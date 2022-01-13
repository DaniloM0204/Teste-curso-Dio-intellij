package Desafios_DIO;

//Complete os espaços em branco com o seu código
import java.util.Scanner;


public class Main {


        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                if(a == 61){
                        System.out.print("Brasilia\n");
                }
                else if(a == 71){
                        System.out.print("Salvador\n");
                }
                else if(a == 11){
                        System.out.print("Sao Paulo\n");
                }
                else if(a == 21){
                        System.out.print("Rio de Janeiro\n");
                }
                else if(a == 32){
                        System.out.print("Juiz de fora\n");
                }
                else if(a == 19){
                        System.out.print("Campinas\n");
                }
                else if(a == 27){
                        System.out.print("Vitoria\n");
                }
                else if(a == 31){
                        System.out.print("Belo Horizonte\n");
                }
                else{
                        System.out.print("DDD nao cadastrado\n");
                }
        }

}