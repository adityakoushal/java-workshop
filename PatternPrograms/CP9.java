public class CP9 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print("  ");
            for (int j = 0; j < i; j++) System.out.print((char)('A' + j) + " ");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int s = 0; s < n - i; s++) System.out.print("  ");
            for (int j = 0; j < i; j++) System.out.print((char)('A' + j) + " ");
            System.out.println();
        }
    }
}
