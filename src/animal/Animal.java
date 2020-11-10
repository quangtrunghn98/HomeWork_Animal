package animal;

public abstract class Animal {

	private String name;
	private static int population = 0;
	
	public Animal() {
		population++;
	}
	
	public Animal(String name) {
		super();
		this.name = name;
		population++;
	}

	
	
	public int getPopulation() {
		return population;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void makeAsound();
	
	public void introduce() {
		makeAsound();
		System.out.println("Name is: " + name);
	}
	
	public abstract Animal giveBirth();
	
	public static void inSoLuong() {
		System.out.println("so luong con vat: " + population);
	}
	
	
    public void finalize() {
        population--;
        System.out.println("1 con vat da chet, so luong ca the la: " + population);
        
    }
	
}
