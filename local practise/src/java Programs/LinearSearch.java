package kumar;

import org.apache.commons.exec.launcher.Java13CommandLauncher;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = { 10, 20, 30, 50, 70, 90 };
		int key = 50;
System.out.println(key+" is found at index: " +LinearSearch1(a1,key));
	}

	public static int LinearSearch1(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}