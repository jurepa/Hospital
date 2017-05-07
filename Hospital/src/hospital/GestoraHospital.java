package hospital;

import java.io.*;

public class GestoraHospital 
{
	/* Prototipo: 
	 * Breve comentario: Subprograma que da de baja un Paciente.
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 */
	
	//
	
	//pruebas
	public static void main (String [] args)
	{
		
		Object pAux = null;
		
		File pepejava = new File ("pepejava.dat");
		
		Persona p0 = null;
		Persona p1 = null;
		Persona p2 = null;
		Persona p3 = null;
		
		// String nombre, String apellidos, int edad, String dni, char sexo, String telefono, Domicilio domicilio (calle, ciudad y numero)
		
		try
		{
			
			FileOutputStream fos = new FileOutputStream (pepejava);
			ObjectOutputStream oos = new ObjectOutputStream (fos);

				p0 = new Persona ("Pablo", "Chavalator1", 16, "77925631", 'h', "954456545", new Domicilio ("Pepejava1 Street", "El kelo", 3));
				p1 = new Persona ("Juan", "Chavalator2", 17, "77924651", 'h', "954236545", new Domicilio ("Pepejava2 Street", "El kelo", 4));
				p2 = new Persona ("Nzhdeh", "Chavalator3", 18, "77225651", 'h', "952256545", new Domicilio ("Pepejava3 Street", "El kelo", 5));
				p3 = new Persona ("Firewall", "Chavalator4", 19, "71925651", 'h', "954266545", new Domicilio ("Pepejava4 Street", "El kelo", 6));
				
			
			oos.writeObject(p0);
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
			oos.close();
			
		}
		
		catch (IOException e)
		{
			System.out.println("rip in pepperonnis");
		}
		
		catch (HospitalException e)
		{
			System.out.println(e);
		}
		
		
		try
		{
			FileInputStream fis = new FileInputStream (pepejava);
			ObjectInputStream ois = new ObjectInputStream (fis);
			
			pAux = ois.readObject();
			
			if (pAux instanceof Persona)
			{
				for (int i = 0; i < pepejava.length() && pAux != null; i++)
				{
					System.out.println(((Persona) pAux).toString ());
					
					pAux = ois.readObject();
				}
			}
			
			ois.close();
		}
		
		catch (IOException e)
		{
			System.out.println("fail");
		}
		
		catch (ClassNotFoundException e)
		{
			System.out.println("ClassNotFound");
		}
	}
	//pruebas

}
