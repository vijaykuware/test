package casting;

public class Up_casting {

	public static void main(String[] args) {
		System.out.println("******************");
		father f=new father(); 
		f.money();
		f.house();
		System.out.println("******************");
		son s=new son();
		s.money();
		s.house();
		s.degree();
		System.out.println("******************");
		father f1=new son();
		f1.house();
		f1.money();
		f1.bike();

		

	}

}
