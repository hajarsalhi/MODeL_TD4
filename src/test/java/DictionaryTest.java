import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class DictionaryTest {

	Dictionary dict = new Dictionary();
	
	@Test public void testDictionaryName() {
		 assertEquals(dict.getName(),"Example");
	 }
	
	@Test public void testDictionaryEmptiness() {
		assertTrue(dict.getDictionnaire().isEmpty());
	}
}
