package marcowidesott.backm2w1d1.models;

import marcowidesott.backm2w1d1.entities.MenuItem;

import java.time.LocalDateTime;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private Tavolo tavolo;
    private List<MenuItem> elementi;
    private String stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private double costoCoperto;

    public Ordine(int numeroOrdine, Tavolo tavolo, List<MenuItem> elementi, String stato, int numeroCoperti, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.elementi = elementi;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.costoCoperto = costoCoperto;
    }

    public double calcolaTotale() {
        double totale = numeroCoperti * costoCoperto;
        for (MenuItem item : elementi) {
            totale += item.getPrice();
        }
        return totale;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numeroOrdine=" + numeroOrdine +
                ", tavolo=" + tavolo +
                ", stato='" + stato + '\'' +
                ", numeroCoperti=" + numeroCoperti +
                ", oraAcquisizione=" + oraAcquisizione +
                ", totale=" + calcolaTotale() +
                '}';
    }
}
