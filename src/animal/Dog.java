package animal;

public class Dog extends Animal {

	private static int population = 0;
	
	public Dog(String name) {
		super(name);
		System.out.println("tao ra cho");
		population++;
	}

	
	public int getPopulation() {
		return population;
	}
	@Override
	public void makeAsound() {
		System.out.println("gau gau");
	}


	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return new Cow(getName() + "'s baby");
	}
}
