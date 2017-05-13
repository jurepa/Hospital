package hospital;

import java.io.Serializable;
import java.util.Objects;

/*
 * CLASE PERSONA 
 * 
 * Propiedades básicas:
 * 
 * Nombre-> String Consultable y modificable
 * Apellidos-> String Consultable y modificable
 * Edad-> Entero consultable y modificable
 * DNI-> String consultable
 * Sexo-> Char consultable y modificable
 * Telefono-> String consultable y modificable
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
 * String getApellidos()
 * void setApellidos(String apellidos)
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
 * String getTelefono()
 * void setTelefono(String telefono)
 * 
 * Domicilio getDomicilio()
 * void setDomicilio(Domicilio domicilio)
 * 
 * 
 * Restricciones:
 * 
 * -La edad debe ser igual o mayor a 0
 * -El DNI debe tener 8 numeros y una letra valida
 * -El caracter del sexo debe ser M(mujer) o H(hombre)
 * -El teléfono debe tener 9 números
 * - El domicilio no puede ser null
 * 
 * Metodos añadidos
 * 
 * calcularLetra()
 * validarNumerosDNI()
 * validarNumerosTelefono()
 * 
 */

public class Persona implements Cloneable, Comparable <Persona>, PersonaIMPL, Serializable{
	

	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	private char sexo;
	private Domicilio domicilio;
	private String telefono;
	
	//constructores
	//vacÃ­o
	public Persona()
	{
		nombre="";
		apellidos="";
		edad=0;
		dni="";
		sexo=' ';
		domicilio=new Domicilio();

	}
	//De copia
	public Persona(Persona persona)
	{
		this.nombre=persona.nombre;
		this.apellidos=persona.apellidos;
		this.edad=persona.edad;
		this.dni=persona.dni;
		this.sexo=persona.sexo;
		this.telefono=persona.telefono;
		this.domicilio=persona.domicilio;
	}
	//Ordinario
	public Persona (String nombre, String apellidos, int edad, String dni, char sexo, String telefono, Domicilio domicilio) throws HospitalException 
	{
			if (apellidos.equals("") || apellidos.equals (null)
				|| nombre.equals ("") || nombre.equals (null)
				|| edad < 0
				|| (dni.length () == 9 && validarNumerosDNI (dni) && dni.charAt (8) == calcularLetra (dni))
				|| (sexo != 'h' && sexo != 'm')
				|| (telefono.length () != 9 || validarNumerosTelefono (telefono) == false)
				|| (domicilio == null || domicilio.getCalle ().equals ("") || domicilio.getCiudad ().equals ("") || domicilio.getNumero () <= 0))
			{
				if (apellidos.equals("") || apellidos.equals(null))
				{
					throw new HospitalException("Apellido incorrecto");	
				}
				
				else if (nombre.equals ("") || nombre.equals (null))
				{
					throw new HospitalException("Nombre incorrecto");	
				}
				
				else if (edad < 0)
				{
					throw new HospitalException("Edad incorrecta, debe ser mayor a 0");
				}
				
				else if (dni.length () == 9 && validarNumerosDNI (dni) && dni.charAt (8) == calcularLetra (dni))
				{
					throw new HospitalException("DNI incorrecto, debes introducir los 8 números de tu DNI");
				}
				
				else if (sexo != 'h' && sexo != 'm')
				{
					throw new HospitalException("El sexo debe ser 'H'(Hombre) o 'M'(Mujer)");
				}
				
				else if (telefono.length () != 9 || validarNumerosTelefono (telefono) == false)
				{
					throw new HospitalException("El telefono debe contener 9 numeros");
				}
				
				else if (domicilio == null || domicilio.getCalle ().equals ("") || domicilio.getCiudad ().equals ("") || domicilio.getNumero () <= 0)
				{
					throw new HospitalException("El domicilio debe tener una calle, una ciudad y un numero mayor que 0");
				}
			}
			else
			{
				this.apellidos=apellidos;
				this.nombre=nombre;
				this.edad=edad;
				this.dni=dni;
				this.sexo=sexo;
				this.telefono=telefono;
				this.domicilio=domicilio;
			}
	}
	//consultores
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre) throws HospitalException
	{
		if(nombre.equals("")||nombre.equals(null))
		{
				throw new HospitalException("Nombre incorrecto");	
		}
		else
		{
			this.nombre=nombre;
		}
	}
	public String getApellidos()
	{
		return apellidos;
	}
	public void setApellidos(String apellidos)throws HospitalException
	{
		if(apellidos.equals("")||apellidos.equals(null))
		{
				throw new HospitalException("Nombre incorrecto");	
		}
		else
		{
			this.apellidos=apellidos;
		}
	}
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int edad) throws HospitalException 
	{
			
		if(edad>0)
		{
			this.edad=edad;
		}
		else
		{
			throw new HospitalException("Edad incorrecta, debe ser mayor a 0");
		}
		
	}
	public void setDNI(String dni) throws HospitalException
	{
		if(dni.length()==9&&validarNumerosDNI(dni)&&dni.charAt(8)==calcularLetra(dni))
		{
			this.dni=dni;
		}
		else
		{
			throw new HospitalException("DNI incorrecto");
		}
	}
	public String getDNI()
	{
		return dni;
	}
	public char getSexo()
	{
		return sexo;
	}
	public void setSexo(char sexo) throws HospitalException 
	{
		
		if(sexo=='h'||sexo=='m')
		{
			this.sexo=sexo;
		}
		else
		{
			throw new HospitalException("El sexo debe ser 'H'(Hombre) o 'M'(Mujer)");
		}
	
	}
	public String getTelefono()
	{
		return telefono;
	}
	public void setTelefono(String telefono) throws HospitalException
	{
		if(telefono.length()==9&&validarNumerosTelefono(telefono))
		{
			this.telefono=telefono;
		}
		else
		{
			throw new HospitalException("El telefono debe contener 9 numeros");
		}
	}
	public void setDomicilio(Domicilio domicilio) throws HospitalException
	{
		if(domicilio==null||domicilio.getCalle().equals("")||domicilio.getCiudad().equals("")||domicilio.getNumero()<=0)
		{
			
			throw new HospitalException("El domicilio debe tener una calle, una ciudad y un numero mayor que 0");
		}
		else
		{
			this.domicilio=domicilio;
		}
	}
	public Domicilio getDomicilio()
	{
		return domicilio;
	}
	//Metodos sobreescritos y sobrecargados
	@Override
	public String toString()
	{
		
		return nombre+", "+apellidos+", "+edad+", "+dni+", "+sexo+", "+telefono+", "+domicilio;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(nombre,apellidos,sexo,edad,dni, domicilio,telefono);
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
		if(x != null && x instanceof Persona)
		{
			Persona persona=(Persona) x;
			if(this.getNombre().equals(persona.getNombre())
				&& this.getEdad() == persona.getEdad()
				&& this.getSexo() == persona.getSexo()
				&& this.getDNI().equals(persona.getDNI()))
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
	 * Este método valida que los primeros 7 números de un dni sean números
	 * Prototipo: boolean validarNumerosDNI(String dni)
	 * Precondiciones: No hay
	 * Entradas: Una cadena
	 * Salidas: Un valor booleano
	 * Postcondiciones: True si son números y false si no lo son
	 * E/S: No hay
	 */
	public boolean validarNumerosDNI(String dni)
	{
		boolean sonNumeros=true;
		 for (int i=0; sonNumeros==true&&i<8; i++) 
		 {
             if(!Character.isDigit(dni.charAt(i)))
             {
                   sonNumeros= false;    
             } 
        }
		return sonNumeros;
	}
	/*
	 * Interfaz
	 * 
	 * Este método valida que el telefono son numeros
	 * Prototipo: boolean validarNumerosTelefono(String telefono)
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: Un valor booleano
	 * Postcondiciones: True si son números y false si no lo son
	 * E/S: No hay
	 */
	public boolean validarNumerosTelefono(String telefono)
	{
		boolean sonNumeros=true;
		 for (int i=0; sonNumeros==true&&i<9; i++) 
		 {
             if(!Character.isDigit(telefono.charAt(i)))
             {
                   sonNumeros= false;    
             } 
        }
		return sonNumeros;
	}
	/*
	 * Interfaz
	 * 
	 * Este método calcula la letra de un dni
	 * Prototipo: char calcularLetra(String dni)
	 * Precondiciones: Un dni sin letra
	 * Entrada: Una cadena
	 * Salida: Un char
	 * Postcondiciones: La letra será de la A a la Z
	 * E/S: No hay
	 */
	public char calcularLetra(String dni)
	{
		String letrasDNI="TRWAGMYFPDXBNJZSQVHLCKET";
		String letras=dni.substring(0, 8);
		int aux,posicion;
		char letra;
		aux=Integer.parseInt(letras);
		posicion=aux%23;
		letra=letrasDNI.charAt(posicion);
		return letra;
	}
	
}

