package arrays;

public class ArrayEx4_2D {

	public static void main(String[] args) {
		int[][] a=new int[3][3];
		a[0][0]=101;
		a[0][1]=102;
		a[0][2]=103;
		a[1][0]=104;
		a[1][1]=105;
		a[1][2]=106;
		a[2][0]=107;
		a[2][1]=108;
		a[2][2]=109;
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
