package arrays;

public class Count_Blank_Spaces {

	public static void main(String[] args) {
		String given= ("Maharashtra is a state which is third largest state"); 
        int count=0;
        for(int i=0;i<=given.length()-1;i++)
        {
        	char blank=' ';
        	if(blank==given.charAt(i))
        	{
        	count++;
        	}
       
        }
        System.out.println("Blank spaces in the string is= "+count);
	}

}
