/***
 * Crie um método que recebe uma lista de inteiros e um número inteiro (chamado de "razão"). 
 * O método deve retornar um boolean. 
 * Este boolean é verdadeiro se a lista recebida é uma Progressão Aritmética, considerando a razão passada como parâmetro.
 * 
 */

package exercicio.tres;

import java.util.ArrayList;

public class ProgressaoAritmetica {

	//este método verifica se a lista de numero é PA tendo como razao o parametro "razao"
	public static boolean isPa(ArrayList<Integer> intList, int razao) throws Exception
	{		
		for(int n = 0; n < (intList.size()-1); n++)
			if(calcPG(intList.get(n), razao) != intList.get((n+1)))
				throw new Exception("Não é PA");					
		return true;
	}
	// alternativo, para quem não conhece tratamento de exceção ("throws Exception")
	public static boolean isPaAlternativo(ArrayList<Integer> intList, int razao)
	{		
		for(int n = 0; n < (intList.size()-1); n++)
			if(calcPG(intList.get(n), razao) != intList.get((n+1)))
				return false;					
		return true;
	}	
	public static int calcPG(int n, int r)
	{
		return n + r;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(8);
		numbers.add(13);
		numbers.add(18);
		numbers.add(23);
		numbers.add(28);
		numbers.add(33);
		
		try
		{			
			if(isPa(numbers, 5))
				System.out.println("é pg");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//ou:
		if(isPaAlternativo(numbers,5))
			System.out.println("é pg");
		else
			System.out.println("não é pg");
	}

}
