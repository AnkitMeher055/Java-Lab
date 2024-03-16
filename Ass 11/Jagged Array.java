public class JaggedArray 
{
    private int[][] marks; 
   
    
    public JaggedArray(int[] subjects) 
  {
        marks = new int[5][];
        for (int i = 0; i < 5; i++) 
        {
            marks[i] = new int[subjects[i]];
        }
    }
   
    public void inputMarks(String[] names, int[][] childMarks) 
  {
        for (int i = 0; i < 5; i++) 
        {
            System.arraycopy(childMarks[i], 0, marks[i], 0, childMarks[i].length);
        }
    }
   
    
    public void showMarks(String[] names) 
  {
		 System.out.println();
	     System.out.println("MARKS SECURED BY ALL CHILDREN");
		System.out.println("==================================");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print(names[i] + ": ");
            for (int j = 0; j < marks[i].length; j++) 
            {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
	System.out.println("==================================");
	 System.out.println();
	 System.out.println();
    }
   
    public void showTotalMarks(String[] names) 
  {
	System.out.println();
	 System.out.println("THE TOTAL MARK SECURED BY ALL CHILDREN");
	System.out.println("==================================");
        for (int i = 0; i < 5; i++) 
        {
            int totalMarks = 0;
            for (int j = 0; j < marks[i].length; j++) 
            {
                totalMarks += marks[i][j];
            }
            System.out.println(names[i] + "'s total marks: " + totalMarks);
        }
	System.out.println("==================================");
	System.out.println();
	 System.out.println();
    }
   
    public void countMarksAbove80(String[] names) 
  {
	System.out.println();
	 System.out.println("THE CHILDREN HAVE SECURED MORE THAN 80 ARE:-");
	System.out.println("==================================");
        for (int i = 0; i < 5; i++) 
        {
            int count = 0;
            for (int j = 0; j < marks[i].length; j++) 
            {
                if (marks[i][j] > 80) 
                {
                    count++;
                }
            }
            System.out.println(names[i] + " has " + count + " marks above 80.");
        }
	System.out.println("==================================");
	System.out.println();
	 System.out.println();
    }
   
    public void alertMarksLessThan30(String[] names) 
  {
	System.out.println();
	 System.out.println("THE SUBJECTS ON WHICH STUDENTS NEEDS TO PREPARE ON:-");
	System.out.println("==================================");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print(names[i] + ": ");
            for (int j = 0; j < marks[i].length; j++) 
            {
                if (marks[i][j] <= 30) 
                {
                    System.out.print(marks[i][j] + " ");
                }
            }
            System.out.println();
        }
	System.out.println("==================================");
    }
   
    public static void main(String[] args) 
  {
        int[] subjects = {3, 5, 2, 6, 4};
        String[] names = {"Mohan", "Sarita", "Khitis", "Ramesh", "Priyanka"};
       
        int[][] childMarks = {
            {15, 70, 90},    // Child1
            {60, 23, 10, 85, 95},    // Child2
            {70, 25},    // Child3
            {45, 55, 65, 75, 85, 95},    // Child4
            {29, 50, 30, 70}    // Child5
        };
       
        JaggedArray jaggedArray = new JaggedArray(subjects);
        jaggedArray.inputMarks(names, childMarks);
       
        jaggedArray.showMarks(names);
        jaggedArray.showTotalMarks(names);
        jaggedArray.countMarksAbove80(names);
        jaggedArray.alertMarksLessThan30(names);
    }
}
