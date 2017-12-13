package test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import util.Largest;

public class FileTest {

	@Before
	public void setUp() throws Exception {}

	@After
	public void tearDown() throws Exception {}
	
	@Test
	public void test() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("Testdata.txt"));
	
		String readLine =null;
		while((readLine=br.readLine()) != null){
			if(readLine.startsWith("#")||readLine.length() == 0){
				continue;
			}
			String[] data = readLine.split(",");
			int result = Integer.parseInt(data[0].trim());
			int[] param = new int[data.length-1];
			for(int i=0;i<param.length;i++){
				param[i] = Integer.parseInt(data[i+1].trim());
			}
			assertEquals(result , Largest.largest(param));
			
		}
	
	}

}
