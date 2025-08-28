import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display elements
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }

        sc.close();
    }
}
