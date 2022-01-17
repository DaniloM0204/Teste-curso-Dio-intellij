package Exercicios_2_DIO;

public class Areas {

    public static void Quadrado(double lado) {
        System.out.println("Área do quadrado:" + lado*lado);
    }

    public static void Retangulo(double lado1, double lado2){
        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void Trapezio(double Bmaior, double Bmenor, double H){
        System.out.println("Área do trápezio:" + ((Bmaior+Bmenor)*H) / 2);
    }

    public static void Losango(float diagonal1, float diagonal2){
        System.out.println("Área do Losango:" + diagonal1 * diagonal2 / 2);
    }
}
