
public class Lab_3_first {
//write a program to count and display the total no of prime numbers between 1 and 1000.

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int count = 0;
        System.out.println("prime nos b/w 1 and 1000 are:");
        for (int num = 2; num <= 1000; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println("\ntotal no of prime no b/w 1 and 1000:" + count);
    }
}
