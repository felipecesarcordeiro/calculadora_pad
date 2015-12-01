/*Felipe César Cordeiro Campelo
 * Matricula : 20121004010 
 * 4°ano Integrado em informatica
 * github:felipecesarcordeiro e-mail:felipecesarcordeiro@gmail.com*/
package felipe_calculator;

import java.rmi.Naming; 

public class CalculatorClient { 

   public static void main(String[] args) { 

          try { 

        	  Felipe_Calculator c = (Felipe_Calculator)Naming.lookup("felipe_calculator");

              System.out.println( c.sub(4, 3) ); 

              System.out.println( c.add(4, 5) ); 

              System.out.println( c.mul(3, 6) ); 

              System.out.println( c.div(9, 3) ); 

          } 

          catch (Exception e) {

                System.out.println(e);

          } 

    }

  }