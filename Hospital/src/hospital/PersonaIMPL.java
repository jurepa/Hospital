package hospital;

public interface PersonaIMPL 
{
	String getNombre ();
	void setNombre (String nombre);
	
	String getApellidos ();
	void setApellidos (String apellidos);
	
	int getEdad ();
	void setEdad (int edad);
	
	String getDNI ();
	
	char getSexo ();
	void setSexo (char sexo);
	
	String getTelefono ();
	void setTelefono (String telefono);
	
	Domicilio getDomicilio ();
	void setDomicilio (Domicilio domicilio);
	
	char calcularLetra (String dni);
	boolean validarNumerosTelefono (String telefono);
	boolean validarNumerosDNI (String dni);
}