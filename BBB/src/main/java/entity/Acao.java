package entity;

import java.util.Scanner;

public class Acao {

    private Integer idAcao;
    private String ticker;
    private String nomeAcao;
    private Double variacaoValor;

    public Acao(Integer idAcao, String ticker, String nomeAcao, Double variacaoValor) {
        this.idAcao = idAcao;
        this.ticker = ticker;
        this.nomeAcao = nomeAcao;
        this.variacaoValor = variacaoValor;
    }

    public Acao() {

    }

    public void addAcao(){


        ArvoreBinariaAcoes arvore = new ArvoreBinariaAcoes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicione informações da Ação:");
        System.out.print("ID da Ação: ");
        int idAcao = scanner.nextInt();
        scanner.nextLine(); // Limpa a quebra de linha

        System.out.print("Ticker da Ação: ");
        String ticker = scanner.nextLine();

        System.out.print("Nome da Ação: ");
        String nomeAcao = scanner.nextLine();

        System.out.print("Variação de Valor: ");
        double variacaoValor = scanner.nextDouble();

        Acao acao = new Acao(idAcao, ticker, nomeAcao, variacaoValor);
        arvore.inserir(acao);

        System.out.println("Ação na árvore (em ordem):");
        arvore.emOrdem();

        Menus m = new Menus();
        m.MenuCorretora();
    }

    public Integer getIdAcao() {
        return idAcao;
    }

    public void setIdAcao(Integer idAcao) {
        this.idAcao = idAcao;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getNomeAcao() {
        return nomeAcao;
    }

    public void setNomeAcao(String nomeAcao) {
        this.nomeAcao = nomeAcao;
    }

    public Double getVariacaoValor() {
        return variacaoValor;
    }

    public void setVariacaoValor(Double variacaoValor) {
        this.variacaoValor = variacaoValor;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "idAcao=" + idAcao +
                ", ticker='" + ticker + '\'' +
                ", nomeAcao='" + nomeAcao + '\'' +
                ", variacaoValor=" + variacaoValor +
                '}';
    }
}

class NoAcao {
    private Acao acao;
    private NoAcao esquerda;
    private NoAcao direita;

    public NoAcao(Acao acao) {
        this.acao = acao;
        this.esquerda = null;
        this.direita = null;
    }

    public NoAcao() {

    }

    public Acao getAcao() {
        return acao;
    }

    public NoAcao getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoAcao esquerda) {
        this.esquerda = esquerda;
    }

    public NoAcao getDireita() {
        return direita;
    }

    public void setDireita(NoAcao direita) {
        this.direita = direita;
    }
}

class ArvoreBinariaAcoes {
    private NoAcao raiz;

    public ArvoreBinariaAcoes() {
        this.raiz = null;
    }

    public void inserir(Acao acao) {
        raiz = inserirRec(raiz, acao);
    }

    private NoAcao inserirRec(NoAcao raiz, Acao acao) {
        if (raiz == null) {
            raiz = new NoAcao(acao);
            return raiz;
        }

        if (acao.getIdAcao() < raiz.getAcao().getIdAcao()) {
            raiz.setEsquerda(inserirRec(raiz.getEsquerda(), acao));
        } else if (acao.getIdAcao() > raiz.getAcao().getIdAcao()) {
            raiz.setDireita(inserirRec(raiz.getDireita(), acao));
        }

        return raiz;
    }

    // Você pode adicionar métodos para busca, remoção e outras operações na árvore, se necessário.

    // Exemplo de um método para imprimir a árvore em ordem (percurso em ordem):
    public void emOrdem() {
        emOrdemRec(raiz);
    }

    private void emOrdemRec(NoAcao raiz) {
        if (raiz != null) {
            emOrdemRec(raiz.getEsquerda());
            System.out.println(raiz.getAcao());
            emOrdemRec(raiz.getDireita());
        }
    }
}

