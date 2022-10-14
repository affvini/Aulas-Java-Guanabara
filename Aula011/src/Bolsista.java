public class Bolsista extends Aluno{
    private double bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " É bolsista! Pagamento facilitado.");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
