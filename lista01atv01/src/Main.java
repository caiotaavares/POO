public class Main {
    public static void main(String[] args) {
        // CRIA O VEICULO
        System.out.println("CRIANDO VEICULO...");
        Veiculo veiculo = new Veiculo(
                "Subaru",
                "Fuji Heavy Industries",
                2009,
                2009,
                "azul",
                "NEZ-4180",
                1000,
                false
        );
        System.out.println("\nDADOS DO VEICULO");
        veiculo.exibirVeiculo();

        // REAJUSTE DO IPVA
        float reajuste = 0.2f;
        System.out.println("\nREAJUSTE DE "+reajuste+" NO IPVA...");
        veiculo.atualizarValorIpva(reajuste);

        // PAGAR O IPVA
        System.out.println("\nPAGANDO IPVA...");
        veiculo.pagarIpva();

        // VERIFICA O STATUS DO IPVA
        System.out.println("\nVERIFICANDO STATUS DO IPVA...");
        veiculo.verificaStatusIpva();

        // EXIBE DADOS DO VEICULO
        System.out.println("\nDADOS DO VEICULO");
        veiculo.exibirVeiculo();
    }
}