package hospital;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/*
 * Interfaz
 * 
 * Propiedades básicas:
 * 
 * String especialidad, consultable y modificable
 * 
 * Propiedades derivadas: No tiene
 * Propiedades compartidas: No tiene
 * 
 * Métodos consultores y modificadores:
 * 
 * void setEspecialidad(String especialidad)
 * String getEspecialidad()
 * 
 * void setPacientesAsignados(ArrayList<Paciente>pacientesAsignados)
 * ArrayList<Paciente>pacientesAsignados getPacientesAsignados()
 * 
 * Restricciones: No hay
 * 
 * Métodos añadidos: No hay
 */
public class Medico extends PersonaIMPL implements Serializable {
	

	private String especialidad;
	private ArrayList<Paciente>pacientesAsignados;
	//Constructores
	public Medico()
	{
		super();
		especialidad="";
		pacientesAsignados=new ArrayList<Paciente>();
	}
	public Medico(String nombre,String apellidos, int edad, String dni, char sexo, Domicilio domicilio, String telefono,String especialidad) throws HospitalException
	{
		super(nombre,apellidos,edad,dni,sexo,telefono,domicilio);
		if(especialidad.equals("")||especialidad==null||(!especialidad.equals("alergo")&&!especialidad.equals("trauma")&&!especialidad.equals("pediatra")&&!especialidad.equals("neuro")&&!especialidad.equals("cardio")))
		{
			throw new HospitalException("Por favor, escriba una especialidad correcta");
		}
		else
		{
			this.especialidad=especialidad;
		}
		pacientesAsignados=new ArrayList<Paciente>();
	}
	public Medico(Medico medico)
	{
		super(medico);
		this.especialidad=medico.especialidad;
		this.pacientesAsignados=medico.pacientesAsignados;
	}
	//Métodos consultores y modificadores
	public void setEspecialidad(String especialidad)throws HospitalException
	{
		if(especialidad.equals("")||especialidad==null)
		{
			throw new HospitalException("Por favor, escriba una especialidad");
		}
		else
		{
			this.especialidad=especialidad;
		}
	}
	public String getEspecialidad()
	{
		return especialidad;
	}
	public void setPacienteAsignado(ArrayList<Paciente>pacientesAsignados)
	{
		this.pacientesAsignados=pacientesAsignados;
	}
	public ArrayList<Paciente> getPacienteAsignado()
	{
		return pacientesAsignados;
	}
	//Métodos sobrecargados y sobreescritos
	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(),especialidad);
	}
	@Override
	public String toString()
	{
		return super.toString()+", "+especialidad;
	}
	//criterio de igualdad: Si todos los atributos son iguales a los de otro medico los dos objetos son iguales
	@Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		if(x!=null && x instanceof Medico)
		{
			Medico paciente=(Medico)x;
			if(super.equals(x)==true
				&& getEspecialidad().equals(paciente.getEspecialidad()))
			{
				igual=true;
			}
		}
		return igual;
	}

}
