package entity;

public class FII {
    private int quantidadeCotas;

    public FII(String codigo, String nome, double valorAtual, int quantidadeCotas) {

        this.quantidadeCotas = quantidadeCotas;
    }

    public int getQuantidadeCotas() {
        return quantidadeCotas;
    }

    public void setQuantidadeCotas(int quantidadeCotas) {
        this.quantidadeCotas = quantidadeCotas;
    }

    @Override
    public String toString() {
        return "FII{" +
                "quantidadeCotas=" + quantidadeCotas +
                '}';
    }
}