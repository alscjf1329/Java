import java.util.Scanner;

public class HW2_2 {

	public static void main(String[] args) {
		int temp, first, second, third;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("세 정수 입력 : ");
			if (!in.hasNext()) {
				break;
			}
			first = in.nextInt();
			second = in.nextInt();
			third = in.nextInt();
			if (first > second) {
				temp = first;
				first = second;
				second = temp;
			}
			if (third < first) {
				temp = first;
				first = third;
				third = second;
				second = temp;
			} else if (third < second) {
				temp = second;
				second = third;
				third = temp;
			}
			if (first < second) {
				if (second < third) {
					System.out.println("결과 : " + first + " <" + second + " <" + third);
				} else if (second == third) {
					System.out.println("결과 : " + first + " <" + second + " =" + third);
				} else {
					System.out.println("결과 : " + first + " <" + second + " >" + third);
				}
			} else if (first == second) {
				if (second < third) {
					System.out.println("결과 : " + first + " =" + second + " <" + third);
				} else if (second == third) {
					System.out.println("결과 : " + first + " =" + second + " =" + third);
				} else {
					System.out.println("결과 : " + first + " =" + second + " >" + third);
				}
			} else {
				if (second < third) {
					System.out.println("결과 : " + first + ">" + second + "<" + third);
				} else if (second == third) {
					System.out.println("결과 : " + first + ">" + second + "=" + third);
				} else {
					System.out.println("결과 : " + first + ">" + second + ">" + third);
				}
			}
		}
	}
}
