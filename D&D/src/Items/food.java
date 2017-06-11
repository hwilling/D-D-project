package Items;

public class food {
	
	private String name;
	private int value;
	private int weight;
	
	food(String name){
		this.name = name;
	}
	//name of food
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	//value of food
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
	//weight of food
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
}