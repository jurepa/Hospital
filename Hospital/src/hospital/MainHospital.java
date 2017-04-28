package hospital;

import java.util.*;
import java.io.*;

/* Nombre del programa: MainHospital
 * Breve comentario: Clase principal del proyecto Hospital.
 * Entradas: Validaciones
 * Salidas: Mensajes
 * Restricciones: Ninguna
 * 
 * P.G
 * 
 * Inicio
 * Repetir
 * 		PrintMenuPrincipalLeerValidarOpcion*
 * 		si opci�n != 0
 * 			seg�n (opci�n)
 * 				caso 1: Pacientes
 * 				caso 2: Medicos
 * 				caso 3: Centro			//POR HACER
 * 				caso 4: Estad�sticas	//POR HACER
 * 			fin_seg�n
 * 		fin_si
 * 		LeerValidarElegirOpcion
 * 	Fin_Mientras QuieraElegirOpcion
 * Fin
 * 
 * 
 * PG Nivel 1 Pacientes
 * 
 * Inicio
 * 	PrintMenuPacientesLeerValidarOpcion*
 * 	si opcion != 0
 * 		segun (opcion)
 * 			caso 1: Dar de alta un paciente. *
 * 			caso 2: Dar de baja un paciente. *
 * 			caso 3: Listar pacientes.
 * 		fin_segun
 * 	fin_si
 * Fin
 * 
 * PG Nivel 1 Medicos
 * 
 * Inicio
 * 	PrintMenuMedicosLeerValidarOpcion
 * 	si opcion != 0
 * 		segun (opcion)
 * 			caso 1: Contratar a un m�dico. *
 * 			caso 2: Despedir a un m�dico. *
 * 			caso 3: Listar los m�dicos.
 * 			caso 4: Asignar un paciente. *
 * 		fin_segun
 * 	fin_si
 * Fin
 * 
 * 
 * PG Nivel 2 Listar pacientes
 * 
 * Inicio
 * 	PreguntarDeseaListar
 * 	Mientras QuieraListar
 * 		PrintMenuListaPLeerValidarOpcion*
 * 		si opcion != 0
 * 			segun (opcion)
 * 				caso 1: Por departamento
 * 				caso 2: Por edad
 * 				caso 3: Por g�nero
 * 			fin_segun
 * 		fin_si
 * 		Preguntar ListarOtraVez
 * 	Fin_Mientras
 * Fin
 * 
 * PG Nivel 2 Listar Medicos
 * 
 * Inicio
 * 	PreguntarDeseaListar
 * 	Mientras QuieraListar
 * 		PrintMenuListaMLeerValidarOpcion*
 * 		si opcion != 0
 * 			segun (opcion)
 * 				caso 1: Por departamento
 * 				caso 2: Por edad
 * 				caso 3: Pacientes asignados
 * 			fin_segun
 * 		fin_si
 * 		Preguntar ListarOtraVez
 * 	Fin_Mientras
 * Fin
 */
public class MainHospital 
{
	//Introducir men�s de mierda aqu�.
	
	/* Prototipo: menuPrincipal
	 * Breve comentario: Menu principal del programa.
	 * Precondiciones: Ninguna
	 * Entradas: Un entero
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: public void menuHospital ()
		{
			System.out.println("Llamada al metodo menuPrincipal");
		}
	 */
	public static void menuHospital ()
	{
		Scanner teclado = new Scanner (System.in);
		
		int opcion = 0;
		
		do
		{
			System.out.println("--------------------------------------------------------");
			System.out.println("------ Bienvenidos al hospital 'Habersinomemuero' ------");
			System.out.println("--------------------- 1. Pacientes ---------------------");
			System.out.println("---------------------- 2. M�dicos ----------------------");
			System.out.println("-------------------- 3. Estad�sticas -------------------");
			System.out.println("--------------------------------------------------------");
			opcion = teclado.nextInt();
		}
		while (opcion < 0 || opcion > 3);
	}
	//fin menuPrincipal
	
	/* Prototipo: menuPacientes
	 * Breve comentario: Menu de pacientes del programa.
	 * Precondiciones: Ninguna
	 * Entradas: Un entero
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: public void menuPacientes ()
		{
			System.out.println("Llamada al metodo menuPacientes");
		}
	 */
	public static void menuPacientes ()
	{
		Scanner teclado = new Scanner (System.in);
		
		int opcion = 0;
		
		do
		{
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------ Bienvenidos al menu de pacientes del hospital 'Habersinomemuero' ------");
			System.out.println("------------------------- 1. Dar de baja un paciente -------------------------");
			System.out.println("------------------------- 2. Dar de alta un paciente -------------------------");
			System.out.println("----------------------------- 3. Listar pacientes ----------------------------");
			System.out.println("------------------------------------------------------------------------------");
			opcion = teclado.nextInt();
		}
		while (opcion < 0 || opcion > 3);
	}
	//fin menuPacientes
	
	/* Prototipo: menuMedicos
	 * Breve comentario: Menu de medicos del programa.
	 * Precondiciones: Ninguna
	 * Entradas: Un entero
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: public void menuMedicos ()
		{
			System.out.println("Llamada al metodo menuMedicos");
		}
	 */
	public static void menuMedicos ()
	{
		Scanner teclado = new Scanner (System.in);
		
		int opcion = 0;
		
		do
		{
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------- Bienvenidos al menu de medicos del hospital 'Habersinomemuero' -------");
			System.out.println("-------------------------- 1. Contratar a un m�dico --------------------------");
			System.out.println("-------------------------- 2. Despedir a un m�dico ---------------------------");
			System.out.println("------------------------------ 3. Listar m�dicos -----------------------------");
			System.out.println("---------------------------- 3. Asignar un paciente --------------------------");
			System.out.println("------------------------------------------------------------------------------");
			opcion = teclado.nextInt();
		}
		while (opcion < 0 || opcion > 3);
	}
	//fin menuMedicos
	
	
	
	public static void main (String [] args)
	{
		//Inicio
		BufferedReader tecladoString = new BufferedReader (new InputStreamReader (System.in));
		Scanner teclado = new Scanner (System.in);
		char ejecutar = ' ';
		int opcion = 0;
		
		do
		{
			//PrintMenuPrincipalLeerValidarOpcion*
			MainHospital.menuHospital();
			//Fin PrintMenuPrincipalLeerValidarOpcion
			
			if (opcion != 0)
			{
				switch (opcion)
				{
					//caso 1: Pacientes
					case 1:
					
				 	//PrintMenuPacientesLeerValidarOpcion*
					MainHospital.menuPacientes();
					//Fin PrintMenuPacientesLeerValidarOpcion*
					
						if (opcion != 0)
						{
							switch (opcion)
							{
					 			//caso 1: Dar de alta un paciente. *
								case 1:
								break;
					 			//caso 2: Dar de baja un paciente. *
								case 2:
								break;
					 			//caso 3: Listar pacientes.
								case 3:
								break;
							}//fin_segun
						}//fin_si
					
					break;
					//Fin caso 1: Pacientes
					
					//caso 2: Medicos
					case 2:
					break;
					//Fin caso 2: Medicos
					
					//caso 3: Centro
					case 3:
					break;
					//Fin caso 3: Centro	
					
					
					//caso 4: Estad�sticas
					case 4:
					break;
					//Fin caso 4: Estad�sticas
						
				}//fin_seg�n
			}//fin_si
		
			//LeerValidarElegirOpcion
			do
			{
				System.out.println("Desea volver al menu? S/N");
				ejecutar = Character.toLowerCase(teclado.next().charAt(0));
			}
			while (ejecutar != 's' && ejecutar != 'n');
			//Fin LeerValidarElegirOpcion
		
		}
		while (ejecutar == 's');//Fin_Mientras QuieraElegirOpcion
		
	}//fin_main
}//fin_clase