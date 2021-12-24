package interface_study;

public class Child implements Grandmother,Mother
{

	public static void main(String[] args) {
		Child c=new Child();
		c.stories();
		c.keys();
		System.out.println("***********");
		c.looks();
		c.receipe();
		System.out.println("***********");
		c.love();

	}
	@Override
	public void stories() {
		System.out.println("Stories of Grandmother");
	}

	@Override
	public void keys() {
		System.out.println("Keys of Grandmother");
		
	}
	
	

	@Override
	public void looks() {
		System.out.println("Looks of Mother");
		
	}

	@Override
	public void receipe() {
	   System.out.println("Receipe of mother");
		
	}
	@Override
	public void love() {
		// TODO Auto-generated method stub
		Grandmother.super.love();
		Mother.super.love();
	}

}
