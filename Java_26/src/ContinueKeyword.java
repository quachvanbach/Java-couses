
public class ContinueKeyword {
	public static void main(String[] args) {
		int i, j;
		System.out.println("*****************************************");
		System.out.println("---------- Không sử dụng label ----------");
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= 5; j++) {
				if (i < 3)
					continue;
			}
			System.out.println("i = " + i + " và j =" + j);
		}
		System.out.println("*****************************************");

		System.out.println("------------ Sử dụng label -------------");
		label: for (i = 0; i < 5; i++) {
			for (j = 0; j <= 5; j++) {
				if (i < 3)
					continue label;
			}
			System.out.println("i = " + i + " và j =" + j);
		}
		System.out.println("-- Kết thúc --");
		System.out.println("*****************************************");
	}
}
