package animal;

public class Cat extends Animal {

	private static int population = 0;
	
	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("tao ra meo");
		population++;
		
	}

	public int getPopulation() {
		return population;
	}
	
	@Override
	public void makeAsound() {
		System.out.println("meo meo");
	}

	@Override
	public Animal giveBirth() {
		// TODO Auto-generated method stub
		
		return new Cat(getName() + "'s baby");
	}
	
	public static void inSoLuong() {
		System.out.println("so luong meo: " + population);
	}
	
	
	public void finalize() {
	     population--;
	     System.out.println("1 con meo da chet, so luong con: " + population);     
	}
	
}


