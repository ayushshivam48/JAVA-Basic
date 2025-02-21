import java.util.Scanner;

public class SortedOrNot {

    // Recursive function to check if the array is sorted
    public static boolean isSorted(int arr[], int idx) {
        // Base case: if we reach the last element, the array is sorted
        if (idx == arr.length - 1) {
            return true;
        }

        // Check if the current element is less than or equal to the next element
        if (arr[idx] <= arr[idx + 1]) {
            // Recursively check the next part of the array
            return isSorted(arr, idx + 1);
        } else {
            // If any element is greater than the next, the array is not sorted
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Input the size of the array
        int arr[] = new int[size];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if the array is sorted
        boolean sorted = isSorted(arr, 0);

        // Print the result
        System.out.println("Is the array sorted? " + sorted);

        sc.close();
    }
}
