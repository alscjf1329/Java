import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HW4_1 {

	public static void main(String[] args) {
		int A = 0, B = 0;
		String op = "";
		try {
			args[0] = switchOp(args[0]);
			args[1] = switchOp(args[1]);
			args[2] = switchOp(args[2]);
			op = args[1];
			A = Integer.parseInt(args[0]);
			B = Integer.parseInt(args[2]);

			if (args.length > 3) {
				for (int i = 0; i < args.length; i++) {
					System.out.print(args[i]);
				}
				System.out.println(" = 입력 초과");
			}
		} catch (Exception e) {
			try {
				A = Integer.parseInt(args[0]);
				B = Integer.parseInt(args[1]);
				for (int i = 0; i < args.length; i++) {
					System.out.print(args[i] + " ");
				}
				System.out.println("= 연산자 없음");
				return;
			} catch (Exception e2) {
				for (int i = 0; i < args.length; i++) {
					System.out.print(args[i]);
				}
				System.out.println(" = 인자 부족");
				return;
			}
		}
		System.out.println(calculation(A, B, op));
	}

	static String switchOp(String op) {
		switch (op) {
		case "add":
			op = "+";
			break;
		case "minus":
			op = "-";
			break;
		case "multiply":
			op = "x";
			break;
		case "div":
			op = "/";
			break;
		case "mod":
			op = "%";
			break;

		default:
			break;
		}
		return op;
	}

	static String calculation(int A, int B, String op) {
		String result;
		switch (op) {
		case "+":
			result = "" + (A + B);
			break;
		case "-":
			result = "" + (A - B);
			break;
		case "x":
			result = "" + (A * B);
			break;
		case "/":

			if (B == 0) {
				result = "분모가 0인 오류";
			} else {
				result = "" + ((double) A / B);
			}
			break;
		case "%":
			if (B == 0) {
				result = "분모가 0인 오류";
			} else {
				result = "" + (A % B);
			}
			break;

		default:
			result = "연산자 오류";
			break;
		}
		System.out.printf("%d %s %d = ", A, op, B);
		return result;
	}
}
