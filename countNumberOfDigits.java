public class countNumberOfDigits {
    public static void main(String[] args) {
        int n = 67978;

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println(count);
    }
}
