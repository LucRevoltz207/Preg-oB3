package entity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Relatorio {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\teste\\texto.txt");
        if(Files.notExists(path)){
            Files.createFile(path);
        }


    }
    }

