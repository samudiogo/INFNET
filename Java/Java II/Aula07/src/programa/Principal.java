package programa;

import java.util.ArrayList;

import entities.Pessoa;

public class Principal {

	public static void main(String[] args) 
	{
		ArrayList<Pessoa> Pessoas = new ArrayList<>();
		Pessoa a = new Pessoa("Samuel Diogo", 1234);
		Pessoas.add(a);
		Pessoa b = new Pessoa("Carlos Renato", 3212);
		Pessoas.add(b);
		Pessoa c = new Pessoa("Jamal ", 7852);
		Pessoas.add(c);
		Pessoa d = new Pessoa("Matheus Araujo", 1231);
		Pessoas.add(d);
		Pessoa e = new Pessoa("Matheus Araujo", 1231);
		Pessoas.add(d);
		
		System.out.println(d.equals(c));
	}

}
