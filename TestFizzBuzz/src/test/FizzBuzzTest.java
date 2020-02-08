import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testConstructor(){
		Program p = new Program();
	}
	
	@Test
	public void testProgram(){
		Program p = new Program();
		p.main(null);
	}
	
	@Test
	public void testConstructorFizzBuzz(){
		FizzBuzz fb = new FizzBuzz();
	}
	
	@Test
	public void testFizzBuzz(){
		FizzBuzz fb = new FizzBuzz();
		fb.generar();
	}
	
}
