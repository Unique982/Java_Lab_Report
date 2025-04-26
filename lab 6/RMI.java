/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Acer
 */
import java.rmi.*;
public interface RMI extends Remote{
double multiplication(double fnum, double snum) throws RemoteException;
double division(double fnum, double snum) throws RemoteException;

   
 
}

