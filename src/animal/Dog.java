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
	
	public static void inSoLuong() {
		System.out.println("so luong cho: " + population);
	}
	
	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return new Cow(getName() + "'s baby");
	}
	
	public void finalize() {
	     population--;
	     System.out.println("1 con cho da chet, so luong con; " + population);     
	}
}
