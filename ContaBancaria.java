//7.Crie uma classe chamada ContaBancaria que terá 3 atributos: número da conta (int), número da agência (int) e saldo(float).
//Construa os métodos get/set somente para os atributos número da conta e agência.

public class ContaBancaria
{
	private int numConta;
	private int numAg;
	private float saldo;
	private Cliente correntista;

	public ContaBancaria(int numConta, int numAg, Cliente correntista)
	{
		this.numConta = numConta;
		this.numAg = numAg;
		this.correntista = correntista;
	}

	public Cliente getCorrentista()
	{
		return correntista;
	}

	public void setCorrentista(Cliente correntista)
	{
		this.correntista = correntista;
	}

	public int getNumConta()
	{
		return numConta;
	}

	public void setNumConta(int numConta)
	{
		this.numConta = numConta;
	}

	public int getNumAg()
	{
		return numAg;
	}

	public void setNumAg(int numAg)
	{
		this.numAg = numAg;
	}

	public float getSaldo()
	{
		return saldo;
	}

	public void setSaldo(float saldo)
	{
		this.saldo = saldo;
	}

	public void sacar(float valor)
	{
		if (this.getSaldo() < valor)
		{
			System.out.println("Saldo insuficiente, saldo em conta não alterado.");
		}
		else
		{
			setSaldo(getSaldo() - valor);
			System.out
				.println("Valor de: " + valor + " retirado, saldo disponivel após saque: " + getSaldo());
		}
	}

	public void depositar(float valor)
	{
		if (valor > 0)
		{
			this.setSaldo(this.getSaldo() + valor);
		}
	}
}
