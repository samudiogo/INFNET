package entities;

public class Cliente
{
	private String Nome;
	private Genero Sexo;
	public String getNome()
	{
		return Nome;
	}
	public void setNome(String nome)
	{
		Nome = nome;
	}
	public Genero getSexo()
	{
		return Sexo;
	}
	public void setSexo(Genero sexo)
	{
		Sexo = sexo;
	}
	public Cliente(){}
	
	public Cliente(String nome, Genero sexo)
	{
		setNome(nome);
		setSexo(sexo);
	}
	@Override
	public boolean equals(Object obj)
	{
		if((obj instanceof Cliente) && obj != null)
			if(this.getNome().equals(((Cliente)obj).getNome())) return true;
		return false;		
		
	}
	@Override
	public String toString()
	{
		return String.format("Nome do Cliente: %s || Sexo: %s", Nome, Sexo);
	}
	
	
	
	
	
	
}
