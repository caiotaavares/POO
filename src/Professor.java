public class Professor extends Usuario {

    public Professor(int codigoUsuario, String nome, String cpf, String email, String titulacao) {
        super(codigoUsuario, nome, cpf, email);
        this.titulacao = titulacao;
    }
    protected String titulacao;

    // TITULACAO
    protected void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    protected String getTitulacao() {
        return titulacao;
    }
}
