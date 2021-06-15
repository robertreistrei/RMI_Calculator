package com.calculator.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.NotBoundException;


public class calculatorServer {
    public static void main(String[] args) throws RemoteException,NotBoundException
    {
        try
        {//creez registrul RMI accesibil pe portul 1090 ("//localhost:1090/...)
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1090);
//inregistrez obiectul accesibil la distanta "Calculator" in rmiregistry
            r.rebind("Calculator", new Calculator());
            System.out.println("OBIECTUL 'calculator' A FOST INREGISTRAT IN rmiregistry SI ESTE " +
                    "ACCESIBIL LA DISTANTA!\n"+"SERVERUL RULEAZA...");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
