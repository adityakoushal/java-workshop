// 23
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term: ");
        int a = sc.nextInt();
        System.out.print("Enter common ratio: ");
        int r = sc.nextInt();
        long term = a;
        for (int i = 0; i < 10; i++) {
            System.out.print(term + " ");
            term *= r;
        }
        System.out.println();
    }
}