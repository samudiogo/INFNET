/**
* Sabendo que o encapcsulamento Ú um pilar da orientacao a objetos, optei por 
* utilizar encapsular todos os campos da classe, visando maior seguranša e controle * no acesso de suas propriedades
*/
package com.booble.operacional;

public class Colaborador
{
	private String nome;
	private String matrÝcula;
	private int idade;
	private char sexo;
	private int tipoDeContrato;
	private int CargaHoraria;

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
	 * @return the matrÝcula
	 */
	public String getMatrÝcula()
	{
		return matrÝcula;
	}
	/**
	 * @param matrÝcula the matrÝcula to set
	 */
	public void setMatrÝcula(String matrÝcula)
	{
		this.matrÝcula = matrÝcula;
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
	 * @return the tipoDeContrato
	 */
	public int getTipoDeContrato()
	{
		return tipoDeContrato;
	}
	/**
	 * @param tipoDeContrato the tipoDeContrato to set
	 */
	public void setTipoDeContrato(int tipoDeContrato)
	{
		this.tipoDeContrato = tipoDeContrato;
	}
	/**
	 * @return the cargaHoraria
	 */
	public int getCargaHoraria()
	{
		return CargaHoraria;
	}
	/**
	 * @param cargaHoraria the cargaHoraria to set
	 */
	public void setCargaHoraria(int cargaHoraria)
	{
		CargaHoraria = cargaHoraria;
	}
	
	
}
