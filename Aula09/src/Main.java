import Livro.Livro;
import Livro.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Senhor dos Aneis","J.R.R Tolkien", 500,p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 300, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800,p[0]);

        l[0].abrir();
        l[0].folhear(400);
        System.out.println(l[0].detalhes());

    }
}