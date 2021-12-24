package Basics;

public class Student_info {

	public static void main(String[] args) {
	 Student_info s=new Student_info();
	 s.Students("Vijay", "CSE", 1,85.6f,'A');
	 s.Students("Sachin", "ME", 2, 86.5f, 'B');
	 s.Students("Kishor", "CSE", 3, 88.7f, 'C');
	 s.Students("Prashant", "ENTC", 4, 90.6f, 'D');
	}
       public void Students(String Name, String stream, int Rollnu, float Marks, char Grade )
       {
    	   System.out.println("*************************");
    	   System.out.println("Name:       "+Name);
    	   System.out.println("Stream:     "+stream);
    	   System.out.println("Rollnumber: "+Rollnu);
    	   System.out.println("Marks:      "+Marks);
    	   System.out.println("Grade:      "+Grade);
    	   System.out.println("*************************");
       }

}
