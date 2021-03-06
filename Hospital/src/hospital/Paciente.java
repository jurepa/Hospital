package hospital;

import java.io.Serializable;
import java.util.Objects;

/*
 * Interfaz
 * 
 * Propiedades b�sicas:
 * 
 * seguroPrivado String, consultable y modificable
 * ingresado Boolean, consultable y modificable
 * 
 * Propiedades derivadas: No hay
 * Propiedades compartidas: No hay
 * 
 * M�todos consultores y modificadores:
 * 
 * void setSeguroPrivado(String seguroPrivado);
 * void setIngresado (boolean Ingresado);
 * 
 * String getSeguroPrivado();
 * 
 * boolean getIngresado ();
 * 
 * Restricciones: 
 * No hay
 * 
 * M�todos a�adidos:
 * 
 * 	-No hay
 */
public class Paciente  extends PersonaIMPL implements Serializable
{
	
	private String seguroPrivado;
	private boolean ingresado;
	private Medico medicoAsignado;
	
	public Paciente()
	{
		super();
		this.seguroPrivado="";
		this.ingresado = false;
		this.medicoAsignado=new Medico();
	}
	public Paciente(String nombre,String apellidos, int edad, String dni, char sexo, Domicilio domicilio, String telefono, String seguroPrivado, boolean ingresado, Medico medico) throws HospitalException
	{
		super(nombre,apellidos,edad,dni,sexo,telefono,domicilio);
		if(seguroPrivado.equals("no") || seguroPrivado.equals ("mutua") ||seguroPrivado.equals("mapfre")||seguroPrivado.equals("adeslas")||seguroPrivado.equals("fremap")||seguroPrivado.equals(""))
		{
			this.seguroPrivado=seguroPrivado;
		}
		else
		{
			throw new HospitalException("El Seguro Privado solo puede ser Mutua, Mapfre, Adeslas o Fremap. Si no tiene escriba NO");
		}
		this.ingresado = ingresado;
		this.medicoAsignado=medico;
	}
	public Paciente(Paciente paciente)
	{
		super(paciente);
		this.seguroPrivado=paciente.seguroPrivado;
		this.ingresado = paciente.ingresado;
		this.medicoAsignado=paciente.medicoAsignado;
	}
	//M�todos modificadores y consultores
	public void setSeguroPrivado(String seguroPrivado) throws HospitalException
	{
		if(seguroPrivado.equals("no") || seguroPrivado.equals ("mutua") ||seguroPrivado.equals("mapfre")||seguroPrivado.equals("adeslas")||seguroPrivado.equals("fremap"))
		{
			this.seguroPrivado=seguroPrivado;
		}
		else
		{
			throw new HospitalException("El Seguro Privado solo puede ser Mutua, Mapfre, Adeslas o Fremap. Si no tiene escriba NO");
		}
	}
	public String getSeguroPrivado() 
	{
		return seguroPrivado;
	}
	public Medico getMedico()
	{
		return medicoAsignado;
	}
	public void setMedico(Medico medico)  throws HospitalException
	{
		this.medicoAsignado=medico;
	}
	public boolean getIngresado ()
	{
		return ingresado;
	}
	
	public void setIngresado (boolean ingresado) throws HospitalException
	{
		this.ingresado = ingresado;
	}
	//M�todos sobreescritos y sobrecargados
	@Override
	public int hashCode()
	{
		return super.hashCode()+Objects.hash(seguroPrivado);
	}
	@Override
	public String toString()
	{
		return super.toString()+", "+this.getSeguroPrivado () + ", "+this.getIngresado();	
	}
	//Criterio de igualdad: Dos pacientes ser�n iguales si todos sun atributos son iguales.
	@Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		if(x!=null&& x instanceof Paciente)
		{
			Paciente paciente=(Paciente)x;
			if(super.equals(x)==true
				&& paciente.getSeguroPrivado().equals(getSeguroPrivado()))
			{
				igual=true;
			}
		}
		return igual;	
	}
	//Criterio de comparaci�n: Seguir� el compareTo de persona
	/*public int compareTo(Paciente paciente)
	{
		int compara=0;
		compara=super.compareTo(paciente);
		return compara;
	}*/
	
	/*@Override
	public Paciente clone()
	{
		Paciente paciente=null;
		
		paciente=(Paciente)super.clone();
		
		return paciente;
	}*/

	

}
