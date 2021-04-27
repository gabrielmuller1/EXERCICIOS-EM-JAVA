public class PrincipalClinica
{
	public void testar()
	{
		Cliente cliente1 = new Cliente("victor1", "endereco1");
		Cliente cliente2 = new Cliente("victor2", "endereco2");
		Data d1 = new Data(1,10,2020);

		Prontuário p1 = new Prontuário(cliente1, d1, 80.1F, 170.0F);
		Prontuário p2 = new Prontuário(cliente2, d1, 60.1F, 160.0F);
		p1.toString();
		p2.toString();

		p1.preDiagnosticar();
		p2.preDiagnosticar();
	}
}
