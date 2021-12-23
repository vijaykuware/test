package inheritance_study;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
	Grandmother g=new Grandmother();
	g.experiance();
	g.stories();
	System.out.println("*************");
	Mother m=new Mother();
	m.songs();
	m.looks();
	m.experiance();
	m.stories();
	System.out.println("*************");
	Daughter d=new Daughter();
	d.cuteness();
	d.smart();
	d.songs();
	d.looks();
	d.experiance();
	d.stories();
	System.out.println("*************");
	
	
	
	}

}
