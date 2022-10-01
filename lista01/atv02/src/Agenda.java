import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> contatos;

    public Agenda(ArrayList<Pessoa> contatos) {
        this.contatos = contatos;
    }

    public void imprime() {
        for (int i = 0; i < getContatos().size(); i++) {
            System.out.println(getContatos().get(i).getNome());
            System.out.println(getContatos().get(i).getEmail());
            System.out.println(getContatos().get(i).getEndereco());
            System.out.println(getContatos().get(i).getTelefone());
            System.out.println("\n");
        }
    }

    public ArrayList<Pessoa> getContatos() {
        return this.contatos;
    }
    public void setContatos(ArrayList<Pessoa> contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(Pessoa contato) {
        this.contatos.add(contato);
    }

    public void excluirContato(String nome) {
        for (int i = 0; i < getContatos().size(); i++) {
            String nomePessoa = getContatos().get(i).getNome();
            if (nomePessoa == nome) {
                getContatos().remove(i);
            }
        }
    }

    public void buscaContato(String nome) {
        for (int i = 0; i < getContatos().size(); i++) {
            String nomePessoa = getContatos().get(i).getNome();
            if (nomePessoa == nome) {
                System.out.println(getContatos().get(i).getNome());
                System.out.println(getContatos().get(i).getEmail());
                System.out.println(getContatos().get(i).getEndereco());
                System.out.println(getContatos().get(i).getTelefone());
            }
        }
    }
}
