package Exercicios_2_DIO;

public class Areas {

    public static void area(double lado) {
        System.out.println("Área do quadrado:" + lado*lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void area(double Bmaior, double Bmenor, double H){
        System.out.println("Área do trápezio:" + ((Bmaior+Bmenor)*H) / 2);
    }
}
