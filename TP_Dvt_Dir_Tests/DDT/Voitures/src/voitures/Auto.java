package voitures;

/** 
 * 
 * @author Valerie Anne Nicolas - <vnicolas@univ-brest.fr> - version initiale
 * @author Eric Cousin - eric.cousin@imt-atlantique.fr - adaptation
 *
 */
public class Auto {
	private String marque;
	private String modele;
	private float prix;
	private float consommation;
	private int kilometrage;
	private int nb_portes;
	private int nb_places;

	/**
	 * Création d'une nouvelle Auto
	 * @param vmarque la marque de l'Auto
	 * @param vmodele le modele de l'Auto
	 * @param vprix le prix de l'Auto
	 * @param vconsommation la consommation de l'Auto
	 * @param vkilometrage le kilometrage de l'Auto
	 * @param vnb_portes le nombre de portes de l'Auto
	 * @param vnb_places le nombre de places de l'Auto
	 */
	public Auto(String vmarque, String vmodele, 
			float vprix, float vconsommation, 
			int vkilometrage, int vnb_portes, int vnb_places) {	
		this.marque = vmarque;
		this.modele = vmodele;
		this.prix = vprix;
		this.consommation = vconsommation;
		this.kilometrage = vkilometrage;
		this.nb_portes = vnb_portes;
		this.nb_places = vnb_places;
	}

	/**
	 * 
	 * @return le modele de l'Auto
	 */
	public String getModele() {
		// TODO
		return this.modele;
	}

	/**
	 * 
	 * @return la marque de l'Auto
	 */
	public String getMarque() {
		// TODO
		return this.marque;
	}

	/**
	 * 
	 * @return le prix de l'Auto
	 */
	public float getPrix() {
		// TODO
		return this.prix;
	}

	/**
	 * 
	 * @return a consommation de l' Auto
	 */
	public float getConso() {
		// TODO
		return this.consommation;
	}
	
	/**
	 * 
	 * @return le kilometrage de l'Auto
	 */
	public int getKilometrage() {
		// TODO
		return this.kilometrage;
	}

	/**
	 * 
	 * @return le nombre de portes de l'Auto
	 */
	public int getNbPortes() {
		// TODO
		return this.nb_portes;
	}

	/**
	 * 
	 * @return le nombre de places de l'Auto
	 */
	public int getNbPlaces() {
		// TODO
		return this.nb_places;
	}
	
	public String toString() {
		String s="Auto [Marque : "+this.getMarque()
		+ " , Modele : "+this.getModele()
		+ " , Prix : "+this.getPrix()
		+ " , Consommation : "+this.getConso()
		+ " , Kilometrage : "+this.getKilometrage()
		+ " , Nombre de Portes : "+this.getNbPortes()
		+ " , Nombre de Places : "+this.getNbPlaces()
		+"]";
		return s;
	}
	
	
	public static void main (String[] args) {
		Auto a1, a2;
		a1 = new Auto("Renault", "Twizy", (float)6490, (float)4.5, 4700, 2, 2);
		a2 = new Auto("Peugeot", "3008", (float)14490, (float)7, 96416, 5, 6);
		System.out.println(a1);
		System.out.println(a2);
	}
}
