import java.io.*;
import java.util.Scanner;

class Student 
{
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) 
  {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() 
  {
        return rollNo;
    }

    public String getName() 
  {
        return name;
    }

    @Override
    public String toString() 
  {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
  public class StudentFileOperation 
  {
    private static final String FILE_NAME = "Student.txt";

    public static void main(String[] args) 
    {
        writeRecord(new Student(111, "Amrit"));
        writeRecord(new Student(112, "Amar"));
        writeRecord(new Student(113, "Sonu"));

        System.out.println("All records:");
        readAllRecords();

        System.out.println("\nSearching record with roll number 112:");
        searchRecord(112);
    }

    private static void writeRecord(Student student) 
    {
        try (FileWriter writer = new FileWriter(FILE_NAME, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer);
             PrintWriter printWriter = new
             PrintWriter(bufferedWriter)) {
            printWriter.println(student.getRollNo() + "," + student.getName());
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    private static void readAllRecords() 
    {
        try (FileReader fileReader = new FileReader(FILE_NAME);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) 
        {
            String line;
            while ((line = bufferedReader.readLine()) != null) 
            {
                String[] parts = line.split(",");
                int rollNo = Integer.parseInt(parts[0]);
                String name = parts[1];
                Student student = new Student(rollNo, name);
                System.out.println(student);
            }
        } catch (IOException e) 
        {
          e.printStackTrace();
        }
    }

    private static void searchRecord(int rollNoToSearch) 
    {
        try (FileReader fileReader = new FileReader(FILE_NAME);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) 
        {
            String line;
            boolean found = false;
            while ((line = bufferedReader.readLine()) != null) 
            {
                String[] parts = line.split(",");
                int rollNo = Integer.parseInt(parts[0]);
                String name = parts[1];
                if (rollNo == rollNoToSearch) 
                {
                    System.out.println("Record found: " + new Student(rollNo, name));
                    found = true;
                    break;
                }
            }
          if (!found) 
          {
                System.out.println("Record not found for roll number: " + rollNoToSearch);
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
