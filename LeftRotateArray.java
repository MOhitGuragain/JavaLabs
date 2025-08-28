import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store first element
        int first = arr[0];

        // Shift elements to the left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Move first element to the end
        arr[n - 1] = first;

        // Display rotated array
        System.out.println("Array after left rotation by one position:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
