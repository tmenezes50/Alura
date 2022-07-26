import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteDeLidaScanner{
    public static void main(String[] args)  throws IOException {
        Scanner scanner = new Scanner(new File("arquivo.csv"));

        while(scanner.hasNext()) {
            //System.out.println(scanner.nextLine());
            Scanner scannearLinha = new Scanner(scanner.nextLine());
            scannearLinha.useLocale(Locale.US);
            scannearLinha.useDelimiter(",");

            String valor1 = scannearLinha.next();
            int valor2 = scannearLinha.nextInt();
            int valor3 = scannearLinha.nextInt();
            String valor4 = scannearLinha.next();
            double valor5 = scannearLinha.nextDouble();



            //System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);

            System.out.printf("Tipo de conta: %s\nAgência: %d\nNúmero da Conta: %d\nTitular: %s\n" +
                    "Saldo: %.2f\n\n", valor1, valor2, valor3, valor4, valor5);

            scannearLinha.close();

        }
        scanner.close();
    }
}
