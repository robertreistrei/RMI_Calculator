package com.calculator.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.lang.Math;
public class calculatorClient {
    public static void main(String[] args) throws NotBoundException,RemoteException,
            MalformedURLException {
        Scanner sc = new Scanner(System.in);
        while (true)
            try
            { //se cauta obiectul accesibil la distanta "Calculator" IN rmiregistry
                CalculatorInterface c = (CalculatorInterface)
                        Naming.lookup("//localhost:1090/Calculator");
                System.out.println("OBIECTUL 'calculator' A FOST REGASIT IN rmiregistry!\n"+
                        "Clientul S-A CONECTAT LA Server ... //localhost:1090/\n");
                System.out.println("SELECTATI UNA DIN URMATOARELE OPERATII DIN MENU");
                System.out.println("1.ADUNARE");
                System.out.println("2.SCADERE");
                System.out.println("3.INMULTIRE");
                System.out.println("4.IMPARTIRE");
                System.out.println("5.PATRAT");
                System.out.println("6.RADICAL");
                System.out.println("7.FACTORIAL");
                System.out.println("8.COMBINARI");
                System.out.println("9.TOATE OPERATIILE ARITMETICE:+,-,*,/,^");
                System.out.print("INTRODUCETI INDEXUL OPERATIEI DIN MENIU: ");
                int operatia = sc.nextInt();
                double x,y;
                System.out.print("INRODUCETI PRIMUL OPERAND: ");
                x = sc.nextDouble();

                System.out.print("INRODUCETI AL DOILEA OPERAND: ");
                y = sc.nextDouble();



                switch (operatia) {
                    case 1 -> System.out.println("REZULTATUL ADUNARII ESTE=" + c.add(x, y));
                    case 2 -> System.out.println("REZULTATUL SCADERII ESTE=" + c.sub(x, y));
                    case 3 -> System.out.println("REZULTATUL INMULTIRII ESTE=" + c.mul(x, y));
                    case 4 -> System.out.println("REZULTATUL IMPARTIRII ESTE=" + c.div(x, y));
                    case 5 -> System.out.println("REZULTATUL RIDICARII LA PUTERE ESTE=" + c.power(x,y));
                    case 6 -> System.out.println("REZULTATUL RADICALULUI PRIMULUI OPERAND ESTE=" + c.radical(x));
                    case 7 -> System.out.println("FACTORIALUL PRIMULUI OPERAND ESTE=" + c.factor(x));
                    case 8 -> System.out.println("REZULTATUL COMBINARILOR ESTE=" + c.combinari(x,y));
                    case 9 -> {
                        System.out.println("REZULTATUL ADUNARII ESTE=" + c.add(x, y));
                        System.out.println("REZULTATUL SCADERII ESTE=" + c.sub(x, y));
                        System.out.println("REZULTATUL INMULTIRII ESTE=" + c.mul(x, y));
                        System.out.println("REZULTATUL IMPARTIRII ESTE=" + c.div(x, y));
                        System.out.println("REZULTATUL RIDICARII LA PUTERE ESTE=" + c.power(x, y));
                        System.out.println("REZULTATUL RADICALULUI PRIMULUI OPERAND ESTE=" + c.radical(x));
                        System.out.println("FACTORIALUL PRIMULUI OPERAND ESTE=" + c.factor(x));
                        System.out.println("REZULTATUL COMBINARILOR ESTE=" + c.combinari(x,y));
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

    }

}

