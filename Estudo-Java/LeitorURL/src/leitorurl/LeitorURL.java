package leitorurl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class LeitorURL {

    public static void main(String[] args) {
        
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Olá, digite o CEP para consulta, somente números: ");
        String usuarioCEP = objScanner.next();

        try {
            String url = "https://viacep.com.br/ws/"+usuarioCEP+"/json/";

            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();

            String inputLine = "";
            ArrayList<String> conteudoJSON = new ArrayList<>();
            int index = 0;

            if (responseCode == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

                while (inputLine != null) {
                    inputLine = br.readLine();
                    conteudoJSON.add(index,inputLine);
                    index++;
                }
                System.out.println(conteudoJSON.get(1));
                System.out.println(conteudoJSON.get(2));
                System.out.println(conteudoJSON.get(4));
                System.out.println(conteudoJSON.get(5));
                System.out.println(conteudoJSON.get(6));
            } else {
                System.out.println("erro " + responseCode);
            }
        } catch (IOException e) {
            System.out.println("Erro de leitura");
        }
        
        
    }

}
