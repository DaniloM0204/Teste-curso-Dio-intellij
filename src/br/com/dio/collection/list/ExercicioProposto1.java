package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ExercicioProposto1 {

    public static void main(String[] args){
        /* Fazer um programa que recebe a temperatura média
         dos 6 primeiros meses do ano.*/

        List<Temperatura> Temperatura = new ArrayList<>();
        add(new Temperatura("Janeiro", 31));
        add(new Temperatura("Fevereiro", 27));
        add(new Temperatura("Março", 40));
        add(new Temperatura("Abril", 33));
        add(new Temperatura("Maio", 29));
        add(new Temperatura("Junho", 35));

        System.out.println("--\t Ordem de Inserção\t---");
        System.out.println(Temperatura);
    }

    private static void add(Temperatura mes) {
    }

    public ExercicioProposto1() {
    }
}

class Temperatura{
    public String mes;
    public Integer Temp;

    public Temperatura(String mes, Integer Temp) {
        this.mes = mes;
        this.Temp = Temp ;

    }}


