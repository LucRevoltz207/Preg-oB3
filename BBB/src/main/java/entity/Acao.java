package entity;

        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.List;
        import java.util.Scanner;


public class Acao {

    private Integer idAcao;


    private String ticker;

    private String nomeAcao;

    private Double variacaoValor;

    private Investidores DonoAcao;
    private FII Ativo;

    // Lista para armazenar as ações em heap
    private static List<Acao> listaAcoes = new ArrayList<>();

    public Acao(String ticker, String nomeAcao, Double variacaoValor) {
        this.idAcao = proximoIdAcao();
        this.ticker = ticker;
        this.nomeAcao = nomeAcao;
        this.variacaoValor = variacaoValor;
        this.DonoAcao = null;
        this.Ativo = null;

    }

    public Acao(int id, String ticker, String nomeAcao, double variacaoValor) {
    }

    public Acao() {

    }

    public static void addAcao() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicione informações da Ação:");

        System.out.print("Ticker da Ação: ");
        String ticker = scanner.nextLine();

        System.out.print("Nome da Ação: ");
        String nomeAcao = scanner.nextLine();

        System.out.print("Variação de Valor: ");
        double variacaoValor = scanner.nextDouble();

        Acao acao = new Acao(ticker, nomeAcao, variacaoValor);

        // Adiciona a ação à lista em heap
        listaAcoes.add(acao);

        System.out.println("Ação adicionada com sucesso!");
        Relatorio.criatxt(listaAcoes);//Chama criatxt após adicionar uma nova ação


        CexibirTodasAcoes(); // Exibe todas as ações adicionadas



        Menus.MenuCorretora();
    }

    // Método para exibir todas as ações adicionadas
    public static void IexibirTodasAcoes() throws IOException {
        System.out.println("Ações adicionadas:");
        for (Acao acao : listaAcoes) {
            System.out.println(acao);
        }
        Menus.MenuInvestidor();

    }
    public static String retornarAcoes() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Ações armazenadas:\n");

        for (Acao acao : listaAcoes) {
            resultado.append(acao.toString()).append("\n");
        }

        return resultado.toString();
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
    private Integer proximoIdAcao() {
        // Retorna o próximo ID de ação com base na posição na lista + 1
        return listaAcoes.size() + 1;
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
            Relatorio.criatxt(listaAcoes);
        } catch (IOException e) {
            throw new RuntimeException(e);
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
        try {
            Relatorio.criatxt(listaAcoes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Menus.MenuCorretora();
    }

        @Override
    public String toString() {
        return "Ativo " +
                "\n Id =" + idAcao +
                "\n Ticker =" + ticker+
                "\n Nome Acao =" + nomeAcao +
                "\n Valor =" + variacaoValor +
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
