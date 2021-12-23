package generalization;

public class Generalization_Study {

	public static void main(String[] args) {
	System.out.println("***************************");
    BSNL b=new BSNL();
    b.rates();
	b.calls();
	b.data();
	b.sms();
	b.callertune();
	System.out.println("***************************");
	
	Airtel a=new Airtel();
	a.rates();
	a.calls();
	a.data();
	a.sms();
	a.callertune();
	System.out.println("***************************");
	
	Jio j=new Jio();
	j.rates();
	j.calls();
	j.data();
	j.sms();
	j.callertune();
	System.out.println("***************************");
	}

}
