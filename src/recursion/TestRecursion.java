package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRecursion {

	@Test
	void test1() {
		assertEquals(RecursionProblems.countEight(8818), 4);
	}
	@Test
	void test2() {
		assertEquals(RecursionProblems.countEight(88188), 6);
	}
	@Test
	void test3() {
		assertEquals(RecursionProblems.countEight(8818000), 4);
	}
	@Test
	void test4() {
		assertEquals(RecursionProblems.countEight(19283568), 2);
	}
	
	void test5() {
		assertEquals(RecursionProblems.countEight(88188818881888), );
	}
}
