package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro Livro1 = new Livro("O problema dos 3 corpos", 300);
        boolean livro1 = true;
        System.out.println(livro1);
        int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));
    }
}

class Livro {
    private String nome;
    private Integer Numpag;

    public Livro(String nome, Integer Numpag) {
        this.nome = nome;
        this.Numpag = Numpag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpag() {
        return Numpag;
    }

    public void setNumpag(Integer numpag) {
        Numpag = numpag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", Numpag=" + Numpag +
                '}';
    }
}
