import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n;
        long product = 1;
        while (temp != 0) {
            product *= temp % 10;
            temp /= 10;
        }
        System.out.println("Product of digits: " + product);
    }
}