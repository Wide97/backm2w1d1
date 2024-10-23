package marcowidesott.backm2w1d1.models;

public class Tavolo {
    private int numero;
    private int maxCoperti;
    private String stato; // occupato o libero

    public Tavolo(int numero, int maxCoperti, String stato) {
        this.numero = numero;
        this.maxCoperti = maxCoperti;
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numero=" + numero +
                ", maxCoperti=" + maxCoperti +
                ", stato='" + stato + '\'' +
                '}';
    }
}