
public class Program {
	public static void main(String[] args)
	{
		
		FizzBuzz fb = new FizzBuzz();
		//fb.generar();
		
		int num = fb.generarUno(1);
		System.out.println(num);
		
		String resultado = fb.generarFizz(3);
		System.out.println(resultado);
		
		String resultado2 = fb.generarBuzz(5);
		System.out.println(resultado2);
		
		String resultado3 = fb.generarFizzBuzz(15);
		System.out.println(resultado3);
		
		fb.generarMuchos(10);
    }	
}
