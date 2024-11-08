package aula6;

import java.util.ArrayList;

public class ex6 {
    public static void main(String[] args) {
        System.out.println(lista());
    }
    public static ArrayList<Integer> lista(){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Temos essa lista: " + list);
        list.remove(3);
        System.out.println("Essas sao: " + list + " sem a lista 3.");
    return list;
    }
}
