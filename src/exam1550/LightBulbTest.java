package exam1550;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightBulbTest {

	@Test
	public void test() {
		LightBulb b=new LightBulb(15,"CFL","white");
		
		String a=b.getBulbColor();
		assertEquals("white",a);
		
		String t=b.getBulbType();
		assertEquals("CFL",t);
		
		int w=b.getBulbWattage();
		assertEquals(15,w);
	
		
	}

}
