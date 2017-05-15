package hospital;

import java.io.Serializable;
import java.util.Objects;

/*
 * Clase dommicilio
 * 
 * Propiedades básicas:
 * 
 * Calle String, consultable y modificable
 * Numero int, consultable y modificable
 * Ciudad String, consultable y modificable
 * 
 * Propiedades derivadas:
 * 
 * No tiene
 * 
 * Propiedades compartidas:
 * 
 * No tiene
 * 
 * Métodos consultores y modificadores:
 * 
 * void setCalle(String calle)
 * void setNumero(int numero)
 * void setCiudad(String ciudad)
 * 
 * String getCalle()
 * int getNumero()
 * String getCiudad()
 * 
 * Métodos añadidos:
 * 
 * No hay
 * 
 * 
 */
public class DomicilioIMPL implements Cloneable, Domicilio, Serializable {
	
	private String calle;
	private int numero;
	private String ciudad;
	
	//Constructores
	
	public DomicilioIMPL()
	{
		calle="";
		numero=0;
		ciudad="";
	}
	public DomicilioIMPL(String calle, String ciudad, int numero) throws HospitalException
	{
		if (calle.equals ("") || calle.equals(null)
			|| ciudad.equals("") || ciudad.equals(null)
			|| numero < 1)
		{
			if (calle.equals("") || calle.equals(null))
			{
				throw new HospitalException ("La calle no puede estar vacia");
			}
			
			if (ciudad.equals("") || ciudad.equals(null))
			{
				throw new HospitalException ("La calle no puede estar vacia");
			}
			
			if (numero < 1)
			{
				throw new HospitalException ("La calle no puede estar vacia");
			}
		}
		
		else
		{
			this.calle=calle;
			this.ciudad=ciudad;
			this.numero=numero;
		}
	}
	public DomicilioIMPL(DomicilioIMPL d)
	{
		this.calle=d.calle;
		this.ciudad=d.ciudad;
		this.numero=d.numero;
	}
	//Métodos consultores y modificadores
	public void setCalle(String calle) throws HospitalException
	{
		if (calle.equals("") || calle.equals(null))
		{
			throw new HospitalException ("La calle no puede estar vacia");
		}
		
		else
		{
			this.calle=calle;
		}
	}
	public void setNumero(int numero)  throws HospitalException
	{
		if (numero < 1)
		{
			throw new HospitalException ("El numero debe ser mayor que 0");
		}
		else
		{
			this.numero=numero;
		}
	}
	public void setCiudad(String ciudad)  throws HospitalException
	{
		if (ciudad.equals("") || ciudad.equals(null))
		{
			throw new HospitalException ("La ciudad no puede estar vacia");
		}
		
		else
		{
			this.ciudad=ciudad;
		}
	}
	public String getCalle()
	{
		return calle;
	}
	public String getCiudad()
	{
		return ciudad;
	}
	public int getNumero()
	{
		return numero;
	}
	//Métodos añadidos
	@Override
	public String toString()
	{
		return getCalle()+", "+getNumero()+", "+getCiudad();
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(getCalle(),getNumero(),getCiudad());
	}
	@Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		if(x!=null&& x instanceof Domicilio)
		{
			Domicilio domicilio=(Domicilio)x;
			if(this.getCalle().equals(domicilio.getCalle())
				&& this.getNumero() == domicilio.getNumero()
				&& this.getCiudad().equals(domicilio.getCiudad()))
			{
				igual=true;
			}
		}
		return igual;
	}
	@Override
	public Domicilio clone()
	{
		Domicilio d=null;
		try
		{
			d=(Domicilio)super.clone();
		}catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return d;
	}
	//No pongo compareTo, no hay atributos para comparar dos domicilios.
	
	

}
