public class HW5_1 {

	public static void main(String[] args) {
		int num = 0;
		String temp;
		try {
			num = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("타입 오류");
			System.exit(1);
		}
		if (num == 2) {
			System.out.println("o-\r\n" + "-o");
		} else {
			for (int i = 0; i < num; i++) {
				temp = "";
				for (int j = 0; j < num; j++) {
					temp = drawX(i, j, temp, num);
				}
				System.out.println(temp);
			}
		}

	}

	static boolean isEven(int n) {
		if (n % 2 == 0)
			return true;
		else
			return false;
	}

	static String drawX(int i, int j, String temp, int num) {
		if ((j == num - i - 1) || (j == i)) {
			return temp + "o";
		} else {
			return temp + "-";
		}
	}

}
