package helperFuntions;

public class Search {
	
	private String message;
	
	public Search(String message){
		this.message = message.toLowerCase();
	}

	public String findWord(String word){
		
		return word;
	}
	
	public boolean wordExists(String word){
		if(message.indexOf(word) != -1)
			return true;
		else
			return false;
		
	}
}
