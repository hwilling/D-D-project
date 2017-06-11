package character;

import java.util.ArrayList;
import Languages.language;

public class character {
	//character values
	private String name;
	private String playerName;
	private String chClass;
	private String deity;
	private String race;
	private String alignment;
	private String gender;
	private int age;
	private int xp;
	private int level;
	ArrayList<language> languages = new ArrayList<language>();
	private String background;
	private int size;
	private String eDest;
	private String pPath;
	//attributes
	private int str;
	private int strMod;
	private int cons;
	private int consMod;
	private int dex;
	private int dexMod;
	private int intl;
	private int intlMod;
	private int wis;
	private int wisMod;
	private int cha;
	private int chaMod;
	//defenses
	private int ac;
	private int fort;
	private int ref;
	private int will;
	//skills
	private int acro;
	private int athl;
	private int heal;
	private int dung;
	private int natr;
	private int relg;
	private int stlh;
	private int lkpk;
	private int acra;
	private int intm;
	private int bluf;
	private int dipl;
	//TODO create inventory object
	private String[] inventory;
	//HP
	private int hpMax;
	private int hpCur;
	private int hpPerlvl;
	private int hpInitial;
	private int surges;
	private int surgesPday;
	private int surgeVal;
	//TODO create objects for powers/feats
	private String[] feats;
	private String[] atWill;
	private String[] encounter;
	private String[] daily;
	private String[] utilities;
	
	//constructor
	character(String name){
		this.name = name;
	}
	
	public int getStr(){
		return str;
	}
	public void setStr(int str){
		this.str = str;
	}
	public void modStr(int str){
		this.str = str;
	}
}
