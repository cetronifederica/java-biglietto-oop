package biglietto.del.treno;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// chiedo all'utente di dirmi età e chilometri da percorrere
		System.out.println("Inserisci la tua età: ");
		int etaPasseggero = scan.nextInt();
		System.out.println("Inserisci i chilometri che vuoi percorrere: ");
		double chilometriDaPerc = scan.nextDouble();

		Biglietto biglietto = new Biglietto(chilometriDaPerc, etaPasseggero);
		// stampa del prezzo del biglietto
		System.out.println("Il tuo biglietto costa: " + biglietto.prezzoBigliettoFormattato());
		scan.close();
	}

}
