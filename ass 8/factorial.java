import java.util.Scanner;
class factorial 
  {  
    static int factorial(int n)
    {    
     if (n == 0)    
       return 1;    
     else    
       return(n * factorial(n-1));    
    }    
    public static void main(String args[]){  
        Scanner in =new Scanner(System.in);
     int i,fact=1;  
     int n1;
     System.out.println("Enter the value of n:");
     n1=in.nextInt();
       fact= factorial(n1);   
     System.out.println("Factorial of "+n1+" is: "+fact);    
    }  
   }  
