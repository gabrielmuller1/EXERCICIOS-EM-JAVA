public class Banco
{
	public void cadastra()
	{
		Cliente c1 = new Cliente("victor1", "endereco1");
		Cliente c2 = new Cliente("victor2", "endereco2");
		Cliente c3 = new Cliente("victor3", "endereco3");

		ContaBancaria contaBancaria1 = new ContaBancaria(1, 11, c1);
		ContaBancaria contaBancaria2 = new ContaBancaria(2, 22, c2);
		ContaBancaria contaBancaria3 = new ContaBancaria(3, 33, c3);

		//os metodos de sacar e visualizacao de saldo ja foram implementados
	}
}
