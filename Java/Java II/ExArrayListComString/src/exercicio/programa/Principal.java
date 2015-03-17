package exercicio.programa;

import java.util.ArrayList;

import exercicio.repositorio.Aluno;

public class Principal
{
	public static ArrayList<Aluno> list = Aluno.GenerateMonkyList();
	
	public static void main(String[] args)
	{
		ListFullNames();
	}
	
	//aux methods:
	
	private static String[] splitNames(String fName)
	{
		return fName.split("\b");
	}
	
	// 1. Imprimir o vetor no console utilizando o "enhanced for"
	public void ListNames()
	{
		for(Aluno a: this.list)
			System.out.println(a.getNome());
	}
	
	//2. Imprimir o vetor no console utilizando o "enhanced for". Todos as letras do nome maiúsculas (toUpperCase)
	public void ListnamesToUpper()
	{
		for(Aluno a: this.list)
		{
			System.out.println(a.getNome().toUpperCase());
		}
	}
	
	//3. Imprimir o vetor no console utilizando o "enhanced for". Todos as letras do nome minúsculas (toLowerCase)
	public void ListnamesToLower()
	{
		for(Aluno a: this.list)
		{
			System.out.println(a.getNome().toLowerCase());
		}
	}
		
	//4. Imprimir o vetor no console utilizando o "enhanced for", exibindo apenas o tamanho de cada String (length)
	public void ListNamesLength()
	{
		for(Aluno a: this.list)
			System.out.println(a.getNome().length());
	}
	
	//5. Imprimir o vetor no console utilizando o "enhanced for", concatenando o nome e o sobrenome de cada aluno (concat)
	public static void ListFullNames()
	{
		for(Aluno a : list)
		{
			String[] fName = splitNames(a.getNome());
			String name = "";
			int t = fName.length;
			System.out.println(t);
			System.out.println(name);
				
			
		}
	}
	//6. Imprimir o vetor no console utilizando o "enhanced for", substituindo todas as letras "a" por "4" (replace)

	//7. Imprimir o vetor no console utilizando o "enhanced for", substituindo todas as sequências "an" por "JAVA2" (replace)
	//   [Utilize outra sequência de dois caracteres caso esta não exista no vetor]
	//8. Imprimir o vetor no console utilizando o "enhanced for", exibindo apenas os nomes iniciados com "A" (startsWith)

	//9. Imprimir o vetor no console utilizando o "enhanced for", exibindo apenas os sobrenomes terminados com "A" (endsWith)

	//10. Imprimir o vetor no console utilizando o "enhanced for", exibindo apenas os sobrenomes iniciados com "A" (startsWith)	
}
