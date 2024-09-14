import java.util.Scanner;

public class TesterPattern {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String regex = "test"; // expression régulière à rechercher test
	  String chaine; // chaîne à traiter
	  do{	chaine=sc.nextLine();
		if (chaine.matches(regex)) System.out.println(chaine + "--> OK");
		else System.out.println(chaine + "--> PAS OK");
	  } while (sc.hasNext());
	}
}