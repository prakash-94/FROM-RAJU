package kumar;

import java.util.Arrays;
import java.util.*;
import java.util.Collections;

public class ArraysSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numberArray[]= {12,8,2,8,6,5,1,1,2,7};
		
		
		Arrays.sort(numberArray);
		//System.out.printf("Modified Ascending order numberArray[]: %s",Arrays.toString(numberArray));
		System.out.println("Modified Ascending order numberArray:"+Arrays.toString(numberArray));
		
		
		Arrays.sort(numberArray,Collections.reverseOrder());
	//	System.out.printf("Modified Descending order numberArray[]:%s",Arrays.toString(numberArray));
		System.out.println("Modified Descending order numberArray:"+Arrays.toString(numberArray));
		
		

	}

}
