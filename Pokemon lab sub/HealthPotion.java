//the Health Potion item to restore 30 health for the pokemon
public class HealthPotion implements Item{

	private int count;
	
	//constructor
	public HealthPotion() {
		count = 2;
	}
	//method to get potion count
	public int getCount() {
		return count;
	}
	@Override
	//method to use health potion
	public void use(Pokemon p) {
		// TODO Auto-generated method stub
		//if you have health potions you gain 30 health
		if(count >= 1) {
			count--;
			p.setHealth(p.getHealth() + 30);
			System.out.println("Health Potion used, health increased by 30 to :  " + p.getHealth() + "\n You have " + count + " Health potions left!");
		}
		
		//if you dont have health potions then you get a message that none are left
		else {
			System.out.println("No potions left!!! You waster ");
		}
	}

}
