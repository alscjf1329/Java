import java.util.Scanner;

public class HW3_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line, token;
		int intNum, intCnt, intSum, i = 0, doubleCnt, intMALine = 0, intMACnt = 0, doubleMALine = 0, doubleMACnt = 0;
		double doubleSum = 0, doubleNum, intMAAver = Double.MIN_VALUE, doubleMAAver = Double.MIN_VALUE,
				intAver = Double.MIN_VALUE, doubleAver = Double.MIN_VALUE;

		while (in.hasNextLine()) {
			i++;
			System.out.print(i + ":");
			line = in.nextLine();
			Scanner inline = new Scanner(line);
			intCnt = 0;
			doubleCnt = 0;
			intSum = 0;
			doubleSum = 0;
			while (inline.hasNext()) {
				token = inline.next();
				try {
					intNum = Integer.parseInt(token);
					intCnt++;
					intSum += intNum;
				} catch (Exception e) {
					try {
						doubleCnt++;
						doubleNum = Float.parseFloat(token);
						doubleSum += doubleNum;
					} catch (Exception e2) {
						continue;
					}

				}

			}
			intAver = (double) intSum / intCnt;
			if (intMAAver < intAver) {
				intMAAver = intAver;
				intMALine = i;
				intMACnt = intCnt;
			}
			doubleAver = doubleSum / doubleCnt;
			if (doubleMAAver < doubleAver) {
				doubleMAAver = doubleAver;
				doubleMALine = i;
				doubleMACnt = doubleCnt;
			}
			System.out.printf(" 정수(%d개) %f", intCnt, intAver);
			if (doubleCnt > 0) {
				System.out.printf(", 실수(%d개) %f", doubleCnt, doubleAver);
			}
			System.out.println();

		}
		System.out.printf("\n정수 평균 최고 : %d번줄 %f (%d개)\n", intMALine, intMAAver, intMACnt);
		if (doubleMACnt > 0) {
			System.out.printf("실수 평균 최고 : %d번줄 %f (%d개)\n", doubleMALine, doubleMAAver, doubleMACnt);
		}

	}

}
