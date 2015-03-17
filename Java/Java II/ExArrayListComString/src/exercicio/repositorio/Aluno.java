package exercicio.repositorio;

import java.util.ArrayList;

public class Aluno
{
	private String Nome;

	public String getNome()
	{
		return Nome;
	}

	public void setNome(String nome)
	{
		Nome = nome;
	}
	
	public Aluno(String _nome)
	{
		this.setNome(_nome);
	}
	
	public static ArrayList<Aluno> GenerateMonkyList()
	{
		ArrayList<Aluno>a = new ArrayList<Aluno>();
		a.add(new Aluno("Supremo Samuel Diogo"));
		a.add(new Aluno("Kathline Grizzle"));
		a.add(new Aluno("Chante Sommers"));
		a.add(new Aluno("Denver Recore"));
		a.add(new Aluno("Elden Mazzoni"));
		a.add(new Aluno("Caroyln Campfield"));
		a.add(new Aluno("Crystle Elsberry"));
		a.add(new Aluno("Laurel Mulcahy"));
		a.add(new Aluno("Mavis Issac"));
		a.add(new Aluno("Nan Nickle"));
		a.add(new Aluno("Melissa Rudloff"));
		
		return a;
	}
}
