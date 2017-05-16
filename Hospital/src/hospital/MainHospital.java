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
 * 				caso 3: Estadísticas	//POR HACER
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
 * Repetir
 * 		PrintMenuPacientesLeerValidarOpcion*
 * 		si opcion != 0
 * 			segun (opcion)
 * 				caso 1: Dar de alta un paciente. *
 * 				caso 2: Dar de baja un paciente. *
 * 				caso 3: Listar pacientes.
 * 			fin_segun
 * 		fin_si
 * 		LeerValidarElegirOpcion
 * 	Fin_Mientras QuieraElegirOpcion
 * Fin
 * 
 * PG Nivel 1 Medicos
 * 
 * Inicio
 * Repetir
 * 		PrintMenuMedicosLeerValidarOpcion
 * 		si opcion != 0
 * 			segun (opcion)
 * 				caso 1: Contratar a un médico. *
 * 				caso 2: Despedir a un médico. *
 * 				caso 3: Listar los médicos.
 * 				caso 4: Asignar un paciente. *
 * 			fin_segun
 * 		fin_si
 * 		LeerValidarElegirOpcion
 * Fin_Mientras QuieraElegirOpcion
 * Fin
 * 
 * PG Nivel 1 Estadísticas
 * 
 * Inicio
 * Repetir
 * 		PrintMenuEstadisticasLeerValidarOpcion*
 * 		si opcion != 0
 * 			segun (opcion)
 * 				caso 1: Porcentaje pacientes hospitalizados
 * 				caso 2: Porcentaje mujeres y hombres hospitalizados *
 * 				caso 3: Porcentaje de pacientes con seguro privado *
 * 			fin_segun
 * 		fin_si
 * 		LeerValidarElegirOpcion
 * Fin_Mientras QuieraElegirOpcion
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
			System.out.println("-------------------- 3. Estadísticas -------------------");
			System.out.println("------------------------- 0. Salir ---------------------");
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
			System.out.println("------------------------- 1. Dar de alta un paciente -------------------------");
			System.out.println("------------------------- 2. Dar de baja un paciente -------------------------");
			System.out.println("----------------------------- 3. Listar pacientes ----------------------------");
			System.out.println("------------------------------------ 0. Salir --------------------------------");
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
			System.out.println("------------------------------------ 0. Salir --------------------------------");
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
			System.out.println("--------------------------------------- 0. Salir ------------------------------------");
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
			System.out.println("---------------------------------------- 0. Salir -------------------------------------");
			System.out.println("---------------------------------------------------------------------------------------");
	}
	//fin menuListarPacientes
	
	/* Prototipo: menuEstadisticas
	 * Breve comentario: Menu estadisticas del programa.
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: public void menuListarEstadisticas ()
		{
			System.out.println("Llamada al metodo menuListarEstadisticas");
		}
	 */
	public static void menuListarEstadisticas ()
	{
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("----------------------------- Bienvenidos al menu de estadísticas del hospital 'Habersinomemuero' ----------------------------");
			System.out.println("----------------------------------------- 1. Porcentaje de pacientes hospitalizados ------------------------------------------");
			System.out.println("------------------------------------- 2. Porcentajes de mujeres y hombres hospitalizados -------------------------------------");
			System.out.println("----------------------------------------- 3. Porcentaje de pacientes con seguro privado --------------------------------------");
			System.out.println("----------------------------------------------------------- 0. Salir ---------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
	}
	//fin menuListarEstadisticas
	
	/* Prototipo: menuEstadisticasPacientesHospitalizados
	 * Breve comentario: Menu estadisticas de pacientes hospitalizados del programa.
	 * Precondiciones: Ninguna
	 * Entradas: Ninguna
	 * Salidas: Ninguna
	 * Entradas/Salidas: Ninguna
	 * Postcondiciones: Ninguna
	 * 
	 * Resguardo: public void menuEstadisticasPacientesHospitalizados ()
		{
			System.out.println("Llamada al metodo menuEstadisticasPacientesHospitalizados");
		}
	 */
	public static void menuEstadisticasPacientesHospitalizados ()
	{
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("----------------------------- Bienvenidos al menu de estadísticas de pacientes del hospital 'Habersinomemuero' ----------------------------");
			System.out.println("----------------------------------------------------------------- 1. Niños ----------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------- 2. Jovenes --------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------- 3. Adultos --------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------ 0. Salir ---------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
	}
	//fin menuEstadisticasPacientesHospitalizados
	
	
	
	public static void main (String [] args) throws IOException
	{
		//Inicio
		BufferedReader tecladoString = new BufferedReader (new InputStreamReader (System.in));
		Scanner teclado = new Scanner (System.in);
		char ejecutar = ' ';
		char listarPacientes = ' ';
		char listarMedicos = ' ';
		char listarEstadisticas = ' ';
		char repetirMenuMedicos = ' ';
		char repetirMenuPacientes = ' ';
		char repetirMenuEstadisticas = ' ';
		int opcion = 0;
		int opcion2 = 0;
		int opcion3 = 0;
		int opcion4 = 0;
		int opcion5 = 0;
		int opcion6 = 0;
		int opcion7 = 0;
		String dni=null;
		double seguroPrivado = 0.0;
		GestoraJaraneitor jaraneitor=new GestoraJaraneitor();
		GestoraHospital goumes = new GestoraHospital ();
		MergePacientesEdad merge=new MergePacientesEdad();
		do
		{
			//PrintMenuPrincipalLeerValidarOpcion*
			do
			{
				MainHospital.menuHospital();
				try
				{
					opcion = teclado.nextInt ();
				}catch(InputMismatchException error)
				{
					opcion=-1;
					teclado=new Scanner(System.in);
				}
			}
			while (opcion < 0 || opcion > 3);
			//Fin PrintMenuPrincipalLeerValidarOpcion
			
			if (opcion != 0)
			{
				switch (opcion)
				{
					//caso 1: Pacientes
					case 1:
						do
						{
						
						 	//PrintMenuPacientesLeerValidarOpcion*
							do
							{
								MainHospital.menuPacientes();
								try
								{
									opcion2 = teclado.nextInt ();
								}catch(InputMismatchException error)
								{
									opcion2=-1;
									teclado=new Scanner(System.in);
								}
							}
							while (opcion2 < 0 || opcion2 > 3);
							//Fin PrintMenuPacientesLeerValidarOpcion*
							
								if (opcion2 != 0)
								{
									switch (opcion2)
									{
							 			//caso 1: Dar de alta un paciente. *
										case 1:
											jaraneitor.registrarPaciente();
											System.out.println("El paciente ha sido ingresado con exito");
										break;
										//Fin caso 1: Dar de alta un paciente.
											
							 			//caso 2: Dar de baja un paciente. *
										case 2:
											do
											{
												System.out.println("Inserte el DNI del paciente a dar de baja: ");
												dni=tecladoString.readLine();
											}while(dni.length()!=9);
											if(jaraneitor.eliminarPaciente(dni))
											{
												System.out.println("Se elimino correctamente el paciente");
											}
											else
											{
												System.out.println("No se borro el paciente");
											}
									
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
												try
												{
													opcion3 = teclado.nextInt ();
												}catch(InputMismatchException error)
												{
													opcion3=-1;
													teclado=new Scanner(System.in);
												}
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
														merge.run();
														jaraneitor.listarPacientes();
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
								
							//LeerValidarElegirOpcion
							do
							{
								System.out.println("Desea volver al menu de pacientes? S/N");
								repetirMenuPacientes = Character.toLowerCase(teclado.next().charAt(0));
							}
							while (repetirMenuPacientes != 's' && repetirMenuPacientes != 'n');
							//Fin LeerValidarElegirOpcion	
						}
						while (repetirMenuPacientes == 's');
						
					break;
					//Fin caso 1: Pacientes
					
					//caso 2: Medicos
					case 2:
						
						do
						{
							//PrintMenuMedicosLeerValidarOpcion
							do
							{
								MainHospital.menuMedicos();
								try
								{
									opcion4 = teclado.nextInt ();
								}catch(InputMismatchException error)
								{
									opcion4=-1;
									teclado=new Scanner(System.in);
								}
							}
							while (opcion4 < 0 || opcion4 > 4);
							//Fin PrintMenuMedicosLeerValidarOpcion
							
							if (opcion4 != 0)
							{
								switch (opcion4)
								{
									//caso 1: Contratar a un médico. *
									case 1:
									goumes.registrarMedico ();
									System.out.println("El médico ha sido contratado con éxito");
									break;
									//Fin caso 1: Contratar a un médico.
								
									//caso 2: Despedir a un médico. *
									case 2:
									do
									{
										System.out.println("Introduzca el DNI del medico a despedir.");
										dni = tecladoString.readLine();
									}
									while (dni.length() != 9);
										
									
									if (goumes.despedirMedico(dni))
									{
										System.out.println("El médico ha sido despedido con éxito");
									}
									
									else
									{
										System.out.println("No se ha despedido al medico");
									}
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
												try
												{
													opcion5 = teclado.nextInt ();
												}catch(InputMismatchException error)
												{
													opcion5=-1;
													teclado=new Scanner(System.in);
												}
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
							//LeerValidarElegirOpcion
							do
							{
								System.out.println("Desea volver al menu de medicos? S/N");
								repetirMenuMedicos = Character.toLowerCase(teclado.next().charAt(0));
							}
							while (repetirMenuMedicos != 's' && repetirMenuMedicos != 'n');
							//Fin LeerValidarElegirOpcion
					}
					while (repetirMenuMedicos == 's');
						
					break;
					//Fin caso 2: Medicos
					
					
					//caso 3: Estadísticas
					case 3:
						do
						{
						
							//PrintMenuEstadisticasLeerValidarOpcion*
							do
							{
								MainHospital.menuListarEstadisticas();
								try
								{
									opcion6 = teclado.nextInt ();
								}catch(InputMismatchException error)
								{
									opcion6=-1;
									teclado=new Scanner(System.in);
								}
							}
							while (opcion6 < 0 || opcion6 > 3);
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
										do
										{
											MainHospital.menuEstadisticasPacientesHospitalizados();
											try
											{
												opcion7 = teclado.nextInt ();
											}catch(InputMismatchException error)
											{
												opcion7=-1;
												teclado=new Scanner(System.in);
											}
										}
										while (opcion7 < 0 || opcion7 > 3);
										//Fin PrintMenuPacientesHospitalizadosLeerValidarOpcion
											
										if (opcion7 != 0)
										{
											switch (opcion7)
											{
											
												//caso 1: niños
												case 1:
													if(jaraneitor.porcentajeNiños()>=0)
													{
														System.out.println("Hay un "+jaraneitor.porcentajeNiños()+"% de niños en el hospital");
													}
													else
													{
														System.out.println("No hay pacientes en el hospital");
													}
												break;
												//Fin caso 1: niños
		
												//caso 2: jovenes
												case 2:
													if(jaraneitor.porcentajeJovenes()>=0)
													{
														System.out.println("Hay un "+jaraneitor.porcentajeJovenes()+"% de jovenes en el hospital");
													}
													else
													{
														System.out.println("No hay pacientes en el hospital");
													}
												break;
												//Fin caso 2: jovenes
											
												//caso 3: adultos
												case 3:
													if(jaraneitor.porcentajeAdultos()>=0)
													{
														System.out.println("Hay un "+jaraneitor.porcentajeAdultos()+"% de adultos en el hospital");
													}
													else
													{
														System.out.println("No hay pacientes en el hospital");
													}
												break;
												//Fin caso 3: adultos
											
											}//fin_segun
										}//fin_si
											
										//Preguntar ListarOtraVez
										do
										{
											System.out.println("Desea volver a ver los porcentajes de los pacientes hospitalizados? S/N");
											listarEstadisticas = Character.toLowerCase(teclado.next().charAt(0));
										}
										while (listarEstadisticas != 's' && listarEstadisticas != 'n');
										//Fin Preguntar ListarOtraVez
										
									}
									while (listarEstadisticas == 's');//Fin_Mientras QuieraListarOtraVez
									
									break;
									//Fin caso 1: Porcentaje pacientes hospitalizados
								
									//caso 2: Porcentaje mujeres y hombres hospitalizados *
									case 2:
										if(jaraneitor.porcentajeHombres()>=0)
										{
											System.out.println("Hay un "+jaraneitor.porcentajeHombres()+"% de hombres en el hospital");
										}
										else
										{
											System.out.println("No hay pacientes en el hospital");
										}
										if(jaraneitor.porcentajeMujeres()>=0)
										{
											System.out.println("Hay un "+jaraneitor.porcentajeMujeres()+"% de mujeres en el hospital");
										}
										else
										{
											System.out.println("No hay pacientes en el hospital");
										}
									break;
									//Fin caso 2: Porcentaje mujeres y hombres hospitalizados
								
									//caso 3: Porcentaje de pacientes con seguro privado *
									case 3:
										seguroPrivado = goumes.porcentajeSeguroPrivado();
										
										if (seguroPrivado != -1.0)
										{
											System.out.println("El porcentaje de pacientes con seguro privado es: "+seguroPrivado+"%");
										}
										
										else
										{
											System.out.println("No existe el fichero");
										}
									break;
									//Fin caso 3: Porcentaje de pacientes con seguro privado
								
								}//fin_segun
							}//fin_si
							
							do
							{
								System.out.println("Desea volver al menu de estadísticas? S/N");
								repetirMenuEstadisticas = Character.toLowerCase(teclado.next().charAt(0));
							}
							while (repetirMenuEstadisticas != 's' && repetirMenuEstadisticas != 'n');
							//Fin LeerValidarElegirOpcion
					}
					while (repetirMenuEstadisticas == 's');
						
					break;
					//Fin caso 3: Estadísticas
						
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