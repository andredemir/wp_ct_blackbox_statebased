import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class StateTestTemplateSimple {

/*	*//*@Test
	void test() {
		SbSimple1.start(); // (re-) starting the SbSimple1
		SbSimple1.getStateName(); // returns the name of the current state
		SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
		SbSimple1.transition("b"); // transition the current state with the given event
		String stateName = SbSimple1.getStateName();
		assertEquals("S2", stateName);
	}*//*

	*/// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(SbSimple1.evalCoverage(), "There are states or transitions left to cover!");

	}

	//fertig
	//@Test
	//void test_s1_s2_b() {
	//	SbSimple1.start(); // (re-) starting the SbSimple1
	//	SbSimple1.transition("b"); // transition the current state with the given event
//
	//	String stateName = SbSimple1.getStateName();
	//	assertEquals("S2", stateName);
	//}

	//fertig
	//@Test
	//void test_s2_SF_a() {
	//	SbSimple1.start(); // (re-) starting the SbSimple1 // (re-) starting the SbSimple1
	//	SbSimple1.getStateName(); // returns the name of the current state
	//	SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
	//	SbSimple1.transition("b"); // transition the current state with the given event
	//	SbSimple1.transition("a"); // transition the current state with the given event
	//	String stateName = SbSimple1.getStateName();
	//	assertEquals("Final", stateName);
	//}


	//Fertig
	//@Test
	//void test_s2_s4_c() {
	//	SbSimple1.start();
//
	//	SbSimple1.transition("b"); // S2
	//	SbSimple1.transition("c"); // S4
//
	//	String stateName = SbSimple1.getStateName();
	//	assertEquals("S4", stateName);
	//}

	//fertig
/*	@Test
	void test_s2_s3_d() {
		SbSimple1.start(); // (re-) starting the SbSimple1
		SbSimple1.getStateName(); // returns the name of the current state
		SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
		SbSimple1.transition("b"); // transition the current state with the given event
		SbSimple1.transition("d"); // transition the current state with the given event
		String stateName = SbSimple1.getStateName();
		assertEquals("S3", stateName);
	}

	//fertig
	@Test
	void test_s3_s1_b() {
		SbSimple1.start(); // (re-) starting the SbSimple1
		SbSimple1.getStateName(); // returns the name of the current state
		SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
		SbSimple1.transition("b"); // transition the current state with the given event
		SbSimple1.transition("d"); // transition the current state with the given event
		SbSimple1.transition("b"); // transition the current state with the given event
		String stateName = SbSimple1.getStateName();
		assertEquals("S1", stateName);
	}

	// André fertig
	@Test
	void test_s3_s4_d() {
		SbSimple1.start(); // (re-) starting the SbSimple1
		SbSimple1.getStateName(); // returns the name of the current state
		SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
		SbSimple1.transition("b"); // transition the current state with the given event
		SbSimple1.transition("d"); // transition the current state with the given event
		SbSimple1.transition("d"); // transition the current state with the given event
		String stateName = SbSimple1.getStateName();
		assertEquals("S4", stateName);
	}
	// André fertig
	@Test
	void test_s3_s4_s2_b() {
		SbSimple1.start(); // (re-) starting the SbSimple1
		SbSimple1.getStateName(); // returns the name of the current state
		SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
		SbSimple1.transition("b"); // transition the current state with the given event
		SbSimple1.transition("d"); // transition the current state with the given event
		SbSimple1.transition("d"); // transition the current state with the given event
		SbSimple1.transition("b"); // transition the current state with the given event
		String stateName = SbSimple1.getStateName();
		assertEquals("S2", stateName);
	}
	//fertig
	@Test
	void test_s3_s4_SF_a() {
		SbSimple1.start(); // (re-) starting the SbSimple1
		SbSimple1.getStateName(); // returns the name of the current state
		SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
		SbSimple1.transition("b"); // S2
		SbSimple1.transition("d"); //
		SbSimple1.transition("d"); //
		SbSimple1.transition("a"); //
		String stateName = SbSimple1.getStateName();
		assertEquals("Final", stateName);
	}


	//-------------------------------------------- Meine carina
	//fertig
	@Test
	void test_s2_s4_s2_b() {
		SbSimple1.start(); // (re-) starting the SbSimple1
		SbSimple1.transition("b"); // S2
		SbSimple1.transition("c"); // S4
		SbSimple1.transition("b"); // S2

		String stateName = SbSimple1.getStateName();
		assertEquals("S2", stateName);
	}

	//fertig
	@Test
	void test_s4_SF_a() {
		SbSimple1.start(); // (re-) starting the SbSimple1
		SbSimple1.transition("b"); // S2
		SbSimple1.transition("c"); // S4
		SbSimple1.transition("a"); // SF

		String stateName = SbSimple1.getStateName();
		assertEquals("Final", stateName);
	}*/

	//------ Alternative Lösung -----

	@Test
	void test01() {
		SbSimple1.start(); // (re-) starting the SbSimple1
		SbSimple1.getStateName(); // returns the name of the current state
		SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
		SbSimple1.transition("b"); // transition the current state with the given event
		SbSimple1.transition("d"); // transition the current state with the given event
		SbSimple1.transition("b"); // transition the current state with the given event
		SbSimple1.transition("b"); // transition the current state with the given event
		SbSimple1.transition("a"); // transition the current state with the given event
		String stateName = SbSimple1.getStateName();
		assertEquals("Final", stateName);
	}
	@Test
	void test02() {
		SbSimple1.start(); // (re-) starting the SbSimple1
		SbSimple1.getStateName(); // returns the name of the current state
		SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
		SbSimple1.transition("b"); // transition the current state with the given event
		SbSimple1.transition("d"); // transition the current state with the given event
		SbSimple1.transition("d"); // transition the current state with the given event
		SbSimple1.transition("b"); // transition the current state with the given event
		SbSimple1.transition("c"); // transition the current state with the given event
		SbSimple1.transition("a"); // transition the current state with the given event
		String stateName = SbSimple1.getStateName();
		assertEquals("Final", stateName);
	}

}