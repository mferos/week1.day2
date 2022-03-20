package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		int j = 0;
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			j = i+1;
			if (j != arr[i])
			{
				System.out.println(j);
				break;
			}
		}

	}

}
