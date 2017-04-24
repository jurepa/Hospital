package hospital;
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
public class Paciente implements Comparable<Paciente>, Cloneable
{
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private Domicilio domicilio;
	private int telefono;
	private String seguroPrivado;
	
	public Paciente()
	{
		nombre="";
		edad=1;
		dni="12345678A";
		sexo='h';
		domicilio=new Domicilio();
		telefono=123456789;
		seguroPrivado="";
	}
	public Paciente(String nombre, int edad, String dni, char sexo, Domicilio domicilio, int telefono, String seguroPrivado)
	{
		
	}
	

}
