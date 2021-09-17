import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public class DictionaryTest {
	
	Dictionary dict ;
	
	@BeforeAll public void initialize() {
		 dict = new Dictionary("Example");
		 dict.getTranslation("fly").add("mouche");
		 dict.getTranslation("fly").add("voler");

		 
	}
	
	@Test public void testDictionaryName() {
		 assertEquals(dict.getName(),"Example");
	 }
	
	@After public void clearTranslations() {
		dict.getTranslations().clear();
	}
	
	@Test public void testDictionaryEmptiness() {
		assertTrue(dict.getTranslations().isEmpty());
	}
	
	
	
	@Before public void verifyEmptiness() {
		if (dict.getTranslations().isEmpty()) {
			initialize();
		};
	}
	
	
	@Test public void testOneTranslation() {
		
		dict.addTranslation("contre", "against");
		assertEquals(dict.getTranslation("contre"), "against");
	}
	
	@AfterAll public void clearDictionary(){
		clearTranslations();
	}
	
	
	
	@Test public void testMultipleTranslations() {
		assertThat(dict.getTranslation("fly"),containsInAnyOrder("voler","mouche"));
	}
	
	
	
}
