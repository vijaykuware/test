package polymorphism;

public class Test_Overriding {

	public static void main(String[] args) {
	Teacher t=new Teacher();
	t.marks();
	t.results();
	Teacher.display();
    System.out.println("*************");
	Student s=new Student();
	s.marks();
	s.subjects();
	s.results();
	s.marks(53.56f);
	Student.display();

	}

}
