package hospital;

import java.io.*;
import java.util.*;

public class GestoraHospital 
{
	/* Prototipo: void registrarMedico
	 * Breve comentario: Subprograma que lee los datos de un médico y lo añade al archivo correspondiente.
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: public void registrarMedico ()
		{
			System.out.println("Llamada al metodo registrarMedico");
		}
	 */
	
	public void registrarMedico ()
	{
		BufferedReader tecladoString = new BufferedReader (new InputStreamReader (System.in));
		Scanner teclado = new Scanner (System.in);
		Medico medico = null;
		Domicilio domicilio = null;
		
		try
		{
			medico = new Medico ();
			domicilio = new Domicilio ();
			
			do
			{
				System.out.println("Introduzca su nombre:");
				medico.setNombre(tecladoString.readLine ());
			}
			while (medico.getNombre().equals ("") || medico.getNombre ().equals (null));
			
			do
			{
				System.out.println("Introduzca sus apellidos:");
				medico.setApellidos(tecladoString.readLine ());
			}
			while (medico.getApellidos() .equals("") || medico.getApellidos ().equals (null));
			
			do
			{
				try
				{
					System.out.println("Introduzca su edad:");
					medico.setEdad(teclado.nextInt ());
				}
				catch (InputMismatchException e)
				{
					System.out.println("La edad debe ser un numero entero.");
					teclado.next();
				}
			}
			while (medico.getEdad() < 1);
			
			do
			{
				System.out.println("Introduzca su DNI:");
				medico.setDNI(tecladoString.readLine ());
			}
			while (medico.getDNI().length() != 9 && medico.validarNumerosDNI (medico.getDNI ()) && medico.getDNI ().charAt (8) != medico.calcularLetra (medico.getDNI ()));
			
			do
			{
				System.out.println("Introduzca su sexo: M/H");
				medico.setSexo(Character.toLowerCase(teclado.next().charAt (0)));
			}
			while (medico.getSexo() != 'm' && medico.getSexo() != 'h');
			
			do
			{
				System.out.println("Introduzca su telefono:");
				medico.setTelefono(tecladoString.readLine ());
			}
			while (medico.getTelefono ().length () != 9 || medico.validarNumerosTelefono (medico.getTelefono ()) == false);
			
			do
			{
				System.out.println("Introduzca su especialidad:");
				medico.setEspecialidad(tecladoString.readLine ());
			}
			while (medico.getEspecialidad ().equals("") || medico.getEspecialidad ().equals(null) 
					|| (medico.getEspecialidad ().equals("alergo") == false 
						&& medico.getEspecialidad().equals("trauma") == false 
						&& medico.getEspecialidad ().equals("pediatra") == false
						&& medico.getEspecialidad ().equals("neuro")
						&& medico.getEspecialidad ().equals("cardio")));
			
			do
			{
				System.out.println("Introduzca su calle:");
				domicilio.setCalle(tecladoString.readLine ());
			}
			while (domicilio.getCalle().equals("") || domicilio.getCalle().equals(null));
			
			do
			{
				System.out.println("Introduzca su ciudad:");
				domicilio.setCiudad(tecladoString.readLine ());
			}
			while (domicilio.getCiudad().equals("") || domicilio.getCiudad().equals(null));
			
			do
			{
				try
				{
					System.out.println("Introduzca el numero de su portal:");
					domicilio.setNumero(teclado.nextInt ());
				}
				catch (InputMismatchException e)
				{
					System.out.println("El numero del portal debe ser un entero.");
					teclado.next ();
				}
			}
			while (domicilio.getNumero() < 1);
			
			medico.setDomicilio(domicilio);
			
			insertarMedico (medico);
		}
		
		catch (HospitalException e)
		{
			System.out.println(e);
		}
		
		catch (IOException e)
		{
			System.out.println("IOException");
		}
	}
	//Fin registrarMedico
	
	/* Prototipo: void insertarMedico (Medico medico)
	 * Breve comentario: Subprograma que inserta a un medico en el archivo correspondiente
	 * Precondiciones: Ninguna
	 * Entradas: Un medico
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: 	public void insertarMedico (Medico medico)
		{
			System.out.println("Llamada al metodo insertarMedico ()");		
		}
	 */
	public void insertarMedico (Medico medico)
	{
		File medicosContratados = new File ("./src/hospital/medicosContratados.dat");
		ObjectOutputStream oos = null;
		
		try
		{
			oos = new ObjectOutputStream (new FileOutputStream (medicosContratados, true))
			{
				@Override protected void writeStreamHeader()
				{}
			};
			
			oos.writeObject(medico);
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("FileNotFoundException");
		}
		
		catch (IOException e)
		{
			System.out.println("IOException");
		}
		
		finally 
		{
			if (oos != null)
			{
				try
				{
					oos.close();
				}
				
				catch (IOException e)
				{
					System.out.println("IOException");
				}
			}
			
		}
	}
	//Fin insertarMedico
	
	
	
	//pruebas
	public static void main (String [] args)
	{
		
		Object pAux = null;
		
		File pepejava = new File ("pepejava.dat");
		ObjectInputStream ois = null;
		
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
			ois = new ObjectInputStream (fis);
			
			pAux = ois.readObject();
			
			if (pAux instanceof Persona)
			{
				while (true)
				{
					System.out.println(((Persona) pAux).toString ());
					
					pAux = ois.readObject();
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
			System.out.println("IOException");
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
	//pruebas

}
