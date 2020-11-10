package animal;

public class Cow extends Animal {
	
	private static int population = 0;

	public Cow(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("tao ra bo");
		population++;
	}
	
	public int getPopulation() {
		return population;
	}

	@Override
	public void makeAsound() {
		
		System.out.println("bo bo");
	}

	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		return new Cow(getName()+ "'s baby");
	}
	
	public static void inSoLuong() {
		System.out.println("so luong bo: " + population);
	}
	
	public void finalize() {
	     population--;
	     System.out.println("1 con bo da chet, so luong con; " + population);     
	}
	
}
