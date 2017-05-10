package exam1550;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightBulbTest {

	@Test
	public void test() {
		LightBulb b=new LightBulb(15,"CFL","white");
		LightBulb q=new LightBulb(16,"qwerty","red"); 
		
		String a=b.getBulbColor();
		assertEquals("white",a);
		
		String t=b.getBulbType();
		assertEquals("CFL",t);
		
		int w=b.getBulbWattage();
		assertEquals(15,w);
		
		String l=q.getBulbType();
		assertEquals("qwerty",l);
		
	
		
	}

}
