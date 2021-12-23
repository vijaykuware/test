package Control_state;

public class nested_if {

	public static void main(String[] args) {
		String username="Vijay";
		String password="vijay123";
		
		if (username=="Vijay") 
		 {
			System.out.println("Enter password");
			if (password=="vijay123") 
			  {
				System.out.println("welcome to inbox");
			  }
			else 
			  {
				System.out.println("Passeord is incorrect,Enter correct password");
			  }
		}
		
		else 
		{
			System.out.println("Enter correct username");
		}

	}

}
