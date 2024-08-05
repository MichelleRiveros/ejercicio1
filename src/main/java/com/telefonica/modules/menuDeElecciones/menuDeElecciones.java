package com.telefonica.modules.menuDeElecciones;

import java.util.Scanner;

import com.telefonica.modules.areaCírculo.CalcularAreaCirculo;
import com.telefonica.modules.areaTriangulo.CalcularAreaTriangulo;

public class menuDeElecciones {
    CalcularAreaCirculo calcularAreaCirculo = new CalcularAreaCirculo();
    CalcularAreaTriangulo calcularAreaTriangulo = new CalcularAreaTriangulo();
   

    public void start(Scanner sc){
        int start = -1;
        double result = 0;

        while(start != 0){
            System.out.println("Bienvenido, porfavor ingrese la opccion que desea realizar: \n" +
            "1. Calcular el área de un triángulo teniendo las variables Base y Altura \n" +
            "2. Calcular el área de un círculo, se envía como parámetro el radio\n" +
            "0. Salir");
            int choice = -1;
            try{
                choice = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("Ingresar SOLAMENTE numeros");
                continue;
            }
            switch (choice) {
                case 1:
                    result = calcularAreaTriangulo.funcionTriangulo(sc);
                    System.out.println("El area del triangulo es " + result); 
                    break;
                case 2:
                    result = calcularAreaCirculo.funcionCirculo(sc);
                    System.out.println("El area del circulo es " + result);
                    break;
                case 0:
                    System.out.println("Adios");
                    return;
            
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
    
}
