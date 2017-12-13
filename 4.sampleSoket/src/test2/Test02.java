package test2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test02 {
	List<Integer> list;
	
	@Before
	public void setup(){
		list = new ArrayList<>();
	}
	
	@After
	public void close(){
		list = null;
	}
	@Test(timeout=10)
	public void test() throws Exception{
		list.add(1);
		list.add(2);
	//	Thread.sleep(5000);
		list.add(3);
		System.out.println(list);
	}
	@Test(expected = java.lang.ArithmeticException.class)
	public void testex(){
		list.add(0);
		int result = 100/list.get(0);
		assertTrue(true);
	}

		
}
