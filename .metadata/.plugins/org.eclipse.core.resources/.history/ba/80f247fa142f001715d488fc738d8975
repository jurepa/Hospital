package hospital;

import java.util.Objects;

/*
 * CLASE PERSONA 
 * 
 * Propiedades básicas:
 * 
 * Nombre-> String Consultable y modificable
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
 * int getEdad();
 * void setEdad(int edad)
 * 
 * String getDNI();
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
 * -El DNI debe tener 8 numeros y una letra calculada
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

public class Persona implements Cloneable, Comparable <Persona>{
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private Domicilio domicilio;
	private String telefono;
	
	//constructores
	//vacÃ­o
	public Persona()
	{
		nombre="Paco";
		edad=0;
		dni="12345678"+calcularLetra(dni);
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
	public Persona (String nombre, int edad, String dni, char sexo, String telefono, Domicilio domicilio) throws HospitalException 
	{
			if(nombre==""||nombre==null)
			{
					throw new HospitalException("Nombre incorrecto");	
			}
			else
			{
				this.nombre=nombre;
			}
			if(edad>0)
			{
				this.edad=edad;
			}
			else
			{
				throw new HospitalException("Edad incorrecta, debe ser mayor a 0");
			}
			if(dni.length()==8&&validarNumerosDNI(dni))
			{
				this.dni=dni+calcularLetra(dni);
			}
			else
			{
				throw new HospitalException("DNI incorrecto, debes introducir los 8 números de tu DNI");
			}
			if(sexo=='h'||sexo=='m')
			{
				this.sexo=sexo;
			}
			else
			{
				throw new HospitalException("El sexo debe ser 'H'(Hombre) o 'M'(Mujer)");
			}
			if(telefono.length()==9&&validarNumerosTelefono(telefono))
			{
				this.telefono=telefono;
			}
			else
			{
				throw new HospitalException("El telefono debe contener 9 numeros");
			}
			
			if(domicilio==null||domicilio.getCalle()==""||domicilio.getCiudad()==""||domicilio.getNumero()<=0)
			{
				throw new HospitalException("El domicilio debe tener una calle, una ciudad y un numero mayor que 0");
			}
			else
			{
				
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
		if(nombre==""||nombre==null)
		{
				throw new HospitalException("Nombre incorrecto");	
		}
		else
		{
			this.nombre=nombre;
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
		if(domicilio==null||domicilio.getCalle()==""||domicilio.getCiudad()==""||domicilio.getNumero()<=0)
		{
			this.domicilio=domicilio;
		}
		else
		{
			throw new HospitalException("El domicilio debe tener una calle, una ciudad y un numero mayor que 0");
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
	//Métodos añadidos
	/*
	 * Interfaz
	 * 
	 * Este método valida que los primeros 7 números de un dni sean números
	 * Prototipo: boolean validarNumerosDNI()
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
	 * Prototipo: boolean validarNumerosTelefono()
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
	 * Prototipo: char calcularLetra()
	 * Precondiciones: Un dni sin letra
	 * Entrada: Una cadena
	 * Salida: Un char
	 * Postcondiciones: La letra será de la A a la Z
	 * E/S: No hay
	 */
	private char calcularLetra(String dni)
	{
		String letrasDNI="TRWAGMYFPDXBNJZSQVHLCKET";
		int aux,posicion;
		char letra;
		aux=Integer.parseInt(dni);
		posicion=aux%23;
		letra=letrasDNI.charAt(posicion);
		return letra;
	}
	
}

