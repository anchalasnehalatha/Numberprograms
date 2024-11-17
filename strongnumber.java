class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean res = strong(n);
        if (res) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }

    static boolean strong(int n) {
        int sum = 0, temp = n;
        while (n > 0) {
            int rem = n % 10;
            int fact = factorial(rem);
            sum = sum + fact;
            n /= 10;
        }
        return sum == temp;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}

Strong number
