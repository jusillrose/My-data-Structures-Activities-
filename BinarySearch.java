import java.util.Scanner;
import java.util.Arrays;
//Create a file name
public class BinarySearch {

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return mid; 
            }
            
            if (array[mid] < key) {
                low = mid + 1;
            }
            
            else {
                high = mid - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Elements of the array
        System.out.println("Enter the elements of the array (in any order): ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        // Input
        System.out.print("Enter the element to search for: ");
        int key = scanner.nextInt();

        int result = binarySearch(array, key);

        // Output
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}