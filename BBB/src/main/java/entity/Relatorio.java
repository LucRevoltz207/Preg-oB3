package entity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

public class Relatorio {


    private static final String DIRETORIO_ACOES = "C:\\teste";
    private static final String NOME_ARQUIVO_ACOES = "Acoes.txt";
    private static final String DIRETORIO_ACOES_COMPRADAS = "C:\\teste";
    private static final String NOME_ARQUIVO_ACOES_COMPRADAS = "AcoesCompradas.txt";

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
        for (Acao acao : listaAcoes) {
            String texto = acao.retornarAcoes();
            Files.writeString(path,texto);
        }
    }

    public static void relatorioAcoes(List<Acao> listaAcoes) {
        System.out.println("Relatório de Ações:");
        for (Acao acao : listaAcoes) {
            System.out.println(acao);
        }
    }


    public static void CriatxtCompradas() {
        Path path = Path.of(DIRETORIO_ACOES_COMPRADAS, NOME_ARQUIVO_ACOES_COMPRADAS);

        try {
            // Cria o diretório se não existir
            if (Files.notExists(Path.of(DIRETORIO_ACOES_COMPRADAS))) {
                Files.createDirectories(Path.of(DIRETORIO_ACOES_COMPRADAS));
            }
            if (Files.notExists(path)) {
                Files.createFile(path);
            }

            // Cria um StringBuilder para armazenar todas as ações compradas
            StringBuilder texto = new StringBuilder();

            // Adiciona cada ação comprada ao StringBuilder
            for (Acao acao : Acao.acoesinvestidor) {
                texto.append(acao.toString()).append("\n");
            }

            // Escreve no arquivo apenas uma vez, com todas as ações compradas
            Files.writeString(path, texto.toString());
        } catch (IOException e) {
            throw new RuntimeException("Erro ao escrever no arquivo de ações compradas", e);
        }
    }
}