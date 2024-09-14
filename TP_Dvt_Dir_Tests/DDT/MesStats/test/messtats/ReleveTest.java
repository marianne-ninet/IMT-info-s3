
package messtats;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.CoreMatchers.is;

/** 
 * 
 * @author Valerie Anne Nicolas - <vnicolas@univ-brest.fr>
 *
 */
public class ReleveTest {

	private Releve instance1;
	private Releve instance2;

	@Rule
	  public ErrorCollector collector= new ErrorCollector();
	
	public ReleveTest() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() {
		instance1 = new Releve("janvier",14,3,20,60);
		instance2 = new Releve("mars",1,15,100,10); 
	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of getMois method, of class Releve.
	 */
	@Test
	public void testGetMois() {
		collector.checkThat("Test de getMois 1",instance1.getMois(),is("janvier"));
		collector.checkThat("Test de getMois 2",instance2.getMois(),is("mars"));
	}

	/**
	 * Test of getJour method, of class Releve.
	 */
	@Test
	public void testGetJour() {
		collector.checkThat("Test de getJour 1",instance1.getJour(),is(14));
		collector.checkThat("Test de getJour 2",instance2.getJour(),is(1));
	}

	/**
	 * Test of getTemp method, of class Releve.
	 */
	@Test
	public void testGetTemp() {
		collector.checkThat("Test de getTemp 1",instance1.getTemp(),is(3));
		collector.checkThat("Test de getTemp 2",instance2.getTemp(),is(15));
	}

	/**
	 * Test of getPluvio method, of class Releve.
	 */
	@Test
	public void testGetPluvio() {
		collector.checkThat("Test de getPluvio 1",instance1.getPluvio(),is(20));
		collector.checkThat("Test de getPluvio 2",instance2.getPluvio(),is(100));
	}

	/**
	 * Test of getVent method, of class Releve.
	 */
	@Test
	public void testGetVent() {
		collector.checkThat("Test de getVent 1",instance1.getVent(),is(60));
		collector.checkThat("Test de getVent 2",instance2.getVent(),is(10));
	}
}