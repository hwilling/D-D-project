package board;

import java.util.ArrayList;
import character.character;

public class space {
	
	private int tileID;
	private ArrayList<character> charsInSpace = new ArrayList<character>();
	private String[] items;
	
	space(int tileID, ArrayList<character> charsInSpace, String[] items){
		this.tileID = tileID;
		this.charsInSpace = charsInSpace;
		this.items = items;
	}
	
	//get and set what tile to be used in the given boardspace
	public int getID(){
		return tileID;
	}
	public void setID(int tileID){
		this.tileID = tileID;
	}
	
	//get and set the characters in the selected space
	public int getNumChars(){
		return charsInSpace.size();
	}
	public character getChar(int charNum){
		return charsInSpace.get(charNum);
	}
	public void moveToSpace(int charNum, character charInfo){
		charsInSpace.add(charInfo);
	}
	public void moveFromSpace(int charNum){
		charsInSpace.remove(charNum);
	}
	
	//get and set items in current space
	
	
	//get and set terrain objects in current space
}
