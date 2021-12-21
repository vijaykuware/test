package constructor_study;

public class CS3 {
       String city;
      public CS3(String a) 
      {
      city=a;
      }
	public static void main(String[] args) 
	   {
		CS3 c1=new CS3("pune");
		c1.Display();
	   }
		public void Display()
		{
			System.out.println("City Name is: "+city);
		}

	

}
