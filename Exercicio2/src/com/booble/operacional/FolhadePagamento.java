/**
* Sabendo que o encapcsulamento é um pilar da orientacao a objetos, optei por 
* utilizar encapsular todos os campos da classe, visando maior segurança e controle * no acesso de suas propriedades
*/
package com.booble.operacional;

import com.booble.adm.RH;

/**
 * @author Samuel
 *
 */
public class FolhadePagamento
{
	private int ano;
	/**
	 * @return the ano
	 */
	public int getAno()
	{
		return ano;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano)
	{
		this.ano = ano;
	}
	
	private int mes;
	/**
	 * @return the mes
	 */
	public int getMes()
	{
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes)
	{
		this.mes = mes;
	}

	
	public static int numeroDeSerie;
	private Colaborador[] colaborador;
	
	final int MAX_SIZE_ROW;
	

	public FolhadePagamento(int TotalDeFuncionarios)
	{
		FolhadePagamento.numeroDeSerie++;
		this.MAX_SIZE_ROW = TotalDeFuncionarios;
		this.setTotaldeColaborades();
		
	}
	private void setTotaldeColaborades()
	{
		this.colaborador = new Colaborador[MAX_SIZE_ROW];
	}

	public void cadastrarColaborador(Colaborador funcionario, int indice)
	{
		 this.colaborador[indice] = funcionario;
	}
	
	public void retornaTodosColaboradores()
	{
		for(Colaborador funcionario : this.colaborador)
		{
			int tpContrato = funcionario.getTipoDeContrato();
			int carga = funcionario.getCargaHoraria();
			
			int salario = RH.determinarPagamanto(tpContrato,carga);
			
			System.out.println("Nome: "+funcionario.getNome() + " || Salário: "+ salario );
		}
	}
	
}
