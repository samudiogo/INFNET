/**
 * Crie um método que recebe uma lista de nomes e um número inteiro (chamado de "limite"). 
 * O método deve retornar uma lista de nomes. 
 * A lista retornada possui todos os nomes da lista original compostos por mais palavras que o valor 
 * de "limite" *ou* que possuam o primeiro nome terminado em "z".
 * 
 **/

package exercicio.dois;

import java.util.ArrayList;

public class Nome 
{
	// Este método estático filtra uma lista de nomes com os parametros solicitados na questão da prova
	public static ArrayList<String> GetListofNamesEndingZorHaveLimits(ArrayList<String> nameList, int limit)
	{
		ArrayList<String> filtredNames = new ArrayList<String>();
		for(String name: nameList)
		{
			String[] fullName = name.split(" ");
			boolean isOverLimit = (fullName.length > limit);
			boolean isFirstNamedEndsWithZ = (fullName[0].endsWith("z"));		
		
			if(isOverLimit || isFirstNamedEndsWithZ)
				filtredNames.add(name);			
		}
		return filtredNames;
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> listaDeNomes = new ArrayList<String>();
			
		listaDeNomes.add("Viva Inabinet");
		listaDeNomes.add("Nathanial Meigs");
		listaDeNomes.add("Blake Portwood");
		listaDeNomes.add("Fransisca Lecroy");
		listaDeNomes.add("Delmer Dossey");
		listaDeNomes.add("Vita Jeffries");
		listaDeNomes.add("Jarrett Hilger");
		listaDeNomes.add("Catherina Hassel");
		listaDeNomes.add("Terrance Sorensen");
		listaDeNomes.add("Lynsey Ralston");
		listaDeNomes.add("Bettina Lowy");
		listaDeNomes.add("Kathleen Shadduck");
		listaDeNomes.add("Christopher Russum");
		listaDeNomes.add("Erasmoz Seamons");
		listaDeNomes.add("Berta Mckinnis");
		listaDeNomes.add("Bill Kilmer");
		listaDeNomes.add("Bernicez Footman");
		listaDeNomes.add("Courtney Moreland");
		listaDeNomes.add("Dorianz Gail");
		listaDeNomes.add("Cloe Dorianz Gail");
		listaDeNomes.add("Benjamin Dorian Gail");
		listaDeNomes.add("Tessa Edmondson");
		
		ArrayList<String> nomesFiltrados = new ArrayList<String>();
		
		nomesFiltrados = GetListofNamesEndingZorHaveLimits(listaDeNomes,2);
		for(String nome: nomesFiltrados)
			System.out.println(nome);
	}
}
