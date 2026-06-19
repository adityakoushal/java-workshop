import java.util.Scanner;

// 17
public class FractionSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) i / (i + 1);
            System.out.print(i + "/" + (i+1));
            if (i < n) System.out.print(" + ");
        }
        System.out.println(" = " + sum);
    }
}