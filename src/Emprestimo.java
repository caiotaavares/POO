import java.util.Calendar;

public class Emprestimo {

    private int codigoEmprestimo;
    private int codigoUsuario;
    private Livro livrosDoEmprestimo;
    private Calendar dataEmprestimo;
    private Calendar dataDevolucao;

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
    private void setLivrosDoEmprestimo(Livro livrosDoEmprestimo) {
        this.livrosDoEmprestimo = livrosDoEmprestimo;
    }
    private Livro getLivrosDoEmprestimo() {
        return livrosDoEmprestimo;
    }

    // DATA EMPRESTIMO
    private void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    private Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    // DATA DEVOLUÇÃO
}
