package br.com.dio;



import br.com.dio.model.Gatos;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gatos gato = new Gatos();
        System.out.println(gato);

        Livro Livro1 = new Livro("Primeiro Porgrama Intellij", 100);
        System.out.println(Livro1);


        /*int a = 5;
        int b = 3;

        System.out.println("Hello World!" + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer nunPaginas;

    public Livro(String nome, Integer nunPaginas) {
        this.nome = nome;
        this.nunPaginas = nunPaginas;
    }

    public Livro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNunPaginas() {
        return nunPaginas;
    }

    public void setNunPaginas(Integer nunPaginas) {
        this.nunPaginas = nunPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nunPaginas=" + nunPaginas +
                '}';
    }
}