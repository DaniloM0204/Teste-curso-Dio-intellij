package Metódo_Set;

/* Crie um conjunto contendo as cores do arco-íris e:
A- Exiba todas as cores uma abaixo da outra
B- A quantia de cores que o arco-íris têm
C- Exiba as cores em ordem alfabética
D- Exiba as cores em ordem inversa da que foi informada
E- Exiba todas as cores que começam com a letra "v"
F- Remova todas as cores que não começam com a letra "v"
G- Limpe o conjunto
H- Confira se o conjunto está vazio
 */


import java.util.*;


public class ExercicioPropHash {
    public static void main(String[] args){
        System.out.println("Crie um conjunto contendo as cores do arco-íris");
        Set<String> arcoiris = new HashSet<>(Arrays.asList("vermelho","laranja","amarelo","verde","azul","anil","violeta"));
        System.out.println(arcoiris);

        System.out.println("--\tTodas as cores uma abaixo da outra\t--");
        for (String cor : arcoiris) {
            System.out.println(cor);
        }

        System.out.println("A quantia de cores que o arco-íris têm:" + arcoiris.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> arcoiris2 = new TreeSet<>(arcoiris);
        System.out.println(arcoiris2);

        System.out.println("Exiba as cores em ordem inversa da que foi informada");
        List<String> arcoiris3 = (List <String>) new LinkedHashSet <String>(
                Arrays.asList("vermelho","laranja","amarelo","verde","azul","anil","violeta"));
        System.out.println(arcoiris3);
        List<String> arcoirisList = new ArrayList<>(arcoiris3);
        Collections.reverse(arcoirisList);
        System.out.println(arcoirisList);

        System.out.println("Exiba todas as cores que começam com a letra " + "v");
        for (String cor: arcoiris){
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra" + "v");
        arcoiris.removeIf(s -> !s.startsWith("v"));
        System.out.println(arcoiris);

        System.out.println("Limpe o conjunto");
        arcoiris.clear();

        System.out.println("Confira se o conjunto está vazio: " + arcoiris.isEmpty());






    }
}
