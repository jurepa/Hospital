package hospital;

public class TestMedico {

	public static void main(String[] args) 
	{
		//nombre,edad,dni,sexo,telefono,domicilio
		Medico medico1;
		try
		{
			medico1=new Medico("Pepe","Jimene",60,"34273121",'m',new Domicilio(),"653826350","Pediatria");
		}catch(HospitalException mensaje)
		{
			System.out.println(mensaje);
		}
				
		

	}

}
