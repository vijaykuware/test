package polymorphism;

public class Student extends Teacher
{
public void marks()
   {
	System.out.println("Marks of Student1");
   }
public void subjects()
{
	System.out.println("Subjects of Student1");
}
public void marks(float a)
{
	System.out.println("Percent of student1 "+a);
}
public static void display()
{
	System.out.println("Static method from base class");
}
}
