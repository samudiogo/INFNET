package entities;

import java.util.ArrayList;
import java.util.Collections;

public class Conta
{
	private Cliente Titular;
	private Double Saldo;
	public Cliente getTitular()
	{
		return Titular;
	}
	public void setTitular(Cliente titular)
	{
		Titular = titular;
	}
	public Double getSaldo()
	{
		return Saldo;
	}
	public void setSaldo(Double saldo)
	{
		Saldo = saldo;
	}
	
	public static ArrayList<Conta> getContasVIP(ArrayList<Conta> contas)
	{
	ArrayList<Conta> ContasVIP = new ArrayList<Conta>();
		
		for(Conta conta: contas)
			if(conta.getSaldo() > 2000.0)      // só é elite opressora quem tem saldo superior à R$ 2000.00 e pronto.
				if(!ContasVIP.contains(conta)) // só pode ser VIP uma vez, mesmo sendo o PAPA. 
					ContasVIP.add(conta);
		return ContasVIP;
	}
	
	public static void printDuplicados(ArrayList<Conta> contas)
	{
		ArrayList<Conta> aux = new ArrayList<Conta>();
		for(Conta c : contas)
		{
			int q = Collections.frequency(contas, c);
			if(q> 1 && (!(aux.contains(c))))
			{
				aux.add(c);
				System.out.println(String.format("O titular %s tem %d contas", c.getTitular().getNome(), q));
			}
				
		}
	}
	
	public Conta(){}
	public Conta(Cliente titular, double SaldoInicial)
	{
		setTitular(titular);
		setSaldo(SaldoInicial);
	}
	
	public boolean equals(Object obj)
	{
		if((obj instanceof Conta) && obj != null)
			if(this.getTitular().equals(((Conta)obj).getTitular())) return true;
		 
		return false;
	}
	@Override
	public String toString()
	{
		return String.format("Dados do titular da conta:\n%s\nSaldo:%s", Titular, Saldo);
	}
	
	
	
}

