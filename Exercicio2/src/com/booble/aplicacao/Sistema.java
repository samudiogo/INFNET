/**
 * 
 */
package com.booble.aplicacao;
import java.io.ObjectInputStream.GetField;

import com.booble.adm.*;
import com.booble.operacional.*;
/**
 * @author Samuel
 *
 */
public class Sistema
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		RH.exibirStatus();
		
		Colaborador funcionario = new Colaborador();
		funcionario.setNome("Supremo Samuel Diogo");
		funcionario.setCargaHoraria(160);
		funcionario.setSexo('m');
		funcionario.setMatrícula("SD2014TM4");
		funcionario.setIdade(23);
		funcionario.setTipoDeContrato(1);

		Colaborador funcionario1 = new Colaborador();
		funcionario1.setNome("Gavin Degraw");
		funcionario1.setCargaHoraria(220);
		funcionario1.setSexo('m');
		funcionario1.setMatrícula("GD2013TM2");
		funcionario1.setIdade(23);
		funcionario1.setTipoDeContrato(2);
		
		
		Colaborador funcionario2 = new Colaborador();
		funcionario2.setNome("Janis Joplin");
		funcionario2.setCargaHoraria(22);
		funcionario2.setSexo('f');
		funcionario2.setMatrícula("JP19762014TM1");
		funcionario2.setIdade(23);
		funcionario2.setTipoDeContrato(3);
		
		
		FolhadePagamento folha = new FolhadePagamento(3);
		
		folha.cadastrarColaborador(funcionario, 0);
		folha.cadastrarColaborador(funcionario1, 1);
		folha.cadastrarColaborador(funcionario2, 2);
		
		folha.retornaTodosColaboradores();
		int idDoCargoDaJanis = funcionario.getTipoDeContrato();
		String cargoDaJanis = RH.retornaDescricaoContrato(idDoCargoDaJanis);
		System.out.println("Nome: "+ funcionario.getNome() + " Cargo: " + cargoDaJanis);
		RH.exibirStatus();
	}

}
