
public class PhuongThucOverride {
	public static void main(String[] args) {
		System.out.println("Dog");
		Dog dog = new Dog();
		dog.eat();
		dog.makeSound();
		dog.sleep();

		System.out.println("---------");
		System.out.println("Cat");
		Cat cat = new Cat();
		cat.eat();
		cat.makeSound();
		cat.sleep();

		System.out.println("---------");
		System.out.println("Bird");
		Bird bird = new Bird();
		bird.eat();
		bird.makeSound();
		bird.sleep();
	}
}
