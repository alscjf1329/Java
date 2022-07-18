import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intCnt = 0, intNum = 0, sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, doubleNum = 0;
		while (in.hasNext()) {
			try {
				intNum = in.nextInt();
				intCnt++;
				sum += intNum;
				if (intNum > max)
					max = intNum;
				if (intNum < min)
					min = intNum;
			} catch (InputMismatchException e) {
				in.next();
				doubleNum++;
			}
		}
		System.out.println("총 입력 정수 : " + intCnt);
		System.out.println("총합 : " + sum + ", 평균 : " + ((double) sum / intCnt));
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
		System.out.println("실수의 개수: " + doubleNum);

	}

}
