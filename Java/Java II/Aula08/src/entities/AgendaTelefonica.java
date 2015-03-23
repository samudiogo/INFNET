package entities;

import java.util.ArrayList;
import java.util.Collections;


public class AgendaTelefonica
{
	private String Nome;
	private ArrayList<Contato> Contatos;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public ArrayList<Contato> getContatos() {
		return Contatos;
	}
	public void setContatos(ArrayList<Contato> contatos) {
		Contatos = contatos;
	}
	public void AddContatos(Contato contato)
	{
		Contatos.add(contato);
	}
	
	public AgendaTelefonica(String nome)
	{
		setNome(nome);		
		ArrayList<Contato> c = new ArrayList<Contato>();
		setContatos(c);
	}
	
	public void GetContatosRepitidos()
	{		
		for(Contato c: this.Contatos)
			System.out.println(c.getNome() + " | r="+Collections.frequency(Contatos, c));
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AgendaTelefonica [Nome= ");
		builder.append(Nome);
		builder.append(", Contatos=");
		builder.append(Contatos);
		builder.append("]");
		return builder.toString();
	}
	
}
