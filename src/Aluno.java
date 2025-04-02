public class Aluno {

    String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void exibirAluno() {
        System.out.println("Aluno:" + nome);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Luis");
        aluno.exibirAluno();
    }
}
