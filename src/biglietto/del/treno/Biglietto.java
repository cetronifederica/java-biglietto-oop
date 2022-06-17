package biglietto.del.treno;

import java.text.DecimalFormat;

public class Biglietto {

	// attributi

	private double chilometriDaPerc;
	private int etaPasseggero;
	private double prezzoAlKm;
	private DecimalFormat formatter = new DecimalFormat("#0.00€");

	// costruttori
	public Biglietto(double chilometriDaPerc, int etaPasseggero) {
		this.chilometriDaPerc = chilometriDaPerc;
		this.etaPasseggero = etaPasseggero;
		this.prezzoAlKm = 0.21;

	}

	public double getChilometriDaPerc(double chilometriDaPerc) {
		this.chilometriDaPerc = chilometriDaPerc;
		return chilometriDaPerc;
	}

	public int getEtaPasseggero(int etaPasseggero) {
		this.etaPasseggero = etaPasseggero;
		return etaPasseggero;
	}

	// metodi

	// prezzo biglietto intero
	public double prezzoBiglietto() {
		double prezzoBiglietto;
		prezzoBiglietto = prezzoAlKm * chilometriDaPerc;
		if (etaPasseggero < 18) {
			double scontoMinorenni = 0.2;
			double scontoMinorenniSulTot = prezzoBiglietto * scontoMinorenni;
			double prezzoFinaleMinorenni = prezzoBiglietto - scontoMinorenniSulTot;
			return prezzoFinaleMinorenni;

		} else if (etaPasseggero >= 65) {
			double scontoOver65 = 0.4;
			double scontoOver65SulTot = prezzoBiglietto * scontoOver65;
			double prezzoFinaleOver = prezzoBiglietto - scontoOver65SulTot;
			return prezzoFinaleOver;
		}

		return prezzoBiglietto;

	}

	public String prezzoBigliettoFormattato() {
		return formatter.format(prezzoBiglietto());

	}

}
