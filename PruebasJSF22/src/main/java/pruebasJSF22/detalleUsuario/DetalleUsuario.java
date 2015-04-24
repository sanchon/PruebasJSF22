package pruebasJSF22.detalleUsuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class DetalleUsuario 
{
	private String nombre;
	private String apellidos;
	private int id;
	private String puesto;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void cargarDesdeBD()
	{
		if (this.id==1)
		{
			this.nombre="Fulano";
			this.apellidos="Perez";
			this.puesto="Gerente";
		}
		
		if (this.id==2)
		{
			this.nombre="Mengano";
			this.apellidos="Rodriguez";
			this.puesto="Coordinador";
		}
		
			
	}
	

}
