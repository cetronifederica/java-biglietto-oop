package biglietto.del.treno;

import java.util.Scanner;

public class BiglietteriaBonus {

	public static void main(String[] args) {

		// devo stampare una scelta per l'utente : inserire nuovo biglietto o terminare
		// il programma
		// se scegli di inserire biglietto chiedo i dati
		// altrimenti termino il programma
		Scanner scan = new Scanner(System.in);

		// Costruisco la struttura del menù
		int r;

		do {
			System.out.println("Fai la tua scelta tra queste due opzioni");
			// 1
			System.out.println("Per un Nuovo Biglietto digita 1");
			// 0
			System.out.println("Per chiudere il programma digita 0");
			r = scan.nextInt();

			// Effettuo la verifica per l'evento selezionato

			if (r == 0) {

				System.out.println("Programma terminato");
			} else if (r == 1) {

				System.out.println("Benvenuto");
				System.out.println("Inserisci la tua età: ");
				int etaPasseggero = scan.nextInt();
				System.out.println("Inserisci i chilometri che vuoi percorrere: ");

				double chilometriDaPerc = scan.nextDouble();

				Biglietto biglietto = new Biglietto(chilometriDaPerc, etaPasseggero);
				// stampa del prezzo del biglietto
				System.out.println("Il tuo biglietto costa: " + biglietto.prezzoBigliettoFormattato());

			}
		} while (r == 1);

		scan.close();
	}

}
