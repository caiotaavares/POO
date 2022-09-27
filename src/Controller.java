import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {

    public static void main(String[] args) {

        // Livros do estoque
        Livro livro0 = new Livro(1, "O Hobbit", "Atenova", false);
        Livro livro1 = new Livro(1, "O senhor dos aneis: a irmandade do anel", "Atenova", false);
        Livro livro2 = new Livro(1, "O senhor dos aneis: as duas torres", "Atenova", false);

        // Usuários do tipo aluno
        Usuario aluno = new Aluno(
                1,
                "Caio Tavares",
                "47448898754",
                "caio@caio.com",
                "Ciência da Computação",
                2021
        );

        // Usuários do tipo professor
        Usuario professor = new Professor(
                2,
                "Bruno",
                "23489765439",
                "buno@bruno.com",
                "Profissional em POO"
        );

        // Livros que serão emprestados
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(livro0);
        livros.add(livro1);

        Emprestimo emprestimo = new Emprestimo(
            1,
                aluno,
                livros
        );

        emprestimo.exibir();
    }
}
