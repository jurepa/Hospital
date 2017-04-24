package Persona;
/*
 * CLASE PERSONA 
 * 
 * Propiedades relevantes:
 * 
 * Nombre-> String Consultable y modificable
 * Edad-> Entero consultable y modificable
 * DNI-> String consultable y modificable
 * Sexo-> Char consultable y modificable
 * Peso -> Double consultable y modificable
 * Altua -> Double consultable y modificable
 * 
 * Propiedades derivadas:
 * 
 * IMC -> Double consultable
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
 * double getPeso();
 * void setPeso(double peso)
 * 
 * double getAltura()
 * void setAltura(double altura)
 * 
 * double getIMC()
 * 
 * Restricciones:
 * 
 * -La edad debe ser igual o mayor a 0
 * -El DNI debe tener 9 caracteres
 * -El carácter del sexo debe ser M(mujer) o H(hombre)
 * -El peso y la altura deben ser mayor a 0
 * 
 * Métodos añadidos
 * 
 * public boolean mayorEdad(int edad)
 *  
 * 
 */

public class Persona implements Cloneable, Comparable <Persona>{
	
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	
	//constructores
	//vacío
	public Persona()
	{
		nombre="Paco";
		edad=0;
		DNI="12345678A";
		sexo='h';
		peso=0.0;
		altura=0.0;
	}
	//De copia
	public Persona(Persona persona)
	{
		this.nombre=persona.nombre;
		this.edad=persona.edad;
		this.DNI=persona.DNI;
		this.sexo=persona.sexo;
		this.peso=persona.sexo;
		this.altura=persona.altura;
	}
	//Ordinario
	public Persona (String nombre, int edad, String DNI, char sexo, double peso, double altura) throws ExcepcionPersona
	{
		this.nombre=nombre;
		if(edad>=1||edad<=99)
		{
			this.edad=edad;
		}
		else
		{
			ExcepcionPersona ExcepcionEdad= new ExcepcionPersona("La edad no es valida, debe estar comprendida entre 1 y 99");
		}
		if(DNI.length()==9)
		{
			this.DNI=DNI;
		}
		else
		{
			ExcepcionPersona ExcepcionDNI=new ExcepcionPersona("El DNI debe tener 9 caracteres");
		}
		if(sexo=='h'||sexo=='m')
		{
			this.sexo=sexo;
		}
		else
		{
			ExcepcionPersona ExcepcionSexo= new ExcepcionPersona("El sexo no es valido, M para mujer y H para hombre");
		}
		if(peso>0)
		{
			this.peso=peso;
		}
		else
		{
			ExcepcionPersona ExcepcionPeso= new ExcepcionPersona("Peso incorrecto, debe ser mayor que 0");
		}
		if(altura>0)
		{
			this.altura=altura;
		}
		else
		{
			ExcepcionPersona ExcepcionAltura= new ExcepcionPersona("Altura incorrecta, debe ser mayor que 0");
		}
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
	public void setEdad(int edad) throws ExcepcionPersona
	{
		if(edad>=1&&edad<=99)
		{	
			this.edad=edad;
		}
		else
		{
			ExcepcionPersona ExcepcionEdad= new ExcepcionPersona("La edad no es valida, debe estar comprendida entre 1 y 99");
		}
	}
	public String getDNI()
	{
		return DNI;
	}
	public void setDNI(String DNI) throws ExcepcionPersona
	{
		if(DNI.length()==9)
		{	
			this.DNI=DNI;
		}
		else
		{
			ExcepcionPersona ExcepcionDNI=new ExcepcionPersona("El DNI no es valido, debe tener 9 caracteres");
		}
	}
	public char getSexo()
	{
		return sexo;
	}
	public void setSexo(char sexo) throws ExcepcionPersona
	{
		if(sexo=='m' || sexo=='h')
		{
			this.sexo=sexo;
		}
		else
		{
			ExcepcionPersona ExcepcionSexo= new ExcepcionPersona("El sexo no es valido, M para mujer y H para hombre");
		}
	}
	public double getPeso()
	{
		return peso;
	}
	public void setPeso(double peso) throws ExcepcionPersona
	{
		if(peso>0)
		{
			this.peso=peso;
		}
		else
		{
			ExcepcionPersona ExcepcionPeso= new ExcepcionPersona("Peso incorrecto, debe ser mayor que 0");
		}
	}
	public double getAltura()
	{
		return altura;
	}
	public void setAltura(double altura) throws ExcepcionPersona
	{
		if(altura>0)
		{	
			this.altura=altura;
		}
		else
		{
			ExcepcionPersona ExcepcionAltura= new ExcepcionPersona("Altura incorrecta, debe ser mayor que 0");
		}
	}
	public double getIMC()
	{
		return (peso/(Math.pow(altura,2)));
	}
	//Métodos sobreescritos y sobrecargados
	@Override
	public String toString()
	{
		String s="Nombre: "+nombre+", Edad: "+edad+", DNI: "+DNI+", Sexo: "+sexo+", Peso: "+peso+", Altura: "+ altura;
		return s;
	}
	@Override
	public int hashCode()
	{
		return ((int)((edad*peso*altura*11311)/3));
	}
	//Orden natural: Será mayor el objeto cuyo nombre vaya antes
	public int compareTo(Persona persona)
	{
		int compara=0;
		if(this.nombre.charAt(0)>persona.nombre.charAt(0))
		{
			compara=1;
		}
		else if(this.nombre.charAt(0)<persona.nombre.charAt(0))
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
			if(getNombre()==persona.getNombre()&&getEdad()==persona.getEdad()&&getSexo()==persona.getSexo()&&getDNI()==persona.getDNI()&&getPeso()==persona.getPeso()&&getAltura()==persona.getAltura())
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
	
	//Métodos añadidos
	/*
	 * Interfaz
	 * 
	 * Este subprograma indica si es mayor de edad o no
	 * Prototipo: public boolean mayorEdad(int edad)
	 * Precondiciones: La edad está situada entre 0 y 99, ambos inclusive
	 * Entrada: Un número entero
	 * Salida: Un valor booleano
	 * Postcondiciones: True si es mayor de edad y false si no lo es
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public boolean mayorEdad(int edad)
	 * {
	 *		return false;
	 * }
	 */
	public boolean mayorEdad(int edad)
	{
		boolean esMayor=false;
		if(edad>=18)
		{
			esMayor=true;
		}
		return esMayor;
	}
	
	/*
	 * Interfaz
	 * 
	 * Este subprograma indica si está en su peso ideal, con sobrepeso o por debajo de su peso ideal
	 * Prototipo: public int pesoIdeal()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: Un número entero
	 * Postcondiciones: 1 si está en sobrepeso, 0 si está en su peso ideal y -1 si está por debajo
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public int pesoIdeal()
	 * {
	 * 		return 1;
	 * }
	 */
	public int pesoIdeal()
	{
		int pesoIdeal=0;
		if(getIMC()<=20)
		{
			pesoIdeal=-1;
		}
		else if (getIMC()>25)
		{
			pesoIdeal=1;
		}
		return pesoIdeal;
	}
}

