package aula6;

import java.util.ArrayList;

public class ex7 {
    public static void main(String[] args) {
        armazenamento(1);
        
    }
    public static void armazenamento(int i){
        ArrayList<String>nome = new ArrayList<>();
        nome.add("Pedro");
        nome.add("Sara");
        nome.add("Bruna");
        
        System.out.println(nome.get(i));
    }
}
