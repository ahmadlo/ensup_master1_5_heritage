package presentation;

import metier.Compte;
import metier.CompteCourant;
import metier.CompteEpargne;
import metier.ComptePayant;

public class Lanceur {

	public static void main(String[] args) {
		Compte c = new Compte(1, 500);
		CompteCourant cc = new CompteCourant(2, 500, 200);
		CompteEpargne ce = new CompteEpargne(3, 300, 100);
		ComptePayant cp = new ComptePayant(3, 200, 500);
		
		//affichage apres retrait
		System.out.println("*********AVANT VERSEMENT*********");
		System.out.println(c);
		System.out.println(cc);
		System.out.println(ce);
		System.out.println(cp);
		
		//versement
		c.verser(100);
		cc.verser(100);
		ce.verser(100);
		cp.verser(100);
		
		//affichage apres versement
		System.out.println("*********APRES VERSEMENT*********");
		System.out.println(c);
		System.out.println(cc);
		System.out.println(ce);
		System.out.println(cp);
		
		//retrait
		c.retirer(300);
		cc.retirer(300);
		ce.retirer(300);
		cp.retirer(300);
		
		//affichage apres retrait
		System.out.println("*********APRES RETRAIT*********");
		System.out.println(c);
		System.out.println(cc);
		System.out.println(ce);
		System.out.println(cp);

	}

}
