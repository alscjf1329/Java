import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW5_3 {

	public static void main(String[] args) throws FileNotFoundException {
		int charCnt[] = new int[60]; // Lower :26 | Upper :26 | Pair :6 | Blank :1 | Line :1
		String scannerLine;
		int lineCnt = 0;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			scannerLine = scanner.nextLine();
			for (int i = 0; i < scannerLine.length(); i++) {
				charCnt = charAssignment(charCnt, scannerLine.charAt(i));
			}
			lineCnt++;
		}
		charCnt[59] = lineCnt;
		printArr(charCnt);
	}

	static char charCase(char c) { // char case를 나눠줌 (대문자 :U | 소문자 :L | 나머지는 그대로)
		if ('A' <= c && c <= 'Z') {
			return 'U';
		} else if ('a' <= c && c <= 'z') {
			return 'L';
		}
		return c;
	}

	static int[] charAssignment(int[] charCnt, char c) { // switch문을 활용하여 char case를 보고
		switch (charCase(c)) { 										// charCnt array 원소를 알맞게 증가
		case 'U':														// 소문자 :charCnt[0~25] 
			charCnt[c - 'A' + 26]++;								// 대문자 :charCnt[26~51] 
			break;														// 나머지 :charCnt[51~59]
		case 'L':
			charCnt[c - 'a']++;
			break;
		case '(':
			charCnt[52]++;
			break;
		case ')':
			charCnt[53]++;
			break;
		case '{':
			charCnt[54]++;
			break;
		case '}':
			charCnt[55]++;
			break;
		case '[':
			charCnt[56]++;
			break;
		case ']':
			charCnt[57]++;
			break;
		case ' ':
			charCnt[58]++;
			break;

		default:
			break;
		}
		return charCnt;
	}

	static void printArr(int[] charCnt) { // charCnt array를 출력
		int numCnt = 0;
		for (int i = 0; i < charCnt.length; i++) {
			if (charCnt[i] != 0) {
				numCnt++;

				if (i <= 25) {
					System.out.printf("%c:%d\t", i + 'a', charCnt[i]);
				} else if (i <= 51) {
					System.out.printf("%c:%d\t", i + ('A' - 26), charCnt[i]);
				} else {
					switch (i) {
					case 52:
						System.out.printf("(:%d\t", charCnt[i]);
						break;
					case 53:
						System.out.printf("):%d\t", charCnt[i]);
						break;
					case 54:
						System.out.printf("{:%d\t", charCnt[i]);
						break;
					case 55:
						System.out.printf("}:%d\t", charCnt[i]);
						break;
					case 56:
						System.out.printf("[:%d\t", charCnt[i]);
						break;
					case 57:
						System.out.printf("]:%d\t", charCnt[i]);
						break;
					case 58:
						System.out.printf("공백:%d\t", charCnt[i]);
						break;
					case 59:
						System.out.printf("줄바꿈:%d\t", charCnt[i]);
						break;

					default:
						break;
					}
				}
				if (numCnt % 5 == 0 && numCnt != 0) {
					System.out.println();
				}
			}
		}

	}
}
