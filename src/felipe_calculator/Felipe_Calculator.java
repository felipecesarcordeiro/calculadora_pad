package felipe_calculator;

public interface Felipe_Calculator extends java.rmi.Remote { 

    public long add(long a, long b) 

           throws java.rmi.RemoteException; 

    public long sub(long a, long b) 

           throws java.rmi.RemoteException; 

    public long mul(long a, long b) 

           throws java.rmi.RemoteException; 

    public long div(long a, long b) 

           throws java.rmi.RemoteException;
}
