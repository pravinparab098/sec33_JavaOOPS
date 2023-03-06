package Arrays;

public class lec290_maximuNumber {

	public static void main(String[] args) {
		
		int abc [][] = {{10,56,28}, {48,90,5}, {83,78,35}};
		int min = abc [0][0];
		int minCol = 0;
		
		for (int i=0; i<3; i++)  //for row
		{
			for (int j=0; j<3; j++) //for col
			{
				 if(abc[i][j]<min)
				 {
					 min = abc [i][j];
					 //minCol = j;		 
				 }
			}
		}
			
		int max = abc [0] [minCol];
		int k =0;
		while (k<3)
		{
			if (abc [k][minCol]>max)
			{
				max = abc [k][minCol];
			}
			k++;
		}
		System.out.println(max);
	}
}
