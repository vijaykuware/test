package inheritance_study;

public class Single_inheritance {

	public static void main(String[] args) {
		Mother m=new Mother();
		m.looks();
		m.songs();
		
		System.out.println("*************");
		Grandmother g=new Grandmother();
		g.experiance();
		g.stories();
		System.out.println("*************");
		m.looks();
		m.songs();
		m.stories();
		m.experiance();
		Mother.test();
		

	}

}
