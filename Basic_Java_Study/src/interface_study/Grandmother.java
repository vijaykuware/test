package interface_study;

public interface Grandmother 
{
void stories();
void keys();
default void love()
{
	System.out.println("Grandmother's love");
}


}
