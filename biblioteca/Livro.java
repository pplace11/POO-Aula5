package biblioteca;

import java.util.ArrayList;

public class Livro {
    private String tituloLivro;
    private String isbn;
    private ArrayList<Autor>autores;
    public Livro(String tituloLivro, String isbn){
        this.tituloLivro = tituloLivro;
        this.isbn = isbn;
        this.autores = new ArrayList<Autor>();
    }
    public void adicionarAutor(Autor autor){
        autores.add(autor);
    }
    public void listarAutores(){
        System.out.println("Autores do livro " + tituloLivro + ":");
        for(Autor autor : autores){
            System.out.println(autor.getNomeAutor());
        }
    }
    public String getTituloLivro() {
        return tituloLivro;
    }
    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public ArrayList<Autor> getAutores() {
        return autores;
    }
    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
}
