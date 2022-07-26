import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
    public static void main(String[] args) throws IndexOutOfBoundsException, IOException {

        //FileWriter fw = new FileWriter("documento.txt");    // Escritor de Arquivo
        //BufferedWriter bw = new BufferedWriter(fw);                 /* Buffer de Escrita */

        BufferedWriter bw = new BufferedWriter(new FileWriter("documentos.txt"));

        bw.write("Novo teste de uma classe diferente");
        bw.newLine();
        bw.write("Parece ser bem mais fácil e deixa de usar tantas linhas de códigos assim");

        bw.close();
    }
}
