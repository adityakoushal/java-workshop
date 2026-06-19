import java.util.Scanner;

public class ToggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int bitPosition = 3; // 3rd bit

        int result = n ^ (1 << (bitPosition - 1));

        System.out.println("After Toggling 3rd Bit = " + result);

        sc.close();
    }
}