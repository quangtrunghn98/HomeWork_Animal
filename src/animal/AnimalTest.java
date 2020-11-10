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
		
		System.out.println("so meo: " + tom.getPopulation());
		System.out.println("so cho: " + dan.getPopulation());
	
		System.out.println("_____________________");
		Animal tomBayby = tom.giveBirth();
		tomBayby.introduce();
		
		System.out.println("_____________________");
		tom =null;
		tom.getPopulation();
	}

}
