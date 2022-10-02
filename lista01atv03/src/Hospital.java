import java.util.ArrayList;

public class Hospital {
    private String nome;
    private String endereco;
    private ArrayList<Medico> medicosContratos;

    public Hospital(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.medicosContratos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", medicosContratos=" + medicosContratos +
                '}';
    }

    public void adicionaMedico(Medico medico) {
        getMedicosContratos().add(medico);
    }
    public void excluiMedico(String crm) {
        for (int i = 0; i < getMedicosContratos().size(); i++) {
            String MedicoCrm = getMedicosContratos().get(i).getCrm();
            if (MedicoCrm == crm) {
                getMedicosContratos().remove(i);
            }
        }
    }

    public void exibirMedicoAnoContratacao(int Ano) {
        for (int i = 0; i < getMedicosContratos().size(); i++) {
            int MedicoAno = getMedicosContratos().get(i).getDataContratacao().getYear();
            if (MedicoAno >= Ano) {
                System.out.println(getMedicosContratos().get(i));
            }
        }
    }

    public void imprime() {
        for (int i = 0; i < getMedicosContratos().size(); i++) {
            System.out.println(getMedicosContratos().get(i));
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Medico> getMedicosContratos() {
        return medicosContratos;
    }

    public void setMedicosContratos(ArrayList<Medico> medicosContratos) {
        this.medicosContratos = medicosContratos;
    }
}
