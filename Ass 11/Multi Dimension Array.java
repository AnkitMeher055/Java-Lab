import java.util.Scanner;

class TwoDArray 
{
    private int[][] array;

    public TwoDArray(int n) 
  {
        array = new int[2][n];
    }

    public void inputData() 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the 2D array:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < array[0].length; j++) 
            {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public void display() {
        System.out.println("Array elements in row-wise:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < array[0].length; j++) 
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] splitArray() 
  {
        return array;
    }

    public static int[][] addArrays(int[][] array1, int[][] array2) 
  {
        int[][] result = new int[2][array1[0].length];
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < array1[0].length; j++) 
            {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyArrays(int[][] array1, int[][] array2) 
  {
        int[][] result = new int[2][array2[0].length];
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < array2[0].length; j++) 
            {
                for (int k = 0; k < array1[0].length; k++) 
                {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return result;
    }
}

class OneDArray 
{
    private int[] array;

    public OneDArray(int n) 
  {
        array = new int[n];
    }

    public void showArray() 
  {
        System.out.println("1D Array:");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void setArray(int[] newArray) 
  {
        for (int i = 0; i < newArray.length; i++) 
        {
            array[i] = newArray[i];
        }
    }
}

public class Main 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the 2D array: ");
        int n = scanner.nextInt();

        TwoDArray array1 = new TwoDArray(n);
        array1.inputData();
        System.out.println("Array 1:");
        array1.display();

        TwoDArray array2 = new TwoDArray(n);
        array2.inputData();
        System.out.println("Array 2:");
        array2.display();

        int[][] splitArray1 = array1.splitArray();
        int[][] splitArray2 = array2.splitArray();

        OneDArray oneDArray1 = new OneDArray(n);
        oneDArray1.setArray(splitArray1[0]);
        System.out.println("1D Array 1:");
        oneDArray1.showArray();

        OneDArray oneDArray2 = new OneDArray(n);
        oneDArray2.setArray(splitArray2[1]);
        System.out.println("1D Array 2:");
        oneDArray2.showArray();

        int[][] addedArray = TwoDArray.addArrays(splitArray1, splitArray2);
        System.out.println("Sum of arrays:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(addedArray[i][j] + " ");
            }
            System.out.println();
        }

        int[][] multipliedArray = TwoDArray.multiplyArrays(splitArray1, splitArray2);
        System.out.println("Multiplication of arrays:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(multipliedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
