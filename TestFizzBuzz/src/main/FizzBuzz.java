
public class FizzBuzz {

	public String generar(int numero){
		
		if (numero % 3 == 0 && numero % 5 == 0)
		
			return  "FizzBuzz";                    
		
		if(numero % 3 == 0)
		
			return "Fizz";
		
		if(numero % 5 == 0)
		
			return "Buzz";
		
		else
			return Integer.toString(numero);
	}

	public int generarUno(int numero) {
		// TODO Auto-generated method stub
		return numero;
	}

	public String generarFizz(int numero) {
		// TODO Auto-generated method stub
		if(numero % 3 == 0)
		{
			return "Fizz";
		}
		else
		{
			return Integer.toString(numero);
		}
		
	}

	public String generarBuzz(int numero) {
		// TODO Auto-generated method stub
		if(numero % 5 == 0)
		{
			return "Buzz";
		}
		else
		{
			return Integer.toString(numero);
		}
	}

	public String generarFizzBuzz(int numero) {
		// TODO Auto-generated method stub
		if (numero % 3 == 0 && numero % 5 == 0)
		{
			return "FizzBuzz";                    
		}
		else
		{
			return Integer.toString(numero);
		}
	}

	public void generarMuchos(int tamanio) {
		// TODO Auto-generated method stub
		for(int numero = 0; numero < tamanio; numero++)
		{
			System.out.println(generar(numero));
		}
	}

	

	

	
	
	
}
