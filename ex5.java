package aula6;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        hifen();
    }
    public static void hifen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um proverbio: ");
        String frase = scanner.nextLine();
        frase = frase.replace(" " , "-");
        System.out.println("Proverbio com hifen: " + frase);
    }
}
