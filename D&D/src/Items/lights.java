package Items;

public class lights {
	private String name;
	private int value;
	private int weight;
	private int lightRadius;
	private int lightStrength;
	private int lightTime;
	
	//get rest of data values from database
	lights(String name){
		this.name = name;
	}
	
	//get or set name of the light object
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	//get or set value of object
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
	
	//get or set the weight of the light object
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	//get or set the range of the light that is given off by the object
	public int getlightRadius(){
		return lightRadius;
	}
	public void setLightRadius(int lightRadius){
		this.lightRadius = lightRadius;
	}
	
	//get or set the amount of light given off by the object
	public int getLightStrength(){
		return lightStrength;
	}
	public void setLightStrength(int lightStrength){
		this.lightStrength = lightStrength;
	}
	
	//get or change time that is left before the light burns out
	public int getLightTime(){
		return lightTime;
	}
	public void setLightTime(int lightTime){
		this.lightTime = lightTime;
	}
	public void modLightTime(int lightTime){
		this.lightTime = lightTime;
	}
}
