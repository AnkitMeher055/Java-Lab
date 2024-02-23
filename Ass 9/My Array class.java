import java.util.Scanner
public class MyArray 
{
    private int[] array;
    private int size;

    public MyArray(int size) 
  {
        this.size = size;
        array = new int[size];
        // Initialize array to zero
        Arrays.fill(array, 0);
    }

    public void InputElements() 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public void DisplayElements() 
  {
        System.out.println("Array elements:");
        System.out.println(Arrays.toString(array));
    }

    public void SumAndAverage() 
  {
        int sum = 0;
        for (int num : array) 
        {
            sum += num;
        }
        double average = (double) sum / size;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    public void SwapMaxAndMin() 
  {
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < size; i++) 
        {
            if (array[i] > array[maxIndex]) 
            {
                maxIndex = i;
            }
            if (array[i] < array[minIndex]) 
            {
                minIndex = i;
            }
        }
        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;
    }

    public void OccurrenceOfUniqueElements() 
  {
        Map<Integer, Integer> OccurrenceMap = new HashMap<>();
        for (int num : array) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Occurrence of unique elements:");
        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) 
        {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }

    public void CreateThreeDigitNumbers() 
  {
        List<Integer> newNumbers = new ArrayList<>();
        for (int i = 0; i <= size - 3; i++) 
        {
            int num = array[i] + array[i + 1] + array[i + 2];
            num = num % 10 + (num / 10) % 10 + num / 100; // Reduce to single digit
            newNumbers.add(num);
        }
        System.out.println("New values are: " + newNumbers);
        if (!newNumbers.isEmpty()) 
        {
            System.out.println("The greatest value is: " + Collections.max(newNumbers));
        }
    }

    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();
        MyArray myArray = new MyArray(size);
        myArray.InputElements();
        myArray.DisplayElements();
        myArray.SumAndAverage();
        myArray.SwapMaxAndMin();
        myArray.DisplayElements();
        myArray.OccurrenceOfUniqueElements();
        myArray.CreateThreeDigitNumbers();
    }
}
