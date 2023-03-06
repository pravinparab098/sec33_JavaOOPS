package Arrays;

public class lec286_MultiDimentionalArrays {

	public static void main(String[] args) {

		int a[][] = new int[2][3];
		// a[row][column] so here is the [2 rows] and [3 column]
		a[0][0] = 45;
		a[0][1] = 36;
		a[0][2] = 65;
		a[1][0] = 32;
		a[1][1] = 87;
		a[1][2] = 23;
		// for printing 32
		// System.out.println(a[1][0]);

		// simple way to write arrays {{row one},{row two}}
		int b[][] = { { 45, 36, 65 }, { 32, 87, 23 } };
		// for printing 65
		// System.out.println(b[0][2]);

		for (int i = 0; i < 2; i++) // represent rows
		{
			for (int j = 0; j < 3; j++) // represent columns
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
			System.out.println("");
		}

	}
}
