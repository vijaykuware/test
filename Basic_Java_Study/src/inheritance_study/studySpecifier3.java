package inheritance_study;

import AccessSpecifier.studySpecifier;

public class studySpecifier3 extends studySpecifier {

	public static void main(String[] args) {
		studySpecifier sp=new studySpecifier();
		sp.display2();
		System.out.println("**************");
		studySpecifier3 sp1=new studySpecifier3();
		sp1.display2();
		System.out.println("**************");
		sp1.display3();
	}

}
