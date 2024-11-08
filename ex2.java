package aula6;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        palavra();
    }
    public static void palavra(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma frase: ");
        String frase = scanner.nextLine();
        int size = frase.length();
        System.out.println("A frase é " + frase + " e a quantidade de caracterie é " + size);
    }
}
