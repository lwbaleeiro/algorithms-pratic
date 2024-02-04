package org.example;

/**The algorithm repeatedly selects the smallest (or largest)
 * element from the unsorted portion of the list and swaps it with
 * the first element of the unsorted part. This process is repeated
 * for the remaining unsorted portion until the entire list is sorted. **/

public class SelectionSort {

    void sort(int[] array) {
        int arrayLength = array.length;

        // One by one move boundary of unsorted sub array
        for (int i = 0; i < arrayLength-1; i++) {

            // Find the minimum element in sorted array
            int min_index = i;
            for (int j = i+1; j < arrayLength; j++) {
                if (array[j] < array[min_index])
                    min_index = j;
            }

            // Swap the found minimum element with the first element
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }

    // Print the array
    void printArray(int[] array) {
        int arrayLength = array.length;
        for (int i=0; i<arrayLength; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String[] args)
    {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {64,25,12,22,11,0,-4,99,103,2,54,8,12,52,92,12,7,234,1479};
        selectionSort.sort(array);
        System.out.println("Sorted array");
        selectionSort.printArray(array);
    }

}