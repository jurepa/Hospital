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
		DomicilioIMPL domicilio = null;
		GestoraJaraneitor pablo = new GestoraJaraneitor ();
		
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
			while ((medico.getDNI().length() != 9 
					|| !medico.validarNumerosDNI(medico.getDNI()) 
					|| medico.getDNI().charAt(8) != medico.calcularLetra (medico.getDNI())) 
					|| pablo.buscaDNI(medico.getDNI()));
			
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
	 * Entradas: Una cadena indicando el dni del médico.
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
		File auxiliar = new File("./src/hospital/auxiliar.dat");
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Object aux = null;
		boolean borrado = false;
		
		if (medicosContratados.exists())
		{
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
		}
		
		medicosContratados.delete();
		auxiliar.renameTo (medicosContratados);
		
		return borrado;
	}
	//Fin despedirMedico
	
	/* Prototipo: void contarmedicos ();
	 * Breve comentario: Metodo que cuenta el numero de médicos que hay en un archivo
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
	 * Salidas: Un entero
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Un entero indicando el numero de médicos que hay en el archivo
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
	 * Breve comentario: Funcionalidad que lista todos los médicos del hospital ordenados por departamento.
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
					if (((Paciente) aux).getSeguroPrivado().equals("no"))
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
	
	/* Prototipo: void asignarPaciente (Paciente paciente, String dni)
	 * Breve comentario: Metodo encargado de asignar un paciente a un medico
	 * Precondiciones: Ninguna
	 * Entradas: Un paciente y un String indicando el dni de un medico
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: public void asignarPaciente (Paciente paciente, String dni)
		{
			System.out.println("Llamada al metodo asignarPaciente");
		}
	 */
	public void asignarPaciente (String dni2, String dni)
	{
		File medicosContratados = new File ("./src/hospital/medicosContratados.dat");
		File pacientesIngresados = new File ("./src/hospital/pacientesIngresados.dat");
		File auxiliar = new File ("./src/hospital/auxiliar.dat");
		ObjectInputStream ois = null;
		ObjectInputStream ois2 = null;
		ObjectOutputStream oos = null;
		Object aux = null;
		Object aux2 = null;
		boolean salir = false;
		
		try
		{
			ois = new ObjectInputStream (new FileInputStream (medicosContratados))
			{
				@Override protected void readStreamHeader () {}
			};
			
			ois2 = new ObjectInputStream (new FileInputStream (pacientesIngresados))
			{
				@Override protected void readStreamHeader () {}
			};
			
			oos = new ObjectOutputStream (new FileOutputStream (auxiliar, true))
			{
				@Override protected void writeStreamHeader () {}
			};
			
			aux = ois.readObject();
			aux2 = ois2.readObject();
			
			while (!aux2.equals(null) && !salir)
			{
				if (aux2 instanceof Paciente && ((Paciente) aux2).getDNI().equals(dni2))
				{
					salir = true;
				}
				
				else
				{
					aux2 = ois2.readObject ();
				}
				
			}
			
			while (!aux.equals(null))
			{
				if (aux instanceof Medico && ((Medico) aux).getDNI().equals(dni))
				{
					((Medico) aux).addPaciente ((Paciente)aux2);
				}
				
				oos.writeObject(aux);
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
			
			if (ois2 != null)
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
			
			if (oos != null)
			{
				try
				{
					oos.close ();
				}
				
				catch (IOException e)
				{
					System.out.println("IOException");
				}
			}
		}
		
		medicosContratados.delete();
		auxiliar.renameTo (medicosContratados);
	}
	//Fin asignarPaciente
	
	/* Prototipo: void listarPacientesMedico (String dni)
	 * Breve comentario: Imprime la lista de los pacientes asignados a un médico
	 * Precondiciones: Ninguna
	 * Entradas: Un String que indica el dni
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: public void listarPacientesMedico ()
		{
			System.out.println("Llamada al metodo listarPacientesMedico");
		}
	 */
	public void listarPacientesMedico (String dni)
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
						if (((Medico) aux).getDNI ().equals (dni))
						{
							System.out.println("Medico: ");
							System.out.println(((Medico) aux).toString());
							
							System.out.println();
							System.out.println("Pacientes: ");
							System.out.println();
	
							for (int i = 0; i < ((Medico) aux).getPacienteAsignado().size(); i++)
							{
								System.out.println(((Medico) aux).getPacienteAsignado().get (i).toString ());
							}
						}
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
	//Fin listarPacientesMedico ()

}
