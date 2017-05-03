package hospital;

import java.util.Objects;

/*
 * Clase dommicilio
 * 
 * Propiedades b�sicas:
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
 * M�todos consultores y modificadores:
 * 
 * void setCalle(String calle)
 * void setNumero(int numero)
 * void setCiudad(String ciudad)
 * 
 * String getCalle()
 * int getNumero()
 * String getCiudad()
 * 
 * M�todos a�adidos:
 * 
 * No hay
 * 
 * 
 */
public class Domicilio {
	
	private String calle;
	private int numero;
	private String ciudad;
	
	//Constructores
	
	public Domicilio()
	{
		calle="";
		numero=1;
		ciudad="";
	}
	public Domicilio(String calle, String ciudad, int numero)
	{
		this.calle=calle;
		this.ciudad=ciudad;
		this.numero=numero;
	}
	public Domicilio(Domicilio d)
	{
		this.calle=d.calle;
		this.ciudad=d.ciudad;
		this.numero=d.numero;
	}
	//M�todos consultores y modificadores
	public void setCalle(String calle)
	{
		this.calle=calle;
	}
	public void setNumero(int numero)
	{
		this.numero=numero;
	}
	public void setCiudad(String ciudad)
	{
		this.ciudad=ciudad;
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
	//M�todos a�adidos
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
