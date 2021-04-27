public class Prontuário
{
	private Cliente cliente;
	private Data nascimento;
	private Float peso;
	private Float altura;

	public Prontuário(Cliente cliente, Data nascimento, Float peso, Float altura)
	{
		this.cliente = cliente;
		this.nascimento = nascimento;
		this.altura = altura;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

	public Data getNascimento()
	{
		return nascimento;
	}

	public void setNascimento(Data nascimento)
	{
		this.nascimento = nascimento;
	}

	public Float getPeso()
	{
		return peso;
	}

	public void setPeso(Float peso)
	{
		this.peso = peso;
	}

	public Float getAltura()
	{
		return altura;
	}

	public void setAltura(Float altura)
	{
		this.altura = altura;
	}

	@Override
	public String toString()
	{
		return "Prontuário{" + "cliente:" + cliente + ", nascimento: " + nascimento + ", peso: " + peso
			+ ", altura:" + altura + '}';
	}

	public Float calcIMC()
	{
		Float calc;

		calc = peso / (altura * altura);

		return calc;
	}

	public void preDiagnosticar()
	{
		String msg = "";

		if(calcIMC() < 18.5)
		{
			msg = "Você está abaixo do peso ideal";
		}
		else if(calcIMC() >= 18.5 && calcIMC() <= 24.9)
		{
			msg = "Você está no seu peso ideal";
		}
		else if(calcIMC() >= 25 && calcIMC() <= 29.9)
		{
			msg = "Você está com sobrepeso";
		}
		else if(calcIMC() >= 30 && calcIMC() <= 34.9)
		{
			msg = "Obesidade Grau I";
		}
		else if(calcIMC() >= 35 && calcIMC() <= 39.9)
		{
			msg = "Obesidade Grau II";
		}
		else if(calcIMC() > 40)
		{
			msg = "Obesidade Mórbida";
		}
		else
		{
			msg = "valor invalido";
		}

		System.out.println(msg);
	}

}
