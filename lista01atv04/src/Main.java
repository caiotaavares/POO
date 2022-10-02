public class Main {
    public static void main(String[] args) {
        Professor professor0 = new Professor(1, "Caio", "Cloud Professor", "189876524", "caio@caio.com", 123456d);
        Professor professor1 = new Professor(2, "Gabriel", "Cloud Professor", "189876524", "caio@caio.com", 123456d);
        Professor professor2 = new Professor(3, "Santana", "Cloud Professor", "189876524", "caio@caio.com", 123456d);
        Professor professor3 = new Professor(4, "Tavares", "Cloud Professor", "189876524", "caio@caio.com", 123456d);

        Departamento departamento = new Departamento("UNESP", "39916756", "unesp@unesp.br");

        // ADICIONAR PROFESSOR
        System.out.println("Adicionando professor...");
        departamento.adicionarProfessor(professor0);
        departamento.adicionarProfessor(professor1);
        departamento.adicionarProfessor(professor2);
        departamento.adicionarProfessor(professor3);

        // EXCLUIR PROFESSOR
        System.out.println("Excluindo professor...");
        departamento.excluirProfessor(4);

        // BUSCA PROFESSOR
        System.out.println("Busca profesor...");
        departamento.buscaProfessor(1);

        // MOSTRA TODOS
        System.out.println("Mostra todos os professores...");
        departamento.imprime();
    }
}