package aula6;

import java.util.ArrayList;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        armazenar();
    }
    public static void armazenar(){
        ArrayList<Integer>numero = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
    int i = 1;
    while (i!=0){
        System.out.println("Diga um numero: ");
        int number = scanner.nextInt();
        if(number == 0){
            break;
        }
    }
    if(!numero.isEmpty()){
        int maiorNumero = numero.get(0);
        int menorNumero = numero.get(0);
        for(int num : numero){
            if(num>maiorNumero){
                maiorNumero = num;
            }
            if(num<menorNumero){
                menorNumero = num;
            }
        }
        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Menor numero: " + menorNumero);
    }else{
        System.out.println("A lista esta vazia.");
    }
    }
}
