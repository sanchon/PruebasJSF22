package pruebasJSF22.buscadorUsuarios;

public class Usuario 
{
	private String nombre;
	private String apellidos;
	private int id;
	private String puesto;
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getApellidos()
	{
		return apellidos;
	}
	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getPuesto()
	{
		return puesto;
	}
	public void setPuesto(String puesto)
	{
		this.puesto = puesto;
	}
	
	public Usuario(String nombre, String apellidos, int id, String puesto)
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.puesto = puesto;
	}

}
