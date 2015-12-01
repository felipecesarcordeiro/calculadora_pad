/*Felipe César Cordeiro Campelo
 * Matricula : 20121004010 
 * 4°ano Integrado em informatica
 * github:felipecesarcordeiro e-mail:felipecesarcordeiro@gmail.com*/
package felipe_calculator;

import java.rmi.Naming; 

public class CalculatorServer { 

   public CalculatorServer() { 

    try { 

          Felipe_Calculator c = new CalculatorImpl(); 

           Naming.rebind("felipe_calculator", c); 

    } catch (Exception e) { 

           System.out.println("Trouble: " + e); 

    }

   } 

   public static void main(String args[]) { 

         new CalculatorServer();

   }

 } 

