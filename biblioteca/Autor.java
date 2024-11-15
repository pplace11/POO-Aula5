package biblioteca;

public class Autor {
    private String NomeAutor;
    private String Nacionalidade;
    public Autor(String NomeAutor, String Nacionalidade){
        this.NomeAutor = NomeAutor;
        this.Nacionalidade = Nacionalidade;
    }
    public String getNomeAutor(){
        return NomeAutor;
    }
    public void setNomeAutor(String NomeAutor){
        this.NomeAutor = NomeAutor;
    }
    public String getNacionalidade(){
        return Nacionalidade;
    }
    public void setNacionalidade(String Nacionalidade){
        this.Nacionalidade = Nacionalidade;
    }
}
