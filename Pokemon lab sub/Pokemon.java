
public abstract class Pokemon {
	
	//all variables used in each pokemons creation process
	protected int health;
	protected int powerPoints;
	protected String name;
	protected String type;
	protected String[] attacks;
	protected Boolean tf;
	
	
	//constructor
	public Pokemon(int health, int powerPoints, String name, String type, String[] attacks, Boolean tf)
	{
		this.health = health;
		this.powerPoints = powerPoints;
		this.name = name;
		this.type = type;
		this.attacks = attacks; 
		this.tf = tf;
	}
	
	public abstract void attack(Pokemon other, Boolean tf);
	
	public abstract void speak();

	
	
	//mutator methods	
	public void setHealth(int health) {
		this.health = health;
	}

	public void setPowerPoints(int powerPoints) {
		this.powerPoints = powerPoints;
	}
			
	public void setName(String name) {
		this.name = name;
	}
			
	public void setType(String type) {
		this.type = type;
	}
	
	
	public void setAttacks(String[] attacks) {
	this.attacks = attacks;
	}
	
	
	//accessor methods	
	public int getHealth() {
		return health;
	}

	public int getPowerPoints() {
		return powerPoints;
	}
		
	public String getName() {
		return name;
	}
		
	public String getType() {
		return type;
	}
		
	public String[] getAttacks() {
		return attacks;
	}		
	

}
