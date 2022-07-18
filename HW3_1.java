public class HW3_1 {

	public static void main(String[] args) {
		int A = 0, B = 0;
		String op = "";
		try {
			A = Integer.parseInt(args[0]);
			B = Integer.parseInt(args[2]);
			op = args[1];
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i]);
			}
			if (args.length > 3) {
				System.out.println(" = 입력 초과");
				return;
			}
		} catch (Exception e) {
			try {
				A = Integer.parseInt(args[0]);
				B = Integer.parseInt(args[1]);
				System.out.printf("%d %d = 연산자 없음", A, B);
				return;
			} catch (Exception e2) {
				for (int i = 0; i < args.length; i++) {
					System.out.print(args[i]);
				}
				System.out.println(" = 인자 부족");
				return;
			}
		}
		if (op == "/") {
			System.out.printf(" = %.3f\n", Double.parseDouble(calculation(A, B, op)));
		} else {
			System.out.println(" = " + calculation(A, B, op));
		}
	}

	static boolean isInteger(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	static String calculation(int A, int B, String op) {
		double result = 0;
		switch (op) {
		case "+":
			result = A + B;
			break;
		case "-":
			result = A - B;
			break;
		case "/":
			if (B == 0) {
				return "분모가 0인 오류";
			}
			result = (double) A / B;
			return "" + result;
		case "x":
		case "X":
			result = A * B;
			break;
		case "%":
			if (B == 0) {
				return "분모가 0인 오류";
			}
			result = A % B;
			break;
		default:
			return "연산자 오류";
		}
		return "" + (int) result;
	}

}
