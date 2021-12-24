package string;

public class String_Study {

	public static void main(String[] args) {
		String s=new String("Vijay");
		String s1=new String("Kuware");
		
		System.out.println(s.endsWith("jay"));
		System.out.println(s.endsWith("y"));
		System.out.println(s1.startsWith("Kuw"));
		System.out.println(s1.startsWith("Ku", 0));
		System.out.println(s.substring(3));
		System.out.println(s.substring(2));
		System.out.println(s1.substring(2, 4));
		System.out.println(s.concat(s1));
		System.out.println(s.concat(" J. Kuware"));
		System.out.println(s.indexOf('j'));
		System.out.println(s1.indexOf('r'));
		System.out.println(s1.lastIndexOf('a'));
	}

}
