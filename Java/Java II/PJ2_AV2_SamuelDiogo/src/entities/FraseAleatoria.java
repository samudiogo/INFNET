package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import repository.PhraseRepository;

public class FraseAleatoria 
{
	private String Frase;
	private int Length;

	public int getLength() {
		return Length;
	}

	private void setLength(int length) {
		Length = length;
	}

	public String getFrase() {
		return Frase;
	}
	
	public void setFrase(String frase) {
		Frase = frase;
	}

	public FraseAleatoria()
	{
		setLength(25);
		setFrase(RandomPhrase(getLength()));
	}
	
	public FraseAleatoria(int length)
	{
		setLength(length);
		setFrase(RandomPhrase(getLength()));
	}
	
	private String RandomPhrase(int lenght)
	{
		StringBuilder auxPhrase = new StringBuilder();
		Random rd4Char = new Random();
		Random rd4Spaces = new Random();
		StringBuilder tmpWord = new StringBuilder();;
		for(int i = 0; i <= getLength(); i++)
		{
			while(tmpWord.length() < 5)
			{
				tmpWord.append(PhraseRepository.randomLetters[rd4Char.nextInt((PhraseRepository.randomLetters.length)-1)]);
			}
			
			auxPhrase.append(tmpWord.toString());
			if((auxPhrase.length()> (getLength() - 5)))
			{
				if(rd4Spaces.nextInt(10) > 5)
					auxPhrase.append(" ");
				else if(rd4Spaces.nextInt(10) == 5)
					auxPhrase.append(PhraseRepository.randomWords[rd4Char.nextInt(3)]);
			}
			
		}
		
		return auxPhrase.toString();
	}
	
	
	public void printWordFrequency(String word)
	{
		ArrayList<String> aux = GetSplitedPhraseToWord();
		int fq = Collections.frequency(aux, word);
		System.out.println(String.format("A palavra %s repitiu %d vezes", word,fq));
	}
	
	public void printWordFrequency(String word, ArrayList<String> sList)
	{		
		int fq = Collections.frequency(sList, word);
		System.out.println(String.format("A palavra %s repitiu %d vezes", word,fq));
	}
	private ArrayList<String> GetSplitedPhraseToWord()
	{
		ArrayList<String> aux = new ArrayList<String>();
		String tp[] = getFrase().split(" ");
		for(int i = 0; i < tp.length; i++)
			aux.add(tp[i]);
		return aux;
	}
	public ArrayList<String> getWordsBySize(int size)
	{
		ArrayList<String> aux = GetSplitedPhraseToWord();
		ArrayList<String> auxR = new ArrayList<String>();
		for(String s: aux)
			if(s.length() <= size)
				auxR.add(s);		
		return auxR;
	}
	
	public void swapLetter(char letter)
	{
		System.out.println(getFrase().replace(letter, '?'));
	}
}
