import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> contatos;

    public Agenda(ArrayList<Pessoa> contatos) {
        this.contatos = contatos;
    }

    public

    public ArrayList<Pessoa> getContatos() {
        return this.contatos;
    }
    public void setContatos(ArrayList<Pessoa> contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(ArrayList<Pessoa> contato) {
        setContatos(contato);
    }
}
