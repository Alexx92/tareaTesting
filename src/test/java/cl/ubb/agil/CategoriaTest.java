package cl.ubb.agil;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CategoriaTest {
	private Categoria cat;
	@Before
	public void setup()throws Exception{
		cat = new Categoria("Guitarra electrica","1578");
		
	}	
	@Test
	public void probarNombreIgualGuitarraConCodigo(){
		/*Arrange*/	
		
		/*Act*/
		String nombre= cat.getNombre();
		/*Assert*/
		assertThat(nombre,is("Guitarra electrica"));
		
	}
	@Test
	public void probarCodigo1578ConNombre(){
		/*Arrange*/	
		
		/*Act*/
		String codigo= cat.getCodigo();
		/*Assert*/
		assertThat(codigo,is("1578"));
	}
	@Test
	public void cambiarNombreGuitarraElectricaPorGuitarraAcustica(){
		/*Arrange*/		
		/*Act*/
		cat.setNombre("Guitarra Acustica");
		String nombre= cat.getNombre();
		/*Assert*/
		assertThat(nombre,is("Guitarra Acustica"));
	}
	@Test
	public void cambiarCodigo1578A2769(){
		/*Arrange*/		
		/*Act*/
		cat.setCodigo("2769");
		String codigo= cat.getCodigo();
		/*Assert*/
		assertThat(codigo,is("2769"));
	}
	@Test
	public void pruebaCambiarCodigoDeTamaño4ATamaño7(){
		/*Arrange*/		
		/*Act*/
		cat.setCodigo("2458765");
		String codigo= cat.getCodigo();
		/*Assert*/
		/*Si el test sale fallido es porque se actualizo la variable codigo con un valor
		 * mayor a 5 y por las reglas esto no deberia pasar*/
		assertThat(codigo.length(),is(7));
	}
	@Test
	public void pruebaIngresarDatosVaciosAlConstructor(){
		
		/*Arrange*/	
		cat = new Categoria("","");
		/*Act*/
		String nombre= cat.getNombre();
		/*Assert*/
		if(nombre.length()==0)/*El test deve fallar porque se creo un objeto de tipo categoria con datos vacios*/
			assertThat(nombre.length(),is(1));
	}
	

}
