package escola;


public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro Place", 22, 222456);
        Aluno aluno2 = new Aluno("Sara Silva", 19, 365987);
        Aluno aluno3 = new Aluno("Bruna Santos", 25, 124584);
        Disciplina disciplina = new Disciplina("POO", 101);
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
        disciplina.adicionarAluno(aluno3);
        disciplina.listarAlunos();
    }
}
