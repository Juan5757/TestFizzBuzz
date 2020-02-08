
public class FizzBuzz {

	public void generar(int numero){
		
		if (numero % 3 == 0 && numero % 5 == 0)
		{
			System.out.println("FizzBuzz");                    
		}
		else 
			if(numero % 3 == 0)
			{
				System.out.println("Fizz");
			}
			else 
				if(numero % 5 == 0)
				{
					System.out.println("Buzz");
				}
				else
					System.out.println(numero);
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
			generar(numero);
		}
	}

	

	

	
	
	
}
