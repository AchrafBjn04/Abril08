package com.softtek.ejercicio08.model;

public class Calculadora {

    public Calculadora() {
    }

    public double sumar(double num1, double num2){
        return num1+num2;
    }

    public double restar(double num1, double num2){
        return num1-num2;
    }

    public double multiplicar(double num1, double num2){
        return num1*num2;
    }

    public double dividir(double num1, double num2) throws CalculadoraException {
        if(num2==0){
            throw new CalculadoraException("ERROR. No se puede dividir entre 0.");
        }
        return num1/num2;
    }


}
