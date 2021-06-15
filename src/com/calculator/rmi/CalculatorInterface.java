package com.calculator.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

// metodele invocate la distanta prin intermediul interfetei
 interface CalculatorInterface extends Remote{
     double add(double x,double y) throws RemoteException;
     double sub(double x,double y) throws RemoteException;
     double mul(double x,double y) throws RemoteException;
     double div(double x, double y) throws RemoteException;
     double power(double x,double y) throws RemoteException;
     double radical(double x) throws RemoteException;
     double factor(double x) throws  RemoteException;
     double combinari(double x, double y) throws  RemoteException;
}