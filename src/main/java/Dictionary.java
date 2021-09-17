import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	private String name;
	private Map<String,String> translations;
	
	protected Dictionary(String nom) {
		this.name=nom;
		this.translations = new HashMap<String, String>();
		
	}
	
	protected Dictionary(String nom,HashMap<String,String> translations) {
		this.name=nom;
		this.translations = translations;
		
	}
	
	
	
	protected String getName() {
		return name;
	}


	public String getTranslation(String string) {
		
		return translations.get(string) ;
	}

	public void addTranslation(String string, String string2) {
		translations.put(string, string2);
	}

	public Map<String, String> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, String> translations) {
		this.translations = translations;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
