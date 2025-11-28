public class Main {


    // 1. Bubble sort
     static void bubbleSortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // descending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // 2. Selection sort
     static void selectionSortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    // 3. Selection sort || looking for smallest to put at end
     static void selectionSortSmallestToEnd(int[] arr) {
        for (int end = arr.length - 1; end > 0; end--) {
            int minIndex = 0;
            for (int j = 1; j <= end; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[end];
            arr[end] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Print array
     static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // MAIN: Test all three sorting methods
     static void main(String[] _args) {
        int[] arr1 = {5, 2, 9, 1, 7};
        int[] arr2 = {5, 2, 9, 1, 7};
        int[] arr3 = {5, 2, 9, 1, 7};

        System.out.println("Original:");
        printArray(arr1);

        bubbleSortDescending(arr1);
        System.out.println("\nBubble Sort (Descending):");
        printArray(arr1);

        selectionSortDescending(arr2);
        System.out.println("\nSelection Sort (Descending):");
        printArray(arr2);

        selectionSortSmallestToEnd(arr3);
        System.out.println("\nSelection Sort (Smallest to End → Descending):");
        printArray(arr3);
    }
}
