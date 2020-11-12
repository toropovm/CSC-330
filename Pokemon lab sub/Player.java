
public abstract class Player {

	   //variables uesd in play classes
	   protected Pokemon pokemon;
	   protected Item items;
	  
	  //constructor
	   public Player(Pokemon pokemon, Item items) {
	       this.pokemon = pokemon;
	       this.items = items;
	   }
	   
	   //accessor methods
	   public abstract Pokemon getPokemon();
	   public abstract Item getItem();
	   
	   //method that lets the user run away from battle
	   public abstract void run();
	   
	   //added to get the name of the player
	   public abstract String getName();
	   
	   
}
