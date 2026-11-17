package Exceptions.verificada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Code_Projects\\Curso_BackFullEnd\\textoo.txt"));
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("erro ao ler o arquivo" + e.getMessage());
            throw new RuntimeException(e);
        }
        System.out.println("ok");
    }
}
