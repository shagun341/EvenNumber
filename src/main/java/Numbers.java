public class Numbers {

    public static void main(String[] args) {
        int i, n;
        boolean isPrime;
        for (i = 2; i <= 100; i++) {
            isPrime = true;
            for (n = 2; n < i / 2; n++) {
                if ((i % n) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
        }
    }
}
