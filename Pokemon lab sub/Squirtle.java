import java.util.Random;
import java.util.Scanner; 
public class Squirtle extends Pokemon {

	//creation of Squirtle, via constructor
	public Squirtle() {			
	super(150, 16, "Squirtle", "Water", squirtleAttacks(), false);
	}
	//array for squirtles attacks
	public static String[] squirtleAttacks() {
		String[] attacks;
		attacks = new String[3];
		attacks[0] = "Tackle";
		attacks[1] = "Tail Whip";
		attacks[2] = "Water Gun";
		
		return attacks;
	}
	//Extremly long, deep apology, same as pikachu but for squirtle, so if you read the other class then this is the same
	@Override
	public void attack(Pokemon other, Boolean tf) {
		// TODO Auto-generated method stub
		
		//if statement that checks if this is the player or the computer
		if(this.tf == true) {
			System.out.println("Please select your attack.\n");
			System.out.println("[1] " + attacks[0] + " Attack Cost 1 PP");
			System.out.println("[2] " + attacks[1] + " Attack Cost 2 PP");
			System.out.println("[3] " + attacks[2] + " Attack Cost 4 PP");
			
			Scanner input = new Scanner(System.in); 
			int attackChoice = input.nextInt();
			
			//basically a direct copy of pikachu but for squirtle so if statements based on attacks selected
			//then win conditions if health drops below 1 and more if statement that check how effective the attacks were
			//based on the type of pokemon fighting, also the attacks have diffrent damage values compared to the other pokemon
			if(attackChoice == 1 && getPowerPoints() >= 1) {
				
				if(other.getType() == "Fire" || other.getType() == "Ground" || other.getType() == "Rock") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (16 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 32 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Ice") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (16 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 8 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 16);
					System.out.println(getName() + " used " +  attacks[1] + " it did 16 damage." + "\n");
				}
				if(other.getHealth() > 0) {
				
					setPowerPoints(getPowerPoints() - 1);
					System.out.println("You have " + getPowerPoints() + " Power Points left.");
					System.out.println(other.getName() + " has " +   other.getHealth() + " health left.\n");
				}
				else {
					System.out.println("Squirtle WINS!!!!");
					System.exit(0);
				}
			}
			
			else if(attackChoice == 2 && getPowerPoints() >= 2) {
				
				if(other.getType() == "Fire" || other.getType() == "Ground" || other.getType() == "Rock") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (20 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 40 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Ice") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (20 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 10 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 20);
					System.out.println(getName() + " used " +  attacks[1] + " it did 20 damage." + "\n");
				}
				
				if(other.getHealth() > 0) {
				setPowerPoints(getPowerPoints() - 2);
				System.out.println("You have " + getPowerPoints() + " Power Points left.");
				System.out.println(other.getName() + " has " +   other.getHealth() + " health left.\n");
				}
				else {
					System.out.println("Squirtle WINS!!!!");
					System.exit(0);
				}
			}
			
			else if (attackChoice == 3 && getPowerPoints() >= 4) {
				
				if(other.getType() == "Fire" || other.getType() == "Ground" || other.getType() == "Rock") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (24 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 48 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Ice") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (24 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 12 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 24);
					System.out.println(getName() + " used " +  attacks[1] + " it did 24 damage." + "\n");
				}
				
				
				if(other.getHealth() > 0) {
					setPowerPoints(getPowerPoints() - 4);
					System.out.println("You have " + getPowerPoints() + " Power Points left.");
					System.out.println(other.getName() + " has " +   other.getHealth() + " health left.\n");
				}
				else {
					System.out.println("Squirtle WINS!!!!");
					System.exit(0);
				}
			}
			else {
				System.out.println("You don't have enough PowerPoints to use this attack.");
				
			}
		}
		//SLIMED down attack options for PC
		//If the attacker is a computer
		//same as the pikachu computer attack stage, basically all the code from above is the same but 
		//I have added rng so the computer selects a random attack and less text is printed out so no prompt
		//for the player because this is supposed to be the AI going
		else {
			
			//rng to pick attack large if statement blocks are for each attack
			Random rand = new Random();
			int randomNum = rand.nextInt((3 - 1) + 1) + 1;
			
			if(randomNum  == 1 && getPowerPoints() >= 1) {
				
				if(other.getType() == "Fire" || other.getType() == "Ground" || other.getType() == "Rock") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (16 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 32 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Ice") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (16 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 8 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 16);
					System.out.println(getName() + " used " +  attacks[1] + " it did 16 damage." + "\n");
				}
				if(other.getHealth() > 0) {
				
					setPowerPoints(getPowerPoints() - 1);
					System.out.println("You have " + getPowerPoints() + " Power Points left.");
				}
				else {
					System.out.println("Squirtle WINS!!!!");
					System.exit(0);
				}
			}
			
			else if(randomNum  == 2 && getPowerPoints() >= 2) {
				
				if(other.getType() == "Fire" || other.getType() == "Ground" || other.getType() == "Rock") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (20 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 40 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Ice") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (20 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 10 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 20);
					System.out.println(getName() + " used " +  attacks[1] + " it did 20 damage." + "\n");
				}
				
				if(other.getHealth() > 0) {
				setPowerPoints(getPowerPoints() - 2);
				System.out.println("You have " + getPowerPoints() + " Power Points left.");
				}
				else {
					System.out.println("Squirtle WINS!!!!");
					System.exit(0);
				}
			}
			
			else if (randomNum  == 3 && getPowerPoints() >= 4) {

				if(other.getType() == "Fire" || other.getType() == "Ground" || other.getType() == "Rock") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (24 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 48 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Ice") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (24 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 12 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 24);
					System.out.println(getName() + " used " +  attacks[1] + " it did 24 damage." + "\n");
				}
				
				
				if(other.getHealth() > 0) {
					setPowerPoints(getPowerPoints() - 4);
					System.out.println("You have " + getPowerPoints() + " Power Points left.");
				}
				else {
					System.out.println("Squirtle WINS!!!!");
					System.exit(0);
				}
			}
			else {
				System.out.println("Enemy used an attack but didn't have enough PowerPoints to use this attack.");
				
			}
			
		}
		
	}
	
	//pokemon talking
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Squirtle, squirtle");
	}


}
