package hospital;

import java.util.Objects;

/*
 * Interfaz
 * 
 * Propiedades básicas:
 * 
 * nombre String, consultable y modificable
 * DNI String, consultable y modificable
 * edad int, consultable y modificable
 * sexo char, consultable y modificable
 * domicilio Domicilio, consultable y modificable
 * telefono int, consultable y modificable
 * seguroPrivado String, consultable y modificable
 * 
 * Propiedades derivadas: No hay
 * Propiedades compartidas: No hay
 * 
 * Métodos consultores y modificadores:
 * 
 * void setNombre(String nombre)
 * void setEdad(int edad)
 * void setSexo(char sexo)
 * void setDomicilio(Domicilio d)
 * void setDNI(String dni)
 * void setSeguroPrivado(String seguroPrivado)
 * 
 * String getNombre()
 * String getDNI()
 * int getEdad()
 * char getSexo()
 * Domicilio getDomicilio()
 * int getTelefono()
 * String seguroPrivado()
 * 
 * Restricciones: 
 * 	-El DNI solo puede tener 8 números y una letra calculada
 * 	-La edad debe ser mayor a 0
 * 	-El sexo solo puede ser 'm' o 'h'
 * 	-El domicilio no puede ser null
 * 	-El telefono tiene una longitud de 9 números
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
	public Paciente(String nombre, int edad, String dni, char sexo, Domicilio domicilio, int telefono, String seguroPrivado)
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
	public int compareTo(Paciente paciente)
	{
		int compara=0;
		compara=super.compareTo(paciente);
		return compara;
	}
	
	/*@Override
	public Paciente clone()
	{
		Paciente paciente=null;
		
		paciente=(Paciente)super.clone();
		
		return paciente;
	}*/

	

}
