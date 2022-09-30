import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pessoa pessoa1 = new Pessoa("caio", "0909", "caio@caio.com", "caetano lopes");
        Pessoa pessoa1 = new Pessoa("Gabriel", "0909", "Gabriel@Gabriel.com", "caetano lopes");
        Pessoa pessoa1 = new Pessoa("Santana", "0909", "Santana@Santana.com", "caetano lopes");

        ArrayList<Pessoa> arrPessoa = new ArrayList<Pessoa>();
        arrPessoa.add(pessoa1);

        Agenda agenda = new Agenda(arrPessoa);
    }
}