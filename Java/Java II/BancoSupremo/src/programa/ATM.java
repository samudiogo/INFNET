package programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import entities.*;


public class ATM
{
	public static void main(String[] args)
	{
		//Criado os clientes e suas contas, vamos agora adicioná-las em uma agencia:
		ArrayList<Conta> AgenciaINFNET = new ArrayList<Conta>();
		Cliente cl1 = new Cliente("Samuel Diogo",Genero.Masculino);
		Conta   ct1 = new Conta(cl1,5500.5);
		AgenciaINFNET.add(ct1);
		
		Cliente cl2 = new Cliente("Carlos Renato",Genero.Masculino);
		Conta   ct2 = new Conta(cl2,1200.25);
		AgenciaINFNET.add(ct2);
		
		Cliente cl3 = new Cliente("Marina Ferreira",Genero.Feminino);
		Conta   ct3 = new Conta(cl3,100.5);
		AgenciaINFNET.add(ct3);
		
		Cliente cl4 = new Cliente("Marcio Vinicius Telles",Genero.Viado);
		Conta   ct4 = new Conta(cl4,24.69);
		AgenciaINFNET.add(ct4);
		
		Cliente cl5 = new Cliente("Samuel Diogo",Genero.Masculino);
		Conta   ct5 = new Conta(cl5,7000.10);
		AgenciaINFNET.add(ct5);
		
		ArrayList<Conta> ContasVIP = new ArrayList<Conta>();
		
		for(Conta conta: AgenciaINFNET)
			if(conta.getSaldo() > 2000.0)      // só é elite opressora quem tem saldo superior à R$ 2000.00 e pronto.
				if(!ContasVIP.contains(conta)) // só pode ser VIP uma vez, mesmo sendo o PAPA. 
					ContasVIP.add(conta);
		
		
		//clientes com mais de uma conta:
		Map<String, Conta> ClientesComMultiplaConta = new HashMap<String, Conta>();
		
		for(Conta conta: AgenciaINFNET)
		{
			
			int f = Collections.frequency(AgenciaINFNET,conta);
			if(f > 1)
				if(!ClientesComMultiplaConta.containsValue(conta)) // if sem necessidade, pois hashMap não aceita duplicata
					ClientesComMultiplaConta.put(String.format("%s",f), conta);
		}
		
				
		System.out.println(ClientesComMultiplaConta.toString());
		
		
		
		
		
		
		
	}
}