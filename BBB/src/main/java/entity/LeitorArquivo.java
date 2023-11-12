package entity;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivo {

    public static void main(String[] args) {
        List<Acao> listaAcoes = new ArrayList<>();

        try {
            lerArquivo("C:\\teste\\Acoes.txt", listaAcoes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Agora, listaAcoes contém as informações lidas do arquivo
        for (Acao acao : listaAcoes) {
            System.out.println(acao);
        }
    }

    public static void lerArquivo(String caminhoArquivo, List<Acao> listaAcoes) throws IOException {
        List<String> linhas = Files.readAllLines(Path.of(caminhoArquivo));

        Acao acaoAtual = null;

        for (String linha : linhas) {
            // Verifica se a linha indica o início de uma nova ação
            if (linha.startsWith("Ativo")) {
                // Se a ação atual não for nula, adiciona à lista
                if (acaoAtual != null) {
                    listaAcoes.add(acaoAtual);
                }
                // Cria uma nova instância de Acao
                acaoAtual = new Acao();
            } else if (linha.startsWith("Id")) {
                // Extrai o ID da linha e define na ação atual
                int id = extrairValorInteiro(linha);
                acaoAtual.setIdAcao(id);
            } else if (linha.startsWith("Ticker")) {
                // Extrai o ticker da linha e define na ação atual
                String ticker = extrairValorString(linha);
                acaoAtual.setTicker(ticker);
            } else if (linha.startsWith("Nome Acao")) {
                // Extrai o nome da ação da linha e define na ação atual
                String nomeAcao = extrairValorString(linha);
                acaoAtual.setNomeAcao(nomeAcao);
            } else if (linha.startsWith("Valor")) {
                // Extrai o valor da linha e define na ação atual
                double valor = extrairValorDouble(linha);
                acaoAtual.setVariacaoValor(valor);
            }
        }

        // Adiciona a última ação à lista
        if (acaoAtual != null) {
            listaAcoes.add(acaoAtual);
        }
    }

    private static int extrairValorInteiro(String linha) {
        String[] partes = linha.split("=");
        return Integer.parseInt(partes[1].trim());
    }

    private static String extrairValorString(String linha) {
        String[] partes = linha.split("=");
        return partes[1].trim();
    }

    private static double extrairValorDouble(String linha) {
        String[] partes = linha.split("=");
        return Double.parseDouble(partes[1].trim());
    }}