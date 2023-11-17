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


    public static void CriatxtCompradas(){
        Path path = Path.of("teste", "Acoes Compradas");
        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        for (Acao acao: Acao.acoesinvestidor) {
            String texto2 = acao.retornarAcoescompradas();
            try {
                Files.writeString(path, texto2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}