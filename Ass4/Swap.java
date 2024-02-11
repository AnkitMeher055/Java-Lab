public class Swap{
public static void main(String ar[])
{
int num1 = 20;
int num2 = 12;

num1 = num1 ^ num2;
num2 = num1 ^ num2;
num1 = num1 ^ num2;
System.out.println(num1);
System.out.println(num2);

num1 = num1 + num2;
num2 = num1 - num2;
num1 = num1 - num2;

System.out.println(num1);
System.out.println(num2);

}
}