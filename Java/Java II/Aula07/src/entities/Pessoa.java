package entities;

public class Pessoa 
{
	private String Nome;
	private int	CPF;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
	public Pessoa(String nome, int cpf)
	{
		this.setNome(nome);
		this.setCPF(cpf);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		//;
		if(obj instanceof Pessoa && obj != null)
		{
			Pessoa other = (Pessoa) obj;
			boolean equalReference = this.hashCode() == other.hashCode();
			boolean equalName = (this.getNome().equals(other.getNome()));
			boolean equalCPF = (this.getCPF() == other.getCPF());
			if(!equalReference && equalName && equalCPF)
				return true;
		}			
		return false;// (this == obj);
	}
	
}
