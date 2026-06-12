public class CP7 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) System.out.print((char)('A' + j) + " ");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print((char)('A' + j) + " ");
            System.out.println();
        }
    }
}
