package org.example;

public class BubbleSort {

    static void bubbleSort(int[] array, int arrayLength) {

        int i, j, temp;
        boolean swapped;
        for (i=0; i < arrayLength -1; i++) {
            swapped = false;
            for (j=0; j < arrayLength - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no two elements were swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    // print the array
    static void printArray(int[] array, int size) {

        int i;
        for (i = 0; i < size; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] array = {64,25,12,22,11,0,-4,99,103,2,54,8,12,52,92,12,7,234,1479};;
        int arrayLength = array.length;
        bubbleSort(array, arrayLength);
        System.out.println("Sorted array: ");
        printArray(array, arrayLength);
    }

}
