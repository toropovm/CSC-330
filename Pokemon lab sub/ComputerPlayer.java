
public class ComputerPlayer extends Player{

	protected String name;
	
	
	public ComputerPlayer(Pokemon pokemon, Item items) {
		super(pokemon, items);
		this.name = "Computer";
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
	//method to run away from battle for the pc
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " fled the battle!");
		System.exit(0);
	}


}
