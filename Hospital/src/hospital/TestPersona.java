package hospital;

public class TestPersona 
{
	public static void main(String[]args)
	{
		Persona persona1=null;
		Persona persona2=null;
		try
		{
			persona1=new Persona("Pepe",69,"78937263",'h',"954611957", new Domicilio("Almirante Topete","Sevilla",6));
			persona2=new Persona("Java",50,"72358351",'m',"237424442",new Domicilio("PorAqui","Villanueva del Trabuco",2));
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nombre: "+persona1.getNombre());
		try
		{
			persona1.setNombre("Ultimate Chavalator-3000");
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo Nombre: "+persona1.getNombre());
		System.out.println("Edad: "+persona1.getEdad());
		try
		{
			persona1.setEdad(0);
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nueva Edad: "+persona1.getEdad());
		System.out.println("DNI: "+persona1.getDNI());
		try
		{
			persona1.setDNI("123456r8");
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo DNI: "+persona1.getDNI());
		System.out.println("Domicilio: "+persona1.getDomicilio());
		System.out.println("Sexo: "+persona1.getSexo());
		try
		{
			persona1.setSexo('7');
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo sexo: "+persona1.getSexo());
		System.out.println("Telefono: "+persona1.getTelefono());
		try
		{
			persona1.setTelefono("9546119e7");
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo telefono: "+persona1.getTelefono());
		System.out.println("hashCode: "+persona1.hashCode());
		System.out.println("toString: "+persona1.toString());
		System.out.println("compareTo: "+persona1.compareTo(persona2));
		System.out.println("equals: "+persona1.equals(persona2));
	}
}
