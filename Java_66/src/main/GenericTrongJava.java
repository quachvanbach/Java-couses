package main;

public class GenericTrongJava {
	public static void main(String[] args) {
		Box box = new Box(15);
		System.out.println("Gia tri: " + box.getValue());

//		Box box1 = new Box("Muoi Lam"); => Error
//		Box box2 = new Box(15.5); => Error
//		Box box3 = new Box(true); => Error

		// GerericBox
		GenericBox genericBox = new GenericBox<Integer>(15);
		GenericBox genericBox1 = new GenericBox<String>("Muoi lam");
		GenericBox genericBox2 = new GenericBox<Double>(15.5);

		System.out.println("Gia tri: " + genericBox);
		System.out.println("Gia tri: " + genericBox1);
		System.out.println("Gia tri: " + genericBox2);
	}
}
