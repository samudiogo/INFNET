package program;


import entities.FraseAleatoria;

public class Principal 
{
	public static void main(String[] args)
	{
		FraseAleatoria fa  = new FraseAleatoria();
		System.out.println(fa.getFrase());
		
		
		//metodo B
		System.out.println("***********************");
		System.out.println("frequencia das palavras:");
		fa.printWordFrequency("turn");
		
		//metodo c:
		System.out.println("***********************");
		System.out.println("Palavras repitidas:");
		for(String c: fa.getWordsBySize(3))
			fa.printWordFrequency(c, fa.getWordsBySize(3));
		
		//metodo d:
		System.out.println("***********************");
		System.out.println("pavras tendo caracteres substituidos:");
		fa.swapLetter('k');
		
	}
}
