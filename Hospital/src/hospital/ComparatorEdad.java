package hospital;

import java.util.Comparator;

public class ComparatorEdad implements Comparator<Persona>{
	
	public int compare(Persona persona1, Persona persona2)
	{
		int compara=0;
		if(persona1.getEdad()>persona2.getEdad())
		{
			compara=1;
		}
		else if(persona1.getEdad()<persona2.getEdad())
		{
			compara=-1;
		}
		return compara;
	}

}
