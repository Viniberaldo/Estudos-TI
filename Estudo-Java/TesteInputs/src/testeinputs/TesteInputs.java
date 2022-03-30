package testeinputs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author viniberaldo
 */
public class TesteInputs {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        //Cria a representação do diretório ou arquivo (o arquivo não existe ainda)
        File arquivo
                = new File("/home/viniberaldo/NetBeansProjects/TesteInputs/src/testeinputs/arquivo_java.txt");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        //cria uma instância de Filewriter para escrever no arquivo
        FileWriter manipuladorDeArquivo = new FileWriter(arquivo, true);

        //cria uma instancia do BufferedWriter para armazenar a informação e aplicar no arquivo
        BufferedWriter escrevedorDeArquivo = new BufferedWriter(manipuladorDeArquivo);

        //escrevendo no arquivo do manipulador
        escrevedorDeArquivo.write("olá, mundo");
        escrevedorDeArquivo.write("olá, mundo");
        escrevedorDeArquivo.newLine();
        escrevedorDeArquivo.write("olá, mundo");
        escrevedorDeArquivo.write("olá, mundo");
        escrevedorDeArquivo.newLine();
        escrevedorDeArquivo.write("olá, mundo");

        //encerrando recursos
        escrevedorDeArquivo.close();
        manipuladorDeArquivo.close();

    }

}
