package code;

public class Infor {
	private int a; // => Chỉ sử dụng được trong class.
	int b; // Chỉ sử dụng được trong cùng package.
	protected int c; // Có thể sử dụng được trong cùng class, cùng package hoặc trong subclass.
	public int d; //Sử dụng được ở bất kỳ nơi nào trong project.
	
	public void method() {
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;
		
	}
}
