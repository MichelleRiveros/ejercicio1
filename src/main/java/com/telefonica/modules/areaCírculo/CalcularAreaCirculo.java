package com.telefonica.modules.areaCírculo;

import java.util.Scanner;

public class CalcularAreaCirculo {
    double radio;
    public double  funcionCirculo(Scanner sc){
        int iniciar = -1;

        while(iniciar != 0){
            System.out.println("Ingrese el radio del circulo o 0 para Salir");
            try {
                radio = Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("Ingrese SOLAMENTE NUMEROS");
                continue;
            }
            if (radio == 0){
                break;
            }
            break;
        }
        return Math.PI * Math.pow(radio, 2); //Math.pow -> elevar a la potencia de dos
    } 
}
