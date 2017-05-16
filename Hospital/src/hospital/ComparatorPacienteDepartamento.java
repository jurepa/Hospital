package hospital;

import java.util.Comparator;

public class ComparatorPacienteDepartamento implements Comparator <Paciente> 
{
	
	public int compare (Paciente paciente1, Paciente paciente2)
	{
		int resultado = 0;
		
		resultado = paciente1.getMedico().getEspecialidad().compareTo(paciente2.getMedico().getEspecialidad());
		
		return resultado;
	}

}
