package hospital;

public interface Persona 
{
	String getNombre ();
	void setNombre (String nombre) throws HospitalException;
	
	String getApellidos ();
	void setApellidos (String apellidos)throws HospitalException;
	
	int getEdad ();
	void setEdad (int edad)throws HospitalException;
	
	String getDNI ();
	
	char getSexo ();
	void setSexo (char sexo)throws HospitalException;
	
	String getTelefono ();
	void setTelefono (String telefono)throws HospitalException;
	
	Domicilio getDomicilio ();
	void setDomicilio (Domicilio domicilio)throws HospitalException;
	
	//No pongo los metodos porque no veo conveniente que todas las clases personas se implementen igual.
}
