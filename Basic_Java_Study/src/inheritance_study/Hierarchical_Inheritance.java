package inheritance_study;

public class Hierarchical_Inheritance {

	public static void main(String[] args) 
	{
        Mother m=new Mother();
        m.looks();
        m.songs();
        System.out.println("*************");
		Son s=new Son();
		s.bike();
		s.habbits();
		s.looks();
		s.songs();
		s.experiance();
		s.stories();
		System.out.println("*************");
		Daughter d=new Daughter();
		d.cuteness();
		d.smart();
		d.songs();
		d.looks();
		s.experiance();
		s.stories();
		System.out.println("*************");
		

	}

}
