import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Dictionary {

	private String name;
	private Map<String,ArrayList<String>> translations;
	
	protected Dictionary(String nom) {
		this.name=nom;
		this.translations = new HashMap <String,ArrayList<String> > ();
		
	}
	
	protected Dictionary(String nom,HashMap<String,ArrayList<String>> translations) {
		this.name=nom;
		this.translations = translations;
		
	}
	
	
	
	protected String getName() {
		return name;
	}


	public ArrayList<String> getTranslation(String string) {
		
		return translations.get(string) ;
	}

	public void addTranslation(String string, String string2) {
		translations.get(string).add(string2);
	}

	public Map<String, ArrayList<String>> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, ArrayList<String>> translations) {
		this.translations = translations;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addTranslation(String string, ArrayList<String> ensembleTrad) {
		translations.put(string, ensembleTrad);
	}

	
	
}
