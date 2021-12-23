package generalization;

public class SBI extends RBI
{

	@Override
	public void interest_Rates() {
		System.out.println("Interest Rates for Saving Acc is 4.6%");
		
	}

	@Override
	public void minimum_Balance() {
		System.out.println("Rs. 500 is minimum balance limit");
	}

	@Override
	public void withdraw_Limit() {
		System.out.println("daily withdrawal limit Rs.40000");
		
	}

}
