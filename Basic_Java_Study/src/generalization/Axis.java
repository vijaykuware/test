package generalization;

public class Axis extends RBI
{

	@Override
	public void interest_Rates() {
		System.out.println("Interest Rates for Saving Acc is 6.0%");
		
	}

	@Override
	public void minimum_Balance() {
		System.out.println("Rs.2000 is minimum balance limit");
	}

	@Override
	public void withdraw_Limit() {
		System.out.println("daily withdrawal limit Rs.50000");
		
	}
}
