package aula6;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        ler();
    }
    public static void ler(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insere a frase para ler: ");
        String frase = scanner.nextLine();
        System.out.println(frase);
    }
}
