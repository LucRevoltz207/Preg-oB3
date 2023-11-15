package entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acao {
    private String ticker;
    private String nomeAcao;
    private double precoAtual;
    private static List<Acao> listaAcoes = new ArrayList<>();

    public Acao(String ticker, String nomeAcao, double precoAtual) {
        this.ticker = ticker;
        this.nomeAcao = nomeAcao;
        this.precoAtual = precoAtual;
    }
    public Acao(){}

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

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(double precoAtual) {
        this.precoAtual = precoAtual;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "ticker='" + ticker + '\'' +
                ", nomeAcao='" + nomeAcao + '\'' +
                ", precoAtual=" + precoAtual +
                '}';
    }

    public static void main(String[] args) {

    }

    public static void criarAcoes() {
        Acao a1 = new Acao("NTCO3", "Natura", 13.91);
        Acao a2 = new Acao("CRFB3", "Carrefour", 10.54);
        Acao a3 = new Acao("BBDC4", "Bradesco", 15.04);
        Acao a4 = new Acao("PETR4", "Petrobras", 34.72);

        listaAcoes.add(a1);
        listaAcoes.add(a2);
        listaAcoes.add(a3);
        listaAcoes.add(a4);

        try {
            exibirAcoes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void exibirAcoes() throws IOException {
        System.out.println("Lista de Ações:");
        System.out.println();
        for (Acao acao : listaAcoes) {
            System.out.println("Ticker: " + acao.getTicker() +
                    "\nNome ação: " + acao.getNomeAcao() +
                    "\nValor ação: " + acao.getPrecoAtual());
            System.out.println();
            System.out.println(listaAcoes);
        }
        try {
            Menus.MenuInvestidor();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void comprarAcoes() throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Ticker da ação que deseja comprar: ");
        String ticker = scan.next();

//        System.out.println("Digite a quantidade de ações desse ticker: ");
//        int qtd= scan.nextInt();

        for(Acao acao : listaAcoes){
            if (acao.getTicker().equals(ticker)) {
                System.out.println("Ação comprada!");
                Menus.MenuInvestidor();
            }
            else {
                System.out.println("Ticker não corresponde a nenhuma ação.");
                Menus.MenuInvestidor();
            }
        }
    }

    public static void venderAcoes() {
        // Implemente a lógica de venda de ações aqui
    }
}