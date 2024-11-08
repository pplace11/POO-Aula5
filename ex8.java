package aula6;

import java.util.ArrayList;

public class ex8 {
    public static void main(String[] args) {
        city();
    }
    public static void city(){
        ArrayList<String>cidade = new ArrayList<>();
        cidade.add("Lisboa");
        cidade.add("Tokyo");
        cidade.add("Roma");
        System.out.println(cidade.contains("Tokyo"));
    }
}
