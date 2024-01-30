package launcher;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import model.Animal;
import model.Person;

public class Launch {

	public static void main(String[] args) {

		/// Play with removeIf and forEach
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
//		bunnies.add("floppy");
		bunnies.add("hoppy");
//		System.out.println(bunnies);
//		
		//Collections.sort(bunnies);
		bunnies.forEach(e ->System.out.println(e));
		System.out.println("------------------ after sort -------------");
		//bunnies.sort((b1,b2)->b1.compareTo(b2));
		bunnies.sort(String :: compareTo);
		bunnies.removeIf(b -> b.charAt(0)=='h');//supprimer le mot qui commence par 'h'
		
		bunnies.forEach(e ->System.out.println(e));
		
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, true));
		animals.add(new Animal("robit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		System.out.println("------------------------- checkTrait --------------------------------");
		//CheckTrait expression = a ->a.canSwim();
		Predicate<Animal> expression = a ->a.canSwim();
		Predicate<Animal> expression2 = Animal::canHop;
		//print(animals,Animal::canHop);
		print(animals,expression);
		System.out.println("------------- nagation ---------------------------");
		print(animals,expression2.negate());
		
		System.out.println("-------------------- Function permet de transformer un object en une autre----------------");
		
		transform(animals, a -> new Person(a.toString()));
		
		System.out.println("-------------------- Consumer ----------------");
		Consumer<String> c =System.out::println;
		lineBreak(c, """ 
				bonjour 
				je passe
				a la
				ligne	
				""");

	}
	
	//private static void print(List<Animal> animals, CheckTrait checker) {
		private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal animal : animals) {
			if(checker.test(animal))
				
				System.out.println(animal);
		}
	}
		//Transforme animal en personne
		private static void transform(List<Animal> animals,Function<Animal, Person> f) {
			List<Person> persons = new ArrayList<>();
			for(Animal a : animals) {
				persons.add(f.apply(a));
			}
			System.out.println(persons);
			
		}
		
		private static void lineBreak(Consumer<String> c,String s) {
			c.accept(s);
		}
	
}
