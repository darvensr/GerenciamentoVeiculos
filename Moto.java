public class Moto extends Veiculo {
    private int cilindrada;

    // Construtor da classe Moto
    public Moto(String marca, String modelo, int ano, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String informacoesVeiculo() {
        return "Moto - Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + getAno() + ", Cilindrada: " + cilindrada + "cc";
    }
}
