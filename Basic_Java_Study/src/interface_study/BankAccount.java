package interface_study;

public class BankAccount implements PersonalLoan,HomeLoan{

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.accountDetails();
		b.homeLoanDetails();
		b.nominee();
		b.salary();
		b.income();
		
	
	}

//	@Override
//	public void homeLoanDetails() {
//		System.out.println("Home loan details of homeloan class");
//		
//		
//	}
//
//	@Override
	public void nominee() {
		System.out.println("Nominee of homeloan");
		
	}

	@Override
	public void salary() {
		System.out.println("Salary for Personal Loan");
		
	}

	@Override
	public void income() {
		System.out.println("Income for personal loan");
		
	}

	@Override
	public void accountDetails() {
		// TODO Auto-generated method stub
		HomeLoan.super.accountDetails();
	
	}

	@Override
	public void homeLoanDetails() {
		
		System.out.println("Homeloan");
	}
	

}
