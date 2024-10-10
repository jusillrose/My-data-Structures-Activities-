public class ArrayImplementation {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Access and print elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element in the array
        numbers[2] = 100;

        // Print the modified array
        System.out.println("\nModified array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}