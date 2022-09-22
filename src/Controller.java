
public class Controller {

    public static void main(String[] args) {
        Livro livro0 = new Livro(1, "O Hobbit", "Atenova", false);
        Livro livro1 = new Livro(1, "O senhor dos aneis: a irmandade do anel", "Atenova", false);
        Livro livro2 = new Livro(1, "O senhor dos aneis: as duas torres", "Atenova", false);

        Usuario aluno = new Aluno(
                1,
                "Caio Tavares",
                "47448898754",
                "caio@caio.com",
                "Ciência da Computação",
                2021
        );

        Usuario professor = new Professor(
                1,
                "Bruno",
                "23489765439",
                "buno@bruno.com",
                "Profissional em POO"
        );

        Emprestimo emprestimo = new Emprestimo(
            1,
                1,
                livro0
        );

        emprestimo.exibir();
    }
}
