package animal;

public class AnimalTest {

	public static void main(String[] args) {


		Animal tom = new Cat("Tom");
		tom.makeAsound();
		tom.introduce();
		
		System.out.println("_____________________");
		
		Animal dan = new Dog("Dan");
		dan.introduce();
		System.out.println("_____________________");
		
		Animal tomBayby = tom.giveBirth();
		tomBayby.introduce();
		
		System.out.println("_____________________");
		
		Animal cat2 = new Cat("Tom");
		Animal cat3= new Cat("Tom");
		Animal cow1 = new Cow("cow");
		
		System.out.println("_____________________");
		
		Animal.inSoLuong();
		Cat.inSoLuong();
		Dog.inSoLuong();
		Cow.inSoLuong();
		
		System.out.println("_____________________");
		
		cat2 = null;
		cat3 = null;
		System.gc();
		
	
	}

}
