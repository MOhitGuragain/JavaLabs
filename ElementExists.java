import java.util.Scanner;

public class ElementExists {
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

        // Input element to search
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        boolean found = false;

        // Search element
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println(target + " exists in the array.");
        } else {
            System.out.println(target + " does not exist in the array.");
        }

        sc.close();
    }
}
