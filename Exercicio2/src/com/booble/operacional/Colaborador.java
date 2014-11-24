/**
* Sabendo que o encapcsulamento é um pilar da orientacao a objetos, optei por 
* utilizar encapsular todos os campos da classe, visando maior segurança e controle * no acesso de suas propriedades
*/
package com.booble.operacional;

public class Colaborador
{
	private String nome;
	private String matrícula;
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
	 * @return the matrícula
	 */
	public String getMatrícula()
	{
		return matrícula;
	}
	/**
	 * @param matrícula the matrícula to set
	 */
	public void setMatrícula(String matrícula)
	{
		this.matrícula = matrícula;
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
