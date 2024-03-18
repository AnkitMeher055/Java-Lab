import java.util.Scanner;

class Number {
    protected int[] numbers;

    public Number(int n) {
        numbers = new int[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    public void display() {
        System.out.println("Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class OddNum extends Number {
    private int[] oddNumbers;

    public OddNum(Number number) {
        super(number.numbers.length);
        int count = 0;
        for (int num : number.numbers) {
            if (num % 2 != 0) {
                count++;
            }
        }
        oddNumbers = new int[count];
        int index = 0;
        for (int num : number.numbers) {
            if (num % 2 != 0) {
                oddNumbers[index++] = num;
            }
        }
    }

    public void displayOddNumbers() {
        System.out.println("Odd Numbers:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class PrimeNum extends OddNum {
    private int[] primeNumbers;

    public PrimeNum(OddNum oddNum) {
        super(oddNum);
        int count = 0;
        for (int num : oddNum.oddNumbers) {
            if (isPrime(num)) {
                count++;
            }
        }
        primeNumbers = new int[count];
        int index = 0;
        for (int num : oddNum.oddNumbers) {
            if (isPrime(num)) {
                primeNumbers[index++] = num;
            }
        }
    }

    public void displayPrimeNumbers() {
        System.out.println("Prime Numbers:");
        for (int num : primeNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        Number number = new Number(size);
        number.display();

        OddNum oddNum = new OddNum(number);
        oddNum.displayOddNumbers();

        PrimeNum primeNum = new PrimeNum(oddNum);
        primeNum.displayPrimeNumbers();
    }
}
