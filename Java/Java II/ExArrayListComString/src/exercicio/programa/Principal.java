package exercicio.programa;

import java.util.ArrayList;

import exercicio.repositorio.Aluno;

public class Principal
{
	public static ArrayList<Aluno> list = Aluno.GenerateMonkyList();
	
	//aux methods:
	private static String[] splitNames(String fName)
	{
		return fName.split("\\s");
	}
	
	public static void main(String[] args)
	{
		System.out.println("\nList of names:");
		ListNames();
		System.out.println("\nList of names UPPER:");
		ListnamesToUpper();
		System.out.println("\nList of names Lower:");
		ListnamesToLower();
		System.out.println("\nList length names:");
		ListNamesLength();
		System.out.println("\nList full names:");
		ListFullNames();
		System.out.println("\nList names with 4 names:");
		ListNamesWithFour();
		System.out.println("\nList names with java names:");
		ListNamesWithJava2();
		System.out.println("\nList names with names starts with 'A':");
		ListNamesStartingWithA();
		System.out.println("\nList names with names ends with 'A':");
		ListSurnamesEndindWithA();
		System.out.println("\nList names with surnames starts with 'A':");
		ListSurnameStartingWithA();
	}

	// 1. Imprimir o vetor no console utilizando o "enhanced for"
	public static void ListNames()
	{
		for(Aluno a: list)
			System.out.println(a.getNome());
	}
	
	//2. Imprimir o vetor no console utilizando o "enhanced for". Todos as letras do nome maiúsculas (toUpperCase)
	public static void ListnamesToUpper()
	{
		for(Aluno a: list)
		{
			System.out.println(a.getNome().toUpperCase());
		}
	}
	
	//3. Imprimir o vetor no console utilizando o "enhanced for". Todos as letras do nome minúsculas (toLowerCase)
	public static void ListnamesToLower()
	{
		for(Aluno a: list)
		{
			System.out.println(a.getNome().toLowerCase());
		}
	}
		
	//4. Imprimir o vetor no console utilizando o "enhanced for", exibindo apenas o tamanho de cada String (length)
	public static void ListNamesLength()
	{
		for(Aluno a: list)
			System.out.println(a.getNome().length());
	}
	
	//5. Imprimir o vetor no console utilizando o "enhanced for", concatenando o nome e o sobrenome de cada aluno (concat)
	public static void ListFullNames()
	{
		for(Aluno a: list)
		{
			String fullName[] = splitNames(a.getNome());
			String nomeCompleto = "";
			int tam = fullName.length; 
			if(tam > 1)
				for(int i = 0; i <= (tam-1);++i)
					nomeCompleto = nomeCompleto.concat(" ").concat(fullName[i]);
			System.out.println(nomeCompleto);
		}			
	}
	//6. Imprimir o vetor no console utilizando o "enhanced for", substituindo todas as letras "a" por "4" (replace)
	public static void ListNamesWithFour()
	{
		for(Aluno a : list)
			System.out.println(a.getNome().replace('a', '4'));
	}
	
	//7. Imprimir o vetor no console utilizando o "enhanced for", substituindo todas as sequências "an" por "JAVA2" (replace)
	//   [Utilize outra sequência de dois caracteres caso esta não exista no vetor]
	public static void ListNamesWithJava2()
	{
		for(Aluno a: list)
			System.out.println(a.getNome().replace("an", "JAVA2"));
	}
	//8. Imprimir o vetor no console utilizando o "enhanced for", exibindo apenas os nomes iniciados com "A" (startsWith)
	public static void ListNamesStartingWithA()
	{
		for(Aluno a: list)
			if(a.getNome().startsWith("A"))
				System.out.println(a.getNome());
	}
	//9. Imprimir o vetor no console utilizando o "enhanced for", exibindo apenas os sobrenomes terminados com "A" (endsWith)
	public static void ListSurnamesEndindWithA()
	{
		for(Aluno a: list)
			if(a.getNome().endsWith("a"))
				System.out.println(a.getNome());
	}

	//10. Imprimir o vetor no console utilizando o "enhanced for", exibindo apenas os sobrenomes iniciados com "A" (startsWith)
	public static void ListSurnameStartingWithA()
	{
		for(Aluno a: list)
		{
			String fullName[] = splitNames(a.getNome());
			int t = fullName.length -1;
			if(fullName[t].startsWith("A"))
				System.out.println(fullName[t]);
		}
				
	}
}
