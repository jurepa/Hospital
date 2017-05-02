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
 * 		si opción != 0
 * 			según (opción)
 * 				caso 1: Pacientes
 * 				caso 2: Medicos
 * 				caso 3: Centro			//POR HACER
 * 				caso 4: Estadísticas	//POR HACER
 * 			fin_según
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
 * 			caso 1: Contratar a un médico. *
 * 			caso 2: Despedir a un médico. *
 * 			caso 3: Listar los médicos.
 * 			caso 4: Asignar un paciente. *
 * 		fin_segun
 * 	fin_si
 * Fin
 * 
 * PG Nivel 1 Estadísticas
 * 
 * Inicio
 * 	PrintMenuEstadisticasLeerValidarOpcion*
 * 	si opcion != 0
 * 		segun (opcion)
 * 			caso 1: Porcentaje pacientes hospitalizados
 * 			caso 2: Porcentaje mujeres y hombres hospitalizados *
 * 			caso 3: Porcentaje de pacientes con seguro privado *
 * 		fin_segun
 * 	fin_si
 * Fin
 * 
 * 
 * PG Nivel 2 Pacientes hospitalizados
 * 
 * Inicio
 * 	Repetir
 * 		PrintMenuPacientesHospitalizadosLeerValidarOpcion
 * 		si opcion !=0
 * 			segun (opcion)
 * 				caso 1: niños
 * 				caso 2: jovenes
 * 				caso 3: adultos
 * 			fin_segun
 * 		fin_si
 * 		Preguntar ListarOtraVez
 * 	Fin_Mientras QuieraListarOtraVez
 * 
 * Fin
 * 
 * PG Nivel 2 Listar pacientes
 * 
 * Inicio
 * 	Repetir
 * 		PrintMenuListaPLeerValidarOpcion*
 * 		si opcion != 0
 * 			segun (opcion)
 * 				caso 1: Por departamento *
 * 				caso 2: Por edad *
 * 				caso 3: Por género *
 * 			fin_segun
 * 		fin_si
 * 		Preguntar ListarOtraVez
 * 	Fin_Mientras QuieraListarOtraVez
 * Fin
 * 
 * PG Nivel 2 Listar Medicos
 * 
 * Inicio
 * 	Repetir
 * 		PrintMenuListaMLeerValidarOpcion*
 * 		si opcion != 0
 * 			segun (opcion)
 * 				caso 1: Por departamento *
 * 				caso 2: Por edad *
 * 				caso 3: Pacientes asignados *
 * 			fin_segun
 * 		fin_si
 * 		Preguntar ListarOtraVez
 * 	Fin_Mientras QuieraListarOtraVez
 * Fin
 */
public class MainHospital 
{
	//Introducir menús de mierda aquí.
	
	/* Prototipo: menuPrincipal
	 * Breve comentario: Menu principal del programa.
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
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
			System.out.println("--------------------------------------------------------");
			System.out.println("------ Bienvenidos al hospital 'Habersinomemuero' ------");
			System.out.println("--------------------- 1. Pacientes ---------------------");
			System.out.println("---------------------- 2. Médicos ----------------------");
			System.out.println("----------------------- 3. Centro ----------------------");
			System.out.println("-------------------- 4. Estadísticas -------------------");
			System.out.println("--------------------------------------------------------");
	}
	//fin menuPrincipal
	
	/* Prototipo: menuPacientes
	 * Breve comentario: Menu de pacientes del programa.
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
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
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------ Bienvenidos al menu de pacientes del hospital 'Habersinomemuero' ------");
			System.out.println("------------------------- 1. Dar de baja un paciente -------------------------");
			System.out.println("------------------------- 2. Dar de alta un paciente -------------------------");
			System.out.println("----------------------------- 3. Listar pacientes ----------------------------");
			System.out.println("------------------------------------------------------------------------------");
	}
	//fin menuPacientes
	
	/* Prototipo: menuMedicos
	 * Breve comentario: Menu de medicos del programa.
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
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
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------- Bienvenidos al menu de medicos del hospital 'Habersinomemuero' -------");
			System.out.println("-------------------------- 1. Contratar a un médico --------------------------");
			System.out.println("-------------------------- 2. Despedir a un médico ---------------------------");
			System.out.println("------------------------------ 3. Listar médicos -----------------------------");
			System.out.println("-----------------------------4. Asignar un paciente --------------------------");
			System.out.println("------------------------------------------------------------------------------");
	}
	//fin menuMedicos
	
	/* Prototipo: menuListarMedicos
	 * Breve comentario: Menu listar medicos del programa.
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: public void menuListarMedicos ()
		{
			System.out.println("Llamada al metodo menuListarMedicos");
		}
	 */
	public static void menuListarMedicos ()
	{
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("------- Bienvenidos al menu de listar medicos del hospital 'Habersinomemuero' -------");
			System.out.println("-------------------------------- 1. Por departamento --------------------------------");
			System.out.println("------------------------------------ 2. Por edad ------------------------------------");
			System.out.println("------------------------------- 3. Pacientes asignados ------------------------------");
			System.out.println("-------------------------------------------------------------------------------------");
	}
	//fin menuListarMedicos
	
	/* Prototipo: menuListarPacientes
	 * Breve comentario: Menu listar pacientes del programa.
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: public void menuListarPacientes ()
		{
			System.out.println("Llamada al metodo menuListarPacientes");
		}
	 */
	public static void menuListarPacientes ()
	{
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("------- Bienvenidos al menu de listar pacientes del hospital 'Habersinomemuero' -------");
			System.out.println("--------------------------------- 1. Por departamento ---------------------------------");
			System.out.println("------------------------------------- 2. Por edad -------------------------------------");
			System.out.println("------------------------------------- 3. Por género -----------------------------------");
			System.out.println("---------------------------------------------------------------------------------------");
	}
	//fin menuListarPacientes
	
	
	
	public static void main (String [] args)
	{
		//Inicio
		BufferedReader tecladoString = new BufferedReader (new InputStreamReader (System.in));
		Scanner teclado = new Scanner (System.in);
		char ejecutar = ' ';
		char listarPacientes = ' ';
		char listarMedicos = ' ';
		char listarEstadisticas = ' ';
		int opcion = 0;
		int opcion2 = 0;
		int opcion3 = 0;
		int opcion4 = 0;
		int opcion5 = 0;
		int opcion6 = 0;
		int opcion7 = 0;
		
		do
		{
			//PrintMenuPrincipalLeerValidarOpcion*
			do
			{
				MainHospital.menuHospital();
				opcion = teclado.nextInt ();
			}
			while (opcion < 0 || opcion > 3);
			//Fin PrintMenuPrincipalLeerValidarOpcion
			
			if (opcion != 0)
			{
				switch (opcion)
				{
					//caso 1: Pacientes
					case 1:
						
					 	//PrintMenuPacientesLeerValidarOpcion*
						do
						{
							MainHospital.menuPacientes();
							opcion2 = teclado.nextInt();
						}
						while (opcion2 < 0 || opcion2 > 3);
						//Fin PrintMenuPacientesLeerValidarOpcion*
						
							if (opcion2 != 0)
							{
								switch (opcion2)
								{
						 			//caso 1: Dar de alta un paciente. *
									case 1:
									break;
									//Fin caso 1: Dar de alta un paciente.
									
						 			//caso 2: Dar de baja un paciente. *
									case 2:
									break;
									//Fin caso 2: Dar de baja un paciente.
									
						 			//caso 3: Listar pacientes.
									case 3:
										
										do
										{
										
											//PrintMenuListaPLeerValidarOpcion
											do
											{
												MainHospital.menuListarPacientes();
												opcion3 = teclado.nextInt();
											}
											while (opcion3 < 0 || opcion3 > 3);
											//Fin PrintMenuListaPLeerValidarOpcion
											
											if (opcion3 != 0)
											{
												switch (opcion3)
												{
													//caso 1: Por departamento *
													case 1:
													break;
													//caso 1: Por departamento
												
													//caso 2: Por edad *
													case 2:
														
													break;
													//Fin caso 2: Por edad
												
													//caso 3: Por género *
													case 3:
													break;
													//Fin caso 3: Por género
												
												}//fin_segun
											}//fin_si
											
											//Preguntar ListarOtraVez
											do
											{
												System.out.println("Desea volver a listar los pacientes por otra opción? S/N");
												listarPacientes = Character.toLowerCase(teclado.next().charAt(0));
											}
											while (listarPacientes != 's' && listarPacientes != 'n');
											//Fin Preguntar ListarOtraVez
										}
										while (listarPacientes == 's');//Fin_Mientras
										
									break;
									//Fin caso 3: Listar pacientes.
									
								}//fin_segun
							}//fin_si
						
					break;
					//Fin caso 1: Pacientes
					
					//caso 2: Medicos
					case 2:
						//PrintMenuMedicosLeerValidarOpcion
						do
						{
							MainHospital.menuMedicos();
							opcion4 = teclado.nextInt();
						}
						while (opcion4 < 0 || opcion4 > 4);
						//Fin PrintMenuMedicosLeerValidarOpcion
						
						if (opcion4 != 0)
						{
							switch (opcion4)
							{
								//caso 1: Contratar a un médico. *
								case 1:
								break;
								//Fin caso 1: Contratar a un médico.
							
								//caso 2: Despedir a un médico. *
								case 2:
								break;
								//Fin caso 2: Despedir a un médico.
							
								//caso 3: Listar los médicos.
								case 3:
									
									do
									{
										//PrintMenuListaMLeerValidarOpcion*
										do
										{
											MainHospital.menuListarMedicos();
											opcion5 = teclado.nextInt();
										}
										while(opcion5 < 0 || opcion5 > 3);
										//Fin PrintMenuListaMLeerValidarOpcion
										
										if (opcion5 != 0)
										{
											switch (opcion5)
											{
												//caso 1: Por departamento *
												case 1:
												break;
												//Fin caso 1: Por departamento
											
												//caso 2: Por edad *
												case 2:
												break;
												//Fin caso 2: Por edad
											
												//caso 3: Pacientes asignados *
												case 3:
												break;
												//Fin caso 3: Pacientes asignados
											}//fin_segun
										}//fin_si
										
										//Preguntar ListarOtraVez
										do
										{
											System.out.println("Desea volver a listar los medicos por otra opción? S/N");
											listarMedicos = Character.toLowerCase(teclado.next().charAt(0));
										}
										while (listarMedicos != 's' && listarMedicos != 'n');
										//Fin Preguntar ListarOtraVez
									}
									while (listarMedicos == 's');//Fin_Mientras QuieraListarOtraVez
									
								break;
								//Fin caso 3: Listar los médicos.
							
								//caso 4: Asignar un paciente. *
								case 4:
								break;
								//Fin caso 4: Asignar un paciente.
							
							}//fin_segun
						}//fin_si
					break;
					//Fin caso 2: Medicos
					
					//caso 3: Centro
					case 3:
					break;
					//Fin caso 3: Centro	
					
					
					//caso 4: Estadísticas
					case 4:
						
					//PrintMenuEstadisticasLeerValidarOpcion*
					
					//Fin PrintMenuEstadisticasLeerValidarOpcion
						
						if (opcion6 != 0)
						{
							switch (opcion6)
							{
							
								//caso 1: Porcentaje pacientes hospitalizados
								case 1:
									
								do
								{
									
								//PrintMenuPacientesHospitalizadosLeerValidarOpcion
								//Fin PrintMenuPacientesHospitalizadosLeerValidarOpcion
									
								if (opcion7 != 0)
								{
									switch (opcion7)
									{
									
										//caso 1: niños
										case 1:
										break;
										//Fin caso 1: niños
									
										//caso 2: jovenes
										case 2:
										break;
										//Fin caso 2: jovenes
									
										//caso 3: adultos
										case 3:
										break;
										//Fin caso 3: adultos
									
									}//fin_segun
								}//fin_si
									
								//Preguntar ListarOtraVez
								
								/* TOCA ESTO */
								
								//Fin Preguntar ListarOtraVez
									
								}
								while (listarEstadisticas == 's');//Fin_Mientras QuieraListarOtraVez
								
								break;
								//Fin caso 1: Porcentaje pacientes hospitalizados
							
								//caso 2: Porcentaje mujeres y hombres hospitalizados *
								case 2:
								break;
								//Fin caso 2: Porcentaje mujeres y hombres hospitalizados
							
								//caso 3: Porcentaje de pacientes con seguro privado *
								case 3:
								break;
								//Fin caso 3: Porcentaje de pacientes con seguro privado
							
							}//fin_segun
						}//fin_si
						
					break;
					//Fin caso 4: Estadísticas
						
				}//fin_según
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