class arithmetic{

    // for sum
    static int sum(int a,int b)
    {
        int Result=a+b;
        return Result;
    }
    static float sum(float a, float b)
    {
        float Result=a+b;
        return Result;
    }
    static double sum(double a, double b)
    {
        double Result=a+b;
        return Result;
    }

    static double sum(double a, float b)
    {
        double Result=a+b;
        return Result;
    }
    
    static double sum(double a, int b)
    {
        double Result=a+b;
        return Result;
    }

    // for Subtract

    static int sub(int a,int b){
        int Result=a-b;
        return Result;
    }

    static float sub(float a, float b)
    {
        float Result=a-b;
        return Result;
    }

    static double sub(double a, double b)
    {
        double Result=a-b;
        return Result;

    }

    static double sub(double a, float b)
    {
        double Result=a-b;
        return Result;
    }

    static double sub(double a, int b)
    {
        double Result=a-b;
        return Result;
    }

    // for divide
     
    
    static int div(int a,int b)
    {
        int Result=a/b;
        return Result;
    }

    static float div(float a, float b)
    {
        float Result=a/b;
        return Result;
    }

    static double div(double a, double b)
    {
        double Result=a/b;
        return Result;

    }

    static double div(double a, int b)
    {
        double Result=a/b;
        return Result;
    }
    // for prime number

   static int isPrime(int a)
   {
    int i,flag=0;
    for(i=2;i<=a/2;i++)
    {
        if(a%i==0){
            flag=1;
        }
            if(flag==1)
            System.out.println(a+"  is not  a prime number");
            else
            System.out.println(a+ " is a prime number");

    
   }
   return -1;

   }
   // for factorial number
   
   static int FindFactorial(int a)
   {
    if(a == 0 )
    
        return 1;
    
    return a * FindFactorial(a-1);
   }

   // for palindrome number

   static boolean isPalindrome(int a)
   {
    int res=0;
    int New=a;
    while(a!=0)
    {
        int digit=a%10;
        a=a/10;
        res=(res*10)+digit;
    }
    if(New==res)
    System.out.println(New + " is palindrome number");
    else
    System.out.println(New + " is not s palindrome number");

    return false;
   }
   

   public static void main(String arg[])
   {
    // for sum
   System.out.println("sum of two integer number is = "+sum(4,5));
   System.out.println("sum of two float number is = "+sum(2.5f,2.7f));
   System.out.println("sum of two double number is = "+sum(4.5,4.8));
   System.out.println("sum of double No and float No is = "+sum(4.5,4.5f));
   System.out.println("sum of double No and integer number is = "+sum(4.5,10));

   // for subtract
   System.out.println("subtract of two integer number is = "+sub(14,5));
   System.out.println("subtract of two float number is = "+sub(12.5f,2.7f));
   System.out.println("subtract of two double number is = "+sub(14.5,4.8));
   System.out.println("subtract of double No and float No is = "+sub(14.5,4.5f));
   System.out.println("subtract of double No and integer number is = "+sub(40.5,10));
  // for divide 

  System.out.println("divide of two integer number is = "+div(14,5));
   System.out.println("divide of two float number is = "+div(12.5f,2.7f));
   System.out.println("divide of two double number is = "+div(14.5,4.8));
   System.out.println("divide of double No and integer No is = "+div(14.5,4));

   
   isPrime(5); // for prime

   //for factorial number
   System.out.println( "the Factorial of the number is = "+FindFactorial(5));
   isPalindrome(123); // for palindrome
   }
}
