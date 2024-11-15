package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", "1997");
        Autor autor1 = new Autor("J.K.Rowling", "Britanica");
        Autor autor2 = new Autor("Fernando Pessoa", "Portugues");
        livro.adicionarAutor(autor1);

        System.out.println("Titulo de Livro" + livro.getTituloLivro());
        livro.listarAutores();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar um novo autor ");
        System.out.println("Nome do autor: ");
        String nomeAutor = scanner.nextLine();
        System.out.println("Nacionalidade do autor: ");
        String nacionalidade = scanner.nextLine();
        Autor novoAutor = new Autor(nomeAutor, nacionalidade);
        livro.adicionarAutor(novoAutor);
        System.out.println("Lista atualizada de autores: ");
        livro.listarAutores();
        scanner.close();
    }
}
