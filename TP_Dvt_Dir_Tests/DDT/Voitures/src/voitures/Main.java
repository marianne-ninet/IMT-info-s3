package voitures;

/** 
 * 
 * @author Valerie Anne Nicolas - <vnicolas@univ-brest.fr>
 * @author Eric Cousin - eric.cousin@imt-atlantique.fr - adaptation
 *
 */
public class Main {

	public static void main(String[] args) { 
		Garage garage ;
		Auto une_auto;
		
	    garage = new Garage(10);
	    une_auto = new Auto("Renault", "Twizy", (float)6490, (float)4.5, 4700, 2, 2);
	    garage.ajouter(une_auto);
	    une_auto = new Auto("Jeep", "Compass", (float)11990, (float)8, 94000, 3, 5);
	    garage.ajouter(une_auto);
	    une_auto = new Auto("Opel", "Insignia", (float)16490, (float)6.5, 69800, 5, 5);
	    garage.ajouter(une_auto);
	    une_auto = new Auto("Opel", "Mokka", (float)18990, (float)6, 24450, 3, 5);
	    garage.ajouter(une_auto);
	    une_auto = new Auto("Peugeot", "3008", (float)14490, (float)7, 96416, 5, 6);
	    garage.ajouter(une_auto);
	   
	    System.out.println(garage.toString());
	    System.out.println("-----------------------------");
	    for(int c=1;c<11;c++) {
	    	action(garage, c); 
	    }
	    System.out.println("-----------------------------");
	    System.out.println("Fin du programme");
	}	
	
	private static void action(Garage g, int choix)
	{
		int res;
		float res2;
		boolean res3;

		switch (choix) {
		case 1: res=g.nbDeVoituresDeLaMarque("Renault"); System.out.println("nbDeVoituresDeLaMarque : "+res); break; 
		case 2: res=g.nbDeVoituresDuModele("3008"); System.out.println("nbDeVoituresDuModele : "+res); break; 
		case 3: res=g.nbDeVoitures(); System.out.println("nbDeVoitures : "+res); break; 
		case 4: res3=g.estVide(); System.out.println("estVide : "+res3); break; 
		case 5: res=g.voitureLaPlusEconome(); System.out.println("voitureLaPlusEconome : "+res); break; 
		case 6: res=g.voitureLaPlusChere(); System.out.println("voitureLaPlusChere : "+res); break; 
		case 7: res2=g.ecartDePrix(); System.out.println("ecartDePrix : "+res2); break; 
		case 8: res=g.kilometrageMoyen(); System.out.println("kilometrageMoyen : "+res); break; 
		case 9: res=g.familialeEconomique(); System.out.println("familialeEconomique : "+res); break; 
		case 10: res=g.voiturePortesKm(3,10000); System.out.println("voiturePortesKm : "+res); break;
		default: System.out.println("Erreur, commande inconnue");             
		}


	}
	
}
