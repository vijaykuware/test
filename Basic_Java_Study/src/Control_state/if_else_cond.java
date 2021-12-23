package Control_state;

public class if_else_cond {
	public static void main(String[] args) 
	{
		int mark=34;
		if(mark>=66)
		{
			System.out.println("Congratulations you got Distinction");
		}
		else if (mark>=60) 
		{
			System.out.println("You got First Class");
		}
		else if (mark>=35) 
		{
			System.out.println("Congrats You got Passed");
		
		}
		else {
			System.out.println("Sorry you failed");
		}
	}

}
