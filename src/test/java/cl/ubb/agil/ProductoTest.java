package cl.ubb.agil;

import org.junit.Test;

public class ProductoTest {

	
	@Test
	public void creaProductoConCategoria(){
		Categoria categoria=new Categoria("Guitarra Electrica","1578");
		Producto producto = new Producto("Guitarra Gibson Les Paul Studio",5,10,categoria);
		
	}
	@Test
	public void creaProductoSinCategoria(){
		
		Producto producto = new Producto("Guitarra Gibson Les Paul Studio",5,10);
		
	}

}
