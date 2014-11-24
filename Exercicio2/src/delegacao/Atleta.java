/**
 * 
 */
package delegacao;
import esportes.Modalidade;

/**
 * @author Samuel
 *
 */
public class Atleta
{
	private String nome;
	private int idade;
	private char sexo;
	private Modalidade modalidade;
	private int fama;
	
	/**
	 * @return the nome
	 */
	public String getNome()
	{
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	/**
	 * @return the idade
	 */
	public int getIdade()
	{
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	/**
	 * @return the sexo
	 */
	public char getSexo()
	{
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo)
	{
		this.sexo = sexo;
	}
	/**
	 * @return the modalidade
	 */
	public Modalidade getModalidade()
	{
		return modalidade;
	}
	/**
	 * @param modalidade the modalidade to set
	 */
	public void setModalidade(Modalidade modalidade)
	{
		this.modalidade = modalidade;
	}
	/**
	 * @return the fama
	 */
	public int getFama()
	{
		return fama;
	}
	/**
	 * @param fama the fama to set
	 */
	public void setFama(int fama)
	{
		this.fama = fama;
	}
	
	public static Atleta cadastrarAtleta(String nome, int idade, char sexo, Modalidade modalidade, int fama)
	{
		Atleta atleta  = new Atleta();
		atleta.setNome(nome);
		atleta.setIdade(idade);
		atleta.setSexo(sexo);
		atleta.setModalidade(modalidade);
		atleta.setFama(fama);
		return atleta;
	}
}
