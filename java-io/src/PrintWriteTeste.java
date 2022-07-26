import java.io.IOException;
import java.io.*;

public class PrintWriteTeste {
    public static void main(String[] args) throws IOException {

        //PrintStream ps = new PrintStream("documento.txt");
        PrintWriter ps = new PrintWriter("documeto.txt");
        ps.println("Lukas conka é um gay");
        ps.println();
        ps.println("Talison tbm");
        ps.close();
    }
}
