package hospital;

public interface DomicilioIMPL 
{
	String getCalle ();
	void setCalle (String calle)  throws HospitalException;
	
	int getNumero ();
	void setNumero (int numero)  throws HospitalException;
	
	String getCiudad ();
	void setCiudad (String ciudad)  throws HospitalException;
}