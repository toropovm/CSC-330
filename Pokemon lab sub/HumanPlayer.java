
public class HumanPlayer extends Player{

	//name of the players character
	protected String name;
	
	//constructor
	public HumanPlayer(Pokemon pokemon, Item items, String name) {
		super(pokemon, items);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	//accessor methods
	public String getName() {
		return name;
	}

	@Override
	public Pokemon getPokemon() {
		// TODO Auto-generated method stub
		return this.pokemon;	
		 
	}

	@Override
	public Item getItem() {
		// TODO Auto-generated method stub
		return this.items;
		
	}
	
	//method to allow you to run away, but you are considered a coward
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " fled the battle!");
		System.out.println("You ran away, cowardly move " + this.name + ". GAME OVER!!!");
		System.exit(1);
	}

}
