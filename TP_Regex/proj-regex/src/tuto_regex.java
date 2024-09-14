
import java.util.regex.*;

public class tuto_regex {

	public static void main(String[] args) 
	{
		String entree = "Le bon chasseur sachant chasser sait chasser sans son chien"; // la chaîne à traiter
		Pattern p;
		Matcher m;
		String sortie;
		try {
		p = Pattern.compile ("[a-rt-z]*s[a-z]*"); //mots contenant un 's'
		m = p.matcher(entree);
		while (m.find())
		System.out.println(entree.substring(m.start(),m.end()));
		p = Pattern.compile("s");
		m = p.matcher(entree);
		sortie = m.replaceAll("ch");
		System.out.println(sortie);
		p = Pattern.compile("s+"); // une séquence d'un ou plusieurs 's'
		m = p.matcher(entree);
		sortie = m.replaceAll("ch");
		System.out.println(sortie);
		p = Pattern.compile("s+([a-z]+)");// une séquence de 's' pas en fin de mot
		m = p.matcher(entree);
		// remplacer la suite de s par ch, et garder le reste du mot sans y toucher.
		sortie = m.replaceAll("ch$1");
		System.out.println(sortie);
	}
	catch (PatternSyntaxException pse){};
	}
}