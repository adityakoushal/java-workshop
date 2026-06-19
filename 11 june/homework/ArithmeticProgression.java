// 22
public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term: ");
        int a = sc.nextInt();
        System.out.print("Enter common difference: ");
        int d = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.print((a + i*d) + " ");
        }
        System.out.println();
    }
}