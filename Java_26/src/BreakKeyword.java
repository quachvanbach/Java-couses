
public class BreakKeyword {
	public static void main(String[] args) {
		int out, in = 0;
		System.out.println("*****************************************");
		System.out.println("---------- Không sử dụng label ----------");
		for (out = 0; out < 10; out++) {
			for (in = 0; in < 20; in++) {
				if (in > 10)
					break;
			}
			System.out.println("Bên trong vòng lặp out: out = " + out + ", in = " + in);
		}
		System.out.println("Bên ngoài vòng lặp out: out = " + out + ", in = " + in);

		System.out.println("*****************************************");
		
		System.out.println("------------ Sử dụng label -------------");
		outer: for (out = 0; out < 10; out++) {
			for (in = 0; in < 20; in++) {
				if (in > 10)
					break outer;
			}
			System.out.println("Bên trong vòng lặp out: out = " + out + ", in = " + in);
		}
		System.out.println("Bên ngoài vòng lặp out: out = " + out + ", in = " + in);

		System.out.println("*****************************************");

	}
}
