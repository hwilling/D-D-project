package Items;

public class armor {
	//values for an armor object
	private String name;
	private String kind;
	int weight;
	private int defVal;
	private int penalty;
	private int value;
	private String type;
	
	//constructor
	armor(String name, String kind, int weight, int defVal, int penalty, int value, String type){
		this.name = name;
		this.kind = kind;
		this.weight = weight;
		this.defVal = defVal;
		this.penalty = penalty;
		this.value = value;
		this.type = type;
	}
	
	//getter and setters for values
	//special name of armor
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	// kind of armor
	public String getKind(){
		return kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
	//weight of armor
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	//defense value
	public int getDefVal(){
		return defVal;
	}
	public void setDefVal(int defVal){
		this.defVal = defVal;
	}
	//armor movement penalty
	public int getPenalty(){
		return penalty;
	}
	public void setPenalty(int penalty){
		this.penalty = penalty;
	}
	//value
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
	//type of armor(light, heavy, etc.) 
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
}
