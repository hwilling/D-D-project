package Items;

import java.util.ArrayList;

public class weapon {

	private String name;
	private String kind;
	private String damageType;
	private String profType;
	private int profBonus;
	private int diceType;
	private int numDice;
	private float weight;
	private int value;
	private ArrayList<String> type = new ArrayList<String>();
	
	weapon(String name, String kind, String damageType, String profType, int profBonus, int diceType, int numDice, int weight, int value, ArrayList<String> type){
		this.name = name;
		this.kind = kind;
		this.damageType = damageType;
		this.profType = profType;
		this.profBonus = profBonus;
		this.diceType = diceType;
		this.numDice = numDice;
		this.weight = weight;
		this.value = value;
		this.type = type;
	}
	
	//get or set name
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	//get or set kind
	public String getKind(){
		return kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
	
	//damage type
	public String getDamageType(){
		return damageType;
	}
	public void setDamageType(String damageType){
		this.damageType = damageType;
	}
	
	//prof type
	public String getProfType(){
		return profType;
	}
	public void setProfType(String profType){
		this.profType = profType;
	}
	
	//prof bonuses
	public int getProfBonus(){
		return profBonus;
	}
	public void setProfBonus(int profBonus){
		this.profBonus = profBonus;
	}
	
	//dice type
	public int getdiceType(){
		return diceType;
	}
	public void setDiceType(int diceType){
		this.diceType = diceType;
	}
	
	//dice num
	public int getNumDice(){
		return numDice;
	}
	public void setNumDice(int diceNum){
		this.numDice = diceNum;
	}
	
	//weapon weight
	public float getWeight(){
		return weight;
	}
	public void setWeight(float weight){
		this.weight = weight;
	}
	
	//weapon value
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
	
	//type of weapon
	public int getNumTypes(){
		return type.size();
	}
	public String getType(int indexNum){
		return type.get(indexNum);
	}
	public void addType(String toAdd){
		type.add(toAdd);
	}
	public void removeType(int toRemove){
		type.remove(toRemove);
	}
	
}
