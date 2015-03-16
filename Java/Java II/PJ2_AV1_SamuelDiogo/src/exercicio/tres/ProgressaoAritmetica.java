/***
 * Crie um m�todo que recebe uma lista de inteiros e um n�mero inteiro (chamado de "raz�o"). 
 * O m�todo deve retornar um boolean. 
 * Este boolean � verdadeiro se a lista recebida � uma Progress�o Aritm�tica, considerando a raz�o passada como par�metro.
 * 
 */

package exercicio.tres;

import java.util.ArrayList;

public class ProgressaoAritmetica {

	//este m�todo verifica se a lista de numero � pg tendo como razao o parametro "razao"
	public static boolean isPg(ArrayList<Integer> intList, int razao) throws Exception
	{		
		for(int n = 0; n < (intList.size()-1); n++)
			if(calcPG(intList.get(n), razao) != intList.get((n+1)))
				throw new Exception("N�o � PG");					
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
			if(isPg(numbers, 5))
				System.out.println("� pg");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

}
