import java.util.Scanner;

public class BitRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter rotation count: ");
        int r = sc.nextInt();

        int leftRotate = (n << r) | (n >>> (32 - r));
        int rightRotate = (n >>> r) | (n << (32 - r));

        System.out.println("Left Rotation = " + leftRotate);
        System.out.println("Right Rotation = " + rightRotate);

        sc.close();
    }
}