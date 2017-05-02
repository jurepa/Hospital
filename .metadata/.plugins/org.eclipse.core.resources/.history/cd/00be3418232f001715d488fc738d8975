package hospital;

import java.util.Objects;

/*
 * Interfaz
 * 
 * Propiedades básicas:
 * 
 * seguroPrivado String, consultable y modificable
 * 
 * Propiedades derivadas: No hay
 * Propiedades compartidas: No hay
 * 
 * Métodos consultores y modificadores:
 * 
 * void setSeguroPrivado(String seguroPrivado)
 * 
 * String seguroPrivado()
 * 
 * Restricciones: 
 * No hay
 * 
 * Métodos añadidos:
 * 
 * 	-boolean comprobarDNI()******
 */
public class Paciente  extends Persona implements Comparable<Persona>, Cloneable
{
	private String seguroPrivado;
	
	public Paciente()
	{
		super();
		seguroPrivado="";
	}
	public Paciente(String nombre, int edad, String dni, char sexo, Domicilio domicilio, String telefono, String seguroPrivado) throws HospitalException
	{
		super(nombre,edad,dni,sexo,telefono,domicilio);
		this.seguroPrivado=seguroPrivado;
	}
	public Paciente(Paciente paciente)
	{
		super(paciente);
		this.seguroPrivado=paciente.seguroPrivado;
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
	//Métodos sobreescritos y sobrecargados
	@Override
	public int hashCode()
	{
		return super.hashCode()+Objects.hash(seguroPrivado);
	}
	@Override
	public String toString()
	{
		return super.toString()+", "+seguroPrivado;	
	}
	//Criterio de igualdad: Dos pacientes serán iguales si todos sun atributos son iguales.
	@Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		if(x!=null&& x instanceof Paciente)
		{
			Paciente paciente=(Paciente)x;
			if(super.equals(x)==true&&paciente.getSeguroPrivado()==getSeguroPrivado())
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
