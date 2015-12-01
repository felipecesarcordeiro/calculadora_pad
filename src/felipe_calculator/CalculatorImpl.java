/*Felipe César Cordeiro Campelo
 * Matricula : 20121004010 
 * 4°ano Integrado em informatica
 * github:felipecesarcordeiro e-mail:felipecesarcordeiro@gmail.com*/
package felipe_calculator;

import java.rmi.RemoteException;

public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject 

implements Felipe_Calculator {

  public CalculatorImpl() 

       throws java.rmi.RemoteException { 

           super();

  } 

  public long add(long a, long b) throws java.rmi.RemoteException { 

            return a + b; 

  }

  public long sub(long a, long b) 

	        throws java.rmi.RemoteException { 

	            return a - b; 

	        } 

	  public long mul(long a, long b) 

	         throws java.rmi.RemoteException {

	            return a * b; 

	  }

	   public long div(long a, long b) 

	        throws java.rmi.RemoteException { 

	          return a / b;

	  }
}