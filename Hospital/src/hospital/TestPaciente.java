package hospital;

public class TestPaciente {

	public static void main(String[] args) {
		
		Paciente paciente1=null;
		Paciente paciente2=null;
		Domicilio domicilio1=new Domicilio("PorAqui","Segovia",2);
				
		try
		{
			paciente1=new Paciente("Pepe","Jimene",23,"77813733H",'h',new Domicilio("Almirante Topete", "Sevilla",6),"653706957","Mapfre", true,new Medico());
			paciente2=new Paciente("AFK","Attempting to reconnect", 21,"77813733H",'m',new Domicilio("Felipe II","Villanueva del Trabuco",2),"736251834","No", false, new Medico());
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nombre: "+paciente1.getNombre());
		System.out.println("Edad: "+paciente1.getEdad());
		System.out.println("DNI: "+paciente1.getDNI());
		System.out.println("Sexo: "+paciente1.getSexo());
		System.out.println("Domicilio: "+paciente1.getDomicilio());
		System.out.println("Telefono: "+paciente1.getTelefono());
		System.out.println("Seguro Privado: "+paciente1.getSeguroPrivado());
		System.out.println("Medico: "+paciente1.getMedico());
		try
		{
			paciente1.setNombre("Pepo");
			paciente1.setEdad(50);
			paciente1.setDomicilio(domicilio1);
			paciente1.setTelefono("123456789");
			paciente1.setSeguroPrivado("Dado de baja");
			paciente1.setMedico(new Medico("Carlos","Alvarez",32,"77813733H",'h',new Domicilio("sada","gdh",5),"628472909","trauma"));
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo Nombre: "+paciente1.getNombre());
		System.out.println("Nuevo Edad: "+paciente1.getEdad());
		System.out.println("Nuevo Sexo: "+paciente1.getSexo());
		System.out.println("Nuevo Domicilio: "+paciente1.getDomicilio());
		System.out.println("Nuevo Telefono: "+paciente1.getTelefono());
		System.out.println("Nuevo Seguro Privado: "+paciente1.getSeguroPrivado());
		System.out.println("Nuevo medico: "+paciente1.getMedico());
		System.out.println("hashCode: "+paciente1.hashCode());
		System.out.println("toString: "+paciente1.toString());
		System.out.println("compareTo: "+paciente1.compareTo(paciente2));
		System.out.println("equals: "+paciente1.equals(paciente2));

	}

}
