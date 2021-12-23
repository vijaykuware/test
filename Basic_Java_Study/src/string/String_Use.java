package string;

public class String_Use {

	public static void main(String[] args) {
		String s="VijayJagannathKuware";
		String s1="VijayKuware";
		String s2="VijayKuware";
		 
		String s3=new String("VijayJagannathKuware");
		String s4=new String("vijay jagannath kuware");
		String s5=new String("VijayKuware");
		String s6=new String("KuwareVijay");
		String s7=new String("");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
		System.out.println("********************");
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println(s.toUpperCase());
		System.out.println(s4.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s==s3);
		System.out.println(s1.equals(s5));
		System.out.println(s.equals(s3));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println(s2.equalsIgnoreCase(s5));
		System.out.println(s.contains(s3));
		System.out.println(s.contains(s2));
		System.out.println(s7.isEmpty());
		System.out.println(s.isEmpty());
		System.out.println(s.charAt(5));
		System.out.println(s2.charAt(7));
		System.out.println(s.startsWith(s6));
		
		
		
		
		
		
		
	}

}
