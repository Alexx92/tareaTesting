package cl.ubb.agil;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Test;

public class ProductoTest {
	private Categoria categoria;
	private Producto producto;
	private Producto producto2;
	@Before
	public void setup()throws Exception{
		categoria = new Categoria("Guitarra electrica","1578");
		producto = new Producto("Guitarra Gibson Les Paul Studio",5,10,categoria);
		producto2 = new Producto("Guitarra Gibson Les Paul Studio",5,10);
	}	
	
	@Test
	public void creaProductoConCategoria(){
		/*Arrange*/
		/*Act*/		
		assertNotNull(producto);		
	}
	@Test
	public void creaProductoSinCategoria(){
		/*Arrange*/		
		/*Act*/
		/*Assert*/
		assertNotNull(producto2);
	}
	@Test
	public void actualizaNombreAGuitarraGibsonConCategoria(){
		/*Arrange*/		
		/*Act*/
		producto.setNombre("Guitarra Gibson");
		String newNombre=producto.getNombre();
		/*Assert*/
		assertThat(newNombre,is("Guitarra Gibson"));
		
	}
	@Test
	public void retornaNombreProductoConCategoria(){
		/*Arrange*/		
		/*Act*/
		String newNombre=producto.getNombre();
		/*Assert*/
		assertThat(newNombre,is("Guitarra Gibson"));
		
	}


}
