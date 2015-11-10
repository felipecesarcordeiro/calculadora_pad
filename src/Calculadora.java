import java.util.Scanner;

/*Felipe César Cordeiro Campelo
 * Matricula : 20121004010 
 * 4°ano Integrado em informatica
 * github:felipecesarcordeiro e-mail:felipecesarcordeiro@gmail.com*/

public class Calculadora {

	public static void main(String[] args) {
		{
						int op;
						int op2;
						String operador;
						float resultado;
						Scanner leitor = new Scanner(System.in);
						
						System.out.println("°°°°°°°Calculadora°°°°°°");
						
						System.out.println("Digite o primeiro valor");
						op = leitor.nextInt();
						
						System.out.println("Digite o segundo valor");
						op2 = leitor.nextInt();
						
						System.out.println("Operação  +- ×(*) ÷(/)");
						operador = leitor.next();
						
						switch(operador)
						{
							case "":
							{
								resultado = op+op2;
								System.out.println(resultado );
								break;
							}
							case "-":
							{
								resultado = op-op2;
								System.out.println(resultado );
								break;
							}
							case "/":
							{
								resultado = op/op2;
								System.out.println(resultado );
								break;
							}
							case "*":
							{
								resultado = op*op2;
								System.out.print(resultado );
								break;
							}
							
							case "×":
							{
								resultado = op*op2;
								System.out.print(resultado );
								break;
							}
							
							case "÷":
							{
								resultado = op/op2;
								System.out.println(resultado );
								break;
							}
							
						}
					}

	}

}
