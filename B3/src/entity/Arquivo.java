package entity;


import java.io.IOException;
import java.io.RandomAccessFile;

public class Arquivo {
    public static void main(String[] args) {
        try {
            // Abre o arquivo para leitura e escrita
            RandomAccessFile arquivo = new RandomAccessFile("Acoes.txt", "rw");

            // Escreve no arquivo na posição 0
            arquivo.seek(0);
            arquivo.writeBytes("Exemplo de escrita em arquivo de acesso aleatório");

            // Lê do arquivo na posição 0
            arquivo.seek(0);
            byte[] buffer = new byte[25];
            arquivo.read(buffer);

            // Imprime o conteúdo lido do arquivo
            System.out.println(new String(buffer));
            arquivo.read(buffer);
            System.out.println(new String(buffer));

            // Fecha o arquivo
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}