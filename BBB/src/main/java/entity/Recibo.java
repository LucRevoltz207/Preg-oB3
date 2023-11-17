package entity;

public class Recibo {
    private Acao acaoVendida;
    private int quantidade;

    public Recibo(Acao acaoVendida, int quantidade){
        this.acaoVendida = acaoVendida;
        this.quantidade = quantidade;
    }

    public Acao getAcaoVendida() {
        return acaoVendida;
    }

    public void setAcaoVendida(Acao acaoVendida) {
        this.acaoVendida = acaoVendida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nRecibo: " +
                "\nAção vendida: " + acaoVendida +
                "\nQuantidade: " + quantidade;
    }
}
