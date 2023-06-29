
public class Dog extends Animal {
	public Dog() {
		super("Dog");
	}

	@Override
	public void eat() {
		System.out.println("The dog is eating the bone...");
	}

	@Override
	public void makeSound() {
		System.out.println("Gau gau..");
	}
}
