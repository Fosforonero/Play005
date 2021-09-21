package negozio;


/**
 * La classe Vendita si occupa esclusivamente di "utilizzare gli oggetti ed esegue l'azione di venderli
 *
 */
public class Vendita {

    private float totaleComplessivoVendite;

    /**
     * Per ogni esecuzione vengono ricevuti l'oggetto di tipo Prodotto e la qta venduta.
     * Per ciascuna transazione viene eseguito il metodo calcolaPrezzoDiVendita del Prodotto.
     *
     * @param prodotto
     * @param qta
     */
    public void esegui(Prodotto prodotto, int qta) {
        float valore = prodotto.calcolaPrezzoVendita(qta);
        this.totaleComplessivoVendite += valore;
        System.out.println("--- vendita di " + prodotto.getNome() + " qta = " + qta + " al p.unitario = "
                + prodotto.getPrezzoUnitario() + " con sconto = " + prodotto.getScontoPercentuale() + ". Euro = " + valore);
    }

    public float getTotaleComplessivoVendite() {
        return totaleComplessivoVendite;
    }
}
