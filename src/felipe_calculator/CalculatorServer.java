package felipe_calculator;

import java.rmi.Naming; 

public class CalculatorServer { 

   public CalculatorServer() { 

    try { 

          Felipe_Calculator c = new CalculatorImpl(); 

           Naming.rebind(" rmi://jaca.ime.usp.br:1099/ CalculatorService", c); 

    } catch (Exception e) { 

           System.out.println("Trouble: " + e); 

    }

   } 

   public static void main(String args[]) { 

         new CalculatorServer();

   }

 } 

