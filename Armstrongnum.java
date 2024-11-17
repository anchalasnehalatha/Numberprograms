import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrong(int n) {
        int cd = countDigit(n);
        int sum = 0, temp = n;

        while (n > 0) {
            int rem = n % 10;
            int pow = (int) Math.pow(rem, cd);
            sum += pow;
            n /= 10;
        }

        return sum == temp;
    }

    public static int countDigit(int n) {
        int count = 0;

        while (n > 0) {
            int rem = n % 10; // Optional
            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}

Armstrong number
