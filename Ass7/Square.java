public class Square{
public static void main(String ar[]){
int i=0;
for(i = 1000;i<=9999;i++){
int num = i;

int ftwo = num / 100;
int ltwo = num % 100;
int sum = ftwo + ltwo;
sum = sum * sum;
if(sum == i)
{
 System.out.print(i + " ");
}
}
}
}



