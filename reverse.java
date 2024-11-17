class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
      int rev=reverse(n);
      System.out.println(rev);
    }

    static boolean reverse(int n) {
        int rev = 0, rem, temp = n;
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }
        return rev;
    }
}
