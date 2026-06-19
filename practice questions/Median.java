import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int median = (a > b)
                ? ((b > c) ? b : ((a < c) ? a : c))
                : ((a > c) ? a : ((b < c) ? b : c));

        System.out.println("Median = " + median);

        sc.close();
    }
}a