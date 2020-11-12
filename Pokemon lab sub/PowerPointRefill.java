//class to create power point refill that implements the Item interface
public class PowerPointRefill implements Item{
	
	private int count;
	
	//contructor
	public PowerPointRefill() {
		count = 2;
	}
	
	//method to get potion count
	public int getCount() {
		return count;
	}
	@Override
	//method to use  PP potion
	public void use(Pokemon p) {
		// TODO Auto-generated method stub
		//if you have a pp potion then you gain 10 pp
		if(count >= 1) {
			p.setPowerPoints(p.getPowerPoints() + 10);
			System.out.println("PP Potion used, Power Points increased to:  " + p.getPowerPoints() + "\nPP potions left " + count);
		}
		
		//if you dont have a pp potion you gain nothing
		else {
			System.out.println("No potions left!!!");
		}
	}
}
