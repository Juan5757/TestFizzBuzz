import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void deberiaRetornar1SiIngreso1(){
		FizzBuzz fb = new FizzBuzz();
		int numero=fb.generarUno(1);
		assertThat(1).isEqualTo(numero);
	}
	
	@Test
	public void deberiaRetornar2SiIngreso2(){
		FizzBuzz fb = new FizzBuzz();
		int numero=fb.generarUno(2);
		assertThat(2).isEqualTo(numero);
	}
	
	@Test
	public void deberiaRetornarMenos1SiIngresoMenos1(){
		FizzBuzz fb = new FizzBuzz();
		int numero=fb.generarUno(-1);
		assertThat(-1).isEqualTo(numero);
	}
	
	@Test
	public void deberiaRetornarMenos2SiIngresoMenos2(){
		FizzBuzz fb = new FizzBuzz();
		int numero=fb.generarUno(-2);
		assertThat(-2).isEqualTo(numero);
	}
	
	@Test
	public void deberiaRetornarFizzSiIngreso3(){
		FizzBuzz fb = new FizzBuzz();
		String palabra =fb.generarFizz(3);
		assertThat("Fizz").isEqualTo(palabra);
	}
	
	@Test
	public void deberiaRetornarFizzSiIngreso6(){
		FizzBuzz fb = new FizzBuzz();
		String palabra =fb.generarFizz(6);
		assertThat("Fizz").isEqualTo(palabra);
	}
	
	@Test
	public void deberiaRetornar4SiIngreso4(){
		FizzBuzz fb = new FizzBuzz();
		String resultado =fb.generarFizz(4);
		assertThat("4").isEqualTo(resultado);
	}
	
	@Test
	public void deberiaRetornarBuzzSiIngreso5(){
		FizzBuzz fb = new FizzBuzz();
		String palabra =fb.generarBuzz(5);
		assertThat("Buzz").isEqualTo(palabra);
	}
	
	@Test
	public void deberiaRetornarBuzzSiIngreso10(){
		FizzBuzz fb = new FizzBuzz();
		String palabra =fb.generarBuzz(10);
		assertThat("Buzz").isEqualTo(palabra);
	}
	
	@Test
	public void deberiaRetornarBuzzSiIngreso15(){
		FizzBuzz fb = new FizzBuzz();
		String palabra =fb.generarBuzz(15);
		assertThat("Buzz").isEqualTo(palabra);
	}
	
	@Test
	public void deberiaRetornarBuzzSiIngreso12(){
		FizzBuzz fb = new FizzBuzz();
		String palabra =fb.generarBuzz(12);
		assertThat("12").isEqualTo(palabra);
	}
	
	@Test
	public void deberiaRetornarFizzBuzzSiIngreso15(){
		FizzBuzz fb = new FizzBuzz();
		String palabra =fb.generarFizzBuzz(15);
		assertThat("FizzBuzz").isEqualTo(palabra);
	}
	
	@Test
	public void deberiaRetornarFizzBuzzSiIngreso30(){
		FizzBuzz fb = new FizzBuzz();
		String palabra =fb.generarFizzBuzz(30);
		assertThat("FizzBuzz").isEqualTo(palabra);
	}
	
	@Test
	public void deberiaRetornarFizzBuzzSiIngreso10(){
		FizzBuzz fb = new FizzBuzz();
		String palabra =fb.generarFizzBuzz(10);
		assertThat("10").isEqualTo(palabra);
	}
	
	@Test
	public void deberiaRetornarFizzBuzzSiIngreso11(){
		FizzBuzz fb = new FizzBuzz();
		String palabra =fb.generarFizzBuzz(11);
		assertThat("11").isEqualTo(palabra);
	}
	
	@Test
	public void deberiaRetornar10NumerosAplicandoFizzBuzzSiIngreso10(){
		FizzBuzz fb = new FizzBuzz();
		fb.generarMuchos(10);
	}
	
}
