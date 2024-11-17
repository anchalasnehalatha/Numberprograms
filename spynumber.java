import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean isSpy = spy(n);

        if (isSpy) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not a spy number");
        }
    }

    static boolean spy(int n) {
        int sum = 0, product = 1, rem;

        while (n > 0) {
            rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }

        return sum == product;
    }
}

Spy number
