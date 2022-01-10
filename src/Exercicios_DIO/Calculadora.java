package Exercicios_DIO;

public class Calculadora {

    public static void soma(double N1, double N2){

        double resultado = N1 + N2;

        System.out.println("A soma de " + N1 + " mais " + N2 + " é " + resultado);

    }

    public static void subtracao(double N1, double N2) {

        double resultado = N1 - N2;

        System.out.println("A subtração de " + N1 + " menos " + N2 + " é " + resultado);

    }

    public static void multiplicacao(double N1, double N2) {

        double resultado = N1 * N2;

        System.out.println("A multiplicacao de " + N1 + " vezes " + N2 + " é " + resultado );

    }

    public static void divisao(double N1, double N2){

        double resultado = N1 / N2;

        System.out.println("A divisão entre " + N1 + " divido por " + N2 + " é " + resultado);
    }
}
