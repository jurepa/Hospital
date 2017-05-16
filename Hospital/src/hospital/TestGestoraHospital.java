package hospital;

import java.io.*;


public class TestGestoraHospital
{
	public static void main (String [] args) throws HospitalException
	{
		GestoraHospital prueba = new GestoraHospital ();
		GestoraJaraneitor prueba2 = new GestoraJaraneitor ();
		Object aux = null;
		ObjectInputStream ois = null;
		File archivo = new File ("./src/hospital/medicosContratados.dat");
		
		//Paciente paciente = new Paciente("Pepe","Jimene",23,"77925651H",'h',new DomicilioIMPL("Almirante Topete", "Sevilla",6),"653706957","Mapfre", true,new Medico());
		
		//prueba.registrarMedico ();
		//prueba.insertarMedicoDespedido("77925651H");
		//prueba.despedirMedico("77925651H");
		//prueba.listarMedicos();
		//prueba.asignarPaciente(paciente, "77925651H");
		//prueba.listarPacientesMedico("77925651H");
		prueba.listarMedicos ();
		//prueba.asignarPaciente(new Paciente("Pepe","Jimene",23,"77925651H",'h',new DomicilioIMPL("Almirante Topete", "Sevilla",6),"653706957","mapfre", true,new Medico()), "77925651H");
		
		try
		{
			FileInputStream fis = new FileInputStream (archivo);
			ois = new ObjectInputStream (fis){@Override protected void readStreamHeader(){}};;
			
			aux = ois.readObject();
			
			if (aux instanceof Medico)
			{
				while (true)
				{
					System.out.println(((Medico) aux).toString ());
					
					aux = ois.readObject();
				}
			}
			
			ois.close();
		}
		
		catch (ClassNotFoundException e)
		{
			System.out.println("ClassNotFound");
		}
		
		catch (EOFException e)
		{
			System.out.println("xd");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		finally 
		{
			try
			{
				if (ois != null)
				{
					ois.close ();
				}
			}
			catch (IOException e)
			{
				System.out.println("IOE");
			}
		}
	}
}
