package logical_Programs;

import java.util.Arrays;

public class Compare_Two_Array {

	public static void main(String[] args) {
	int []a= {1,2,3,4};
	int []b= {5,6,7,8};
	int []c= {1,2,3,4};
	
	System.out.println(Arrays.equals(a, b));
	System.out.println(Arrays.equals(a, c));

	}

}
