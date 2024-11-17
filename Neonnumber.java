import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean isNeon = neon(n);

        if (isNeon) {
            System.out.println("Neon number");
        } else {
            System.out.println("Not a neon number");
        }
    }

    static boolean neon(int n) {
        int sqr = n * n;
        int sum = 0;

        while (sqr > 0) {
            int rem = sqr % 10;
            sum += rem;
            sqr /= 10;
        }

        return sum == n;
    }
}

Neon number
