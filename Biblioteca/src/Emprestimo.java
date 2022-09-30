import java.time.LocalDate;
import java.util.ArrayList;

public class Emprestimo {

    private int codigoEmprestimo;
    private Usuario usuario;
    private ArrayList<Livro> livrosDoEmprestimo;
    private LocalDate dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(int codigoEmprestimo, Usuario usuario, ArrayList<Livro> livrosDoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
        this.usuario = usuario;
        this.livrosDoEmprestimo = livrosDoEmprestimo;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusDays(4).toString();

    }

    public void exibir() {
        System.out.printf("Codigo do empréstimo: %d \n", codigoEmprestimo);
        System.out.printf("Usuário: " + usuario + "\n");
        System.out.println("Livros: " + livrosDoEmprestimo + "\n");
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
    private void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    private Usuario getUsuario() {
        return usuario;
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
