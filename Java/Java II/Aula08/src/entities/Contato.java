package entities;

public class Contato 
{
	private String Nome;
	private int CodArea;
	private String Telefone;
	private TipoContato Categoria;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getCodArea() {
		return CodArea;
	}
	public void setCodArea(int codArea) {
		CodArea = codArea;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public TipoContato getCategoria() {
		return Categoria;
	}
	public void setCategoria(TipoContato categoria) {
		Categoria = categoria;
	}
	
	public Contato(){}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [Nome= ");
		builder.append(Nome);
		builder.append(", CodArea= ");
		builder.append(CodArea);
		builder.append(", Telefone= ");
		builder.append(Telefone);
		builder.append(", Categoria= ");
		builder.append(Categoria);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * @param nome
	 * @param codArea
	 * @param telefone
	 * @param categoria
	 */
	public Contato(String nome, int codArea, String telefone,
			TipoContato categoria) {
		Nome = nome;
		CodArea = codArea;
		Telefone = telefone;
		Categoria = categoria;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Contato && obj != null)
			return this.getNome().equals(((Contato) obj).getNome());
		
		return false;
	}
	
}
