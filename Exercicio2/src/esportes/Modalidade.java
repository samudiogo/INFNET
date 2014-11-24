/**
 * 
 */
package esportes;

/**
 * @author Samuel
 *
 */
public class Modalidade
{
	private String nome;
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	private  double SalarioMedio;
	
	public double getSalarioMedio()
	{
		return SalarioMedio;
	}
	public void setSalarioMedio(double Salario)
	{
		this.SalarioMedio = Salario;
	}
	 
	public static Modalidade cadastrarModalidade(String nome, double salario)
	{
		Modalidade modalidade = new Modalidade();
		modalidade.setNome(nome);
		modalidade.setSalarioMedio(salario);
		return modalidade;
	}
}
