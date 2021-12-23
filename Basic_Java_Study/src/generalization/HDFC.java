package generalization;

public class HDFC extends RBI
{

	@Override
	public void interest_Rates() {
		System.out.println("Interest Rates for Saving Acc is 4.1%");
		
	}

	@Override
	public void minimum_Balance() {
		System.out.println("Rs. 5000 is minimum balance limit");
	}

	@Override
	public void withdraw_Limit() {
		System.out.println("daily withdrawal limit Rs.100000");
		
	}
}
