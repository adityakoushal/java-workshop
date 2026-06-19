// 19
public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int val = (i % 2 == 0) ? -i : i;
            System.out.print(val + " ");
        }
        System.out.println();
    }
}