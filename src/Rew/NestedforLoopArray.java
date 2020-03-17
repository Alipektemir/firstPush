package Rew;

public class NestedforLoopArray {

	public static void main(String[] args) {
		
	  for(int i = 0 ; i <5 ; i++)
                {                                 //loop for rows

                       for(int j = 0 ; j <5 ; j++)
                       {                              //loop for columns
                    	   	System.out.print("$");
                              if(i==1 && j==1 ) 
                            	  if(i==2 && j==2)
                            		  continue;  //condition for hollow rectangle printing
                                     
                              else
                                   
                        

                        System.out.println(); }
         }	
	}        }
                
                