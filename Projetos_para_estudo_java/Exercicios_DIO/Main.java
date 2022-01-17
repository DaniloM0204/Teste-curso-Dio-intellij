package Exercicios_DIO;

public class Main {

    public static void main(String[] args) {


        // Calculadora

        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 18);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMsg(9);
        Mensagem.obterMsg(14);
        Mensagem.obterMsg(1);


        //Empréstimo
        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);


    }
}
