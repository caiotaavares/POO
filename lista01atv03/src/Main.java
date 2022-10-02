import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Medico medico0 = new Medico("1234", "Caio", "Cirurgião", "caio@caio.com", 12345.67f);
        Medico medico1 = new Medico("5678", "Gabriel", "Pediatria", "Gabriel@Gabriel.com", 12345.67f);
        Medico medico2 = new Medico("9101112", "Santana", "Cardíaco", "Santana@Santana.com", 12345.67f);

        Hospital hospital = new Hospital("Santa Casa", "Rua das rosas 198");

        // ADICIONA MEDICO
        hospital.adicionaMedico(medico0);
        hospital.adicionaMedico(medico1);
        hospital.adicionaMedico(medico2);

        // EXLCUI MEDICO
        System.out.println("excluindo medico...");
        hospital.excluiMedico("1234");

        // EXIBE MEDICO ANO
        System.out.println("Exibindo medico ano...");
        hospital.exibirMedicoAnoContratacao(2022);

        // IMPRIME TODOS OS MEDICOS
        System.out.println("Imprime todos...");
        hospital.imprime();
    }
}