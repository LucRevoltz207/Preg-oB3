package entity;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Acao> listaAcoes = new ArrayList<>();
        Relatorio.inicio(listaAcoes);
        Cadastros.CadastroMain();

        Relatorio.criatxt(listaAcoes); // Adicionado para criar o arquivo após a leitura
    }
}
