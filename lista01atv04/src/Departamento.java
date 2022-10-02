import java.util.ArrayList;

public class Departamento {
    private String nome;
    private String telefone;
    private String email;
    private ArrayList<Professor> Professores;

    public Departamento(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.Professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        getProfessores().add(professor);
    }

    public void excluirProfessor(int matricula) {
        for (int i = 0; i < getProfessores().size(); i++) {
            int numMatricula = getProfessores().get(i).getMatricula();
            if (numMatricula == matricula) {
                getProfessores().remove(i);
            }
        }
    }

    public void buscaProfessor(int matricula) {
        for (int i = 0; i < getProfessores().size(); i++) {
            int numMatricula = getProfessores().get(i).getMatricula();
            if (numMatricula == matricula) {
                System.out.println(getProfessores().get(i));
            }
        }
    }

    public void imprime() {
        for (int i = 0; i < getProfessores().size(); i++) {
            System.out.println(getProfessores().get(i));
        }
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", Professores=" + Professores +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public ArrayList<Professor> getProfessores() {
        return Professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        Professores = professores;
    }
}
