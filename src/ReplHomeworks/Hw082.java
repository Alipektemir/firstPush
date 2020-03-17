package ReplHomeworks;

public class Hw082 {

	public static void main(String[] args) {
		// sum of all
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
		int add = 0;
		for(int i=0; i<a.length; i++ ) {
			for (int j=0; j<a[i].length; j++) {
				add=add+a[i][j];
				
			}
		
		}
		System.out.println(add);
		}
	}