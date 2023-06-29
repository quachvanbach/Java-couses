
public class Bird extends Animal {

	public Bird() {
		super("Bird");
	}

	@Override
	public void eat() {
System.out.println("The bird is eating the worm..");
	}

	@Override
	public void makeSound() {
		System.out.println("Birds are chirping..");
	}
}
