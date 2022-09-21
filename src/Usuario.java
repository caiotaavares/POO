public class Usuario {

    protected int codigoUsuario;
    protected String nome;
    protected String cpf;
    protected String email;

    public Usuario(int codigoUsuario, String nome, String cpf, String email) {
        this.codigoUsuario = codigoUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void exibirUsuario() {
        System.out.println(codigoUsuario);
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(email);
    }

    // CODIGO USUARIO
    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    // NOME
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    // CPF
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    // EMAIL
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
