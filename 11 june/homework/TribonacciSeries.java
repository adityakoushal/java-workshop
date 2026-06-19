// 20
public class TribonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int a = 0, b = 0, c = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }
        System.out.println();
    }
}