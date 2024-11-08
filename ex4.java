package aula6;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        retangulo();
    }
    public static void retangulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a altura do retangulo:");
        int altura = scanner.nextInt();
        System.out.println("Insira a largura do retangulo: ");
        int largura = scanner.nextInt();
        int area = altura*largura;
        System.out.println("A área de um retangulo é " + area);
    }
}
