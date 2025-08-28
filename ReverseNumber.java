import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;

        // Reverse logic
        while (num != 0) {
            int digit = num % 10; // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            num /= 10; // remove last digit
        }

        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
