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
	
	public static void main (String [] args)
	{
		//Inicio
		InputStreamReader flujo = new InputStreamReader (System.in);
		BufferedReader tecladoString = new BufferedReader (flujo);
		Scanner teclado = new Scanner (System.in);
		char ejecutar = ' ';
		int opcion = 0;
		
		do
		{
			//PrintMenuPrincipalLeerValidarOpcion*
			//Fin PrintMenuPrincipalLeerValidarOpcion
			
			if (opcion != 0)
			{
				switch (opcion)
				{
					//caso 1: Pacientes
					case 1:
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