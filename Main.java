public class Main {
    public static void main(String[] args) {
        System.out.println("برنامه ای بنویسید که اعداد اول بین یک تا صد را چاپ کند ");
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " ");
            }
        }
    }
}