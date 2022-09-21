public class Aluno extends Usuario {

    public Aluno(int codigoUsuario, String nome, String cpf, String email, String curso, int ano) {
        super(codigoUsuario, nome, cpf, email);
        this.curso = curso;
        this.ano = ano;
    };
    protected String curso;
    protected int ano;

    // CURSO
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }

    // ANO
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }
}
