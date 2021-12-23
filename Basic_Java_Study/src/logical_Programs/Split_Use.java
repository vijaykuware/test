package logical_Programs;

public class Split_Use
{

	public static void main(String[] args)
	{
	
		String st="We become what we think about";
		String ref="e";
		
		String[] out=st.split(ref);
		for(int i=0;i<=out.length-1;i++)
		{
			System.out.print(out[i]);
		}
		
		
		
	}

}
