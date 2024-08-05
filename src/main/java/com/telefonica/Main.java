package com.telefonica;

import java.util.Scanner;

import com.telefonica.modules.menuDeElecciones.menuDeElecciones;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menuDeElecciones menuDeElecciones = new menuDeElecciones();
        menuDeElecciones.start(sc);
        sc.close();
    }
}