import java.time.LocalDate;
import java.time.Year;

public class Medico {
    private String crm;
    private String nome;
    private String especialidade;
    private String email;
    private LocalDate dataContratacao;
    private float salario;

    public Medico(String crm, String nome, String especialidade, String email, float salario) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.email = email;
        this.salario = salario;
        this.dataContratacao = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", email='" + email + '\'' +
                ", dataContratacao=" + dataContratacao +
                ", salario=" + salario +
                '}';
    }
//    public void imprime() {
//        for (int i = 0; i < getContatos().size(); i++) {
//            System.out.println(getContatos().get(i).getNome());
//            System.out.println(getContatos().get(i).getEmail());
//            System.out.println(getContatos().get(i).getEndereco());
//            System.out.println(getContatos().get(i).getTelefone());
//            System.out.println("\n");
//        }
//    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
