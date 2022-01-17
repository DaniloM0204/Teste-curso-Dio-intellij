package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class ExercicioProposto2 {
    public ExercicioProposto2() {
    }

    public static void main(String[] args){
        List<String> Respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Responda as perguntas com S/N-----");
        System.out.println("\nTelefonou a vítima? ");
        String Resposta = scanner.next();
        Respostas.add(Resposta.toUpperCase());
        System.out.println("Esteve no local do crime? ");
        Resposta = scanner.next();
        Respostas.add(Resposta.toUpperCase());
        System.out.println("Mora perto da vítima? ");
        Resposta = scanner.next();
        Respostas.add(Resposta.toUpperCase());
        System.out.println("Devia para a vítima? ");
        Resposta = scanner.next();
        Respostas.add(Resposta.toUpperCase());
        System.out.println("Já trabalhou com a vítima? ");
        Resposta = scanner.next();
        Respostas.add(Resposta.toUpperCase());
        System.out.println(Respostas);
        int count = 0;
        Iterator<String> contador = Respostas.iterator();

        while (contador.hasNext()){
            String Resp = (String)contador.next();
            if (Resp.contains("S")){
                ++count;
            }
        }

        switch (count) {
            case 2 -> System.out.println(">> Suspeita <<");
            case 3, 4 -> System.out.println(">> Cúmplice <<");
            case 5 -> System.out.println(">> Assassino <<");
            default -> System.out.println(">> Inocente <<");
        }


    }
}
