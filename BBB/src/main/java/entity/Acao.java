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

    private float variacaoValor;


    // Lista para armazenar as ações em heap
    static List<Acao> listaAcoes = new ArrayList<>();
    static ArrayList<Acao> acoesinvestidor = new ArrayList<>();//carteira logica


    public Acao(String ticker, String nomeAcao, float variacaoValor) {

        this.ticker = ticker;
        this.nomeAcao = nomeAcao;
        this.variacaoValor = variacaoValor;


    }


    public Acao() {

    }
    public static void venderAcoes(List<Acao> listaAcoes, List<Acao> acoesInvestidor) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ticker da ação que deseja vender: ");
        String tick = scan.next();

        Iterator<Acao> iterator = acoesInvestidor.iterator();
        boolean encontrou = false;

        while (iterator.hasNext()) {
            Acao acao = iterator.next();
            if (acao.getTicker().equals(tick)) {
                listaAcoes.add(acao); // Adiciona a ação de volta à lista de todas as ações
                iterator.remove(); // Remove a ação da lista do investidor
                try {
                    Relatorio.criatxt(listaAcoes);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                encontrou = true;
                System.out.println("Ação vendida!");
                Relatorio.CriatxtCompradas();

                try {
                    Menus.MenuInvestidor();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            }

        }

        if (!encontrou) {
            System.out.println("Ação não encontrada com o ticker informado na lista do investidor.");
            try {
                Menus.MenuInvestidor();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

public static void acoesiniciais(){
    Acao a1 = new Acao("NTCO3", "Natura", 13.91F);
    Acao a2 = new Acao("CRFB3", "Carrefour", 10.54F);
    Acao a3 = new Acao("BBDC4", "Bradesco", 15.04F);
    Acao a4 = new Acao("PETR4", "Petrobras", 34.72F);
    Acao a5 = new Acao("ELET3", "Eletrobras", 40.71F);
    Acao a6 = new Acao ("AMAR3", "Marisa", 3.36F);
    Acao a7 = new Acao ("VALE3", "Vale", 74.11F);
    Acao a8 = new Acao ("BBSE3", "BB Seguridade", 32.14F);
    Acao a9 = new Acao ("BBAS3", "Banco Do Brasil", 50.37F);
    Acao a10 = new Acao("MXRF11", "Maxi Renda", 10.90F);


    listaAcoes.add(a1);
    listaAcoes.add(a2);
    listaAcoes.add(a3);
    listaAcoes.add(a4);
    listaAcoes.add(a5);
    listaAcoes.add(a6);
    listaAcoes.add(a7);
    listaAcoes.add(a8);
    listaAcoes.add(a9);
    listaAcoes.add(a10);
}
    public static void comprarAcoes(List<Acao> listaAcoes, List<Acao> acoesinvestidor, Investidores i) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o saldo que deseja depositar: ");
        i.setSaldo(scan.nextDouble());

        System.out.println("Digite o ticker da ação que deseja comprar: ");
        String tick = scan.next();

        System.out.println("Digite a quantidade de ações desse ticker: ");
        int qtd= scan.nextInt();

        double precoTotal;
        double precoFinal;

        for (Acao acao : listaAcoes)
        {
            if (acao.getTicker().equals(tick)){
                precoTotal = qtd * acao.getVariacaoValor();
                if(precoTotal <= i.getSaldo()) {
                    System.out.println("Saldo suficiente!");
                    System.out.println("\nVocê adquiriu " + qtd + " ações " + acao.nomeAcao+" valor final, em R$: " + precoTotal);

                    precoFinal = i.getSaldo() - precoTotal;
                    i.setSaldo(precoFinal);

                    System.out.println("Você ainda possuí: R$ " + precoFinal);

                    Menus.MenuInvestidor();
                    Relatorio.CriatxtCompradas();
                }

            }
            else {
                System.out.println("\nSaldo insuficiente!!");
                Menus.MenuInvestidor();
            }
        }

        Iterator<Acao> iterator = listaAcoes.iterator();
        boolean encontrou = false;

        while (iterator.hasNext()) {
            Acao acao = iterator.next();
            if (acao.getTicker().equals(tick)) {
                // Remover a ação da lista de todas as ações com o ticker correspondente
                iterator.remove();

                // Adicionar a ação à lista do investidor
                acoesinvestidor.add(acao);


                encontrou = true;
                System.out.println("Ação comprada!");
                Relatorio.criatxt(listaAcoes);
                Menus.MenuInvestidor();
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Ação não encontrada com o ticker informado.");
            Menus.MenuInvestidor();
        }
    }
    public static void addAcao() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicione informações da Ação:");

        System.out.print("Ticker da Ação: ");
        String ticker = scanner.nextLine();

        System.out.print("Nome da Ação: ");
        String nomeAcao = scanner.nextLine();

        System.out.print("Variação de Valor: ");
        Float variacaoValor = scanner.nextFloat();

        Acao acao = new Acao(ticker, nomeAcao, variacaoValor);

        // Adiciona a ação à lista em heap
        listaAcoes.add(acao);

        System.out.println("Ação adicionada com sucesso!");
        Relatorio.criatxt(listaAcoes);//Chama criatxt após adicionar uma nova ação


        CexibirTodasAcoes(); // Exibe todas as ações adicionadas



        Menus.MenuCorretora();
        Relatorio.criatxt(listaAcoes);
    }

    // Método para exibir todas as ações adicionadas
    public static void IexibirTodasAcoes() throws IOException {
        System.out.println("Ações adicionadas:");
        for (Acao acao : listaAcoes) {
            System.out.println(acao);
        }
        Menus.MenuInvestidor();

    }


    public ArrayList<Acao> getAcoesinvestidor() {
        return acoesinvestidor;
    }

    public void setAcoesinvestidor(ArrayList<Acao> acoesinvestidor) {
        this.acoesinvestidor = acoesinvestidor;
    }

    public static String retornarAcoes() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Ações armazenadas:\n");

        for (Acao acao : listaAcoes) {
            resultado.append(acao.toString()).append("\n");
        }

        return resultado.toString();
    }
    public static String retornarAcoescompradas() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Ações armazenadas:\n");

        for (Acao acao : acoesinvestidor) {
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

    // Método para excluir uma ação com base no ticker

    public static void excluirAcao() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o ticker da Ação a ser excluída: ");
        String tickParaExcluir = scanner.next();

        Iterator<Acao> iterator = listaAcoes.iterator();
        boolean encontrou = false;

        while (iterator.hasNext()) {
            Acao acao = iterator.next();
            if (acao.getTicker().equals(tickParaExcluir)) {
                iterator.remove();
                encontrou = true;
                System.out.println("Ação excluída com sucesso!");
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
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Ação não encontrada com o ticker informado.");
            try {
                Menus.MenuCorretora();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void mudarValorAtivo() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o ticker da Ação cujo valor deve ser alterado: ");
        String tickParaAlterar = scanner.next();

        Iterator<Acao> iterator = listaAcoes.iterator();
        boolean encontrou = false;

        while (iterator.hasNext()) {
            Acao acao = iterator.next();
            if (acao.getTicker().equals(tickParaAlterar)) {
                System.out.print("Informe o novo valor para a Ação: ");
                float novoValor = scanner.nextFloat();
                acao.setVariacaoValor(novoValor);
                encontrou = true;
                System.out.println("Valor da Ação alterado com sucesso!");
                Relatorio.criatxt(listaAcoes);
                Menus.MenuCorretora();
                break;
            }
        }
    }


        @Override
    public String toString() {
        return "Ativo: " +
                "\n Ticker = " + ticker+
                "\n Nome Acao = " + nomeAcao +
                "\n Valor = " + variacaoValor +
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

    public Float getVariacaoValor() {
        return variacaoValor;
    }

    public void setVariacaoValor(Float variacaoValor) {
        this.variacaoValor = variacaoValor;
    }

    public static List<Acao> getListaAcoes() {
        return listaAcoes;
    }

    public static void setListaAcoes(List<Acao> listaAcoes) {
        Acao.listaAcoes = listaAcoes;
    }




}
