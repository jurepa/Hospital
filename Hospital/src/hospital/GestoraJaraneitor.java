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
	public static void main(String[]args)
	{	
		File binario=new File("./src/hospital/dasdiobas.dat");
		Medico medico=null;
		Medico linea=null;
		boolean lee=true;
		//nombre,apellidos,edad,dni,sexo,telefono,domicilio,especialidad
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		try
		{
				oos=new ObjectOutputStream(new FileOutputStream(binario,true)){@Override protected void writeStreamHeader(){}};
				ois=new ObjectInputStream(new FileInputStream(binario)){@Override protected void readStreamHeader(){}};
				medico=new Medico("Pablo","Jarana",50,"77813733H",'h',new Domicilio("Almirante Topete","Sevilla",4),"653706957","alergo");
				oos.writeObject(medico);
				linea=(Medico)ois.readObject();
				while(lee)
				{	
					System.out.println(linea);
					linea=(Medico)ois.readObject();
				}
					
		}catch (HospitalException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e){
			lee=false;
		} catch (IOException e) {
			e.printStackTrace();
		}finally
		{
			try {
				if(oos!=null)
				{
					oos.close();					
				}
				if(ois!=null)
				{
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 *Interfaz
	 *
	 *Este método lee los datos de un paciente
	 *Prototipo: void leerDatos()
	 *Precondiciones: No hay
	 *Entradas: No hay
	 *Salidas: Nada
	 *Postcondiciones: nada
	 *
	 *RESGUARDO
	 *
	 *public void leerDatos()
	 *{
	 *	System.out.println("En construccion");
	 *}
	 */
	public void leerDatosPaciente()
	{
		BufferedReader tecladoString=new BufferedReader(new InputStreamReader(System.in));
		Scanner teclado=new Scanner(System.in);
		Paciente paciente=null;
		Domicilio domicilio=new Domicilio();
		try
		{
			paciente=new Paciente();
			do
			{
				System.out.println("Introduzca el nombre del paciente: ");
				paciente.setNombre(tecladoString.readLine().toLowerCase());
			}while(paciente.getNombre().equals("")||paciente.getNombre()==null);
			do
			{
				System.out.println("Introduzca los apellidos: ");
				paciente.setApellidos(tecladoString.readLine().toLowerCase());
			}while(paciente.getApellidos().equals("")||paciente.getApellidos()==null);
			do
			{
				System.out.println("Introduzca el DNI, con la letra en mayúscula: ");
				paciente.setDNI(tecladoString.readLine());
			}while(paciente.getDNI().length()!=9&&paciente.validarNumerosDNI(paciente.getDNI())&&paciente.getDNI().charAt(8)!=paciente.calcularLetra(paciente.getDNI()));
			do
			{
				System.out.println("Introduzca la edad: ");
				paciente.setEdad(teclado.nextInt());
			}while(paciente.getEdad()<=0);
			do
			{
				System.out.println("Introduzca su telefono: ");
				paciente.setTelefono(tecladoString.readLine());
			}while(paciente.getTelefono().length()!=9||!paciente.validarNumerosTelefono(paciente.getTelefono()));
			do
			{
				System.out.println("Introduzca su sexo: ");
				paciente.setSexo(Character.toLowerCase(teclado.next().charAt(0)));
			}while(paciente.getSexo()!='h'&&paciente.getSexo()!='m');
			do
			{
				System.out.println("Introduzca su seguro privado, si no tiene escriba NO: ");
				paciente.setSeguroPrivado(tecladoString.readLine());
			}while(paciente.getSeguroPrivado().equals("")||paciente.getSeguroPrivado()==null);
			do
			{
				System.out.println("Introduzca su calle: ");
				domicilio.setCalle(tecladoString.readLine().toLowerCase());
			}while(domicilio.getCalle().equals("")||domicilio.getCalle()==null);
			do
			{
				System.out.println("Introduzca su ciudad: ");
				domicilio.setCiudad(tecladoString.readLine());
			}while(domicilio.getCiudad().equals("")||domicilio.getCiudad()==null);
			do
			{
				System.out.println("Introduzca el numero de su casa/piso/portal: ");
					domicilio.setNumero(teclado.nextInt());
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
		boolean lee=true;
		boolean encontrado=false;
		try {
			oosBaja=new ObjectOutputStream(new FileOutputStream(pacientesBaja,true)){@Override protected void writeStreamHeader(){}};
			oisAlta=new ObjectInputStream(new FileInputStream(pacientesAlta)){@Override protected void readStreamHeader(){}};
			paciente=(Paciente)oisAlta.readObject();
			while(lee&&!encontrado)//Mientras pueda seguir leyendo y no lo haya encontrado
			{
				if(paciente.getDNI().equals(dni))
				{
					paciente.setIngresado(false);
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
			lee=false;
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
	 * prototipo: void eliminarPaciente(String dni)
	 * Precondiciones: No hay
	 * Entradas: Una cadena
	 * Salidas: Nada
	 * Postcondiciones: Nada
	 * 
	 * RESGUARDO
	 * 
	 * public void eliminarPaciente(String dni)
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 */
	public boolean eliminarPaciente(String dni)
	{
		File ficheroDeAltas=new File("./src/hospital/pacientesIngresados.dat");
		File aux=new File("./src/hospital/aux.dat");
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		Paciente paciente=null;
		boolean lee=true;
		boolean borrado=true;
		if(ficheroDeAltas.exists())
		{
			if(cuentaPacientes()>0)
			{
				try 
				{
					oos=new ObjectOutputStream(new FileOutputStream(aux,true)){@Override protected void writeStreamHeader(){}};
					ois=new ObjectInputStream(new FileInputStream(ficheroDeAltas)){@Override protected void readStreamHeader(){}};
					paciente=(Paciente)ois.readObject();
					while(lee)
					{
						if(paciente.getDNI().equals(dni))
						{
							
						}
						else
						{
							oos.writeObject(paciente);
							paciente=(Paciente)ois.readObject();
						}
					}
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}catch(EOFException e)
				{
					lee=false;
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
		boolean lee=true;
		try 
		{
			ois=new ObjectInputStream(new FileInputStream(ficheroDeAltas)){@Override protected void readStreamHeader(){}};
			while(lee)
			{
				paciente=(Paciente)ois.readObject();
				contador++;
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}  catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}catch(EOFException e)
		{
			lee=false;
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
}
