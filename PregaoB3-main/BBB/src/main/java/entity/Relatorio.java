package entity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Relatorio {

    private static final String DIRETORIO_ACOES = "C:\\teste";
    private static final String NOME_ARQUIVO_ACOES = "Acoes.txt";

    public static void criatxt(List<Acao> listaAcoes) throws IOException {
        Path path = Path.of(DIRETORIO_ACOES, NOME_ARQUIVO_ACOES);

        // Cria o diretório se não existir
        if (Files.notExists(Path.of(DIRETORIO_ACOES))) {
            Files.createDirectories(Path.of(DIRETORIO_ACOES));
        }

        // Cria o arquivo se não existir
        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        // Sobrescreve o arquivo com o conteúdo formatado das ações
        Files.write(path, formatarAcoes(listaAcoes));
    }

    public static void relatorioAcoes(List<Acao> listaAcoes) {
        System.out.println("Relatório de Ações:");
        for (Acao acao : listaAcoes) {
            System.out.println(acao);
        }
    }

    // Adicione outros métodos de relatório conforme necessário

    public static void inicio(List<Acao> listaAcoes) throws IOException {
        // Ler os valores dos arquivos TXT e adicionar à lista de ações
        Files.walk(Path.of(DIRETORIO_ACOES))
                .filter(Files::isRegularFile)
                .filter(path -> path.toString().endsWith(".txt"))
                .forEach(path -> {
                    try {
                        String conteudo = Files.readString(path);
                        // Criar uma nova instância de Acao com base no conteúdo do arquivo
                        // e adicionar à lista de ações, apenas se não for nulo
                        Acao acao = parseAcaoFromTexto(conteudo);
                        if (acao != null) {
                            listaAcoes.add(acao);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }

    private static Acao parseAcaoFromTexto(String texto) {
        String[] partes = texto.split("\n");

        if (partes.length >= 5) {
            int id = extrairId(partes[1]);
            String ticker = extrairValor(partes[2]);
            String nomeAcao = extrairValor(partes[3]);
            double variacaoValor = extrairVariacaoValor(partes[4]);

            if (id > 0 && ticker != null && nomeAcao != null) {
                return new Acao(id, ticker, nomeAcao, variacaoValor);
            } else {
                // Lógica para lidar com valores ausentes ou inválidos
                return null;
            }
        } else {
            // Lógica para lidar com linhas que não têm o formato esperado
            return null;
        }
    }

    private static int extrairId(String parte) {
        try {
            String[] valores = parte.split("=");
            return Integer.parseInt((valores.length > 1) ? valores[1].trim() : "0");
        } catch (NumberFormatException e) {
            // Lógica para lidar com a exceção de formato inválido para int
            return 0;
        }
    }

    private static String extrairValor(String parte) {
        String[] valores = parte.split("=");
        return (valores.length > 1) ? valores[1].trim() : null;
    }

    private static double extrairVariacaoValor(String parte) {
        try {
            String[] valores = parte.split("=");
            return Double.parseDouble((valores.length > 1) ? valores[1].trim() : "0.0");
        } catch (NumberFormatException e) {
            // Lógica para lidar com a exceção de formato inválido para double
            return 0.0;
        }
    }

    private static List<String> formatarAcoes(List<Acao> listaAcoes) {
        List<String> resultado = new ArrayList<>();
        for (Acao acao : listaAcoes) {
            resultado.add(acao.toString());
        }
        return resultado;
    }
}
