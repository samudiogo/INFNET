package entities;

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

