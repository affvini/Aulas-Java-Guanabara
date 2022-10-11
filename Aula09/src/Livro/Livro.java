package Livro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public String detalhes() {
        return "Livro " +
                "titulo =' " + titulo + '\'' +
                "\n autor =' " + autor + '\'' +
                "\n Total de páginas = " + totPaginas +
                "\n Página atual = " + pagAtual +
                "\n aberto = " + aberto +
                "\n leitor = " + leitor.getNome() +
                "\n Idade = " + leitor.getIdade()+
                "\n Sexo = " + leitor.getSexo();
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas){
            System.out.println("O livro não possiu essa quantidade de páginas.");
        } else {
            this.pagAtual = p;
        }

    }

    @Override
    public void avancarPag() {
        this.pagAtual ++;

    }

    @Override
    public void voltarPag() {
        this.pagAtual --;
    }
}
