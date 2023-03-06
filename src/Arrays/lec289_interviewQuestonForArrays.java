package Arrays;

public class lec289_interviewQuestonForArrays {

	public static void main(String[] args) {
		/*
		 * print smallest number from 3*3 matrix 
		 * 24 56 76
		 * 67 47 89
		 * 20 78 56
		 */

		int abc[][] = { { 24, 56, 76 }, { 67, 47, 89 }, { -20, 78, 56 } };

		int min = abc[0][0];
		for (int i = 0; i < 3; i++) // outer loop for rows
		{
			for (int j = 0; j < 3; j++) // inner loop for columns
			{
				if (abc[i][j] < min) {
					min = abc[i][j];
				}
			}
		}
		System.out.println(min);
	}
}
