
public class Cat extends Animal {
	public Cat() {
		super("Cat");
	}

	@Override
	public void eat() {
		System.out.println("The cat is eating the fish...");
	}

	@Override
	public void makeSound() {
		System.out.println("Meow Meow...");
	}

}
