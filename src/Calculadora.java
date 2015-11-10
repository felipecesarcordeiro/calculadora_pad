import java.util.Scanner;
import java.io.*;

/*Felipe C�sar Cordeiro Campelo
 * Matricula : 20121004010 
 * 4�ano Integrado em informatica
 * github:felipecesarcordeiro e-mail:felipecesarcordeiro@gmail.com*/


public class Calculadora implements Runnable
{
	private Operacao operacao;
	private Operacao vaux;
	
	public Calculadora(Operacao opera)
	{
		this.operacao = opera;
	}
	
	@Override
	public void run()
	{
		while (true)
		{
			vaux = operacao.getOk();
			int res; 
				
			if(vaux.getOperador() == '+')
			{
				res = vaux.somar();
			}
			else 
				if (vaux.getOperador() == '-')
				{
					res = vaux.subtrair();			
				} 
				else 
					if(vaux.getOperador() == '*') 
					{
						res = vaux.multiplicar();			
					} 
					else 
					{
						res = vaux.dividir();
					}
				
			System.out.printf("Resultado: %d\n", res);
		}
	
	}

	
}
