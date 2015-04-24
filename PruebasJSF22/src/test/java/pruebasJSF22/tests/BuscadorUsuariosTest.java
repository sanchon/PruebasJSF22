package pruebasJSF22.tests;


import org.junit.*;

import pruebasJSF22.buscadorUsuarios.BuscadorUsuarios;
import pruebasJSF22.buscadorUsuarios.Usuario;

public class BuscadorUsuariosTest {

	private BuscadorUsuarios bu;


	@Before
	public void inicializa()
	{
		bu = new BuscadorUsuarios();
	}
	
	@Test(expected=ArithmeticException.class)
	public void testBuscarHugo()
	{
		bu.setNombre("Hugo");
		bu.buscar();
	}
	
	@Test()
	public void testBuscarLosUsuarios()
	{
		bu.setNombre("loquesea");
		bu.buscar();
		
		//debería devolvernos dos objetos:
		Assert.assertEquals(2, bu.getResultados().size());
		
		//el primero debería ser Fulano Pérez, Gerente
		Usuario u1 = new Usuario("Fulano", "Pérez", 1, "Gerente");
		Assert.assertEquals(u1, bu.getResultados().get(0));
		
		
		//el segundo debería ser Mengano Mengánez, Coordinador
		Usuario u2 = new Usuario("Mengano", "Mengánez", 2, "Coordinador");
		Assert.assertEquals(u2, bu.getResultados().get(1));

	}
	
	

}
