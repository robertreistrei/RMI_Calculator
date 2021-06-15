package com.calculator.rmi;

import java.rmi.RemoteException;
import java.rmi.*;
import java.lang.Math;
import java.rmi.server.UnicastRemoteObject;
//declararea obiectului accesibil la distanta
public class Calculator extends UnicastRemoteObject implements CalculatorInterface{
    public Calculator() throws RemoteException
    {
        double a,b;

    }
    @Override
    public double add(double a,double b) throws RemoteException
    {
        return  a+b;
    }
    @Override
    public double sub(double a,double b) throws RemoteException
    {
        return  (a-b);
    }
    @Override
    public double mul(double a,double b) throws RemoteException
    {
        return  (a*b);
    }
    @Override
    public double div(double a,double b) throws RemoteException
    {
        return  (a/b);
    }

    @Override
    public double power(double a,double b) throws RemoteException
    {
        return  Math.pow(a,b);
    }

    @Override
    public double radical(double a) throws RemoteException
    {
        return Math.sqrt(a);
    }

    @Override
    public double factor(double a) throws RemoteException
    {
        if(a > 1)
        {
            return a * factor(a - 1);
        }
        else if (a == 0 || a == 1)
                return 1;
                    else return 0;
    }

    @Override
    public double combinari(double a,double b) throws RemoteException
    {
        if(a == b || b == 0)
            return 1;
        else return combinari(a-1,b) + combinari( a-1, b-1);
    }
}