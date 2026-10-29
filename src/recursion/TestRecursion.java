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
	@Test
	void test5() {
		assertEquals(RecursionProblems.countEight(8818881), 8);
	}
	@Test 
	void testCat1() {
		assertEquals(RecursionProblems.countCat("cattcowcat", null), 0);
	}
	@Test
	void testCat2() {
		assertEquals(RecursionProblems.countCat("cactcowccat", ""), 0);
	}
	@Test
	void testCat3() {
		assertEquals(RecursionProblems.countCat("catcowcat", " "), 0);
	}
	@Test
	void testCat4() {
		assertEquals(RecursionProblems.countCat("meowwoofmeow", null), 0);
	}
		@Test
	void testCat5() {
			assertEquals(RecursionProblems.countCat("catcowcat", "cat"), 2);
	}
		@Test
		void testNoRepeat1() {
			assertEquals(RecursionProblems.noRepeat("abbabbc"), "ababc");
		}
		@Test
		void testNoRepeat2() {
			assertEquals(RecursionProblems.noRepeat(""), "");
		}
		@Test
		void testNoRepeat3() {
			assertEquals(RecursionProblems.noRepeat(null), insert);//FIXMEEE
		}
		@Test
		void testNoRepeat4() {
			assertEquals(RecursionProblems.noRepeat("yzayzabcdyyyyy"), "yzayzabcdy");
		}
		@Test
		void testNoRepeat5() {
			assertEquals(RecursionProblems.noRepeat("yyyyyyyyy"), "y");
		}
}
