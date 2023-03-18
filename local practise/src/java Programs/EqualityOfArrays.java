package divyapractise;

public class EqualityOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = { 2, 4, 5, 6 }, a2[] = { 1, 4, 5, 6};
		boolean flag = false;
		if (a1.length != a2.length) {
			System.out.println("Given two Arrays are not equal as length did not match");
		} else {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] == a2[i]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("Given two Arrays are equal");
			}
			else
			System.out.println("Given two Arrays are not equal");
		}

	}

}
