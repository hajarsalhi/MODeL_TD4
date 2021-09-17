import static org.junit.Assert.*;
//import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DictionaryTest {
	
	Dictionary dict ;

	@Before public void initialize() {
		 dict = new Dictionary("Example");
	}
	
	@Test public void testDictionaryName() {
		 assertEquals(dict.getName(),"Example");
	 }
	
	
	@Before public void initializeMap() {
		dict = new Dictionary("Example", new HashMap<String,String>());
		//dict.addTranslation("flowers","fleurs");
		//dict.addTranslation("Empty", "vide");
	}
	@Test public void testDictionaryEmptiness() {
		assertTrue(dict.getTranslations().isEmpty());
	}
	
	@After public void clearTranslations() {
		dict.getTranslations().clear();
	}
	
	@Before public void verifyEmptiness() {
		if (dict.getTranslations().isEmpty()) {
			initializeMap();
		};
	}
	
	@Test public void testOneTranslation() {
		
		dict.addTranslation("contre", "against");
		assertEquals(dict.getTranslation("contre"), "against");
	}
	
	@After public void clearDictionary(){
		dict.setName(""); 
		clearTranslations();
		System.out.println(dict);
	}
	
}
