package pruebasJSF22.buscadorUsuarios;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BuscadorUsuarios
{
	
	// --------------------------------------------
	// propiedades
	// --------------------------------------------
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	private String estadoBusqueda;

	private List<Usuario> resultados;
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getApellido1()
	{
		return apellido1;
	}
	public void setApellido1(String apellido1)
	{
		this.apellido1 = apellido1;
	}
	public String getApellido2()
	{
		return apellido2;
	}
	public void setApellido2(String apellido2)
	{
		this.apellido2 = apellido2;
	}
	
	public String getEstadoBusqueda()
	{
		return this.estadoBusqueda;
	}
	
	// --------------------------------------------
	// Metodos
	// --------------------------------------------
	
	/*
	 * Este método típicamente invocaría a un servicio de negocio que haría
	 * la búsqueda en la base de datos a partir de los parámetros. 
	 * 
	 * Vamos a usarlo para probar algunas cosas:
	 *  - si en el nombre del usuario metemos "hugo" se generará una excepción
	 *  - si en el nombre del usuario metemos cualquier otra cosa, se generará
	 *    una lista de resultados de prueba
	 */
	public void buscar()
	{
		
		if (this.nombre.equals("Hugo"))
		{
			//forzamos una / by 0 exception
			int a = 0;
			a = 2/a;
		}
		
		
		Usuario u1 = new Usuario("Fulano", "Pérez", 1, "Gerente");
		Usuario u2 = new Usuario("Mengano", "Rodríguez", 2, "Coordinador");
		
		resultados = new ArrayList<Usuario>();
		resultados.add(u1);
		resultados.add(u2);
		
		
	}
	public List<Usuario> getResultados()
	{
		return resultados;
	}
	

}
