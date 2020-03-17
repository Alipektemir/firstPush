package Rew;
import java.util.Scanner;
public class LogOper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please write a letter");
		char code =  sc.next().charAt(0);
		
		     double discount =0.0;

			switch ( code )
			{
			case 'A':
			discount = 0.0;
			break;

			case 'B':
			discount = 0.1;
			break;

			case 'C':
			discount = 0.2;
			break;

			default:
			discount = 0.3;
			break;
			}
			
			System.out.println(discount);
			
			
			
	}

	private static char nextChar() {
		// TODO Auto-generated method stub
		return 0;
	}
		
	}