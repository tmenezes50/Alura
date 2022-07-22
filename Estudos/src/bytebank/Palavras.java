package bytebank;

import java.util.Scanner;

public class Palavras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();

        String outro = nome.toLowerCase();

        System.out.println(outro);
    }
}
