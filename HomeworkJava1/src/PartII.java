
public class PartII {

	public static void main(String[] args) {
		// Part II
		 
        //PartII ,  A. If taxCode
              System.out.println("=============================");
        
        double price = 500.50;
        int taxRate = 10;
        char taxCode = 'T';
            
        if (taxCode == 'T') {
            //print the price if taxCode Equal T	        	  
      	      System.out.println("The price:"+price);
      	  
        }if (taxCode != 'T') { 
      	 //print the price if taxCode not Equal T	       
              System.out.println("The price:"+(price*taxRate/100+price));
            
        }
    
        //PartII ,  B. If opCodrtax
              System.out.println("=============================");
        
        float x = 45.8f;
        float y = 98.0f;
        float duable = 1;
        
          if (duable == 1) {
              System.out.println("Sum of x(45.8) ,y(98.0) is "+( x + y));
          } 
        //PartII ,  C. If currentNumber is 5
              System.out.println("============================="); 
        
         int currentNumber = 6 ;
         int oddNumber;
         int evenNumber;
          if (currentNumber % 2 !=0) {
          	  evenNumber = ((currentNumber*3)+4);
          	  System.out.println("The currentNumber is: "+evenNumber);
          }
          if(currentNumber % 2 == 0){
          	  oddNumber = (currentNumber/2);
          	  System.out.println("The currentNumber is: "+oddNumber);
             }
            
          //Part II , D.If Distance	               
              System.out.println("=============================");   
        
          int Distance = 100;
          double Cost = 0;
            
          if (Distance >= 0 && Distance <= 100) {
     
          	 Cost = 5.00;
          }
          if(Distance > 100 && Distance <= 500) {
          
          	 Cost = 8.00;
          }
          if(Distance > 500 && Distance < 1000) {
        
          	 Cost = 10.00;
          }
          if(Distance >= 1000) {
              
           	 Cost = 12.00;
           }
             System.out.println("Distance: " + Distance);
             System.out.println("Cost: " + Cost);

	}

}
