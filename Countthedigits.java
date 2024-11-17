import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {
            int k = n % 10; // get digit
            count++; // count digit
            n /= 10; // delete digit
        }

        System.out.println(count);
    }
}


Count digits
