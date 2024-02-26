import java.util.Scanner;

public class SortArray 
{
    private int[] arr;
    private int size;

    // Constructor to initialize the array for n elements
    public SortArray(int n) 
  {
        arr = new int[n];
        size = n;
    }

    // Setter method to input n numbers into the array
    public void inputArray() 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = scanner.nextInt();
        }
    }

    // Function to display the values stored in the array
    public void displayArray() 
  {
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Bubble sort
    public void bubbleSort() 
  {
        for (int i = 0; i < size - 1; i++) 
        {
            for (int j = 0; j < size - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort
    public void selectionSort() 
  {
        for (int i = 0; i < size - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion sort
    public void insertionSort() 
  {
        for (int i = 1; i < size; ++i) 
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Merge sort
    public void mergeSort(int[] array, int left, int right) 
  {
        if (left < right) 
        {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) 
  {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) 
        {
            if (L[i] <= R[j]) 
            {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) 
        {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) 
        {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Quick sort
    public void quickSort(int low, int high) 
  {
        if (low < high) 
        {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) 
  {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) 
        {
            if (arr[j] < pivot) 
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        SortArray sortArray = new SortArray(n);
        sortArray.inputArray();

        System.out.println("Original Array:");
        sortArray.displayArray();

        // Sorting using Bubble Sort
        sortArray.bubbleSort();
        System.out.println("Array after Bubble Sort:");
        sortArray.displayArray();

        // Sorting using Selection Sort
        sortArray.inputArray();
        sortArray.selectionSort();
        System.out.println("Array after Selection Sort:");
        sortArray.displayArray();

        // Sorting using Insertion Sort
        sortArray.inputArray();
        sortArray.insertionSort();
        System.out.println("Array after Insertion Sort:");
        sortArray.displayArray();

        // Sorting using Merge Sort
        sortArray.inputArray();
        sortArray.mergeSort(sortArray.arr, 0, n - 1);
        System.out.println("Array after Merge Sort:");
        sortArray.displayArray();

        // Sorting using Quick Sort
        sortArray.inputArray();
        sortArray.quickSort(0, n - 1);
        System.out.println("Array after Quick Sort:");
        sortArray.displayArray();
    }
}
