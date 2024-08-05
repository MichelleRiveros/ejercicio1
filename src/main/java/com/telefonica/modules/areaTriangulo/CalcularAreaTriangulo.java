package com.telefonica.modules.areaTriangulo;

import java.util.Scanner;

public class CalcularAreaTriangulo {
    private double  base = 0;
    private double  altura = 0;
    
    public double  funcionTriangulo(Scanner sc){
        int iniciar = -1;

        while(iniciar != 0){
            System.out.println("Ingrese la base del Triangulo: o 0 para Salir");
            try {
                base = Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("Ingrese SOLAMENTE NUMEROS");
                continue;
            }
            if (base == 0){
                break;
            }
            System.out.println("Ingrese la altura del Triangulo: o 0 para Salir");
            try {
                altura = Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("Ingrese SOLAMENTE NUMEROS");
                continue;
            }
            if (altura == 0){
                break;
            }
            break;
        }
        
        return (base * altura / 2);
    }



}
