package hospital;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
public class GestoraJaraneitor 
{	
	/*
	 *Interfaz
	 *
	 *Este método lee los datos de un paciente y lo registra en el archivo pertinente.
	 *Prototipo: void registrarPaciente()
	 *Precondiciones: No hay
	 *Entradas: No hay
	 *Salidas: Nada
	 *Postcondiciones: nada
	 *
	 *RESGUARDO
	 *
	 *public void registrarPaciente()
	 *{
	 *	System.out.println("En construccion");
	 *}
	 */
	public void registrarPaciente()
	{
		BufferedReader tecladoString=new BufferedReader(new InputStreamReader(System.in));
		Scanner teclado=new Scanner(System.in);
		Paciente paciente=null;
		DomicilioIMPL domicilio=new DomicilioIMPL();
		try
		{
			paciente=new Paciente();
			do
			{
				try
				{
					System.out.println("Introduzca el nombre del paciente: ");
					paciente.setNombre(tecladoString.readLine().toLowerCase());
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}while(paciente.getNombre().equals("")||paciente.getNombre()==null);
			do
			{
				try
				{
					System.out.println("Introduzca los apellidos: ");
					paciente.setApellidos(tecladoString.readLine().toLowerCase());
					
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}while(paciente.getApellidos().equals("")||paciente.getApellidos()==null);
			do
			{
				try
				{
					System.out.println("Introduzca el DNI, con la letra en mayúscula: ");
					paciente.setDNI(tecladoString.readLine());
					
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
				if(buscaDNI(paciente.getDNI()))
				{
					System.out.println("El DNI introducido ya existe");
				}
			}while((paciente.getDNI().length()!=9&&paciente.validarNumerosDNI(paciente.getDNI())&&paciente.getDNI().charAt(8)!=paciente.calcularLetra(paciente.getDNI()))||buscaDNI(paciente.getDNI()));
			do
			{
				try
				{
					System.out.println("Introduzca la edad: ");
					paciente.setEdad(teclado.nextInt());
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}while(paciente.getEdad()<=0);
			do
			{
				try
				{
				System.out.println("Introduzca su telefono: ");
				paciente.setTelefono(tecladoString.readLine());
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}while(paciente.getTelefono().length()!=9||!paciente.validarNumerosTelefono(paciente.getTelefono()));
			do
			{
				try
				{
				System.out.println("Introduzca su sexo: ");
				paciente.setSexo(Character.toLowerCase(teclado.next().charAt(0)));
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}while(paciente.getSexo()!='h'&&paciente.getSexo()!='m');
			do
			{
				try
				{
					System.out.println("Introduzca su seguro privado, si no tiene escriba NO: ");
					paciente.setSeguroPrivado(tecladoString.readLine().toLowerCase());
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}while(!paciente.getSeguroPrivado().equals("no") && !paciente.getSeguroPrivado().equals ("Mutua") &&!paciente.getSeguroPrivado().equals("Mapfre")&&!paciente.getSeguroPrivado().equals("Adeslas")&&!paciente.getSeguroPrivado().equals("Fremap")&&paciente.getSeguroPrivado().equals(""));
			do
			{
				try
				{
					System.out.println("Introduzca su calle: ");
					domicilio.setCalle(tecladoString.readLine().toLowerCase());
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}while(domicilio.getCalle().equals("")||domicilio.getCalle()==null);
			do
			{
				try
				{
					System.out.println("Introduzca su ciudad: ");
					domicilio.setCiudad(tecladoString.readLine());
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}while(domicilio.getCiudad().equals("")||domicilio.getCiudad()==null);
			do
			{
				try
				{
					System.out.println("Introduzca el numero de su casa/piso/portal: ");
					domicilio.setNumero(teclado.nextInt());
				}
				
				catch (HospitalException e)
				{
					System.out.println(e);
				}
			}while(domicilio.getNumero()<=0);
			paciente.setDomicilio(domicilio);
			paciente.setIngresado(true);
			insertarPaciente(paciente);
		}catch(HospitalException error)
		{
			System.out.println(error);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * Interfaz
	 * 
	 * Este método inserta un usuario en el fichero binario
	 * prototipo: void insertarPaciente(Paciente paciente)
	 * Precondiciones: El paciente no debe ser null
	 * Entradas: Un objeto paciente
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void insertarPaciente(Paciente paciente)
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 */
	public void insertarPaciente(Paciente paciente) 
	{
		File pacientesIngresados=new File("./src/hospital/pacientesIngresados.dat");
		ObjectOutputStream oos=null;
		
			try 
			{
				oos=new ObjectOutputStream(new FileOutputStream (pacientesIngresados,true)){@Override protected void writeStreamHeader(){}};
				oos.writeObject(paciente);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally
			{
				if(oos!=null)
				{
					try 
					{
						oos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
	}
	/*
	 * Interfaz
	 * 
	 * Este método escribe el paciente a eliminar en el fichero de Pacientes dados de baja
	 * prototipo: void eliminarPaciente(String dni)
	 * Precondiciones: No hay
	 * Entradas: Una cadena
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void eliminarPaciente()
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 */
	public void insertarPacienteDadoDeBaja(String dni)
	{
		
		File pacientesBaja=new File("./src/hospital/pacientesDadosDeBaja.dat");
		File pacientesAlta=new File("./src/hospital/pacientesIngresados.dat");
		ObjectOutputStream oosBaja=null;
		ObjectInputStream oisAlta=null;
		Paciente paciente=null;
		boolean encontrado=false;
		try {
			oosBaja=new ObjectOutputStream(new FileOutputStream(pacientesBaja,true)){@Override protected void writeStreamHeader(){}};
			oisAlta=new ObjectInputStream(new FileInputStream(pacientesAlta)){@Override protected void readStreamHeader(){}};
			paciente=(Paciente)oisAlta.readObject();
			while(!paciente.equals(null)&&!encontrado)//Mientras pueda seguir leyendo y no lo haya encontrado
			{
				if(paciente.getDNI().equals(dni))
				{
					try
					{
						paciente.setIngresado(false);
					}
					catch (HospitalException e)
					{
						System.out.println(e);
					}
					oosBaja.writeObject(paciente);
					encontrado=true;
				}
				paciente=(Paciente)oisAlta.readObject();
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch(EOFException e)
		{
		}catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}finally
		{
			if(oosBaja!=null)
			{
				try 
				{
					oosBaja.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
			if(oisAlta!=null)
			{
				try 
				{
					oisAlta.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
			
	}
	/*
	 * Interfaz
	 * 
	 * Este método elimina un paciente del fichero dados de alta
	 * prototipo: boolean eliminarPaciente(String dni)
	 * Precondiciones: No hay
	 * Entradas: Una cadena
	 * Salidas: Un boolean
	 * Postcondiciones: True si se ha borrado correctamente, false sino.
	 * 
	 * RESGUARDO
	 * 
	 * public boolean eliminarPaciente(String dni)
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 */
	public boolean eliminarPaciente(String dni)
	{
		File ficheroDeAltas=new File("./src/hospital/pacientesIngresados.dat");
		File aux=new File("./src/hospital/auxiliar.dat");
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		Paciente paciente=null;
		boolean encontrado=false;
		boolean borrado=false;
		if(ficheroDeAltas.exists())
		{
				try 
				{
					oos=new ObjectOutputStream(new FileOutputStream(aux)){@Override protected void writeStreamHeader(){}};
					ois=new ObjectInputStream(new FileInputStream(ficheroDeAltas)){@Override protected void readStreamHeader(){}};
					paciente=(Paciente)ois.readObject();
					while(!paciente.equals(null))
					{
						if(paciente.getDNI().equals(dni))
						{
							borrado=true;
							for(int i=0; i<paciente.getMedico().getPacienteAsignado().size()&&!encontrado;i++)
							{
								if(paciente.getMedico().getPacienteAsignado().get(i).equals(paciente))
								{
									paciente.getMedico().getPacienteAsignado().remove(i);
									encontrado=true;
								}
							}
							paciente.setMedico(new Medico()); //Le quitamos el medico que tenia asignado
							insertarPacienteDadoDeBaja(dni);
						}
						else
						{
							oos.writeObject(paciente);
						}
						paciente=(Paciente)ois.readObject();
					}
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}catch(EOFException e)
				{
				}catch (IOException e) 
				{
					e.printStackTrace();
				} catch (ClassNotFoundException e) 
				{
					e.printStackTrace();
				} catch (HospitalException e) 
				{
					e.printStackTrace();
				}finally
				{
					
					if(ois!=null)
					{
						try 
						{
							ois.close();
						} catch (IOException e) 
						{
							e.printStackTrace();
						}
					}
					if(oos!=null)
					{
						try 
						{
							oos.close();
						} catch (IOException e) 
						{
							e.printStackTrace();
						}
					}
				}
			ficheroDeAltas.delete();
			aux.renameTo(ficheroDeAltas);
		}
		return borrado;
	}
	/*
	 * Interfaz
	 * 
	 * Este método cuenta los pacientes que hay en un fichero 
	 * 
	 * prototipo: int cuentaPacientes()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * salidas: Un entero
	 * Postcondiciones: Es 0 o mayor a 0
	 * 
	 * RESGUARDO
	 * 
	 * public int cuentaObjetos()
	 * {
	 * 		return 1;
	 * }
	 */
	
	public int cuentaPacientes()
	{
		int contador=0;
		File ficheroDeAltas=new File("./src/hospital/pacientesIngresados.dat");
		ObjectInputStream ois=null;
		Paciente paciente=null;
		try 
		{
			ois=new ObjectInputStream(new FileInputStream(ficheroDeAltas)){@Override protected void readStreamHeader(){}};
			paciente=(Paciente)ois.readObject();
			while(!paciente.equals(null))
			{
				contador++;
				paciente=(Paciente)ois.readObject();
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}  catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}catch(EOFException e)
		{
		} catch (IOException e) 
		{
			e.printStackTrace();
		}finally
		{
			if(ois!=null)
			{
				try
				{
					ois.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return contador;
	}
	/*
	 * Interfaz
	 * 
	 * Este metodo imprime los pacientes ingresados por edad
	 * prototipo: void listarPacientesEdad()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void listarPacientesEdad()
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 */
	public void listarPacientes()
	{
		File ficheroDeAltas=new File("./src/hospital/pacientesIngresados.dat");
		ObjectInputStream ois=null;
		Paciente paciente=null;
		try 
		{
			ois=new ObjectInputStream(new FileInputStream(ficheroDeAltas)){@Override protected void readStreamHeader(){}};
			paciente=(Paciente)ois.readObject();
			while(!paciente.equals(null))
			{
				System.out.println(paciente.toString()+","+paciente.getMedico().getEspecialidad());
				paciente=(Paciente)ois.readObject();
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}  catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}catch(EOFException e)
		{
		} catch (IOException e) 
		{
			e.printStackTrace();
		}finally
		{
			if(ois!=null)
			{
				try
				{
					ois.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 * Interfaz
	 * 
	 * Este método calcula el porcentaje de mujeres hospitalizadas en el hospital
	 * prototipo: double porcentajeMujeres()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: un real
	 * Postcondiciones: el número estará entre 0 y 100
	 * 
	 * RESGUARDO
	 * 
	 * public double porcentajeMujeres()
	 * {
	 * 		return 1;
	 * }
	 */
	public double porcentajeMujeres()
	{
		int contadorMujeres=0;
		double porcentaje;
		ObjectInputStream ois=null;
		File pacientes=new File("./src/hospital/pacientesIngresados.dat");
		Paciente paciente=null;
		try 
		{
			ois=new ObjectInputStream(new FileInputStream(pacientes)){@Override protected void readStreamHeader(){}};
			paciente=(Paciente)ois.readObject();
			while(!paciente.equals(null))
			{
				if(paciente.getSexo()=='m')
				{
					contadorMujeres++;
				}
				paciente=(Paciente)ois.readObject();
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch(EOFException e)
		{
		}catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}finally
		{
			if(ois!=null)
			{
				try 
				{
					ois.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		if(cuentaPacientes()>0)
		{
			porcentaje=(contadorMujeres*100)/cuentaPacientes();
		}
		else
		{
			porcentaje=-1;
		}
		return porcentaje;
	}
	/*
	 * Interfaz
	 * 
	 * Este método calcula el porcentaje de hombres hospitalizados en el hospital
	 * prototipo: double porcentajeHombres()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: un real
	 * Postcondiciones: el número estará entre 0 y 100, excepto si no hay pacientes, que será -1
	 * 
	 * RESGUARDO
	 * 
	 * public double porcentajeHombres()
	 * {
	 * 		return 1;
	 * }
	 */
	public double porcentajeHombres()
	{
		int contadorHombres=0;
		ObjectInputStream ois=null;
		File pacientes=new File("./src/hospital/pacientesIngresados.dat");
		Paciente paciente=null;
		double porcentaje;
		try 
		{
			ois=new ObjectInputStream(new FileInputStream(pacientes)){@Override protected void readStreamHeader(){}};
			paciente=(Paciente)ois.readObject();
			while(!paciente.equals(null))
			{
				if(paciente.getSexo()=='h')
				{
					contadorHombres++;
				}
				paciente=(Paciente)ois.readObject();
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch(EOFException e)
		{
		}catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}finally
		{
			if(ois!=null)
			{
				try 
				{
					ois.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		if(cuentaPacientes()>0)
		{
			porcentaje=(contadorHombres*100)/cuentaPacientes();
		}
		else
		{
			porcentaje=-1;
		}
		return porcentaje;
	}
	/*
	 * Interfaz
	 * 
	 * Este método calcula el porcentaje de niños hospitalizados en el hospital
	 * prototipo: double porcentajeNiños()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: un real
	 * Postcondiciones: el número estará entre 0 y 100, excepto si no se ha calculado el porcentaje que será -1
	 * 
	 * RESGUARDO
	 * 
	 * public double porcentajeNiños()
	 * {
	 * 		return 1;
	 * }
	 */
	public double porcentajeNiños()
	{
		int contadorNiños=0;
		ObjectInputStream ois=null;
		File pacientes=new File("./src/hospital/pacientesIngresados.dat");
		Paciente paciente=null;
		double porcentaje;
		try 
		{
			ois=new ObjectInputStream(new FileInputStream(pacientes)){@Override protected void readStreamHeader(){}};
			paciente=(Paciente)ois.readObject();
			while(paciente.equals(null))
			{
				if(paciente.getEdad()>=1&&paciente.getEdad()<=13)
				{
					contadorNiños++;
				}
				paciente=(Paciente)ois.readObject();
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch(EOFException e)
		{
		}catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}finally
		{
			if(ois!=null)
			{
				try 
				{
					ois.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		if(cuentaPacientes()>0)
		{
			porcentaje=(contadorNiños*100)/cuentaPacientes();
		}
		else
		{
			porcentaje=-1;
		}
		return porcentaje;
	}
	/*
	 * Interfaz
	 * 
	 * Este método calcula el porcentaje de Jovenes hospitalizados en el hospital
	 * prototipo: double porcentajeJovenes()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: un real
	 * Postcondiciones: el número estará entre 0 y 100, excepto si no se ha calculado el porcentaje que será -1
	 * 
	 * RESGUARDO
	 * 
	 * public double porcentajeHombres()
	 * {
	 * 		return 1;
	 * }
	 */
	public double porcentajeJovenes()
	{
		int contadorJovenes=0;
		ObjectInputStream ois=null;
		File pacientes=new File("./src/hospital/pacientesIngresados.dat");
		Paciente paciente=null;
		double porcentaje;
		try 
		{
			ois=new ObjectInputStream(new FileInputStream(pacientes)){@Override protected void readStreamHeader(){}};
			paciente=(Paciente)ois.readObject();
			while(!paciente.equals(null))
			{
				if(paciente.getEdad()>13&&paciente.getEdad()<=30)
				{
					contadorJovenes++;
				}
				paciente=(Paciente)ois.readObject();
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch(EOFException e)
		{
		}catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}finally
		{
			if(ois!=null)
			{
				try 
				{
					ois.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		if(cuentaPacientes()>0)
		{
			porcentaje=(contadorJovenes*100)/cuentaPacientes();
		}
		else
		{
			porcentaje=-1;
		}
		return porcentaje;
	}
	/*
	 * Interfaz
	 * 
	 * Este método calcula el porcentaje de adultos hospitalizados en el hospital
	 * prototipo: double porcentajeAdultos()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: un real
	 * Postcondiciones: el número estará entre 0 y 100, excepto si no se ha calculado el porcentaje que será -1
	 * 
	 * RESGUARDO
	 * 
	 * public double porcentajeHombres()
	 * {
	 * 		return 1;
	 * }
	 */
	public double porcentajeAdultos()
	{
		int contadorAdultos=0;
		ObjectInputStream ois=null;
		File pacientes=new File("./src/hospital/pacientesIngresados.dat");
		Paciente paciente=null;
		double porcentaje;
		try 
		{
			ois=new ObjectInputStream(new FileInputStream(pacientes)){@Override protected void readStreamHeader(){}};
			paciente=(Paciente)ois.readObject();
			while(!paciente.equals(null))
			{
				if(paciente.getEdad()>30)
				{
					contadorAdultos++;
				}
				paciente=(Paciente)ois.readObject();
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch(EOFException e)
		{
		}catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}finally
		{
			if(ois!=null)
			{
				try 
				{
					ois.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		if(cuentaPacientes()>0)
		{
			porcentaje=(contadorAdultos*100)/cuentaPacientes();
		}
		else
		{
			porcentaje=-1;
		}
		return porcentaje;
	}
	/*
	 * Interfaz
	 * 
	 * Este método busca un DNI de un paciente
	 * prototipo: boolean buscaDNI(String dni)
	 * Precondiciones: No hay
	 * Entradas: Una cadena
	 * Salidas: Un booleano
	 * Postcondiciones: true si existe y false si no
	 * 
	 *  RESGUARDO
	 *  
	 *  public boolean buscaDNI(String dni)
	 *  {
	 *  	return false;
	 *  }
	 * 
	 */
	public boolean buscaDNI(String dni)
	{
		File pacientesAlta=new File("./src/hospital/pacientesIngresados.dat");
		ObjectInputStream oisAlta=null;
		Paciente paciente=null;
		boolean encontrado=false;
		try 
		{
			oisAlta=new ObjectInputStream(new FileInputStream(pacientesAlta)){@Override protected void readStreamHeader(){}};
			paciente=(Paciente)oisAlta.readObject();
			while(!paciente.equals(null)&&!encontrado)//Mientras pueda seguir leyendo y no lo haya encontrado
			{
				if(paciente.getDNI().equals(dni))
				{
					paciente.setIngresado(false);
					encontrado=true;
				}
				paciente=(Paciente)oisAlta.readObject();
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch(EOFException e)
		{
		}catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (HospitalException e) 
		{
			e.printStackTrace();
		}finally
		{
			if(oisAlta!=null)
			{
				try 
				{
					oisAlta.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return encontrado;
	}
}
