import java.time.LocalDate;

public class Veiculo {

    private String nome;
    private String montadora;
    private int anoFabricacao;
    private int anoModelo;
    private String cor;
    private String placa;
    private int valorIpva;
    private Boolean ipvaPago;

    public Veiculo(String nome, String montadora, int anoFabricacao, int anoModelo, String cor, String placa, int valorIpva, Boolean ipvaPago) {
        this.nome = nome;
        this.montadora = montadora;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cor = cor;
        this.placa = placa;
        this.valorIpva = valorIpva;
        this.ipvaPago = ipvaPago;
    }

    public void exibirVeiculo() {
        System.out.println("Nome: " + nome);
        System.out.println("Montadora: "+montadora);
        System.out.println("Ano de fabricação: "+anoFabricacao);
        System.out.println("Ano de modelo: "+anoModelo);
        System.out.println("Cor: "+cor);
        System.out.println("Placa: "+placa);
        System.out.println("Valor do IPVA: "+valorIpva);
        System.out.println("Ipva Pago: "+ipvaPago);
    }

    private String getNome() {
        return this.nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getMontadora() {
        return this.montadora;
    }
    private void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    private int getAnoFabricacao() {
        return this.anoFabricacao;
    }
    private void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    private int getAnoModelo() {
        return this.anoModelo;
    }
    private void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    private String getcor() {
        return this.cor;
    }
    private void setcor(String cor) {
        this.cor = cor;
    }

    private String getplaca() {
        return this.placa;
    }
    private void setplaca(String placa) {
        this.placa = placa;
    }

    private int getvalorIpva() {
        return this.valorIpva;
    }
    private void setvalorIpva(int valorIpva) {
        this.valorIpva = valorIpva;
    }

    private Boolean getipvaPago() {
        return this.ipvaPago;
    }
    private void setipvaPago(Boolean ipvaPago) {
        this.ipvaPago = ipvaPago;
    }

    public void verificaStatusIpva() {
        System.out.println(getipvaPago());
    }

    public void pagarIpva() {
        setipvaPago(true);
    }

    public void atualizarValorIpva(float reajuste) {
        this.valorIpva = (int) (valorIpva + valorIpva * reajuste);
    }
}
