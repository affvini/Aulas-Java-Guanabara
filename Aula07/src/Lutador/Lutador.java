package Lutador;

public class Lutador {
        private String nome;
        private String nacionalidade;
        private int idade;
        private double altura;
        private double peso;
        private String categoria;
        private int vitorias;
        private int derrotas;
        private int empates;

        public void apresentar(){
            System.out.println("Lutador: " + this.getNome());
            System.out.println("Origem: " + this.getNacionalidade());
            System.out.println(this.getIdade() + " Anos");
            System.out.println(this.getAltura() + " m de altura");
            System.out.println("Pesando: " + this.getPeso() + " Kg");
            System.out.println("Ganhou: " + this.getVitorias() + " vezes");
            System.out.println("Perdeu: " + this.getDerrotas() + " vezes");
            System.out.println("Empatou: " + this.getEmpates() + " vezes");
        }

        public void status() {
            System.out.println(this.getNome());
            System.out.println("É um peso " + this.getCategoria());
            System.out.println(this.getVitorias() + " vitórias");
            System.out.println(this.getDerrotas() + " derrotas");
            System.out.println(this.getEmpates() + " empates");
        }

        public void ganharLuta() {
            this.setVitorias(this.getVitorias() + 1);
        }

        public void perderLuta() {
            this.setVitorias(this.getVitorias() - 1);
        }

        public void empatarLuta() {
            this.setEmpates(this.getEmpates() + 1);
        }

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (this.getPeso() < 52.2){
           categoria = "Invalido";
        } else if (this.getPeso() <= 70.3){
            categoria = "Leve";
        } else if (this.getPeso() <= 83.9){
            categoria = "Médio";
        } else if (this.getPeso() <= 120.0){
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

