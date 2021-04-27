public class Cliente
{
	private String nome;
	private String endereco;
	private String telefone;
	private String rg;
	private String cpf;

	public Cliente(String nome, String endereco)
	{
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getEndereco()
	{
		return endereco;
	}

	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

	public String getTelefone()
	{
		return telefone;
	}

	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}

	public String getRg()
	{
		return rg;
	}

	public void setRg(String rg)
	{
		this.rg = rg;
	}

	public String getCpf()
	{
		return cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	@Override
	public String toString()
	{

		return "nome: " + this.getNome() + "\nrg: " + this.getRg() + "\nendereco: " + this.getEndereco()
			+ "\ncof: " + this.getCpf() + "\ntelefone: " + this.getTelefone();
	}

	public void imprimir()
	{
		System.out.println(this.toString());
	}
}
