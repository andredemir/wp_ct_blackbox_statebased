import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class StateTestTemplateHard {

/*	@Test
	void test() {
		SbHard3.start(); // (re-) starting the SbHard3
		SbHard3.getStateName(); // returns the name of the current state
		SbHard3.getStateEvents(); // returns a Set of all permitted events of the current state
		SbHard3.transition("a"); // transition the current state with the given event
		String stateName = SbHard3.getStateName();
		assertEquals("S4", stateName);
		fail("Not yet implemented");
	}*/

	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(SbHard3.evalCoverage(), "There are states or transitions left to cover!");

	}

	// Alles von s1 ---------------------------------------------

	/*//fertig
	@Test
	void test_s1_s2_c() {
		SbHard3.start();

		SbHard3.transition("c"); // S2

		String stateName = SbHard3.getStateName();
		assertEquals("S2", stateName);
	}

	//fertig
	@Test
	void test_s1_s2_e() {
		SbHard3.start();

		SbHard3.transition("e"); // S2

		String stateName = SbHard3.getStateName();
		assertEquals("S2", stateName);
	}

	//fertig
	@Test
	void test_s1_s4_a() {
		SbHard3.start();

		SbHard3.transition("a"); // S4

		String stateName = SbHard3.getStateName();
		assertEquals("S4", stateName);
	}*/

	// Alles von s2 ---------------------------------------------

	// André???
	/*@Test
	void test_s1_s2_s4_b() {
		SbHard3.start(); //S1
		SbHard3.transition("c"); // S2
		SbHard3.transition("b"); // S5
		String stateName = SbHard3.getStateName();
		assertEquals("S4", stateName);
	}*/

	// Alles von s4 ---------------------------------------------
	/*@Test
	void test_s1_s4_s3_b() {
		SbHard3.start();
		SbHard3.transition("a"); // S4
		SbHard3.transition("b"); // S3

		String stateName = SbHard3.getStateName();
 		assertEquals("S3", stateName);
	}*/

	// Alles von s3 ---------------------------------------------

	/*@Test
	void test_s1_s2c_s6_d() {
		SbHard3.start();

		SbHard3.transition("c"); // S2
		SbHard3.transition("d"); // S6

		String stateName = SbHard3.getStateName();
		assertEquals("S6", stateName);
	}*/


	@Test
	void test_s1_s2e_s6_d() {
		SbHard3.start();

		SbHard3.transition("e"); // S2
		SbHard3.transition("d"); // S6

		String stateName = SbHard3.getStateName();
		assertEquals("S6", stateName);
	}

	//fertig
	@Test
	void test_s1_s4_s3_s5_c() {
		SbHard3.start();

		SbHard3.transition("a"); // S4
		SbHard3.transition("b"); // S3
		SbHard3.transition("c"); // S5

		String stateName = SbHard3.getStateName();
		assertEquals("S5", stateName);
	}

	//fertig
	@Test
	void test_s1_s4_s6_s5_d() {
		SbHard3.start();

		SbHard3.transition("a"); // S4
		SbHard3.transition("c"); // S6
		SbHard3.transition("d"); // S5

		String stateName = SbHard3.getStateName();
		assertEquals("S5", stateName);
	}

	/*//fertig
	@Test
	void test_s1_s4_s6_s5_s3_d() {
		SbHard3.start();

		SbHard3.transition("a"); // S4
		SbHard3.transition("c"); // S6
		SbHard3.transition("d"); // S5
		SbHard3.transition("a"); // S3

		String stateName = SbHard3.getStateName();
		assertEquals("S3", stateName);
	}*/

	//---rechte Seite Baum ende
	//fertig
	@Test
	void test_s1_s4_s6_s5_s3_s5_c() {
		SbHard3.start();

		SbHard3.transition("a"); // S4
		SbHard3.transition("c"); // S6
		SbHard3.transition("d"); // S5
		SbHard3.transition("a"); // S3
		SbHard3.transition("c"); // S5

		String stateName = SbHard3.getStateName();
		assertEquals("S5", stateName);
	}

	/*
	@Test
	void test_s1_s2c_s4_s6_c() {
		SbHard3.start();

		SbHard3.transition("c"); // S2
		SbHard3.transition("b"); // S4
		SbHard3.transition("c"); // S6

		String stateName = SbHard3.getStateName();
		assertEquals("S6", stateName);
	}*/

/*	@Test
	void test_s1_s2e_s4_s6_c() {
		SbHard3.start();

		SbHard3.transition("e"); // S2
		SbHard3.transition("b"); // S4
		SbHard3.transition("c"); // S6

		String stateName = SbHard3.getStateName();
		assertEquals("S6", stateName);
	}*/

/*	@Test
	void test_s1_s4_s6_c() {
		SbHard3.start();

		SbHard3.transition("a"); // S4
		SbHard3.transition("c"); // S6

		String stateName = SbHard3.getStateName();
		assertEquals("S6", stateName);
	}*/

	/*@Test
	void test_s1_s2_s6_s5_d() {
		SbHard3.start();

		SbHard3.transition("c"); // S2
		SbHard3.transition("d"); // S6
		SbHard3.transition("d"); // S5

		String stateName = SbHard3.getStateName();
		assertEquals("S5", stateName);
	}*/
	/*@Test
	void test_s1_s2_s6_s5_s3_a() {
		SbHard3.start();

		SbHard3.transition("c"); // S2
		SbHard3.transition("d"); // S6
		SbHard3.transition("d"); // S5
		SbHard3.transition("a"); // S3

		String stateName = SbHard3.getStateName();
		assertEquals("S3", stateName);
	}*/
	/*@Test
	void test_s1_s2_s6_s5_s3_s5_c() {
		SbHard3.start();

		SbHard3.transition("c"); // S2
		SbHard3.transition("d"); // S6
		SbHard3.transition("d"); // S5
		SbHard3.transition("a"); // S3
		SbHard3.transition("c"); // S5

		String stateName = SbHard3.getStateName();
		assertEquals("S5", stateName);
	}*/


	// Alles mit Endpunkten --------------------------------------------- Carina 5 endpunkte

	@Test
	void test_s1_s4_s6_SF_a() {
		SbHard3.start();

		SbHard3.transition("a"); // S4
		SbHard3.transition("c"); // S6
		SbHard3.transition("a"); // SF

		String stateName = SbHard3.getStateName();
		assertEquals("Final", stateName);
	}

	@Test
	void test_s1_s2c_s6_SF_a() {
		SbHard3.start();

		SbHard3.transition("c"); // S2
		SbHard3.transition("d"); // S6
		SbHard3.transition("a"); // SF

		String stateName = SbHard3.getStateName();
		assertEquals("Final", stateName);
	}

	@Test
	void test_s1_s2e_s6_SF_a() {
		SbHard3.start();

		SbHard3.transition("e"); // S2
		SbHard3.transition("d"); // S6
		SbHard3.transition("a"); // SF

		String stateName = SbHard3.getStateName();
		assertEquals("Final", stateName);
	}

	@Test
	void test_s1_s2c_s4_s6_SF_a() {
		SbHard3.start();

		SbHard3.transition("c"); // S2
		SbHard3.transition("b"); // S4
		SbHard3.transition("c"); // S6
		SbHard3.transition("a"); // SF

		String stateName = SbHard3.getStateName();
		assertEquals("Final", stateName);
	}

	@Test
	void test_s1_s2e_s4_s6_SF_a() {
		SbHard3.start();

		SbHard3.transition("e"); // S2
		SbHard3.transition("b"); // S4
		SbHard3.transition("c"); // S6
		SbHard3.transition("a"); // SF

		String stateName = SbHard3.getStateName();
		assertEquals("Final", stateName);
	}

	//-----------------Alternative Lösung----------------------
	/*
	@Test
	void test01() {
		SbHard3.start();

		SbHard3.transition("a"); // S4
		SbHard3.transition("b"); // S6
		SbHard3.transition("c"); // SF
		SbHard3.transition("a"); // SF

		String stateName = SbHard3.getStateName();
		assertEquals("S3", stateName);
	}
	@Test
	void test02() {
		SbHard3.start();

		SbHard3.transition("c"); // S4
		SbHard3.transition("b"); // S6
		SbHard3.transition("c"); // SF
		SbHard3.transition("d"); // SF

		String stateName = SbHard3.getStateName();
		assertEquals("S5", stateName);
	}
	@Test
	void test03() {
		SbHard3.start();

		SbHard3.transition("e"); // S4
		SbHard3.transition("d"); // S6
		SbHard3.transition("a"); // SF

		String stateName = SbHard3.getStateName();
		assertEquals("Final", stateName);
	}
	*/
}