package ReplHomeworks;
import java.util.Scanner;
public class Hw076Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String[] array= new String[7] ;
		String[] day= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"}; 
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Please enter day 1 of the week");
		String day1 = sc.nextLine() ;
		System.out.println("Please enter day 2 of the week");
		String day2 = sc.nextLine() ;

		System.out.println("Please enter day 3 of the week");
		String day3 = sc.nextLine() ;

		System.out.println("Please enter day 4 of the week");
		String day4 = sc.nextLine() ;

		System.out.println("Please enter day 5 of the week");
		String day5 = sc.nextLine() ;

		System.out.println("Please enter day 6 of the week");
		String day6 = sc.nextLine() ;

		System.out.println("Please enter day 7 of the week");
		String day7 = sc.nextLine() ;


		
		for(int i=0; i<day.length; i++) {
			System.out.println(day[i]+" ");
		}
		System.out.println();
		
		

		
	}

}
