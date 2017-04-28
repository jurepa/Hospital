package hospital;

public class TestPaciente {

	public static void main(String[] args) {
		
		Paciente paciente1=null;
		Paciente paciente2=null;
		Domicilio domicilio1=new Domicilio("PorAqui","Segovia",2);
				
		try
		{
			paciente1=new Paciente("Pepe",23,"73826490",'h',new Domicilio("Almirante Topete", "Sevilla",6),"653706957","Mapfre");
			paciente2=new Paciente("AFK", 21,"42839475",'m',new Domicilio("Felipe II","Villanueva del Trabuco",2),"7362518347","No");
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
		try
		{
			paciente1.setNombre("Pepo");
			paciente1.setEdad(50);
			paciente1.setDomicilio(domicilio1);
			paciente1.setTelefono("123456789");
			paciente1.setSeguroPrivado("Dado de baja");
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
		

	}

}