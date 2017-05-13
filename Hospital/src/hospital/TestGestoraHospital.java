package hospital;

import java.io.*;


public class TestGestoraHospital 
{
	public static void main (String [] args)
	{
		GestoraHospital prueba = new GestoraHospital ();
		Object aux = null;
		ObjectInputStream ois = null;
		File archivo = new File ("./src/hospital/medicosContratados.dat");
		
		//prueba.registrarMedico ();
		//prueba.insertarMedicoDespedido("77925651H");
		//prueba.despedirMedico("13121432R");
		//prueba.listarMedicos();
		
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
			System.out.println("IOException2");
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
