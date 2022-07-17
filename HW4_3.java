import java.util.Scanner;

public class HW4_3 {

	public static void main(String[] args) {
		double dollarEx = 1, euroEx = 1, yenEx = 1, wonEx = 1, sum = 0, num = 0, result, cnt = 0;// 환율
		String resultEx, inLine, resultUnit = args[3], inputUnit = "";
		try { // try-catch문을 활용하여 args배열을 받음
			dollarEx = Double.parseDouble(args[0]);
			euroEx = Double.parseDouble(args[1]);
			yenEx = Double.parseDouble(args[2]);
			resultEx = args[3];
		} catch (Exception e) {
			System.out.println("타입 오류");
			return;
		}
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) { // 다음 줄(개행문자 기준)이 있는 지확인
			inLine = in.nextLine(); // in을 줄 기준으로 읽음
			Scanner line = new Scanner(inLine);
			while (line.hasNext()) { // 다음 토큰(개행문자 ,공백 문자 기준)이 있는지 확인
				try { // try-catch문을 이용하여 line을 scan함
					num = Integer.parseInt(line.next());
					inputUnit = line.next();

				} catch (Exception e) {
					line.next(); // 오류가 날시 line 읽지 않기에 무한루프에 빠지게 됨
					line.next(); // 옆 명령어를 통해 line을 소비하여 읽음
					System.out.println("입력 오류");
				}
				System.out.print(inLine + " -> ");
				switch (resultUnit) { // switch문을 이용하여 resultUnit case를 구분
				case "dollar":
					result = inputExchange(num, inputUnit, dollarEx, dollarEx, euroEx, yenEx / 100, wonEx);
					System.out.printf("%.3f dollar \n", result);
					sum += result;
					cnt++;
					break;
				case "euro":
					result = inputExchange(num, inputUnit, euroEx, dollarEx, euroEx, yenEx / 100, wonEx);
					System.out.printf("%.3f euro \n", result);
					sum += result;
					cnt++;
					break;
				case "yen":
					result = inputExchange(num, inputUnit, yenEx, dollarEx, euroEx, yenEx, wonEx);
					System.out.printf("%.3f yen \n", result);
					sum += result;
					cnt++;
					break;
				case "won":
					result = inputExchange(num, inputUnit, wonEx, dollarEx, euroEx, yenEx / 100, wonEx);
					System.out.printf("%.3f won \n", result);
					sum += result;
					cnt++;
					break;

				default:
					break;
				}

			}
		}
		System.out.printf("\n합계 : %.3f %s\n", sum, resultUnit);
		System.out.printf("평균 : %.3f %s\n", sum / cnt, resultUnit);
	}

	static double inputExchange(double num, String inputUnit, double exchangeUnit, double dollarEx, double euroEx,
			double yenEx, double wonEx) {
		double result = 0;
		switch (inputUnit) {
		case "dollar":
			result = dollarEx / exchangeUnit * num;
			break;
		case "euro":
			result = euroEx / exchangeUnit * num;
			break;
		case "yen":
			result = yenEx / exchangeUnit * num;
			break;
		case "won":
			result = wonEx / exchangeUnit * num;
			break;

		default:
			System.out.println("돈의 단위 오류");
			break;
		}
		return result;
	}

}
