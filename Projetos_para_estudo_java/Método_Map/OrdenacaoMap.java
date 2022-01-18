package Método_Map;

/*Dada as seguinte informações sobre meus livros favoritos e seus autores,
crie um dícionario e ordene este dícionario:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen - Livro = nome: Uma Breve História do tempo. páginas:256
Autor = Duhigg, Charles - Livro = nome: O poder do Hábito páginas:408
Autor = Hararri, Yuval Noah - Livro = nome: 21 Lições para o século 21. páginas:432
*/

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args){


        System.out.println("--\tOrdem Aleátoria\t--");

        Map<String, Livro> meusLivros = new HashMap(){{
            put("Hawking Stephen ", new Livro("Uma Breve História do tempo", 256));
            put("Duhigg Charles ", new Livro("O poder do hábito", 408));
            put("Harari Yuval Noah ", new Livro("21 Lições para o século 21",432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap <>(){{
            put("Hawking Stephen ", new Livro("Uma Breve História do tempo", 256));
            put("Duhigg Charles ", new Livro("O poder do hábito", 408));
            put("Harari Yuval Noah ", new Livro("21 Lições para o século 21",432));
        }};

        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem Alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap <>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet <>(new ComparatorNome());


        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem número de páginas\t--");

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet <>(new ComparatorNumPagina());


        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());
    }
}

class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry <String, Livro> l1, Map.Entry <String, Livro> l2) {

        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorNumPagina implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry <String, Livro> l1, Map.Entry <String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}
