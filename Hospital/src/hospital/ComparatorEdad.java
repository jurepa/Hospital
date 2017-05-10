package hospital;

import java.util.Comparator;

public class ComparatorEdad implements Comparator<Paciente>{
	
	public int compare(Paciente paciente1, Paciente paciente2)
	{
		int compara=0;
		if(paciente1.getEdad()>paciente2.getEdad())
		{
			compara=1;
		}
		else if(paciente1.getEdad()<paciente2.getEdad())
		{
			compara=-1;
		}
		return compara;
	}

}
