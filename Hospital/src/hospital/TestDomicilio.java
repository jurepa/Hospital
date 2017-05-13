package hospital;

public class TestDomicilio 
{
	public static void main (String[]args) throws HospitalException
	{
		Domicilio domicilio1=new Domicilio("PorAlli","Madrid",5);
		Domicilio domicilio2=new Domicilio("PorAqui","Segovia",2);
		
		System.out.println("Calle: "+domicilio1.getCalle());
		domicilio1.setCalle("Calle Felipe II");
		System.out.println("Nueva calle: "+domicilio1.getCalle());
		System.out.println("Ciudad: "+domicilio1.getCiudad());
		domicilio1.setCiudad("Sevilla");
		System.out.println("Nueva ciudad: "+domicilio1.getCiudad());
		System.out.println("Numero: "+domicilio1.getNumero());
		domicilio1.setNumero(1);
		System.out.println("Nuevo numero: "+domicilio1.getNumero());
		System.out.println("hashCode: "+domicilio1.hashCode());
		System.out.println("toString: "+domicilio1.toString());
		System.out.println("equals: "+domicilio1.equals(domicilio2));
		System.out.println("clone: "+domicilio1.clone());
	}
	
}
