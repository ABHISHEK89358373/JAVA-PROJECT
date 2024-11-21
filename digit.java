import java.util.Scanner;

class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        digit obj = new digit();
        obj.separator(n);
    }

    static void separator(int n) {
        int rev = 0;

        while (n > 0) {
            int num=n % 10;
            rev = rev * 10 + num;
            n = n / 10;
        }

        while (rev > 0) {
            int digit = rev % 10;
            System.out.print(digit + "   ");
            rev = rev / 10;
        }
    }
}

