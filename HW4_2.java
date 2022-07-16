
public class HW4_2 {

	public static void main(String[] args) {
		int won50000Cnt = 0, won10000Cnt = 0, won5000Cnt = 0, won1000Cnt = 0, won500Cnt = 0, won100Cnt = 0,
				won50Cnt = 0, won10Cnt = 0, won5Cnt = 0, won1Cnt = 0;
		int money;
		try {
			money = Integer.parseInt(args[0]);
			System.out.print(money + "원은 ");
			if (args.length > 1) {
				System.out.println("Out of range!!");
				return;
			}
		} catch (Exception e) {
			System.out.println("It's not Integer!!");
			return;
		}
		won50000Cnt = money / 50000;
		money %= 50000;
		won10000Cnt = money / 10000;
		money %= 10000;
		won5000Cnt = money / 5000;
		money %= 5000;
		won1000Cnt = money / 1000;
		money %= 1000;
		won500Cnt = money / 500;
		money %= 500;
		won100Cnt = money / 100;
		money %= 100;
		won50Cnt = money / 50;
		money %= 50;
		won10Cnt = money / 10;
		money %= 10;
		won5Cnt = money / 5;
		money %= 5;
		won1Cnt = money / 1;
		money %= 1;
		if (won50000Cnt != 0) {
			System.out.printf("오만원 %d장", won50000Cnt);
			if (won10000Cnt != 0 || won5000Cnt != 0 || won1000Cnt != 0 || won500Cnt != 0 || won100Cnt != 0
					|| won50Cnt != 0 || won10Cnt != 0 || won5Cnt != 0 || won1Cnt != 0) {
				System.out.print("  ,  ");
			}
		}
		if (won10000Cnt != 0) {
			System.out.printf("만원 %d장", won10000Cnt);
			if (won5000Cnt != 0 || won1000Cnt != 0 || won500Cnt != 0 || won100Cnt != 0 || won50Cnt != 0 || won10Cnt != 0
					|| won5Cnt != 0 || won1Cnt != 0) {
				System.out.print(" , ");
			}
		}
		if (won5000Cnt != 0) {
			System.out.printf("오천원 %d장", won5000Cnt);
			if (won1000Cnt != 0 || won500Cnt != 0 || won100Cnt != 0 || won50Cnt != 0 || won10Cnt != 0 || won5Cnt != 0
					|| won1Cnt != 0) {
				System.out.print("  ,  ");
			}
		}
		if (won1000Cnt != 0) {
			System.out.printf("천원 %d장", won1000Cnt);
			if (won500Cnt != 0 || won100Cnt != 0 || won50Cnt != 0 || won10Cnt != 0 || won5Cnt != 0 || won1Cnt != 0) {
				System.out.print(" , ");
			}
		}
		if (won500Cnt != 0) {
			System.out.printf("오백원 동전 %d개", won500Cnt);
			if (won100Cnt != 0 || won50Cnt != 0 || won10Cnt != 0 || won5Cnt != 0 || won1Cnt != 0) {
				System.out.print(" , ");
			}
		}
		if (won100Cnt != 0) {
			System.out.printf("백원 동전 %d개", won100Cnt);
			if (won50Cnt != 0 || won10Cnt != 0 || won5Cnt != 0 || won1Cnt != 0) {
				System.out.print(" , ");
			}
		}
		if (won50Cnt != 0) {
			System.out.printf("오십원 동전 %d개", won50Cnt);
			if (won10Cnt != 0 || won5Cnt != 0 || won1Cnt != 0) {
				System.out.print(" , ");
			}
		}
		if (won10Cnt != 0) {
			System.out.printf("십원 동전 %d개", won10Cnt);
			if (won5Cnt != 0 || won1Cnt != 0) {
				System.out.print(" , ");
			}
		}
		if (won5Cnt != 0) {
			System.out.printf("오원 동전 %d개", won5Cnt);
			if (won1Cnt != 0) {
				System.out.print(" , ");
			}
		}
		if (won1Cnt != 0) {
			System.out.printf("일원 동전 %d개", won1Cnt);
		}
		System.out.println("이다");

	}

}
