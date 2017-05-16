package hospital;

import java.util.*;

public class ComparatorMedicoDepartamento implements Comparator <Medico>
{
	public int compare (Medico medico1, Medico medico2)
	{
		int resultado = 0;
		
		resultado = medico1.getEspecialidad().compareTo(medico2.getEspecialidad());
		
		return resultado;
	}
}
