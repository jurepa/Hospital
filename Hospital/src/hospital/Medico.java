package hospital;

import java.util.Objects;

/*
 * Interfaz
 * 
 * Propiedades b�sicas:
 * 
 * String especialidad, consultable y modificable
 * 
 * Propiedades derivadas: No tiene
 * Propiedades compartidas: No tiene
 * 
 * M�todos consultores y modificadores:
 * 
 * void setEspecialidad(String especialidad)
 * String getEspecialidad()
 * 
 * Restricciones: No hay
 * 
 * M�todos a�adidos: No hay
 */
public class Medico extends Persona {
	
	private String especialidad;
	
	//Constructores
	public Medico()
	{
		super();
		especialidad="";
	}
	public Medico(String nombre,String apellidos, int edad, String dni, char sexo, Domicilio domicilio, String telefono,String especialidad) throws HospitalException
	{

		super(nombre,apellidos,edad,dni,sexo,telefono,domicilio);
		if(especialidad.equals("")||especialidad==null)
		{
			throw new HospitalException("Por favor, escriba una especialidad");
		}
		else
		{
			this.especialidad=especialidad;
		}
	}
	public Medico(Medico medico)
	{
		super(medico);
		
		this.especialidad=medico.especialidad;
	}
	//M�todos consultores y modificadores
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
	//M�todos sobrecargados y sobreescritos
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
