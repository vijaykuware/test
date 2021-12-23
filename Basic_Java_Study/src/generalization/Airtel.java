package generalization;

public class Airtel implements TRAI
{
	@Override
	public void calls() {
		System.out.println("Unlimeted calls Local and National for 28 days");
	}

	@Override
	public void data() {
		System.out.println("Data 1.5Gb/day");
		
	}

	@Override
	public void sms() {
		System.out.println("SMS 100/day");
		
	}
	public void callertune() 
	{
		System.out.println("airtel callertune Rs 15/month ");
	}
	@Override
	public void rates() {
		System.out.println("Monthly Plan Rs.199");
		
	}
	
}
