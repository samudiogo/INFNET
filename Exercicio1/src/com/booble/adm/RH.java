package com.booble.adm;

public class RH
{
	public static void exibirStatus() // coloquei public e static
	{
		System.out.println("Iniciando Exibição do Status da Empresa");
		System.out.println("BLAH BLAH BLAH");
		System.out.println("Encerrando Exibição do Status da Empresa");
	}
	/**
	 * @param tipoDeContrato: 1 = Gerente, 2 = Líder de Equipe, 3 = Estagiário
	 * @param cargaHoraria: em horas
	 * @return retorna o valor do salario do funcionario de acordo com o tipo de contrato e sua carga horária
	 */
	public static int determinarPagamanto(int tipoDeContrato, int cargaHoraria)// coloquei public e static e adicionei a carga horária
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
	 * @param tipoDeContrato: 1 = Gerente, 2 = Líder de Equipe, 3 = Estagiário
	 * @return retorna a descrição do contrato mediante a passagem via parametro o tipo de contrato
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
				descricao = "Estagiário";
				break;
				default:
					descricao = "Erro: Cargo não cadastrado";
					
		}
		return descricao;
	}
}
