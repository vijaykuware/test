package arrays;

public class ArrayEx5_2D {

	public static void main(String[] args) {
		String[][] name= {{"Bhagwan","Durgesh","Dev"},{"Amol","Akash","Anil"}};
		
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
