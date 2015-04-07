package rubrica;

import java.util.Vector;

public class Rubrica {
	private Vector elencoTelefonico;
	
	
	public Rubrica(){
		
		elencoTelefonico=new Vector(1,1);
		
	}
	
	public void aggiungiVoce(Voce v){
		elencoTelefonico.addElement(v);
	}
	
	public void eliminaVoce(int posizione){
		
		int Errore=0;
		
		try{
			elencoTelefonico.removeElementAt(posizione);
		}
		catch(Exception e){
			System.out.println("Errore nell'eliminazione");
			Errore=1;
		}
		if(Errore!=1) System.out.println("Eliminazione completata");
	}
	
	public void visualizzaRubrica(){
		Voce v;
		for(int i=0;i<elencoTelefonico.size();i++){
			v = (Voce) elencoTelefonico.elementAt(i);
			System.out.println("utente n."+i+"  "+v.toString());
		}
	}

}
