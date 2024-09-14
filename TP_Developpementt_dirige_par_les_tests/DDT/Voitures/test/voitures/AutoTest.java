package voitures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;

import voitures.Auto;
import static org.hamcrest.CoreMatchers.is;

public class AutoTest {

	private Auto voiture1;
	private Auto voiture2;


	@Rule
	  public ErrorCollector collector= new ErrorCollector();
	
	public AutoTest() {
	}

	@Before
	public void setUp() {
		voiture1 = new Auto("Porsche","911",12012, 20, 60000, 5, 5);
		voiture2 = new Auto("Audi","A1",1515, 10, 40000, 3, 5); 	}

	@After
	public void tearDown() {
	}
	
	/**
	 * Test of getMarque method, of class Auto.
	 */
	@Test
	public void testGetMarque() {
		collector.checkThat("Test de getMarque",voiture1.getMarque(),is("Porsche"));
	}
	
	/**
	 * Test of getModele method, of class Auto.
	 */
	@Test
	public void testGetModele() {
		collector.checkThat("Test de getModele",voiture1.getModele(),is("911"));
	}

	/**
	 * Test of getPrix method, of class Auto.
	 */
	@Test
	public void testGetPrix() {
		collector.checkThat("Test de getPrix",voiture1.getPrix(),is(12012));
	}

	/**
	 * Test of getConso method, of class Auto.
	 */
	@Test
	public void testGetConso() {
		fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test of getKilometrage method, of class Auto.
	 */
	@Test
	public void testGetKilometrage() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test of getNbPortes method, of class Auto.
	 */
	@Test
	public void testGetNbPortes() {
		fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test of getNbPlaces method, of class Auto.
	 */
	@Test
	public void testGetNbPlaces() {
		fail("Not yet implemented"); // TODO
	}
}