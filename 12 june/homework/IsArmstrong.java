public class IsArmstrong {
    public static boolean isArmstrong(int n) {
        int temp = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        while (temp != 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(123));
    }
}
