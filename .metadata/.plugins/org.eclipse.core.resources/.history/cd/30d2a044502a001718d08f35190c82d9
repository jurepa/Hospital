package hospital;

import java.util.Objects;

/*
 * CLASE PERSONA 
 * 
 * Propiedades básicas:
 * 
 * Nombre-> String Consultable y modificable
 * Edad-> Entero consultable y modificable
 * DNI-> String consultable y modificable
 * Sexo-> Char consultable y modificable
 * Telefono-> int consultable y modificable
 * 
 * Propiedades derivadas:
 * 
 * No hay
 * 
 * Propiedades compartidas:
 * 
 * No hay
 * 
 * Getes y setes:
 * 
 * String getNombre();
 * void setNombre(String Nombre)
 * 
 * int getEdad();
 * void setEdad(int edad)
 * 
 * String getDNI();
 * void setDNI(String DNI)
 * 
 * char getSexo();
 * void setSexo(char Sexo)
 * 
 * int getTelefono()
 * void setTelefono(int telefono)
 * 
 * Domicilio getDomicilio()
 * void setDomicilio(Domicilio domicilio)
 * 
 * 
 * Restricciones:
 * 
 * -La edad debe ser igual o mayor a 0
 * -El DNI debe tener 8 numeros y una letra calculada
 * -El caracter del sexo debe ser M(mujer) o H(hombre)
 * -El teléfono debe tener 9 números
 * - El domicilio no puede ser null
 * 
 * Metodos añadidos
 * 
 *No hay
 *  
 * 
 */

public class Persona implements Cloneable, Comparable <Persona>{
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private Domicilio domicilio;
	private int telefono;
	
	//constructores
	//vacÃ­o
	public Persona()
	{
		nombre="Paco";
		edad=0;
		dni="12345678A";
		sexo='h';
		domicilio=new Domicilio();

	}
	//De copia
	public Persona(Persona persona)
	{
		this.nombre=persona.nombre;
		this.edad=persona.edad;
		this.dni=persona.dni;
		this.sexo=persona.sexo;
		this.telefono=persona.telefono;
		this.domicilio=persona.domicilio;
	}
	//Ordinario
	public Persona (String nombre, int edad, String dni, char sexo, int telefono, Domicilio domicilio) 
	{
			this.nombre=nombre;
			this.edad=edad;
			this.dni=dni;
			this.sexo=sexo;
			this.telefono=telefono;
			this.domicilio=domicilio;
	}
	//consultores
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int edad) 
	{
			
			this.edad=edad;
		
	}
	public String getDNI()
	{
		return dni;
	}
	public void setDNI(String dni) 
	{
			
			this.dni=dni;
		
	}
	public char getSexo()
	{
		return sexo;
	}
	public void setSexo(char sexo) 
	{
		
			this.sexo=sexo;
	
	}
	public int getTelefono()
	{
		return telefono;
	}
	public void setTelefono(int telefono)
	{
		this.telefono=telefono;
	}
	public void setDomicilio(Domicilio domicilio)
	{
		this.domicilio=domicilio;
	}
	public Domicilio getDomicilio()
	{
		return domicilio;
	}
	//Metodos sobreescritos y sobrecargados
	@Override
	public String toString()
	{
		
		return nombre+", "+edad+", "+dni+", "+sexo+", "+telefono+", "+domicilio;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(nombre,sexo,edad,dni, domicilio,telefono);
	}
	//Orden natural: SerÃ¡ mayor el objeto cuyo nombre vaya antes
	public int compareTo(Persona persona)
	{
		int compara=0;
		if(this.nombre.compareTo(persona.getNombre())>0)
		{
			compara=1;
		}
		else if(this.nombre.compareTo(persona.getNombre())<0)
		{
			compara=-1;
		}
		return compara;
	}
	@Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		if(x!=null && x instanceof Persona)
		{
			Persona persona=(Persona) x;
			if(getNombre()==persona.getNombre()&&getEdad()==persona.getEdad()&&getSexo()==persona.getSexo()&&getDNI()==persona.getDNI())
			{
				igual=true;
			}
		}
		return igual;
	}
	@Override
	public Persona clone()
	{
		Persona copia=null;
		try
		{
			copia= (Persona)super.clone();
		}
		catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
	
}

