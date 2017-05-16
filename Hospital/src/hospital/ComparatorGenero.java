package hospital;

import java.util.Comparator;

public class ComparatorGenero implements Comparator <Persona> 
{
	public int compare(Persona persona1, Persona persona2)
	{
		int compara=0;
		if(persona1.getSexo()>persona2.getSexo())
		{
			compara=1;
		}
		else if(persona1.getSexo()<persona2.getSexo())
		{
			compara=-1;
		}
		return compara;
	}
}
