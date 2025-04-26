/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class RMIServer extends UnicastRemoteObject implements RMI {
    public RMIServer() throws RemoteException {
        super();
    }
    @Override
    public double multiplication(double fnum, double snum) throws RemoteException{
        return (fnum * snum);
    }
  
    @Override
    public double  division(double fnum,double snum) throws RemoteException {
     
        return (fnum/snum);
    
    }
    public static void main(String[] args) throws Exception{
        Registry reg=LocateRegistry.createRegistry(1099);
        reg.bind("Server",new RMIServer());
        System.out.println("Server is started...");
        
        
    }
}
