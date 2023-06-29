
public class HierarchicalInheritance {
	public static void main(String[] args) {

		System.out.println("Dog: ");
		Dog dog = new Dog();
		dog.eat();
		dog.bark();

		System.out.println("-------");
		System.out.println("Cat: ");
		Cat cat = new Cat();
		cat.eat();
		cat.meow();
		
		System.out.println("-------");
		System.out.println("Bird: ");
		Bird bird = new Bird();
		bird.eat();
		bird.fly();
	}
}

