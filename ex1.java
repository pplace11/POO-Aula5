package aula6;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        soma3();
    }
    public static void soma3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Insira um segundo número: ");
        int numero2 = scanner.nextInt();
        int soma2 = numero1 + numero2;
        System.out.println("Númuro intero inserido: " + soma2);
    }
}
