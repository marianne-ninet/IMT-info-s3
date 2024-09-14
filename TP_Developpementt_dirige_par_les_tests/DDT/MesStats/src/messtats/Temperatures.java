package messtats;

/** 
 * 
 * @author Valerie Anne Nicolas - <vnicolas@univ-brest.fr>
 *
 */
public class Temperatures extends TraitementData {
	private int constanteCanicule = 35;
	private int constanteGrandFroid = -5;

	@Override
	public void majMaximum(int m)
	{
		super.majMaximum(m);
		if (m>=constanteCanicule) System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!! Alerte canicule !");
	}

	@Override
	public void majMinimum(int m)
	{
		super.majMinimum(m);
		if (m<=constanteGrandFroid) System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!! Alerte grand froid !");
	}

	@Override
	public void afficher()
	{
		System.out.print("-----> Traitement Températures : ");
		super.afficher();
	}
}
