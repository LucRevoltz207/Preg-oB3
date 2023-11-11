package entity;

        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.List;
        import java.util.Scanner;
        import jakarta.persistence.*;



public class Acao {

    private Integer idAcao;


    private String ticker;

    private String nomeAcao;

    private Double variacaoValor;

    private Investidores DonoAcao;
    private FII Ativo;

    // Lista para armazenar as ações em heap
    private static List<Acao> listaAcoes = new ArrayList<>();

    public Acao(Integer idAcao, String ticker, String nomeAcao, Double variacaoValor,Investidores donoAcao, FII ativo) {
        this.idAcao = idAcao;
        this.ticker = ticker;
        this.nomeAcao = nomeAcao;
        this.variacaoValor = variacaoValor;
        this.DonoAcao = null;
        this.Ativo = null;

    }

    public Acao() {
    }

    public static void addAcao() throws IOException {
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


        Acao acao = new Acao(idAcao, ticker, nomeAcao, variacaoValor, new Investidores(),new FII());

        // Adiciona a ação à lista em heap
        listaAcoes.add(acao);

        System.out.println("Ação adicionada com sucesso!");

        // Exibe todas as ações adicionadas
        CexibirTodasAcoes();


        Menus.MenuCorretora();
    }

    // Método para exibir todas as ações adicionadas
    public static void IexibirTodasAcoes() {
        System.out.println("Ações adicionadas:");
        for (Acao acao : listaAcoes) {
            System.out.println(acao);
        }
        Menus.MenuInvestidor();

    }
    public static void CexibirTodasAcoes() {
        System.out.println("Ações adicionadas:");
        for (Acao acao : listaAcoes) {
            System.out.println(acao);
        }
        try {
            Menus.MenuCorretora();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // Método para excluir uma ação com base no ID
    public static void excluirAcao() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o ID da Ação a ser excluída: ");
        int idAcaoParaExcluir = scanner.nextInt();

        Iterator<Acao> iterator = listaAcoes.iterator();
        boolean encontrou = false;

        while (iterator.hasNext()) {
            Acao acao = iterator.next();
            if (acao.getIdAcao().equals(idAcaoParaExcluir)) {
                iterator.remove();
                encontrou = true;
                System.out.println("Ação excluída com sucesso!");
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Ação não encontrada com o ID informado.");
        }
        try {
            Menus.MenuCorretora();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void mudarValorAtivo() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o ID da Ação cujo valor deve ser alterado: ");
        int idAcaoParaAlterar = scanner.nextInt();

        Iterator<Acao> iterator = listaAcoes.iterator();
        boolean encontrou = false;

        while (iterator.hasNext()) {
            Acao acao = iterator.next();
            if (acao.getIdAcao().equals(idAcaoParaAlterar)) {
                System.out.print("Informe o novo valor para a Ação: ");
                double novoValor = scanner.nextDouble();
                acao.setVariacaoValor(novoValor);
                encontrou = true;
                System.out.println("Valor da Ação alterado com sucesso!");
                break;
            }
        }
        Menus.MenuCorretora();
    }

        @Override
    public String toString() {
        return "Ativo " +
                "\n Id =" + idAcao +
                "\n Ticker ='" + ticker + '\'' +
                "\n Nome Acao ='" + nomeAcao + '\'' +
                "\n Variacao Valor =" + variacaoValor +
                '\n';
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

    public static List<Acao> getListaAcoes() {
        return listaAcoes;
    }

    public static void setListaAcoes(List<Acao> listaAcoes) {
        Acao.listaAcoes = listaAcoes;
    }

    public Investidores getDonoAcao() {
        return DonoAcao;
    }

    public void setDonoAcao(Investidores donoAcao) {
        DonoAcao = donoAcao;
    }

    public FII getAtivo() {
        return Ativo;
    }

    public void setAtivo(FII ativo) {
        Ativo = ativo;
    }
}
