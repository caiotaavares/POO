import java.time.LocalDate;
import java.util.ArrayList;

public class Emprestimo {

    private int codigoEmprestimo;
    private int codigoUsuario;
    private ArrayList<Livro> livrosDoEmprestimo;
    private LocalDate dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(int codigoEmprestimo, int codigoUsuario, ArrayList<Livro> livrosDoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
        this.codigoUsuario = codigoUsuario;
        this.livrosDoEmprestimo = livrosDoEmprestimo;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusDays(4).toString();

    }

    public void exibir() {
        System.out.printf("Codigo do empréstimo: %d \n", codigoEmprestimo);
        System.out.printf("Código do usuário: %d \n", codigoUsuario);
        System.out.println(livrosDoEmprestimo);
        System.out.printf("Data do empréstimo: %s \n", dataEmprestimo);
        System.out.printf("Data de devolução: %s \n", dataDevolucao);
    }

    // CODIGO EMPRESTIMO
    private void setCodigoEmprestimo(int codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }
    private int getCodigoEmprestimo() {
        return this.codigoEmprestimo;
    }

    // CODIGO USUARIO
    private void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    private int getCodigoUsuario() {
        return codigoUsuario;
    }

    // LIVRO DO EMPRESTIMO
    private void setLivrosDoEmprestimo(ArrayList<Livro> livrosDoEmprestimo) {
        this.livrosDoEmprestimo = livrosDoEmprestimo;
    }
    private ArrayList<Livro> getLivrosDoEmprestimo() {
        return livrosDoEmprestimo;
    }

    // DATA EMPRESTIMO
    private void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = LocalDate.now();
    }
    private LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    // DATA DEVOLUÇÃO
    private void setDataDevolucao(LocalDate dataEmprestimo) {
        this.dataDevolucao = dataEmprestimo.plusDays(4).toString();
    }
}
