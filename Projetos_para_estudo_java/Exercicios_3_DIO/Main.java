package Exercicios_3_DIO;

public class Main {

    public static void main(String[] args) {
        //Retornos

        System.out.println("Exercicio retornos");

        double areaQuadrado = Quadrilatero.areaQuadrado(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.areaRetangulo(5d,5d);
        System.out.println("Área do retangulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.areaTrapezio(7,8,9);
        System.out.println("Área do trapezio:" + areaTrapezio);

        double areaLosango = Quadrilatero.areaLosango(5f,5f);
        System.out.println("Área do Losango:" + areaLosango);


    }
}
