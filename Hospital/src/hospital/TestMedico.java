package hospital;

public class TestMedico {

	public static void main(String[] args) 
	{
		//nombre,edad,dni,sexo,telefono,domicilio
		Medico medico1=null;
		Medico medico2=null;
		try
		{
			medico1=new Medico("Pepe","Jimene",60,"77813733H",'m',new DomicilioIMPL("ConDio","Sevilla",5),"653826350","pediatra");
			medico2=new Medico("Joselito","El Gallo",38,"77813733H",'h',new DomicilioIMPL("Av del Rebujito","Montellano",4),"646384750","alergo");
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nombre: "+medico1.getNombre());
		try
		{
			medico1.setNombre("Joselito");
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo Nombre: "+medico1.getNombre());
		System.out.println("Apellidos: "+medico1.getApellidos());
		try
		{
			medico1.setApellidos("El Gallo");
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevos Apellidos: "+medico1.getApellidos());		
		System.out.println("Edad: "+medico1.getEdad());
		try
		{
			medico1.setEdad(38);
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nueva Edad: "+medico1.getEdad());
		System.out.println("DNI: "+medico1.getDNI());
		System.out.println("Sexo: "+medico1.getSexo());
		try
		{
			medico1.setSexo('h');
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo Sexo: "+medico1.getSexo());
		System.out.println("Domicilio: "+medico1.getDomicilio());
		try
		{
			medico1.setDomicilio(new DomicilioIMPL("Av del Rebujito","Montellano",4));
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Telefono: "+medico1.getTelefono());
		try
		{
			medico1.setTelefono("646384750");
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo Telefono: "+medico1.getTelefono());
		System.out.println("Especialidad: "+medico1.getEspecialidad());
		try
		{
			medico1.setEspecialidad("alergo");
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nueva Especialidad: "+medico1.getEspecialidad());
		System.out.println("M�todos sobrecargados y sobreescritos");
		System.out.println();
		System.out.println("hashCode: "+medico1.hashCode());
		System.out.println("toString: "+medico1.toString());
		System.out.println("equals: "+medico1.equals(medico2));
	}

}
