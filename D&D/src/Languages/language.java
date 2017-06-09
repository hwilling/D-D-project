package Languages;
import java.util.ArrayList;

public class language {

	//name of language
	private String name;
	//type of alphabet
	private String type;
	//common speakers of the language
	private ArrayList<String> commonSpeak = new ArrayList<String>();
	
	//language object
	language(String name, String type, ArrayList<String> commonSpeak){
		this.name = name;
		this.type = type;
		this.commonSpeak = commonSpeak;
	}
	
	//get and set name of the language
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	//modify alphabet type
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
	//modify common speakers of the language
	public int getCommonSpeakLength(){
		return commonSpeak.size();
	}
	public String getCommonSpeak(int indexNum){
		return commonSpeak.get(indexNum);
	}
	public void addCommonSpeak(String speaker){
		commonSpeak.add(speaker);
	}
	public void removeCommonSpeak(int location){
		commonSpeak.remove(location);
	}
}
