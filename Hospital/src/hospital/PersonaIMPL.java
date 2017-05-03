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
	
	//No pongo los metodos porque no veo conveniente que todas las clases personas se implementen igual.
}
