import java.util.ArrayList;

public class Dictionary {

	private String name;
	private ArrayList<String> dictionnaire;
	
	protected Dictionary() {
		this.name="Example";
		this.dictionnaire= new ArrayList<String>();
		
	}
	
	protected String getName() {
		return name;
	}

	public ArrayList<String> getDictionnaire() {
		return dictionnaire;
	}

	public void setDictionnaire(ArrayList<String> dictionnaire) {
		this.dictionnaire = dictionnaire;
	}

	
	
}
