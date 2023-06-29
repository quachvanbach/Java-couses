
public class KiemTraVaXuLyloi { // Lỗi: The public type KiemTraVaXuLyloi must be defined in its own file
	public static void main(String[] args) {
		System.out.println("Xin chào");
		final int x = 10;
		x = 9; // Lỗi: The final local variable x cannot be assigned. It must be blank and not using a compound assignment
		System.out.println(x) // Lỗi: Syntax error, insert ";" to complete BlockStatements
		System.out.println(y); // Lỗi: y cannot be resolved to a variable
		
	}
}
