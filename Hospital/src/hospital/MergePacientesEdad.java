package hospital;
import java.io.*;
public class MergePacientesEdad {

			   
				/*
				 * Interfaz
				 * 
				 * Este m�todo ejecuta el m�todo de ordenaci�n de mezcla directa
				 * prototipo: void run()
				 * Precondiciones: No hay
				 * Entradas: No hay
				 * Salidas: No hay
				 * Postcondiciones: No hay
				 * 
				 * RESGUARDO
				 * 
				 * public  void run() {
				 * 		System.out.println("EN CONSTRUCCION");
				 * }
				 */
			   public  void run() 
			   {
				   String INPUT= ".\\Hospital\\src\\hospital\\pacientesIngresados.dat" ;
				   String AUX1  =  ".\\Hospital\\src\\hospital\\aux1.dat" ;
				   String AUX2  =  ".\\Hospital\\src\\hospital\\aux2.dat" ;
			     boolean sorted = split(INPUT, AUX1, AUX2);
			       while (!sorted) { //Mientras no est�n ordenados, divide y vencer�s
			         merge(AUX1, AUX2, INPUT);
			         sorted = split(INPUT, AUX1, AUX2);
			       }
			   }
			   /*
			    * Interfaz
			    * 
			    * Este m�todo divide un fichero en otros dos, colocando en �stos los n�meros en secuencias ordenadas
			    * prototipo: boolean split(String input,String output1,String output2)
			    * Precondiciones: Las cadenas no pueden estar vac�as
			    * Entrada: 3 cadenas
			    * Salidas: Un valor booleano
			    * Postcondiciones: True si el fichero est� ordenado y false si no
			    * 
			    * RESGUARDO
			    * 
			    * public boolean split(String input,String output1,String output2)
			    * {
			    * 	return false;
			    * }
			    */
			
			    public boolean split(String input,String output1,String output2)  {
			    
			     ComparatorEdad comparator= new ComparatorEdad();
			     File aux1=new File(output1);
			     File aux2=new File(output2);
			     ObjectInputStream in =null; 
			     ObjectOutputStream out =null; 
			     ObjectOutputStream other =null; 
			     boolean lee=true;
			     boolean sorted = true;
			     try
			     {
			    	 in=new ObjectInputStream(new FileInputStream(input)){@Override protected void readStreamHeader(){}}; 
			    	 out=new ObjectOutputStream(new FileOutputStream(output1)){@Override protected void writeStreamHeader(){}};
			    	 other=new ObjectOutputStream(new FileOutputStream(output2)){@Override protected void writeStreamHeader(){}};
				     Paciente pacienteAnterior=null;
				     Paciente pacienteActual =(Paciente) in.readObject();
				     out.writeObject(pacienteActual);
				     pacienteAnterior= pacienteActual;
				     pacienteActual = (Paciente)in.readObject();
				     while (lee) 
				     { 
	
				       if (comparator.compare(pacienteAnterior, pacienteActual)>0) 
				       {
				         sorted = false;
				         ObjectOutputStream tmp = out;
				         out = other;
				         other = tmp;
				       }
				       out.writeObject(pacienteActual);
				
				       pacienteAnterior = pacienteActual;
				       pacienteActual = (Paciente)in.readObject();
				     }
			     }catch(EOFException e)
			     {
			    	 lee=false;
			     } catch (IOException e) 
			     {
					System.out.print(e);
				} catch (ClassNotFoundException e) 
			     {
					System.out.println(e);
				}finally
			     {	
					if(in!=null)
					{
						try 
						{
							in.close();
						} catch (IOException e) 
						{
							e.printStackTrace();
						}
					}
					if(out!=null)
					{
						try 
						{
							out.close();
						} catch (IOException e) 
						{
							e.printStackTrace();
						}
					}
					if(other!=null)
					{
						try 
						{
							other.close();
						} catch (IOException e) 
						{
							e.printStackTrace();
						}
					}
				}
			     if(sorted)
			     {
			    	aux1.delete();
			    	aux2.delete();
			     }
			     return sorted;
			   }
			
			    /*
			     * Interfaz
			     * 
			     * Este m�todo mezcla dos ficheros en uno ordenadamente
			     * Prototipo: void merge(String input1,String input2, String output)
			     * Precondiciones: Las cadenas no est�n vacias
			     * Entradas: 3 cadenas
			     * Salida: No hay
			     * Postcondiciones: No hay
			     * 
			     * RESGUARDO
			     *  public void merge(String input1,String input2, String output) throws IOException {
			     *  	System.out.println("EN CONSTRUCCION");
			     *  }
			     * 
			     */
			   public void merge(String input1,String input2, String output)  {
				 
				 ComparatorEdad comparator=new ComparatorEdad();
			     ObjectInputStream in1 = null;
			     ObjectInputStream in2 = null;
			     ObjectOutputStream out = null;
			     boolean lee1=true,lee2=true;
			     Paciente pacienteActual1 = null;
			     Paciente pacienteActual2 = null;
			    // try
			   //  {
		    	 try 
		    	 {
					in1=new ObjectInputStream(new FileInputStream(input1)){@Override protected void readStreamHeader(){}};
					in2=new ObjectInputStream( new FileInputStream(input2)){@Override protected void readStreamHeader(){}};
			    	out=new ObjectOutputStream(new FileOutputStream(output)){@Override protected void writeStreamHeader(){}};
		    	 } catch (FileNotFoundException e1) 
		    	 {
					e1.printStackTrace();
				 } catch (IOException e1) 
		    	 {
					e1.printStackTrace();
				 }
		    	 try 
			    	{
						pacienteActual1=(Paciente)in1.readObject();
					} catch (ClassNotFoundException e) 
			    	{							
						e.printStackTrace();
					}catch(EOFException e)
			    	{
						lee1=false;
					} catch (IOException e) 
			    	{
						e.printStackTrace();
					}
			    	 
			    	 try 
			    	{
						pacienteActual2=(Paciente)in2.readObject();
					} catch (ClassNotFoundException e) 
			    	{							
						e.printStackTrace();
					}catch(EOFException e)
			    	{
			    		lee2=false;
			    	} catch (IOException e)
			    	{
						e.printStackTrace();
					}
				     while (lee1&&lee2) 
				     {
				    	 
				    	if (comparator.compare(pacienteActual1, pacienteActual2)<=0)
				    	{
				    		try
				    		{
						         out.writeObject(pacienteActual1);
						         pacienteActual1 = (Paciente)in1.readObject();
				    		}catch(EOFException e)
				    		{
				    			lee1=false;
				    		} catch (IOException e) {
								e.printStackTrace();
							} catch (ClassNotFoundException e) {
								e.printStackTrace();
							}
				    	} 
				    	else 
				    	{
					         try 
					         {
								out.writeObject(pacienteActual2);
					        	pacienteActual2 =(Paciente) in2.readObject();
					         }catch(EOFException e)
					         {
					        	 lee2=false;
					         } catch (IOException e) {
								e.printStackTrace();
							} catch (ClassNotFoundException e) 
					         {
								e.printStackTrace();
							}
				        }
				     }
			    /* }catch(EOFException e)
			     {
			    	 lee=false;
			     } catch (FileNotFoundException e) {

					e.printStackTrace();
				} catch (IOException e) {
	
					e.printStackTrace();
				} catch (ClassNotFoundException e) {

					e.printStackTrace();
				}*/
				if(lee1)
				{
				     try
				     {
					     while (lee1) 
					     {
					       out.writeObject(pacienteActual1);
					       pacienteActual1 = (Paciente)in1.readObject();
					     }
				     }catch(EOFException e)
				     {
				    	 lee1=false;
				     } catch (IOException e) {
	
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
	
						e.printStackTrace();
					}
				}
				else if(lee2)
				{
					try
					{
					     while (lee2) 
					     {
					       out.writeObject(pacienteActual2);
					       pacienteActual2 = (Paciente)in2.readObject();
					     }
					}catch(EOFException e)
					{
						lee2=false;
					} catch (IOException e) 
					{
						e.printStackTrace();
					} catch (ClassNotFoundException e) 
					{
	
						e.printStackTrace();
					}
				}
			     try 
			    {
					in1.close();
					in2.close();
				    out.close();
				} catch (IOException e) 
			    {
					e.printStackTrace();
				}

			   }
}