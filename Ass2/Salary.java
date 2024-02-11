class Salary{
public static void main(String args[]){
float basic = 12000;
float HRA = (0.15f)*basic;
System.out.println(HRA);
float DA = (1.10f)*basic;
System.out.println(DA);
float PF = (0.12f)*basic;
System.out.println(PF);

float grossSalary = basic + HRA + DA;
float netSalary = grossSalary - PF;

System.out.println("The Gross salary of the employee is "+grossSalary);
System.out.println("The net salary of the employee is "+ netSalary);
}
}
