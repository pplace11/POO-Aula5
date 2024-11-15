package escola;

import java.util.ArrayList;

public class Disciplina {
    private String nomeDisciplina;
    private int codigoDisciplina;
    private ArrayList<Aluno>alunos;
    public Disciplina(String nomeDisciplina, int codigoDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.alunos = new ArrayList<Aluno>();
    }
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void listarAlunos(){
        System.out.println("Alunos inscritos na disciplina " + nomeDisciplina + ":");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }
    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}