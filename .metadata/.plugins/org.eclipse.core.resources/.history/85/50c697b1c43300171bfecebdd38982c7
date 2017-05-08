package hospital;

import java.io.Serializable;
import java.util.Objects;

/*
 * Interfaz
 * 
 * Propiedades básicas:
 * 
 * seguroPrivado String, consultable y modificable
 * ingresado Boolean, consultable y modificable
 * 
 * Propiedades derivadas: No hay
 * Propiedades compartidas: No hay
 * 
 * Métodos consultores y modificadores:
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
 * Métodos añadidos:
 * 
 * 	-boolean comprobarDNI()******
 */
public class Paciente  extends Persona implements Comparable<Persona>, Cloneable, Serializable
{
	private String seguroPrivado;
	private boolean ingresado;
	
	public Paciente()
	{
		super();
		seguroPrivado="";
		ingresado = false;
	}
	public Paciente(String nombre,String apellidos, int edad, String dni, char sexo, Domicilio domicilio, String telefono, String seguroPrivado, boolean ingresado) throws HospitalException
	{
		super(nombre,apellidos,edad,dni,sexo,telefono,domicilio);
		this.seguroPrivado=seguroPrivado;
		this.ingresado = ingresado;
	}
	public Paciente(Paciente paciente)
	{
		super(paciente);
		this.seguroPrivado=paciente.seguroPrivado;
		this.ingresado = paciente.ingresado;
	}
	//Métodos modificadores y consultores
	public void setSeguroPrivado(String seguroPrivado)
	{
		this.seguroPrivado=seguroPrivado;
	}
	public String getSeguroPrivado()
	{
		return seguroPrivado;
	}
	
	public boolean getIngresado ()
	{
		return ingresado;
	}
	
	public void setIngresado (boolean ingresado)
	{
		this.ingresado = ingresado;
	}
	//Métodos sobreescritos y sobrecargados
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
	//Criterio de igualdad: Dos pacientes serán iguales si todos sun atributos son iguales.
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
	//Criterio de comparación: Seguirá el compareTo de persona
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
