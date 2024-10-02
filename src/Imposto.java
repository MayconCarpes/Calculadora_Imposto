public class Imposto {

    private double cost;
    private double frete;
    private double seguro;
    private double aliquotaIcms;
    private double aliquotaIss;

    public Imposto(double cost, double frete, double seguro, double aliquotaIcms, double aliquotaIss) {
        this.cost = cost;
        this.frete = frete;
        this.seguro = seguro;
        this.aliquotaIcms = aliquotaIcms;
        this.aliquotaIss = aliquotaIss;
    }

    public double calcularPrecoFinal() {


        double baseCalculoIpi = cost + frete + seguro;

        double ipi = baseCalculoIpi * 0.0015; // 0,15%

        double icms = (cost + ipi) * (aliquotaIcms / 100);

        double iss = cost * (aliquotaIss / 100);

        double precoFinal = cost + ipi + icms + iss;

        return precoFinal;
    }
}
