import java.util.Scanner;

public class Home2 {

	public static void main(String[] args) {
        // This part will display print of users  
		        System.out.println("Enter A or a to display 10 entities per page");
		        System.out.println("Enter B or b to display 20 entities per page");
		        System.out.println("Enter C or c to display 50 entities per page");
		        System.out.println("Enter D or d to display 100 entities per page");
		        System.out.println("Enter E or e to display 200 entities per page");
		        System.out.println("-----------------------------------------------");
        // Display type of user input like a b c d ......
		        System.out.print("Enter: " );
				Scanner UsersInsert = new Scanner(System.in);
				char a =  UsersInsert.next() . charAt(0) ;
				int entities = 150;
				int Total;
				switch (a){
        // Display per page 10		
				case 'A':
				case 'a':  Total = 10;
				break;
        // Display per page 20
				case 'B':
				case 'b':  Total = 20;
				break;
        // Display per page 50		
				case 'C':
				case 'c':  Total = 50;
				break;
        //	Display per page 200
				case 'D':
				case 'd':  Total = 100;
				break;
        //	Display per page 200
				case 'E':
				case 'e':  Total = 200;
				break;
        //	If the users not input difference characters a or A until e or E  it will display 5	
				default:  Total = 5 ;
				break;
				}
		       UsersInsert.close();
		//  This print will display informations the user
				System.out.println("Entities: " + entities);
				System.out.println("Entities To Display Per Page:"+ Total);
				System.out.println("===============================================");
					int calulat = entities / Total;					
		//  Output all entities per page in console 
					for(int i = 0; i <= calulat -1; i++){
        //	In this part will print Page and plus 1 all the page 					
						System.out.print("|Page" + (i+1) + ":" + Total);
					}					
		//  This part will Check for last page not equal to 0
					if(entities %  Total !=0 )
					{
        //	Our of this part will be print out all of pages and value that calculate according to user in put    					
						System.out.print("|Page" + ((entities / Total)+1) + ":" + (entities % Total)+"|");
					}else{
        //  This part will print out the number that divide not equal 0 					
						System.out.print("|");
					}
	    }

   }
