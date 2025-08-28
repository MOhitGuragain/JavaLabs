import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n]; // to mark counted elements

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            visited[i] = false;
        }

        // Find frequency
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark duplicate
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times.");
        }

        sc.close();
    }
}
