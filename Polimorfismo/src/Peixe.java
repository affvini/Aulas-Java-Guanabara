public class Peixe extends Animal{
    private String corEscama;



    @Override
    public void locomover() {
        System.out.println("Nandando");
    }

    @Override
    public void alimentar() {
        System.out.println("Susbstâncias da água");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public void soltarBolha(){
        System.out.println("Glub Glub");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
