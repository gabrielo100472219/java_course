import java.util.Scanner;

public class Minimo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the number of digits: ");
        int number = sc.nextInt();
        if (number <= 0){
            System.out.println("Exiting");
            sc.close();
            return;
        }
        System.out.println("Insert number 1: ");
        int input = sc.nextInt();
        int lowest = input;
        for (int i = 1; i < number; i++){
            System.out.println("Insert number " + (i+1) + ": ");
            input = sc.nextInt();
            if (input < lowest){
                lowest = input;
            }
        }
        System.out.println("Lowest number: " + lowest);
        sc.close();
    }    
}
