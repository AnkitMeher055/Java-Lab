import java.util.Scanner;
public class PrimeSum{
public static boolean isPrime(int n)
{
for(int i=2;i<n;i++)
{
 if(n % i == 0)
{
return false;
}
}

return true;
}

public static void main(String ar[]){
Scanner sc = new Scanner(System.in);

System.out.println("enter the range ");
int fIndex = sc.nextInt();
int lIndex = sc.nextInt();

for(int i = fIndex;i<=lIndex ;i++)
{
 int num = i;
int sum = 0;
if(isPrime(num))
{
while( num!=0 ){
sum+= num%10;
num = num/10;
}
if(isPrime(sum)){
System.out.print(i +" " );
}
}


}
}
}

