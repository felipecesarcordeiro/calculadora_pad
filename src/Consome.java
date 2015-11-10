import java.io.*;

/*Felipe César Cordeiro Campelo
 * Matricula : 20121004010 
 * 4°ano Integrado em informatica
 * github:felipecesarcordeiro e-mail:felipecesarcordeiro@gmail.com*/

public class Consome 
{

	public static void main(String[] args) 
	{
		while (true) 
		{
			try 
			{
				File arquivo = new File("arquivo.txt");
				if(arquivo.exists())
				{
					break;
				}
				
				BufferedReader entrada = new BufferedReader(new FileReader(arquivo));
				while (!entrada.ready());	
				
				int v1 = Integer.parseInt(entrada.readLine());
				char operador = entrada.readLine().charAt(0);
				int v2 = Integer.parseInt(entrada.readLine());
				Calculadora calculadora = new Calculadora();
				
				PrintWriter saida = new PrintWriter(new FileWriter(new File("saida.txt"), true));
				saida.println(calculadora.calcula(v1, v2, operador));
				saida.close();
				entrada.close();
				
				File e = new File("arquivo.txt");
				e.delete();
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}

		}
		

	}

}
