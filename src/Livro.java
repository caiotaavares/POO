import java.lang.reflect.Array;

public class Livro {

    private int codigoLivro;
    private String nome;
    private String editora;
    private Boolean estaEmprestado;

    public Livro(int codigoLivro, String nome, String editora, Boolean estaEmprestado) {
        this.codigoLivro = codigoLivro;
        this.nome = nome;
        this.editora = editora;
        this.estaEmprestado = estaEmprestado;
    }

    public void exibir() {
        System.out.println(codigoLivro);
        System.out.println(nome);
        System.out.println(editora);
        System.out.println(estaEmprestado);
    }

    // CODIGO LIVRO
    public void setId(int CodigoLivro) {
        this.codigoLivro = CodigoLivro;
    }
    public int getId() {
        return codigoLivro;
    }

    // NOME
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    // EDITORA
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return editora;
    }

    // ESTAEMPRESTADO
    public void setEstaEmprestado() {
        this.estaEmprestado = true;
    }
    public void unsetEstaEmprestado() {
        this.estaEmprestado = false;
    }
    public Boolean getEstaEmprestado() {
        return estaEmprestado;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.codigoLivro);
        sb.append(this.nome);
        sb.append(this.editora);
        sb.append(this.estaEmprestado);
        return sb.toString();
    }
}
