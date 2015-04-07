package rubrica;

import java.io.*;

public class Menu {
private void mostraMenu(){
		
		System.out.println("[ 1 ] Aggiungi voce");
		System.out.println("[ 2 ] Elimina Voce");
		System.out.println("[ 3 ] Visualizza rubrica");
		System.out.println("[ 4 ] Esci");
		
	}
	
	public int scelta(){
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int scelta;
		
		this.mostraMenu();
		
		try{
			String numeroLetto = tastiera.readLine();
			scelta = Integer.valueOf(numeroLetto).intValue();
		}
		catch(Exception e){
			scelta=0;
		}
		return scelta;
	}
	
	public int leggiIndice(){
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int indice;
		
		System.out.println("Inserisci l'indice da eliminare: ");
		try{
			String numeroLetto = tastiera.readLine();
			indice = Integer.valueOf(numeroLetto).intValue();
		}
		catch(Exception e){
			indice=-1;
		}
		return indice;
	}

}
