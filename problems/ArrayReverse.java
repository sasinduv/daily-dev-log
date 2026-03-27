/*
Day 3: Reverse an Array

Algorithm:
1. Initialize start = 0 and end = last index
2. Swap elements at start and end
3. Move start forward and end backward
4. Repeat until start < end

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Print original array
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Reverse array
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        System.out.print("\nReversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}