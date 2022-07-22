import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HW6_1 {

	public static void main(String[] args) throws FileNotFoundException {
		String line;
		int tempArr[]=new int[1000], numsArr[];
		int numCnt=0;
		Scanner in =new Scanner(new File(args[0]));
		while (in.hasNext()) {
			line=in.nextLine();
			Scanner inline =new Scanner(line);
			numCnt=0;
			while (inline.hasNext()) {
				tempArr[numCnt]=inline.nextInt();
				numCnt++;
			}
			numsArr=makeBubbleSortedArr(tempArr,numCnt);
			
			printArr(numsArr);
		}
	}
	static int[] makeBubbleSortedArr(int[] arr,int numCnt) {
		int[] numsArr;
		numsArr=Arrays.copyOf(arr, numCnt);
		for (int i=0; i<numsArr.length;i++) {
			makeLastMax(i,numsArr);
		}
		return numsArr;
	}
	static void makeLastMax(int i,int[] arr) {
		for (int j=0; j<arr.length-1-i; j++) {
			if (arr[j]>arr[j+1]) {
				swapArrNum(arr, j, j+1);
			}
		}
	}
	static  void swapArrNum(int [] arr,int i,int j) {
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void printArr(int[] numsArr) {
		for(int i=0; i<numsArr.length; i++) {
			System.out.printf("%4d\t",numsArr[i]);
		}
		System.out.println();
	}

}
