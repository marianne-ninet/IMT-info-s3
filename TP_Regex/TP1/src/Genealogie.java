import java.util.regex.*;
import java.io.* ;


public class Genealogie {
	public static void main (String[] args){
		String leFichier = "/Users/marianne/Documents/git/regex/TP1/src/FIPSIT211ModélisationValidation.csv";
		String uneLigne;
		String uneLigneTraitee;
		try {
			BufferedReader input = new BufferedReader (new FileReader (leFichier));
			
			while (input.ready()) {
				uneLigne = input.readLine();
				uneLigneTraitee = traiter(uneLigne);
				if (!uneLigneTraitee.equals(""))
						System.out.println(uneLigneTraitee);
			}
			input.close();
		}
		catch (FileNotFoundException ex) {
		      System.out.println("Fichier inexistant !!");
		    }
	    catch (IOException ex) {
		      System.out.println("Erreur de lecture du fichier !!");
		    }
	}
		
	public static String traiter(String ligne) {
	    Pattern p;
	    Matcher m;
	    StringBuilder sortie = new StringBuilder();
	    try {
	        // Expression régulière pour trouver les lignes où l'une des villes commence par "PLOU"
	        p = Pattern.compile("^[^;]*;[^;]*;[^;]*;[^;]*;(PLOUZ\\w*)", Pattern.CASE_INSENSITIVE);
	        m = p.matcher(ligne);

	        if (m.find()) {
	            sortie.append(ligne);
	        }
	    } catch (PatternSyntaxException pse) {
	        System.out.println("Erreur de syntaxe dans l'expression régulière !");
	    }
	    return sortie.toString();
	}
}