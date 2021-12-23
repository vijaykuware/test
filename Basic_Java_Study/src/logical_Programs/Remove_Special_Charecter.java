package logical_Programs;

public class Remove_Special_Charecter {

	public static void main(String[] args) {
		String s1="Vijay! Ku@ware";
		
		String s2=s1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s2);
		
		String s3="V I J A Y";
		String s4 = s3.replace(" ", "");
		
		System.out.println(s4);

	}

}
