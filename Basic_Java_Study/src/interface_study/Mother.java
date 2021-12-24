package interface_study;

public interface Mother 
{
void looks();
void receipe();
default void love()
{
   System.out.println("Mothers love"); 
}

}
