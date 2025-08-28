import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
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

        // Sort array using Arrays.sort()
        Arrays.sort(arr);

        // Display sorted array
        System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
