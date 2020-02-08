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
	
}
