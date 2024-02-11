import java.util.*;
class Gross{
public static void main(String ar[]){
Scanner sc = new Scanner(System.in);
float salary = sc.nextFloat();
float gSalary =0;

if(salary<12000){
float HRA = salary*0.2f;
float DA = salary*1.15f;
gSalary = salary + HRA + DA;
}
else{
float HRA = salary*0.15f;
float DA = salary*0.90f;
gSalary = salary + HRA + DA;
}
System.out.println("Gross salary is :" +gSalary);
}
}
