import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class Emprestimo {

    private int codigoEmprestimo;
    private int codigoUsuario;
    private ArrayList<Livro> livrosDoEmprestimo;
    private LocalDate dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(int codigoEmprestimo, int codigoUsuario, Livro livrosDoEmprestimo) {
        ArrayList<Livro> lista = new ArrayList<Livro>();

        this.codigoEmprestimo = codigoEmprestimo;
        this.codigoUsuario = codigoUsuario;
//        this.livrosDoEmprestimo = livrosDoEmprestimo;
        System.out.println(livrosDoEmprestimo);
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusDays(4).toString();
    }

    public void exibir() {
        System.out.println(codigoEmprestimo);
        System.out.println(codigoUsuario);
        System.out.println(livrosDoEmprestimo);
        System.out.println(dataEmprestimo);
        System.out.println(dataDevolucao);
    }

    // CODIGO EMPRESTIMO
    private void setCodigoEmprestimo(int codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }
    private int getCodigoEmprestimo() {
        return codigoEmprestimo;
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
