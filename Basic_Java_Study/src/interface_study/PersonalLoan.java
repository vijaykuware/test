package interface_study;

public interface PersonalLoan 
{
void salary();
void income();
default void accountDetails()
{
	System.out.println("Account details for personal details");
}
}
