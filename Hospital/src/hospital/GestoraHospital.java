package hospital;

import java.io.*;
import java.util.*;

public class GestoraHospital 
{
	/* Prototipo: void registrarMedico
	 * Breve comentario: Subprograma que lee los datos de un m�dico y lo a�ade al archivo correspondiente.
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
		DomicilioIMPL domicilio = null;
		
		try
		{
			medico = new Medico ();
			domicilio = new DomicilioIMPL ();
			
			do
			{
				try
				{
					System.out.println("Introduzca su nombre:");
					medico.setNombre(tecladoString.readLine ());
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}
			while (medico.getNombre().equals ("") || medico.getNombre ().equals (null));
			
			do
			{
				try
				{
					System.out.println("Introduzca sus apellidos:");
					medico.setApellidos(tecladoString.readLine ());
				
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
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
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}
			while (medico.getEdad() < 1);
			
			do
			{
				try
				{
					System.out.println("Introduzca su DNI:");
					medico.setDNI(tecladoString.readLine ());
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}
			while (medico.getDNI().length() != 9 && medico.validarNumerosDNI (medico.getDNI ()) && medico.getDNI ().charAt (8) != medico.calcularLetra (medico.getDNI ()));
			
			do
			{
				try
				{
					System.out.println("Introduzca su sexo: H/M");
					medico.setSexo(Character.toLowerCase(teclado.next().charAt (0)));
				
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}
			while (medico.getSexo() != 'm' && medico.getSexo() != 'h');
			
			do
			{
				try
				{
					System.out.println("Introduzca su telefono:");
					medico.setTelefono(tecladoString.readLine ());
				
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}
			while (medico.getTelefono ().length () != 9 || medico.validarNumerosTelefono (medico.getTelefono ()) == false);
			
			do
			{
				try
				{
					System.out.println("Introduzca su especialidad:");
					medico.setEspecialidad(tecladoString.readLine ());
				
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}
			while (medico.getEspecialidad ().equals("") || medico.getEspecialidad ().equals(null) 
					|| (medico.getEspecialidad ().equals("alergo") == false 
						&& medico.getEspecialidad().equals("trauma") == false 
						&& medico.getEspecialidad ().equals("pediatra") == false
						&& medico.getEspecialidad ().equals("neuro")
						&& medico.getEspecialidad ().equals("cardio")));
			
			do
			{
				try
				{
					System.out.println("Introduzca su calle:");
					domicilio.setCalle(tecladoString.readLine ());
				
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}
			while (domicilio.getCalle().equals("") || domicilio.getCalle().equals(null));
			
			do
			{
				try
				{
					System.out.println("Introduzca su ciudad:");
					domicilio.setCiudad(tecladoString.readLine ());
					
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
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
				
				catch (HospitalException e)
				{
					System.out.println(e);
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
	
	/* Prototipo: void insertarMedicoDespedido (String dni)
	 * Breve comentario: Escribe el medico a despedir en el fichero de medicos despedidos.
	 * Precondiciones: Ninguna
	 * Entradas: Una cadena indicando el dni del m�dico.
	 * Salidas: Ninguna.
	 * Entradas/Salidas: Ninguna.
	 * Postcondiciones: Ninguna.
	 * 
	 * Resguardo: public void insertarMedicoDespedido (String dni)
		{
			System.out.println("Llamada al metodo insertarMedicoDespedido");
		}
	 */
	public void insertarMedicoDespedido (String dni)
	{
		File medicosContratados = new File ("./src/hospital/medicosContratados.dat");
		File medicosDespedidos = new File ("./src/hospital/medicosDespedidos.dat");
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Object aux = null;
		boolean lee = true;
		boolean encontrado = false;
		
		try
		{
			oos = new ObjectOutputStream (new FileOutputStream (medicosDespedidos, true))
			{
				@Override protected void writeStreamHeader(){}
			};
			
			ois = new ObjectInputStream (new FileInputStream (medicosContratados))
			{
				@Override protected void readStreamHeader(){}
			};
			
			aux = ois.readObject();
			
			if (aux instanceof Medico)
			{
				while (aux.equals(null)==false && encontrado == false)
				{
					if (((Medico) aux).getDNI ().equals (dni))
					{
						oos.writeObject(aux);
						encontrado = true;
					}
					
					aux = ois.readObject();
				}
			}
			
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("FileNotFoundException");
		}
		
		catch (EOFException e)
		{
		}
		
		catch (IOException e)
		{
			System.out.println("IOException");
		}
		
		catch (ClassNotFoundException e)
		{
			System.out.println("ClassNotFoundException");
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
					System.out.println("IOException cerrar oos");
				}
			}
			
			if (ois != null) 
			{
				try
				{
					ois.close();
				}
				
				catch (IOException e)
				{
					System.out.println("IOException cerrar ois");
				}
			}
		}
	}
	//fin insertarMedicoDespedido
	
	/* Prototipo: boolean despedirMedico (String dni);
	 * Breve comentario: Elimina a un medico del fichero de medicosContratados
	 * Precondiciones: Nnguna
	 * Entradas: Un string indicando el dni del medico
	 * Salidas: Un boolean
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: True si se ha borrado con exito, false sino.
	 * 
	 * Resguardo: 	public boolean despedirMedico (String dni)
		{
			System.out.println("Llamada al metodo despedirMedico");
		}
	 */
	public boolean despedirMedico (String dni)
	{
		File medicosContratados = new File ("./src/hospital/medicosContratados.dat");
		File auxiliar = new File ("./src/hospital/auxiliar.dat");
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Object aux = null;
		boolean lee = true;
		boolean borrado = false;
		
		//if (medicosContratados.exists())
	//	{
			
			try
			{
				oos = new ObjectOutputStream (new FileOutputStream (auxiliar, true))
					{
						@Override protected void writeStreamHeader () {}
					};
					
				ois = new ObjectInputStream (new FileInputStream (medicosContratados))
					{
						@Override protected void readStreamHeader () {}
					};
					
				aux = ois.readObject();
				
				while (!aux.equals(null))
				{
					if (aux instanceof Medico)
					{
						if (((Medico) aux).getDNI ().equals (dni))
						{
							borrado = true;
							insertarMedicoDespedido(dni);
						}
						
						else
						{
							oos.writeObject(aux);
						}
					}
					
					aux = ois.readObject();
				}
			}
			
			catch (FileNotFoundException e)
			{
				System.out.println("FileNotFoundException");
			}
			
			catch (EOFException e)
			{
			}
			
			catch (IOException e)
			{
				System.out.println("IOException");
			}
			
			catch (ClassNotFoundException e)
			{
				System.out.println("ClassNotFoundException");
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
						System.out.println("IOException cerrar oos");
					}
				}
				
				if (ois != null)
				{
					try
					{
						ois.close();
					}
					
					catch (IOException e)
					{
						System.out.println("IOException cerrar ois");
					}
				}
			}
			
			medicosContratados.delete();
			auxiliar.renameTo(medicosContratados);
		//}
		
		return borrado;
	}
	//Fin despedirMedico
	
	/* Prototipo: void contarmedicos ();
	 * Breve comentario: Metodo que cuenta el numero de m�dicos que hay en un archivo
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
	 * Salidas: Un entero
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Un entero indicando el numero de m�dicos que hay en el archivo
	 * 
	 * Resguardo: public int contarMedicos ()
		{
			System.out.println("Llamada al metodo contarMedicos");
			return (-1);
		}
	 */
	public int contarMedicos ()
	{
		File pacientesContratados = new File ("./src/hospital/medicosContratados.dat");
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Object aux = null;
		boolean lee = true;
		int contador = 0;
		
		try
		{
			ois = new ObjectInputStream ( new FileInputStream (pacientesContratados))
				{
					@Override protected void readStreamHeader () {}
				};
				
			aux = ois.readObject();
			
			while (!aux.equals(null))
			{
				if (aux instanceof Medico)
				{
					contador++;
				}
				
				aux = ois.readObject();
			}
		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch (EOFException e)
		{
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if (ois != null)
			{
				try
				{
					ois.close ();
				}
				
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		
		return contador;
	}
	//Fin contarMedicos
	
	/* Prototipo: void listarMedicosDepartamento ();
	 * Breve comentario: Funcionalidad que lista todos los m�dicos del hospital ordenados por departamento.
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: public void listarMedicosDepartamento ()
		{
			System.out.println("Llamada al metodo listarMedicosDepartamento");
		}
	 */
	public void listarMedicos ()
	{
		File medicosContratados = new File ("./src/hospital/medicosContratados.dat");
		ObjectInputStream ois = null;
		Object aux = null;
		
		try
		{
			ois = new ObjectInputStream (new FileInputStream (medicosContratados))
				{
					@Override protected void readStreamHeader () {}
				};
				
			if (medicosContratados.exists())
			{
			
				aux = ois.readObject();
				
				while (!aux.equals(null))
				{
					if (aux instanceof Medico)
					{
						System.out.println(((Medico) aux).toString());
					}
					
					aux = ois.readObject ();
				}
			}
		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch (EOFException e)
		{
			
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		catch (ClassNotFoundException e)
		{
			e.printStackTrace ();
		}
		
		finally 
		{
			if (ois != null)
			{
				try
				{
					ois.close();
				}
				
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	//Fin listarMedicosDepartamento
	
	/* Prototipo: double porcentajeSeguroPrivado ()
	 * Breve comentario: Metodo que calcula el porcentaje de pacientes con seguro privado
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
	 * Salidas: Un double
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Un double indicando el porcentaje de pacientes con seguro privado,
	 * devuelve -1.0 si no existe el fichero de pacientesIngresados
	 * 
	 * Resguardo: public void porcentajeSeguroPrivado ()
		{
			System.out.println("Llamada al metodo porcentaje seguro privado");
			return 0.0;
		}
	 * 
	 */
	public double porcentajeSeguroPrivado ()
	{
		double resultado = 0.0;
		ObjectInputStream ois = null;
		File pacientesIngresados = new File ("./src/hospital/pacientesIngresados.dat");
		Object aux = null;
		int contadorSeguro = 0;
		boolean lee = true;
		
		try
		{
			ois = new ObjectInputStream (new FileInputStream (pacientesIngresados))
			{
				@Override protected void readStreamHeader () {}
			};
			
			aux = ois.readObject();
			
			while (!aux.equals(null))
			{
				if (aux instanceof Paciente)
				{
					if (((Paciente) aux).getSeguroPrivado() != "no")
					{
						contadorSeguro++;
					}
				}
				
				aux = ois.readObject ();
			}
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("FileNotFoundException");
		}
		
		catch (EOFException e)
		{
			
		}
		
		catch (IOException e)
		{
			System.out.println("IOException");
		}
		
		catch (ClassNotFoundException e)
		{
			System.out.println("ClassNotFoundException");
		}
		
		finally
		{
			if (ois != null)
			{
				try
				{
					ois.close ();
				}
				
				catch (IOException e)
				{
					System.out.println("IOException");
				}
			}
			
			
		}
		
		if (contarMedicos () > 0)
		{
			resultado = (contadorSeguro * 100) / contarMedicos ();
		}
		
		else
		{
			resultado = -1.0;
		}
		
		return resultado;
	}
	//Fin porcentajeSeguroPrivado
	
	
	
	//pruebas
	public static void main (String [] args)
	{
		
		Object pAux = null;
		
		File pepejava = new File ("pepejava.dat");
		ObjectInputStream ois = null;
		
		PersonaIMPL p0 = null;
		PersonaIMPL p1 = null;
		PersonaIMPL p2 = null;
		PersonaIMPL p3 = null;
		
		// String nombre, String apellidos, int edad, String dni, char sexo, String telefono, Domicilio domicilio (calle, ciudad y numero)
		
		try
		{
			
			FileOutputStream fos = new FileOutputStream (pepejava);
			ObjectOutputStream oos = new ObjectOutputStream (fos);

			p0 = new PersonaIMPL ("Pablo", "Chavalator1", 16, "77925631", 'h', "954456545", new DomicilioIMPL ("Pepejava1 Street", "El kelo", 3));
			p1 = new PersonaIMPL ("Juan", "Chavalator2", 17, "77924651", 'h', "954236545", new DomicilioIMPL ("Pepejava2 Street", "El kelo", 4));
			p2 = new PersonaIMPL ("Nzhdeh", "Chavalator3", 18, "77225651", 'h', "952256545", new DomicilioIMPL ("Pepejava3 Street", "El kelo", 5));
			p3 = new PersonaIMPL ("Firewall", "Chavalator4", 19, "71925651", 'h', "954266545", new DomicilioIMPL ("Pepejava4 Street", "El kelo", 6));
				
			
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
			
			if (pAux instanceof PersonaIMPL)
			{
				while (true)
				{
					System.out.println(((PersonaIMPL) pAux).toString ());
					
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
