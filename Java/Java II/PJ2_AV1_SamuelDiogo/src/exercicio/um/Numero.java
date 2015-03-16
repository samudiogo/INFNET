package exercicio.um;

import java.util.ArrayList;
import java.util.Scanner;

public class Numero
{

	public static void main(String[] args)
	{
		//Repositório do numeros digitados pelo usuário;
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		final int MAX_NUM = 100; // maximo perimitido, solicitado no enuciado da prova
		
		Scanner userInput = new Scanner(System.in);
		
		//fazendo a leitura dos dados digitados pelo usuario:
		for(int i = 0; i < MAX_NUM; i++)
			listOfNumbers.add(userInput.nextInt());
		
		userInput.close();// fecho o stream de leitura via console
		
		for(int r = (listOfNumbers.size()-1); r >=0 ; r--) // percorrendo o vetor na ordem inversa
			if((listOfNumbers.get(r) % 2) == 0) // checo se é par
				System.out.println(listOfNumbers.get(r));
		//done :D		
	}

}
