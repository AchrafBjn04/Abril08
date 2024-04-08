package com.softtek.ejercicio08.presentacion;

import com.softtek.ejercicio08.model.Calculadora;
import com.softtek.ejercicio08.model.CalculadoraException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) throws CalculadoraException {
        Scanner sc = new Scanner(System.in);
        int operacion = 0;
        double num1 = 0, num2 = 0;
        Calculadora calculadora = new Calculadora();

        do{
            try{
                do {
                    System.out.print("\nNúmero? ");
                    num1 = sc.nextDouble();

                    do{
                        menu();
                        operacion = sc.nextInt();
                    }while(operacion<0 || operacion>4);
                }while(operacion==0);
                    System.out.print("\nNúmero? ");
                    num2 = sc.nextDouble();
                }catch (InputMismatchException e){
                    System.err.println("\nSolo se aceptan números.");
                    sc.nextLine();
                }

            System.out.println("\n");

            switch (operacion){
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + calculadora.sumar(num1, num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + calculadora.restar(num1, num2));
                    break;
                case 3:
                    System.out.println(num1 + " x " + num2 + " = " + calculadora.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + calculadora.dividir(num1, num2));
                    break;
            }

        }while(operacion!=0);
    }

    private static void menu() {
        System.out.println("\n0. Borrar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("\nOperacion? ");
    }
}
