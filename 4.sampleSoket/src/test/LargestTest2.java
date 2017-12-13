package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import util.Largest;

public class LargestTest2 {
	@Test //Test 메서드는 무조건 public void 이고 매게변수 못줌
	public void test(){

		//int max =Largest.largest(new int[]{9,8,7});
		//System.out.println(max);
		assertEquals(9,Largest.largest(new int[]{9,8,7}));
	
	}
}
