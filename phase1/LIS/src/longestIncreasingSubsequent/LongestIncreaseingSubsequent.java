package longestIncreasingSubsequent;

public class LongestIncreaseingSubsequent {

	static int subseq(int myarr[], int l) {
		int arr[] = new int[l];
		int i, j, max = 0;
		for (i = 0; i < l; i++) {
			arr[i] = 1;
		}
		for (i = 1; i < l; i++) {
			for (j = 0; j < i; j++) {
				if (myarr[i] > myarr[j] && arr[i] < arr[j] + 1)
					arr[i] = arr[j] + 1;
			}
		}
		for (i = 0; i < l; i++) {
			if (max < arr[i]) {
				max = arr[i];
				
			}
		}
		return max;
	}

	public static void main(String args[]) {
		int myarr[] = { 55, 78, 2, 5, 9, 67, 32, 69, 23, 45, 78, 54 };
		int l = myarr.length;
		System.out.println("The length of the longest increasing subsequence is : " + subseq(myarr, l));
	}
}
