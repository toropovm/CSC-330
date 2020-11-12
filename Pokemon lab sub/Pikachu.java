import java.util.Random;
import java.util.Scanner;

public class Pikachu extends Pokemon {

    //creation of pikachu, with stats and attacks arranged in a String array
	public Pikachu() {			
	super(130, 14, "Pikachu", "Electric", pikachuAttacks(), true);
	}
	
	//method to genearte all attacks for pikachu
	public static String[] pikachuAttacks() {
		String[] attacks;
		attacks = new String[3];
		attacks[0] = "Electricute";
		attacks[1] = "Shock";
		attacks[2] = "Thunderbolt";
		
		return attacks;
	}
	
	
	//extremely long method,sorry, it started off small but then ballooned as I added functionality
	@Override
	public void attack(Pokemon other, Boolean tf) {
		// TODO Auto-generated method stub	
		//if statement that checks if this is the player or the computer
		if(this.tf == true) {
			//prompt to select what attack you want to use
			System.out.println("Please select your attack.\n");
			System.out.println("[1] " + attacks[0] + " Attack Cost 1 PP");
			System.out.println("[2] " + attacks[1] + " Attack Cost 2 PP");
			System.out.println("[3] " + attacks[2] + " Attack Cost 5 PP");
			
			//scanner to recognize input
			Scanner input = new Scanner(System.in); 
			int attackChoice = input.nextInt();
			
			//if statement that runs if you have power points and selected the first attack
			if(attackChoice == 1 && getPowerPoints() >= 1) {
				//checks the effects the attack will have against various oponent types
				if(other.getType() == "Flying" || other.getType() == "Water") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (12 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 24 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Electric") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (12 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 6 damage." + "\n");
				}
				else if(other.getType() == "Ground") {
					System.out.println("No effect attack\n");
					other.setHealth(other.getHealth() - (12 * (0)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 0 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 12);
					System.out.println(getName() + " used " +  attacks[1] + " it did 12 damage." + "\n");
				}
				//checks if enemy pokemon is fainted
				if(other.getHealth() > 0) {
					setPowerPoints(getPowerPoints() - 1);
					System.out.println("You have " + getPowerPoints() + " Power Points left.");
					System.out.println(other.getName() + " has " +   other.getHealth() + " health left.\n");
				}
				else {
					System.out.println("PIKACHU WINS!!!!");
					System.exit(0);
				}
			}
			//if statement that runs if you selected attack 2
			else if(attackChoice == 2 && getPowerPoints() >= 2) {
				//checks the effects the attack will have against various oponent types
				if(other.getType() == "Flying" || other.getType() == "Water") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (18 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 36 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Electric") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (18 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 9 damage." + "\n");
				}
				else if(other.getType() == "Ground") {
					System.out.println("No effect attack\n");
					other.setHealth(other.getHealth() - (18 * (0)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 0 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 18);
					System.out.println(getName() + " used " +  attacks[1] + " it did 18 damage." + "\n");
				}
				//checks if enemy pokemon is fainted
				if(other.getHealth() > 0) {
					setPowerPoints(getPowerPoints() - 2);
					System.out.println("You have " + getPowerPoints() + " Power Points left.");
					System.out.println(other.getName() + " has " +   other.getHealth() + " health left.\n");
				}
				//win is printed if the health falls below 1
				else {
					System.out.println("PIKACHU WINS!!!!");
					System.exit(0);
				}
			}
			//if statement that runs if you selected attack 3
			else if (attackChoice == 3 && getPowerPoints() >= 4) {
				//checks the effects the attack will have against various oponent types
				if(other.getType() == "Flying" || other.getType() == "Water") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (30 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 60 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Electric") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (30 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 15 damage." + "\n");
				}
				else if(other.getType() == "Ground") {
					System.out.println("No effect attack\n");
					other.setHealth(other.getHealth() - (30 * (0)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 0 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 30);
					System.out.println(getName() + " used " +  attacks[1] + " it did 30 damage." + "\n");
				}
				//checks if enemy pokemon is fainted
				if(other.getHealth() > 0) {
					setPowerPoints(getPowerPoints() - 5);
					System.out.println("You have " + getPowerPoints() + " Power Points left.");
					System.out.println(other.getName() + " has " +   other.getHealth() + " health left.\n");
				}
				//win is printed if the health falls below 1
				else {
					System.out.println("PIKACHU WINS!!!!");
					System.exit(0);
				}
			}
			else {
				System.out.println("You don't have enough PowerPoints to use this attack.");
				
			}
		}
		else {
			//creation of rng so that AI can select a random attack
			Random rand = new Random();
			int randomNum = rand.nextInt((3 - 1) + 1) + 1;
			
			//if statement that runs if AI selected attack 1
			if(randomNum == 1 && getPowerPoints() >= 1) {
				//checks the effects the attack will have against various oponent types
				if(other.getType() == "Flying" || other.getType() == "Water") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (12 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 24 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Electric") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (12 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 6 damage." + "\n");
				}
				else if(other.getType() == "Ground") {
					System.out.println("No effect attack\n");
					other.setHealth(other.getHealth() - (12 * (0)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 0 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 12);
					System.out.println(getName() + " used " +  attacks[1] + " it did 12 damage." + "\n");
				}
				//checks if enemy pokemon is fainted
				if(other.getHealth() > 0) {
					setPowerPoints(getPowerPoints() - 1);
					System.out.println("You have " + getPowerPoints() + " Power Points left.");
					System.out.println(other.getName() + " has " +   other.getHealth() + " health left.\n");
				}
				//win is printed if the health falls below 1
				else {
					System.out.println("PIKACHU WINS!!!!");
					System.exit(0);
				}
			}
			//if statement that runs if AI selected attack 2
			else if(randomNum == 2 && getPowerPoints() >= 2) {
				//checks the effects the attack will have against various oponent types
				if(other.getType() == "Flying" || other.getType() == "Water") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (18 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 36 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Electric") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (18 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 9 damage." + "\n");
				}
				else if(other.getType() == "Ground") {
					System.out.println("No effect attack\n");
					other.setHealth(other.getHealth() - (18 * (0)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 0 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 18);
					System.out.println(getName() + " used " +  attacks[1] + " it did 18 damage." + "\n");
				}
				//checks if enemy pokemon is fainted
				if(other.getHealth() > 0) {
					setPowerPoints(getPowerPoints() - 2);
					System.out.println("You have " + getPowerPoints() + " Power Points left.");
					System.out.println(other.getName() + " has " +   other.getHealth() + " health left.\n");
				}
				//win is printed if the health falls below 1
				else {
					System.out.println("PIKACHU WINS!!!!");
					System.exit(0);
				}
			}
			//if statement that runs if AI selected attack 3
			else if (randomNum == 3 && getPowerPoints() >= 4) {
				//checks the effects the attack will have against various oponent types
				if(other.getType() == "Flying" || other.getType() == "Water") {
					System.out.println("Super effective attack\n");
					other.setHealth(other.getHealth() - (30 * 2) );
					System.out.println(getName() + " used " +  attacks[1] + " it did 60 damage." + "\n");
				}
				else if(other.getType() == "Grass" || other.getType() == "Electric") {
					System.out.println("Not effective attack\n");
					other.setHealth(other.getHealth() - (30 * (1/2)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 15 damage." + "\n");
				}
				else if(other.getType() == "Ground") {
					System.out.println("No effect attack\n");
					other.setHealth(other.getHealth() - (30 * (0)));
					System.out.println(getName() + " used " +  attacks[1] + " it did 0 damage." + "\n");
				}
				else {
					System.out.println("Regular attack\n");
					other.setHealth(other.getHealth() - 30);
					System.out.println(getName() + " used " +  attacks[1] + " it did 30 damage." + "\n");
				}
				//checks if enemy pokemon is fainted
				if(other.getHealth() > 0) {
					setPowerPoints(getPowerPoints() - 5);
					System.out.println("You have " + getPowerPoints() + " Power Points left.");
					System.out.println(other.getName() + " has " +   other.getHealth() + " health left.\n");
				}
				//win is printed if the health falls below 1
				else {
					System.out.println("PIKACHU WINS!!!!");
					System.exit(0);
				}
			}
			else {
				System.out.println("Enemy used an attack but didn't have enough PowerPoints to use this attack.");
				
			}
		}
	}
	//method for the pokemon to speak
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Pika, Pika");
	}


}
