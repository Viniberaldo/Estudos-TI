/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeoutputscomparse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 *
 * @author viniberaldo
 */
public class TesteOutputsComParse {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File arquivo
                = new File("/home/viniberaldo/NetBeansProjects/TesteInputs/src/testeinputs/arquivo_java.txt");

        FileReader seletorDeArquivo = new FileReader(arquivo);

        BufferedReader leitorDeArquivo = new BufferedReader(seletorDeArquivo);

        do {
           String linha = leitorDeArquivo.readLine();
            System.out.println(linha);
        } while (leitorDeArquivo.read()!= -1);

        leitorDeArquivo.close();
        seletorDeArquivo.close();
    }
}
