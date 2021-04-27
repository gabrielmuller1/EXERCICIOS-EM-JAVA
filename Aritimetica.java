/*
 4.Escreva uma classe em Java chamada Aritmética, que vai possuir quatro métodos:
 somar, subtrair, dividir e multiplicar.
 Esses métodos recebem dois inteiros e retornam valores inteiros correspondentes à operação
 (com exceção do dividir, que deve retornar um float).
*/

import java.util.HashMap;
import java.util.Map;

public class Aritimetica
{

	public Integer somar(Integer num1, Integer num2)
	{
		Integer result = num1 + num2;

		return result;
	}

	public Integer subtrair(Integer num1, Integer num2)
	{
		Integer result = num1 - num2;

		return result;
	}

	public Float dividir(Integer num1, Integer num2)
	{
		Float result = null;

		if (num1 != null && num2 != null)
		{
			result = (float) num1 / (float) num2;
		}

		return result;
	}

	public Integer multiplicar(Integer num1, Integer num2)
	{
		Integer result = num1 * num2;

		return result;
	}

	public static void main(String[] args)
	{
		Aritimetica a = new Aritimetica();
		a.testarInteiros(1, 2);

		Cliente cli = new Cliente("victor", "minha rua");
		cli.imprimir();
	}

	public void testarInteiros(Integer num1, Integer num2)
	{
		Integer resultSoma = somar(num1, num2);
		Integer resultSubtracao = subtrair(num1, num2);
		Float resultDivisao = dividir(num1, num2);
		Integer resultMultiplicacao = multiplicar(num1, num2);

		Map<String, Object> map = new HashMap<>();
		map.put("Resultado soma: ", resultSoma);
		map.put("Resultado subtracao: ", resultSubtracao);
		map.put("Resultado divisao: ", resultDivisao);
		map.put("Resultado multiplicacao: ", resultMultiplicacao);

		StringBuilder sb = new StringBuilder();
		for (String key : map.keySet())
		{
			sb.append(key + "" + map.get(key) + "\n");
		}

		System.out.println(sb.toString());
	}
}
