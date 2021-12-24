package interface_study;

public interface HomeLoan extends PersonalLoan
{
 void homeLoanDetails();
 void nominee();
 default void accountDetails()
 {
 	System.out.println("Account details for personal details");
 }

}
