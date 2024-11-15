package escola;

public class Aluno {
    private String nome;
    private int idade;
    private int numeroMatricula;
    public Aluno(String nome, int idade, int numeroMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.numeroMatricula = numeroMatricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getnumeroMatricula() {
        return numeroMatricula;
    }
    public void setnumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}