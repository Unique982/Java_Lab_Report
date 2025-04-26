/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
import java.rmi.registry.*;
import java.util.Scanner;

public class RMiClient {
    public static void main(String[] args) throws Exception{
          Registry reg = LocateRegistry.getRegistry("localhost",1099);
        RMI rmi = (RMI) reg.lookup("Server");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        double fnum =sc.nextDouble();
        System.out.println("Enter Second Number");
        double snum = sc.nextDouble();
         double mul= rmi.multiplication(fnum , snum);
          double div= rmi.division(fnum , snum);
        System.out.println("Multiplication Value:"+mul);
        System.out.println("Division Value:"+div);
    
     
        
    }
    
}