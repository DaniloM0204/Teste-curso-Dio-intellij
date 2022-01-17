package Exercicios_3_DIO;

public class Quadrilatero {

        public static double areaQuadrado(double lado) {
            return lado*lado;
        }

        public static double areaRetangulo(double lado1, double lado2){
            return lado1 * lado2;
        }

        public static double areaTrapezio(double Bmaior, double Bmenor, double H){
            return ((Bmaior+Bmenor)*H) / 2;
        }

        public static double areaLosango(float diagonal1, float diagonal2){
            return (diagonal1 * diagonal2) / 2;
        }
}
