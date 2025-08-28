package modelos;

import modelos.Carro;

public class ModeloCarro extends Carro {
    int ano1;
    int ano2;
    int ano3;

    public void setAnos(int ano1, int ano2, int ano3) {
        this.ano1 = ano1;
        this.ano2 = ano2;
        this.ano3 = ano3;
    }

    public double getAnoMenorPreco() {
        double menorPreco = calcularMenorPreco();
        if (menorPreco == precoAno1) {
            return ano1;
        }
        if (menorPreco == precoAno2) {
            return ano2;
        }
        else {
            return ano3;
        }
    }

    public double getAnoMaiorPreco() {
        double maiorPreco = calcularMaiorPreco();
        if (maiorPreco == precoAno1) {
            return ano1;
        }
        if (maiorPreco == precoAno2) {
            return ano2;
        }
        else {
            return ano3;
        }
    }

    @Override
    public void exibeInformacaoCarro() {
        super.exibeInformacaoCarro();
        System.out.println("O modelo de menor preço é do ano: " + getAnoMenorPreco() + " de preço R$" + calcularMenorPreco());
        System.out.println("O modelo de maior preço é do ano: " + getAnoMaiorPreco() + " de preço R$" + calcularMaiorPreco());
    }
}
