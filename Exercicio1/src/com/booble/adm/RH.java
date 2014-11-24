package com.booble.adm;

public class RH
{
	public static void exibirStatus() // coloquei public e static
	{
		System.out.println("Iniciando Exibi��o do Status da Empresa");
		System.out.println("BLAH BLAH BLAH");
		System.out.println("Encerrando Exibi��o do Status da Empresa");
	}
	/**
	 * @param tipoDeContrato: 1 = Gerente, 2 = L�der de Equipe, 3 = Estagi�rio
	 * @param cargaHoraria: em horas
	 * @return retorna o valor do salario do funcionario de acordo com o tipo de contrato e sua carga hor�ria
	 */
	public static int determinarPagamanto(int tipoDeContrato, int cargaHoraria)// coloquei public e static e adicionei a carga hor�ria
	{
		int valor = 0;
		switch(tipoDeContrato)
		{
			case 1:
				valor = cargaHoraria * 50;
				break;
			case 2:
				valor = cargaHoraria * 20;
				break;
			default:
				valor = cargaHoraria * 10;
		}
		
		return valor;
	}
	
	/**
	 * 
	 * @param tipoDeContrato: 1 = Gerente, 2 = L�der de Equipe, 3 = Estagi�rio
	 * @return retorna a descri��o do contrato mediante a passagem via parametro o tipo de contrato
	 */
	
	public static String retornaDescricaoContrato(int tipoContrato)
	{
		String descricao;
		switch(tipoContrato)
		{
			case 1:
				descricao = "Gerente";
				break;
			case 2:
				descricao = "Lider";
				break;
			case 3:
				descricao = "Estagi�rio";
				break;
				default:
					descricao = "Erro: Cargo n�o cadastrado";
					
		}
		return descricao;
	}
}
