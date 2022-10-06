package Banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso! nome: " + getDono());
    }

    public void fecharConta(){
        if (getSaldo() > 0) {
            System.out.println("Conta com dinheiro.");
        } else if (getSaldo() < 0) {
            System.out.println("Conta em débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }

    }

    public void depositar(double v){
        if (this.isStatus() == true){
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado na conta de: " + this.getDono());
        } else {
            System.out.println("Impossível depositar");
        }

    }

    public void sacar( double v){
        if (this.isStatus() == true){
            if (this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta de: " + this.getDono() + " No valor de: R$" + v);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal(){
        double v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (getTipo() == "CP") {
            v = 20;
        }
        if (this.isStatus() == true){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}


