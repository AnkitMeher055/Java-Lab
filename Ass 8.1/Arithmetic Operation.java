public class ArithmeticOperations 
{
    static int sum(int a, int b) 
  {
        return a + b;
    }
    static float sum(float a, float b) 
  {
        return a + b;
    }
    static double sum(double a, double b) {
        return a + b;
    }
    static double sum(double a, float b) {
        return a + b;
    }
    static double sum(double a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static float subtract(float a, float b) {
        return a - b;
    }
    static double subtract(double a, double b) {
        return a - b;
    }
    static double subtract(double a, float b) {
        return a - b;
    }
    static double subtract(double a, int b) {
        return a - b;
    }
    static double div(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
    static float div(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Float.NaN;
        }
    }
    static double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
    static double div(double a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
    static boolean isPrime(int num) {
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
    static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        int num1 = 5, num2 = 3;
        float floatNum1 = 8.5f, floatNum2 = 2.5f;
        double doubleNum1 = 10.0, doubleNum2 = 5.0;

        System.out.println("Sum of integers: " + sum(num1, num2));
        System.out.println("Sum of floats: " + sum(floatNum1, floatNum2));
        System.out.println("Sum of doubles: " + sum(doubleNum1, doubleNum2));

        System.out.println("Subtraction of integers: " + subtract(num1, num2));
        System.out.println("Subtraction of floats: " + subtract(floatNum1, floatNum2));
        System.out.println("Subtraction of doubles: " + subtract(doubleNum1, doubleNum2));

        System.out.println("Division of integers: " + div(num1, num2));
        System.out.println("Division of floats: " + div(floatNum1, floatNum2));
        System.out.println("Division of doubles: " + div(doubleNum1, doubleNum2));

        int primeNumber = 7;
        System.out.println(primeNumber + " is prime: " + isPrime(primeNumber));

        int factorialNumber = 5;
        System.out.println("Factorial of " + factorialNumber + ": " + findFactorial(factorialNumber));

        int palindromeNum = 121;
        System.out.println(palindromeNum + " is palindrome: " + isPalindrome(palindromeNum));
    }
}

// Output
// Sum of integers: 8
// Sum of floats: 11.0
// Sum of doubles: 15.0
// Subtraction of integers: 2
// Subtraction of floats: 6.0
// Subtraction of doubles: 5.0
// Division of integers: 1.6666666666666667
// Division of floats: 3.4
// Division of doubles: 2.0
// 7 is prime: true
// Factorial of 5: 120
// 121 is palindrome: true
