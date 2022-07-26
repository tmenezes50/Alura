import java.io.*;

public class Testio {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("documento.txt");    //Fluxo de Entrada com Arquivos
        InputStreamReader isr = new InputStreamReader(fis);                 /* Fluxo de Entrada com Leitura */
        BufferedReader br = new BufferedReader(isr);                        /* Buffer de Leitura */

        String linha = br.readLine();

        System.out.println(linha);

        br.close();

        FileOutputStream fos = new FileOutputStream("documeto.txt");      //Fluxo de Saida com Arquivos
        OutputStreamWriter osw = new OutputStreamWriter(fos);                   /* Fluxo de Saida com Escrita */
        BufferedWriter bw = new BufferedWriter(osw);                            /* Buffer de Escrita */

        bw.write("Uma nova linha de teste do codigo novo que to aprendendo a escrever");
        bw.newLine();
        bw.newLine();
        bw.write("Só mais uma tentativa besta de fazer uma nova linha de texto");

        bw.close();

    }
}
