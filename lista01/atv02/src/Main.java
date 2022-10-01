import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa0 = new Pessoa("caio", "0909", "caio@caio.com", "caetano lopes");
        Pessoa pessoa1 = new Pessoa("Gabriel", "0909", "Gabriel@Gabriel.com", "caetano lopes");
        Pessoa pessoa2 = new Pessoa("Santana", "0909", "Santana@Santana.com", "caetano lopes");

        ArrayList<Pessoa> arrPessoa = new ArrayList<>();
        arrPessoa.add(pessoa0);
        arrPessoa.add(pessoa1);
        Agenda agenda = new Agenda(arrPessoa);

        // ADICIONAR CONTATOS
        agenda.adicionarContato(pessoa2);

        // EXCLUIR CONTATO
        agenda.excluirContato("caio");

        // BUSCA CONTATO
        System.out.println("\nCONTATO BUSCADO: ");
        agenda.buscaContato("Gabriel");
        System.out.println("\n");

        // MOSTRA AGENDA
        System.out.println("\nAGENDA COMPLETA: ");
        agenda.imprime();
    }
}