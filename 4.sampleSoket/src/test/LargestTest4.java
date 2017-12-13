package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import util.Largest;

public class LargestTest4 {
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before()");
	}
	@After
	public void tearDown() throws Exception {
		System.out.println(("@After()"));
	}

	@Test
	public void testSimple() {
		System.out.println("@test Simple()");
		assertEquals(9, Largest.largest(new int[] { 9, 8, 7 }));
	}
	@Test
	public void Order() {
		System.out.println("@test Simple()");
		assertEquals(9, Largest.largest(new int[] { 9, 8, 7 }));
		assertEquals(9, Largest.largest(new int[] { 8, 9, 7 }));
		assertEquals(9, Largest.largest(new int[] { 7, 8, 9 }));
	}
	@Test
	public void testDups() {
		System.out.println("@test Simple()");
		assertEquals(9, Largest.largest(new int[] { 9, 8, 7, 8 }));
		assertEquals(9, Largest.largest(new int[] { 8, 9, 7, 8, 7, 8, 9 }));
		assertEquals(9, Largest.largest(new int[] { 7, 8, 9, 4, }));
	}
	@Test
	public void testMin() {
		System.out.println("@test Simple()");
		assertEquals(-7, Largest.largest(new int[] { -9, -8, -7, -8 }));
		assertEquals(-7, Largest.largest(new int[] { -8, -9, -7, -8, -7, -8, -9 }));
		assertEquals(-7, Largest.largest(new int[] { -7, -8, -9, -7, }));

	}
	@Test
	public void testOne() {
		System.out.println("@test Simple()");
		assertEquals(-7, Largest.largest(new int[] { -7 }));
		assertEquals(9, Largest.largest(new int[] { 9 }));
		assertEquals(0, Largest.largest(new int[] { 0 }));
	}
	@Test
	public void testEmpty() {
		System.out.println("@test Empty()");
		try {
			Largest.largest(new int[] {});
			fail("should be thrown Exception");
		} catch (RuntimeException e) {
			assertTrue(true);
		}
	}

}
