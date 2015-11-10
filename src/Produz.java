import java.io.*;
import java.net.UnknownHostException;
import java.util.Scanner;

/*Felipe C�sar Cordeiro Campelo
 * Matricula : 20121004010 
 * 4�ano Integrado em informatica
 * github:felipecesarcordeiro e-mail:felipecesarcordeiro@gmail.com*/

public class Produz 
{

	public static void main(String[] args)throws UnknownHostException,IOException 
	{
		Calculadora r = null;
	
		Scanner leitor = new Scanner(System.in);
		while (true) 
		{
			int v1, v2;
			String operador;
			System.out.println("Digite o primeiro valor");
			v1 = leitor.nextInt();
			System.out.println("Opera��o");
			operador = leitor.next();
			System.out.println("Digite o segundo valor");
			v2 = leitor.nextInt();
			
			PrintWriter entrada = new PrintWriter(new FileWriter(new File("entrada.txt"), true), true);
			entrada.println(v1);
			entrada.println(operador);
			entrada.println(v2);
			entrada.close();
			
			File arquivo = new File("saida.txt");
			do 
			{
				if (arquivo.length() != 0) 
				{
					BufferedReader saida = new BufferedReader(new FileReader(arquivo));
					System.out.println();
					System.out.println("Resultado:" + saida.readLine());
					saida.close();
		
				}
			} 
			
			while (arquivo.length() == 0);
			{
				arquivo.delete();
			}
		}

	}
}
