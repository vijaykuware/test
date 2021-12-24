package arrays;

public class ex {
	
	public static void main (String[] args) 
	{
	int x[][][]={{{10, 20,30,40}, {41, 42}, {43}, {11, 12,13}, {45, 46}, {47, 48,49,50},
		          {51, 52},{53},{54, 55}}};
	System.out.println("length of array "+x.length);
	System.out.println("**********");
	System.out.println("line 11 output :"+x[0][0].length);
	System.out.println();
	System.out.println(x[0][1].length);
	System.out.println(x[0][1][0]);
	System.out.println(x[0][1][1]);
	
	System.out.println("**********");
	System.out.println("**********");
	
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			for(int k=0;k<x[i][j].length;k++)
			{
				System.out.print(x[i][j][k]+" ");
			}
		System.out.println();
		}
		
	}
}
}
