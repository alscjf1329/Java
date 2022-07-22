import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HW6_2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		int lineCnt = lineCnt(args[0]);
		int korean[] = new int[lineCnt], english[] = new int[lineCnt],
				math[] = new int[lineCnt], schoolNum[] = new int[lineCnt];
		String line, studentName[] = new String[lineCnt];
		double average[] = new double[lineCnt];
		Scanner in =scannerFile(args[0]);
		for (int i = 0; i < lineCnt; i++) {
			line = in.nextLine();
			Scanner inLine = scanner(line);
			schoolNum[i] = inLine.nextInt();
			studentName[i] = inLine.next();
			korean[i] = inLine.nextInt();
			english[i] = inLine.nextInt();
			math[i] = inLine.nextInt();
			average[i] = threeNumsAver(korean[i], english[i], math[i]);
		}
		printStudentInfo(schoolNum, studentName, korean, english, math, average, lineCnt);

	}

	static Scanner scannerFile(String s) throws FileNotFoundException {
		Scanner r = new Scanner(new File(s));
		return r;
	}
	static Scanner scanner(String s) {
		Scanner r=new Scanner(s);
		return r;
	}

	static double threeNumsAver(int i, int j, int k) {
		return (double) (i + j + k) / 3;
	}

	static int lineCnt(String fileName) throws FileNotFoundException {
		int cnt = 0;
		Scanner in = new Scanner(new File(fileName));
		while (in.hasNext()) {
			in.nextLine();
			cnt++;
		}
		return cnt;
	}

	static void printStudentInfo(int[] schoolNum, String[] studentName, int[] korean, int[] english, int[] math,
			double[] average, int lineCnt) {
		System.out.printf("%-7s %-3s\t %-3s\t %-3s\t %-3s\t %-3s\n", "학번", "이름", "국어", "영어", "수학", "평균");
		for (int i = 0; i < lineCnt; i++) {
			System.out.printf("%-7d\t %-3s\t %-3d\t %-3d\t %-3d\t %.2f\n", schoolNum[i], studentName[i], korean[i],
					english[i], math[i], average[i]);
		}
		System.out.printf("과목 평균\t%.2f\t%.2f\t%.2f\n", arrAver(korean), arrAver(english), arrAver(math));
		printMaxAver(average, schoolNum, studentName);
		printMinAver(average, schoolNum, studentName);

	}

	static double arrAver(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

	static void printMaxAver(double[] arr, int[] schoolNum, String[] studentName) {
		int[] maxAver = maxValueIndex_arr(arr);
		System.out.printf("최고 평균 : ");
		for (int i = 0; i < maxAver.length; i++) {
			System.out.printf("%d (%s)", schoolNum[maxAver[i]], studentName[maxAver[i]]);
			if (i != maxAver.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	static double maxValue_arr(double[] arr) {
		double maxValue = Double.MIN_NORMAL;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	static int[] maxValueIndex_arr(double[] arr) {
		int r[] = new int[arr.length], index = 0;
		double maxValue = maxValue_arr(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == maxValue) {
				r[index] = i;
				index++;
			}
		}
		r = Arrays.copyOf(r, index);
		return r;
	}

	static void printMinAver(double[] arr, int[] schoolNum, String[] studentName) {
		int[] minAver = minValueIndex_arr(arr);
		System.out.printf("최저 평균 : ");
		for (int i = 0; i < minAver.length; i++) {
			System.out.printf("%d (%s)", schoolNum[minAver[i]], studentName[minAver[i]]);
			if (i != minAver.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	static double minValue_arr(double[] arr) {
		double minValue = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	static int[] minValueIndex_arr(double[] arr) {
		int r[] = new int[arr.length], index = 0;
		double minValue = minValue_arr(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == minValue) {
				r[index] = i;
				index++;
			}
		}
		r = Arrays.copyOf(r, index);
		return r;
	}

}
