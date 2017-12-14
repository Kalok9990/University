
public class Jelly {
	public static final int BLUE_JELLY = 0;
	public static final int RED_JELLY = 1;
	
	public int health; // health of the Jelly (max health is 100).
	public String name;
	public int type;
	public int damage;
	
	public Jelly (int health, int type, String name){
		this.name = name;
		this.type = type;
		this.health = health;
	}
	
	public boolean isAlive(int health){
		if(this.health>0){
			return true;
		} else{
			System.out.println("Jelly is dead!");
			return false;
		}
	}	
	
	public void Attack(int a){
		
	}
	public void TakeDamage(int d){
		SetHealth(getHealth() - d);
		boolean isAlive;
	}
	
	public void SetHealth(int h){
		this.health = h;
	}
	
	public void SetName(String n){
		this.name = n;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		String s;
		if(this.type == BLUE_JELLY){
			s = "Blue";
		}else{
			s = "Red";
		}
		return "Name: " +s+ "jelly, Type: " +this.type+ " Health: " +this.health;
	}

}

class BlueJelly extends Jelly{
	public BlueJelly(String name, int health){
	super(BLUE_JELLY, health, name);
	name = "Blue Jelly";
	health = 10;
	}
}

class RedJelly extends Jelly{
	public RedJelly(String name, int health){
	super(RED_JELLY, health, name);
	name = "Red Jelly";
	health = 20;
	}
}

