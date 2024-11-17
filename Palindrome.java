class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean isPalindrome = reverse(n);
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    static boolean reverse(int n) {
        int rev = 0, rem, temp = n;
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }
        return rev == temp;
    }
}

Palindrome
