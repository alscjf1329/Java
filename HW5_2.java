
public class HW5_2 {

	public static void main(String[] args) {
		int numCnt = randomInt(10, 20), elementInLine = 0, sum = 0;
		System.out.println(numCnt);
		try {
			elementInLine = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("타입 오류");
			System.exit(1);
		}
		int[] nums = new int[numCnt];
		for (int i = 0; i < numCnt; i++) {
			if (i % elementInLine == 0 && i != 0) {
				System.out.println();
			}
			nums[i] = randomInt(-100, 100);
			System.out.printf("%4d ", nums[i]);
			sum += nums[i];
		}
		System.out.println("\n");
		double average = (double) sum / numCnt;
		int numGEAverCnt = 0, numLEAverCnt = 0;
		for (int i = 0; i < numCnt; i++) {
			if (average <= (double) nums[i]) {
				numGEAverCnt++;
			} else if (average >= nums[i]) {
				numLEAverCnt++;
			}
		}
		System.out.printf("평균 : %.3f\n", average);
		System.out.printf("평균 이상 : %3d\n", numGEAverCnt);
		System.out.printf("평균 이하: %3d\n", numLEAverCnt);

	}

	static int randomInt(int start, int end) {
		return (int) (Math.random() * (end - start + 1) + start);
	}

}
