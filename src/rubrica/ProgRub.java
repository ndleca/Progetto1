package rubrica;

import java.io.*;

public class ProgRub {

	public static void main(String[] args) throws IOException {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		Rubrica miaRubrica = new Rubrica();
		Menu mioMenu = new Menu();
		
		int scelta = mioMenu.scelta();
		
		while(scelta!=4){
			
			switch(scelta){
				
			case 1:
				Voce v = new Voce();
				System.out.print("Inserisci il nome: ");
				String nome = keyboard.readLine();
				System.out.print("Inserisci il numero: ");
				String numero = keyboard.readLine();
				
				v.setNome(nome);
				v.setNumeroTelefonico(numero);
				miaRubrica.aggiungiVoce(v);
				break;
				
			case 2:
				int posizione = mioMenu.leggiIndice();
				miaRubrica.eliminaVoce(posizione);
				break;
				
			case 3:
				miaRubrica.visualizzaRubrica();
				break;

			}
			
			scelta = mioMenu.scelta();

		}
		System.out.println("Programma terminato");

	}

}
