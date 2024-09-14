package messtats;

/** 
 * 
 * @author Valerie Anne Nicolas - <vnicolas@univ-brest.fr>
 *
 */
public class Vents extends TraitementData {
	private int constanteTempete = 90;

	@Override
	public void majMaximum(int m)
	{
		super.majMaximum(m);
		if (m>=constanteTempete) System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!! Alerte tempête !");
	}

	@Override
	public void afficher()
	{
		System.out.print("-----> Traitement Vents : ");
		super.afficher();
	}
}
