package Arrays;

public class New_Years_Chaos {

	public static void main(String[] args) {

		int[] q0 = { 2, 1, 5, 3, 4 };  			//3
		int[] q1 = { 2, 5, 1, 3, 4 };			//Too chaotic
		int[] q2 = { 1, 2, 5, 3, 4, 7, 8, 6 };	//4
		int[] q = { 5, 1, 2, 3, 7, 8, 6, 4 };	//Too chaotic

		int count = 0;

		for (int i = q.length - 1; i >= 0; i--) {

			if (q[i] != i + 1) {
				if ((i - 1) >= 0 && q[i - 1] == i + 1) {
					int temp = q[i - 1];
					q[i - 1] = q[i];
					q[i] = temp;
					count++;

				} else if ((i - 2) >= 0 && q[i - 2] == i + 1) {
					q[i - 2] = q[i - 1];
					q[i - 1] = q[i];
					q[i] = q[i - 2];
					count += 2;
				} else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		System.out.println(count);
	}

}
