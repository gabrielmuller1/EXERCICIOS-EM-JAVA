public class AritmeticaData
{
	public Data data1;
	public Data data2;

	public AritmeticaData(Data data1, Data data2)
	{
		this.data1 = data1;
		this.data2 = data2;
	}

	public Data getData1()
	{
		return data1;
	}

	public void setData1(Data data1)
	{
		this.data1 = data1;
	}

	public Data getData2()
	{
		return data2;
	}

	public void setData2(Data data2)
	{
		this.data2 = data2;
	}

	public void calculaDias()
	{
		int dif = 0;
		if (data1.getAno() == data2.getAno())
		{
			if (data1.getMes() == data2.getMes())
			{
				if (data1.getDia() != data2.getDia())
				{
					dif = data1.getDia() - data2.getDia();
				}
			}
			else if (data1.getMes() != data2.getMes())
			{
				dif = data1.getDia() - data2.getDia();

				dif += data1.getMes() - data2.getMes();
			}
		}
		else
		{
			dif = data1.getDia() - data2.getDia();

			dif += data1.getMes() - data2.getMes();
			dif += data1.getAno() - data2.getAno();
		}

		System.out.println("A diferença em dias é de: " + dif);
	}

}
