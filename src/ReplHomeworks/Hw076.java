package ReplHomeworks;
import java.util.Scanner ;
public class Hw076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

			String[] array = new String[7];

			for (int i = 0; i <array.length; i++) {

				System.out.println("Please enter day " + (i+1) + " of the week");
				array[i] = sc.next();
			}
			
			
			for(int i=0; i<array.length; i++){
				System.out.println(array[i]);
			}
			
	  }
	}
