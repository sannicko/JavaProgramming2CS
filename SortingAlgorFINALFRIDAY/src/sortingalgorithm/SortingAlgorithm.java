/**
 *
 * Title:           Assignment Phone Book Array
 *
 * Due Date: 11/11/2018
 *
 * Description of program, & explanation of programming concept(s) being applied
 * in program. This program will sort an array of integers using, insertion,
 * selection & bubble and shows the times spent for each sorting algorithm.
 */
package sortingalgorithm;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithm {

    // Testing variables
    public static int[] randomNumbers = new int[20000];
    public static int[] randomNumbersCopy = new int[20000];
    public static long startTime, endTime;

    // Real variables
    public static int[] myOriginalUnsortedArray1 = new int[20000];
    public static int[] myCopyUnsortedArray2 = new int[20000];
    public static long bubbleSortDuration, quickSortDuration, selectionSortDuration, insertionSortDuration, mergeSortDuration;

    public static void main(String[] args) {

        generateRanNums();

        // Quick Sort Algorigthm
        copyRanNums();
        startTime = System.currentTimeMillis();
        quickSort();
        endTime = System.currentTimeMillis();
        quickSortDuration = endTime - startTime;
        displayContents();

        // Merge Sort Algorigthm
        copyRanNums();
        startTime = System.currentTimeMillis();
        mergeSort();  //Extra Credit!
        endTime = System.currentTimeMillis();
        mergeSortDuration = endTime - startTime;
        displayContents();

        // Selection Sort Algorigthm
        copyRanNums();
        startTime = System.currentTimeMillis();
        selectionSort();
        endTime = System.currentTimeMillis();
        selectionSortDuration = endTime - startTime;
        displayContents();

        // Insertion Sort Algorigthm
        copyRanNums();
        startTime = System.currentTimeMillis();
        insertionSort();
        endTime = System.currentTimeMillis();
        insertionSortDuration = endTime - startTime;
        displayContents();

        // Bubble Sort Algorigthm
        copyRanNums();
        startTime = System.currentTimeMillis();
        bubbleSort();
        endTime = System.currentTimeMillis();
        bubbleSortDuration = endTime - startTime;
        displayContents();

        compareSortTimes();
    }

    // Method to compare the sort time of each alorithm
    public static void compareSortTimes() {
        System.out.println("Quicksort took: " + quickSortDuration + " milliseconds");
        System.out.println("Mergesort took: " + mergeSortDuration + " milliseconds");
        System.out.println("Selection sort took: " + selectionSortDuration + " milliseconds");
        System.out.println("Insertion sort took: " + insertionSortDuration + " milliseconds");
        System.out.println("Bubble sort took: " + bubbleSortDuration + " milliseconds");

    }

    // Method to generate random numbers
    public static int[] generateRanNums() {
        Random rand = new Random();

        for (int x = 0; x < randomNumbers.length; x++) {
            int value = rand.nextInt(5001);
            randomNumbers[x] = value;
        }

        return randomNumbers;
    }

    public static void displayContents() {
        System.out.println("Numbers before sorting: ");
        for (int y = 0; y < 10; y++) {
            System.out.println(randomNumbers[y]);
        }

        System.out.println("Numbers after sorting: ");
        for (int y = 0; y < 10; y++) {
            System.out.println(randomNumbersCopy[y]);
        }
    }

    public static void copyRanNums() {
        randomNumbersCopy = Arrays.copyOf(randomNumbers, randomNumbers.length);
    }

    static void quickSort() {

        int i = 0;
        int j = randomNumbersCopy.length - 1;
        int temp;
        int middle = randomNumbersCopy[(0 + randomNumbersCopy.length - 1) / 2];

        while (i < j) {
            while (randomNumbersCopy[i] < middle) {
                i++;
            }
            while (randomNumbersCopy[j] > middle) {
                j--;
            }
            if (i <= j) {
                temp = randomNumbersCopy[i];
                randomNumbersCopy[i] = randomNumbersCopy[j];
                randomNumbersCopy[j] = temp;
                i++;
                j--;
            }
        }

        if (0 < j) {
            quickSort(randomNumbersCopy, 0, j);
        }
        if (i < randomNumbersCopy.length - 1) {
            quickSort(randomNumbersCopy, i, randomNumbersCopy.length - 1);
        }
    }

    static void quickSort(int[] numbers, int low, int high) {

        int i = low;
        int j = high;
        int temp;
        int middle = randomNumbersCopy[(low + high) / 2];

        while (i < j) {
            while (randomNumbersCopy[i] < middle) {
                i++;
            }
            while (randomNumbersCopy[j] > middle) {
                j--;
            }
            if (i <= j) {
                temp = randomNumbersCopy[i];
                randomNumbersCopy[i] = randomNumbersCopy[j];
                randomNumbersCopy[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(randomNumbersCopy, low, j);
        }
        if (i < high) {
            quickSort(randomNumbersCopy, i, high);
        }
    }

    public static void mergeSort() {
        mergeSort(randomNumbersCopy, 0, randomNumbersCopy.length - 1);
    }

    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

//  Method selection sort
    public static void selectionSort() {
        SelectionSort(randomNumbersCopy);
    }

    public static void SelectionSort(int[] num) {
        int i, j, first, temp;
        for (i = num.length - 1; i > 0; i--) {
            first = 0;   // Initialize to subscript of first element
            for (j = 1; j <= i; j++) // locate smallest element between positions 1 and i.
            {
                if (num[j] > num[first]) {
                    first = j;
                }
            }
            temp = num[first];   // Swap smallest found with element in position i.
            num[first] = num[i];
            num[i] = temp;
        }
    }

//  Method insertion sort
    public static void insertionSort() {
        doInsertionSort(randomNumbersCopy);
    }

    public static void doInsertionSort(int[] input) {

        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
//        return input;
    }

    public static void bubbleSort() {
        bubbleSortInAscendingOrder(randomNumbersCopy);
    }

//  Method bubble sort

    public static void bubbleSortInAscendingOrder(int numbers[]) {
        int temp;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                // if numbers[j-1] > numbers[j], swap the elements
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

}
