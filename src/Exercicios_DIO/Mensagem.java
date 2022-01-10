package Exercicios_DIO;

public class Mensagem {


    public static void obterMsg(int hora) {

        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> msgBomDia();
            case 13, 14, 15, 16, 17 -> msgBoaTarde();
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> msgBoaNoite();
            default -> System.out.println("Hora invalida");
        }
    }

    public static void msgBomDia(){
        System.out.println("Bom dia");
    }
    public static void msgBoaTarde(){
        System.out.println("Bom Tarde");
    }
    public static void msgBoaNoite(){
        System.out.println("Bom Noite");
    }
}
