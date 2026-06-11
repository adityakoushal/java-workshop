import java.util.Scanner;

public class IfExample1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid Age");
        } 
        else if (age <= 4) {
            System.out.println("You are an Infant");
        } 
        else if (age <= 12) {
            System.out.println("You are a Child");
        } 
        else if (age <= 19) {
            System.out.println("You are a Teenager");
        } 
        else if (age <= 50) {
            System.out.println("You are an Adult");
        } 
        else if (age <= 80) {
            System.out.println("You are Old");
        } 
        else {
            System.out.println("You are a Senior Citizen");
        }

        sc.close();
    }
}
