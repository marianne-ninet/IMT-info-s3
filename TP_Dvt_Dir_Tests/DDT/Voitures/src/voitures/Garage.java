package voitures;

/** 
 * 
 * @author Valerie Anne Nicolas - <vnicolas@univ-brest.fr> - version initiale
 * @author Eric Cousin - eric.cousin@imt-atlantique.fr - adaptation
 *
 */
public class Garage {
	private Auto The_garage[];
	private int tailleMaxGarage;
	private int nombreAutos;

	public Garage(int taille_max_garage) {
		this.The_garage = new Auto[taille_max_garage];
		this.nombreAutos = 0;
		this.tailleMaxGarage = taille_max_garage;
	}

	public void ajouter(Auto a) {
		if (this.nombreAutos < this.tailleMaxGarage) {
			this.The_garage[this.nombreAutos] = a;
			this.nombreAutos++;
		}
		// else : on ne fait rien de spécial
	}

	public String toString() {
		String s="Garage[";	
		for(int i=0; i < this.nombreAutos; i++){
			s+="\n   Voiture numéro "+i+" :"+ this.The_garage[i].toString();
		}
		s+="]";
		return s;	
	}
	
	
	public static void main (String[] args) {
		Auto a1, a2;
		a1 = new Auto("Renault", "Twizy", (float)6490, (float)4.5, 4700, 2, 2);
		a2 = new Auto("Peugeot", "3008", (float)14490, (float)7, 96416, 5, 6);
		Garage g1, g2;
		g1 = new Garage(4);
		g1.ajouter(a1);
		g1.ajouter(a2);;
		g2=new Garage(30);
		System.out.println(g1);
		System.out.println(g2);
	}
	
	//-----------------------------------------------------------------
	
	/**
	 * 
	 * @param m marque de la voiture
	 * @return nombre de voitures de cette marque dans le garage
	 */
	public int nbDeVoituresDeLaMarque(String m) {
		return 0;
	}
	
	/**
	 * 
	 * @param m modele de la voiture
	 * @return le nombre de voitures de ce modele dans le garage
	 */
	public int nbDeVoituresDuModele(String m) {
		return 0;
	}

	/**
	 * 
	 * @return nombre de voitures dans le garage
	 */
	public int nbDeVoitures() {
		return 0;
	}
	
	/**
	 * 
	 * @return true si le garage est vide, false sinon
	 */
	public boolean estVide() {
		return true;
	}

	/**
	 * 
	 * @return l'indice de la voiture ayant la plus faible consommation dans le garage 
	 */
	public int voitureLaPlusEconome() {
		return 0;
	}

	/**
	 * 
	 * @return l'indice de la voiture la plus chère dans le garage
	 */
	public int voitureLaPlusChere() {
		return 0;
	}

	/**
	 * 
	 * @return la différence de prix entre la voiture la plus chère et la moins chère du garage
	 */
	public float ecartDePrix() {
		return 0;
	}

	/**
	 * 
	 * @return kilométrage moyen des voitures du garage
	 */
	public int kilometrageMoyen() {
		return 0;
	}

	/**
	 * 
	 * @return l'indice de la voiture ayant 5 portes et au moins 5 places  qui soit la moins chère du garage; -1 si une telle voiture n'est pas présente dans le garage
	 */
	public int familialeEconomique() {
		return 0;
	}

	/**
	 * 
	 * @param n nombre minimal de portes
	 * @param k nombre maximal de kilometres
	 * @return indice de la voiture la moins chère du garage respectant les critères n et k ; -1 si aucune ne convient
	 */
	public int voiturePortesKm(int n, int k) {
		return 0;
	}

}
