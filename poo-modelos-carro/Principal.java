import modelos.Carro;
import modelos.ModeloCarro;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro civic = new ModeloCarro();
        civic.setNomeModelo("Civic g8");
        civic.setAnos(2007, 2008, 2009);
        civic.setPrecos(34000, 45000, 35000);
        civic.exibeInformacaoCarro();
    }
}
