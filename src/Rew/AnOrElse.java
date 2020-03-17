package Rew;
import java.util.Scanner;
public class AnOrElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  String word1;
		  String word2;
		  int int1;
		  int int2;
		  String output;
		  System.out.println("Please enter two strings");
		  word1 = sc.nextLine();
		  word2 = sc.nextLine();
		  System.out.println("Please enter two numbers");
		  int1 = sc.nextInt();
		  int2 = sc.nextInt();
		  
		  if (int1 == int2 && word1.equals(word2)); {
		  output = "AND" ; 
		   
		    }
		   if (int1 == int2  || word1.equals(word2)) ; {
		    output = "NONE" ;
		  }if (int1 == int2  && word1.equals(word2 )); {
		    output = "OR" ;
		  }
		  
		  System.out.println(output);
		  
		  
		  
		}
		}