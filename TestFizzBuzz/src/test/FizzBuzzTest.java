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
	
}
