package entity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Relatorio {

        public static void criatxt(String texto) throws IOException {
            Acao a = new Acao();
            Path path = Path.of("C:\\teste\\acao" + a.getIdAcao() + ".txt");
            if(Files.notExists(path)){
                Files.createFile(path);
            }

            Files.writeString(path, texto);

        }

    }

