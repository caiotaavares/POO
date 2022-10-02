public class Professor {
    private int matricula;
    private String nome;
    private String titulacao;
    private String telefone;
    private String email;
    private Double salario;

    public Professor(int matricula, String nome, String titulacao, String telefone, String email, Double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.titulacao = titulacao;
        this.telefone = telefone;
        this.email = email;
        this.salario = salario;
    }

    public void imprime() {
        System.out.println(getMatricula());
        System.out.println(getTitulacao());
        System.out.println(getNome());
        System.out.println(getTelefone());
        System.out.println(getEmail());
        System.out.println(getSalario());
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", titulacao='" + titulacao + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
