package ReplHomeworks;

public class Hw083 {

	public static void main(String[] args) {
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
			
			int sum=0;
			int row=0;
			
				for(int i=0; i<a[row].length; i++) {
				sum+=a[row][i];//sum=sum+a[i]
				
				}System.out.println(sum);
				
				int sum1=0;
				int row1=1;
				for(int j=0; j<a[row].length; j++) {
				sum1+=a[row1][j];
			}System.out.println(sum1);
			
			int sum2=0;
			int row2=2;
			for(int j=0; j<a[row].length; j++) {
			sum2+=a[row2][j];
		
			}System.out.println(sum2);
		
			int sum3=0;
		    int row3=3;
		    for(int j=0; j<a[row].length; j++) {
		      sum3+=a[row3][j];
	    
		    }System.out.println(sum3);

//teacher solution
//		    
//		    
//		    public static void main(String[] args)
//			{
//				int[][] nums = {
//					{1,1,2}, //sum = 4
//					{3,1,2}, //sum = 6
//					{3,5,3}, //sum = 11
//					{0,1,2}  //sum = 3
//				};
//
//
//			int sums[] = new int[nums.length];
//			
//				for (int i = 0; i < nums.length; i++) {
//					int rowSum = 0;
//					for (int j = 0; j < nums[i].length; j++) {
//						rowSum += nums[i][j];
//					}
//					sums[i] = rowSum;
//				}
//
//			for(int sum : sums) {
//					System.out.println(sum);
//		  }
//		  
//			}
//		}
//		    
		    
		}

	}

