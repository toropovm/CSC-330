//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; 
public class PokemonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation of my objects 
		Pokemon pikachu = new Pikachu();
		Pokemon squirtle = new Squirtle();
		
		Item HPpotion = new HealthPotion();
		Item PPpotion = new PowerPointRefill();
		
		
		
		System.out.println("Pokemon Battle Simulator!!!\n");

		//creation of the human and computer, can be changed if you want to swap items or pokemon , everything should work	
		Player Human = new HumanPlayer(pikachu, HPpotion, "Ash");
		Player Computer = new ComputerPlayer(squirtle, PPpotion);
		
		
		//print out what pokemon you selected and who you face
		
		System.out.println("You're being attacked by a Pokemon master controlling a " + Computer.getPokemon().getName() + "!" );
		System.out.println("Battle Begins, " + Human.getName() + " you control " +  Human.getPokemon().getName() + " get ready for a fight!\n");
		
		
		Scanner input = new Scanner(System.in);
		
		//Battle starts
		//loop that while a pokemon still has health attacks continue or one player has run away
		//System.out.println("Take an action"); redundent
		while(Human.getPokemon().getHealth() > 0 && Computer.getPokemon().getHealth() > 0) {
			
			//Player Turn, includes details on pokemons health and items when used
			System.out.println("Your Pokemons health is " + Human.getPokemon().getHealth() + "\n");
			Human.getPokemon().speak();
			System.out.println("Take an action\n" + "[1]Attack!\n" + "[2]Use Item!\n" + "[3]Flee the fight!");
			int choice = input.nextInt();
			//switch statement to select action
			switch(choice) {
			case 1:
				Human.getPokemon().attack(Computer.getPokemon(), true);
				break;
			case 2:
				Human.getItem().use(Human.getPokemon());
				break;
			case 3:
				Human.run();
				break;
			default:
				System.out.println("Invalid input!");
			}
			
			//STAGE 2 THE AI FIGHTS BACK
			System.out.println(Computer.getPokemon().getName() + " goes.\n");
			Random rand = new Random();
			int randomNum = rand.nextInt((3 - 1) + 1) + 1;
			switch(randomNum) {
			case 1:
				Computer.getPokemon().attack(Human.getPokemon(), false);
				break;
			case 2:
				Computer.getItem().use(Computer.getPokemon());
				break;
			case 3:
				Computer.run();
				break;
			default:
				System.out.println("Invalid input!");
			}
		}
	}

}
