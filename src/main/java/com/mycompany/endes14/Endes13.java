/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.endes14;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Endes13 {

    public static void main(String[] args) {

        boolean salir = true;

        do {
            System.out.println(" MENU ");
            System.err.println("1.- Sumar numeros");
            System.out.println("2.- Restar numeros");
            System.out.println("3.- Multiplicar numeros");
            System.out.println("4.- Dividir numeros");
            System.out.println("5.- Salir");
            try {
                Scanner teclado = new Scanner(System.in);
                int eleccion = teclado.nextInt();
                
                switch (eleccion) {
                    case 1:
                        System.out.println("Introduce el primer numero de la suma");
                        int num1 = teclado.nextInt();
                        System.out.println("Introduce el segundo numero de la suma");
                        int num2 = teclado.nextInt();

                        int sum = num1 * num2;

                        System.out.println("El resultado de sumar " + num1 + " y " + num2 + " es: " + sum);
                        break;

                    case 2:
                        System.out.println("Introduce el primer numero de la resta");
                        int num3 = teclado.nextInt();
                        System.out.println("Introduce el segundo numero de la resta");
                        int num4 = teclado.nextInt();

                        int rest = num3 * num4;

                        System.out.println("El resultado de restar " + num3 + " y " + num4 + " es: " + rest);
                        break;

                    case 3:
                        System.out.println("Introduce el primer numero de la multiplicacion");
                        int num5 = teclado.nextInt();
                        System.out.println("Introduce el segundo numero de la multiplicacion");
                        int num6 = teclado.nextInt();

                        int mult = num5 * num6;

                        System.out.println("El resultado de multiplicar " + num5 + " y " + num6 + " es: " + mult);
                        break;

                    case 4:
                        System.out.println("Introduce el primer numero de la division");
                        int num7 = teclado.nextInt();
                        System.out.println("Introduce el segundo numero de la division");
                        int num8 = teclado.nextInt();

                        int div = num7 / num8;

                        System.out.println("El resultado de multiplicar " + num7 + " y " + num8 + " es: " + div);
                        break;

                    case 5:
                        System.out.println("Adios");
                        salir = false;
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Solo se permiten numeros");
            }
        } while (salir);

    }

}
