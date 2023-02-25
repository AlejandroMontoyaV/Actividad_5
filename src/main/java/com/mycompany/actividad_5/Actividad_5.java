package com.mycompany.actividad_5;
import  java.util.Scanner;

public class Actividad_5 {

    public static void main(String[] args) {
        double cuadrado, cubo, numero;
        Scanner valor = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor: ");
        numero = valor.nextDouble();
        
        cuadrado = Math.pow(numero,2);
        cubo = Math.pow(numero,3);
        
        System.out.println("El número al cuadrado es: " + cuadrado);
        System.out.println("El número al cubo es :" + cubo);
    }
}
