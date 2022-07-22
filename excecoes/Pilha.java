package excecoes;

public class Pilha { 

    public static void main(String[] args) {
        
        System.out.println("Init MAIN");
        method1();
        System.out.println("End MAIN");
    }

    public static void method1() {
        System.out.println("Init method1");
        method2();
        System.out.println("End method1");
    }

    public static void method2() {
        System.out.println("Init method2");
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1);
        }
        System.out.println("End method2");
    }
    
}
