package generalization;

public class Generalization_Study1 {

	public static void main(String[] args) {
		Axis a=new Axis();
		System.out.println("AXIS BANK");
		System.out.println("\n");
		a.interest_Rates();
		a.minimum_Balance();
		a.withdraw_Limit();
		System.out.println("*******************************");
		System.out.println("HDFC BANK");
		System.out.println("\n");
		HDFC h=new HDFC();
		h.interest_Rates();
		h.minimum_Balance();
		h.withdraw_Limit();
		System.out.println("*******************************");
		System.out.println("STATE BANK OF INDIA");
		System.out.println("\n");
		SBI s=new SBI();
		s.interest_Rates();
		s.minimum_Balance();
		s.withdraw_Limit();
		System.out.println("*******************************");

	}

}
