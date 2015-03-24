package programa;

import java.util.ArrayList;

import entities.*;


public class ATM
{
	private static ArrayList<Conta> AgenciaINFNET = new ArrayList<Conta>();
	
	private static void seed()
	{
		AgenciaINFNET.add(new Conta(new Cliente("Samuel Diogo",Genero.Masculino),5500.5));

		AgenciaINFNET.add(new Conta(new Cliente("Carlos Renato",Genero.Masculino),1200.25));
		
		AgenciaINFNET.add(new Conta(new Cliente("Marina Ferreira",Genero.Feminino),100.5));
		
		AgenciaINFNET.add(new Conta(new Cliente("Marcio Vinicius Telles",Genero.Masculino),2500.25));

		AgenciaINFNET.add(new Conta(new Cliente("Samuel Diogo",Genero.Masculino),7200.25));
		
		AgenciaINFNET.add(new Conta(new Cliente("Carlos Renato",Genero.Masculino),3700.25));
	}
	
			
	public static void main(String[] args)
	{		
		//o método seed irá popular o AgenciaINFNET com itens à ser testado
		seed();
		
		//Imprime uma lista de correntista com mais de uma conta na agencia:
		System.out.println("\n************* Clientes Com conta duplicada *****************\n");
		Conta.printDuplicados(AgenciaINFNET);
		
		System.out.println("\n************* Clientes VIPS *****************\n");
		// o for abaixo percorre uma lista de contas vips
		for(Conta c : Conta.getContasVIP(AgenciaINFNET))
			System.out.println(c);
		
		System.out.println("******************************");
		
		
		
	}
}