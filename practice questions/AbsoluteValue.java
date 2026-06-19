import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int abs = (n < 0) ? -n : n;

        System.out.println("Absolute Value = " + abs);
        sc.close();
    }
}