
public class FizzBuzz {

	public String generar(int numero){
		
		if (numero % 3 == 0 && numero % 5 == 0) //Si el residuo de la división del numero entre 3 y 5 es igual a cero
		
			return  "FizzBuzz";  //retornará FizzBuzz                 
		
		if(numero % 3 == 0) //Si el residuo del numero dividido entre 3 es igual a cero
		
			return "Fizz"; //retornará Fizz  
		
		if(numero % 5 == 0)  //Si el residuo del numero dividido entre 5 es igual a cero
		
			return "Buzz"; //retornará Buzz  
		
		else //caso contrario
			return Integer.toString(numero); //retornará el numero  
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
		for(int numero = 0; numero < tamanio; numero++) //la generación de más de 100 numero ya estaba implementada
		{
			System.out.println(generar(numero));
		}
	}

	

	

	
	
	
}
