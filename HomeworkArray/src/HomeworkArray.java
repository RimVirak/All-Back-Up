
public class HomeworkArray {

	public static void main(String[] args) {
		// Declare the variable and put the value for it
		String[] employee = {"Doung","Chan","Minea","Mesa","Romdoul","Veha","Por","Kanika"};
		int[] salary = {560,560,500,500,190,190,560,700};
		
		int compare = 0;
		for(int i = 0; i < salary.length; i++) {
			compare += salary[i];
		}
		int average = compare / salary.length;
		
		
		//1. Find who has the highest salary 
		int big = 0;
		int max = salary[0];
		for(int i = 0; i < salary.length; i++) {
			if(salary[i] > max) {
				max =salary[i];
				big=i;
			}
		}
//		This part will print the who has high salary 
		System.out.println("1.Employee who has highest salary:");
		System.out.println(employee[big]+" has the highest salary of $"+max);
		System.out.println("================================================");
		
		
		//2. Find who has the lowest salary
//		This part will print who has minimum and the same salary
		System.out.println("2.Employee who has lowest salary:");
		int small = 0;
		int min = salary[0];
		for(int i = 0; i < salary.length; i++) {
			if(salary[i] < min) {
				min =salary[i];
			}
		}
		for (int i =0; i < salary.length; i++) {
			if(min == salary[i]) {
				small=i;
//		This part will print who has the same salary
				System.out.println(employee[small]+" has the lowest salary of $"+min);
			}
		}
		
		System.out.println("================================================");
		
		
		//3. Find who has the salary lower than average salary
//		For this part will print employee averages and the same salary
		System.out.println("3.Employee who has lower salary than average: "+average);
		int ever = 0;
		for(int i = 0; i < salary.length; i++) {
			if (salary[i] < average) {
				ever = i;
				System.out.println(employee[ever]+" : $"+salary[i]);
			}
		}
		
		System.out.println("================================================");
		
		//4. Find who has the salary higher or equal average salary  
//		This part will print who has higher salary than average:
		System.out.println("4.Employee who has higher salary than average: "+average);
		int averages = 0;
		for(int i = 0; i < salary.length; i++) {
			if (salary[i] > average) {
				averages = i;
				System.out.println(employee[averages]+" : $"+salary[i]);
			}
		}
		System.out.println("================================================");
		//5. Find who has the salary higher or equal average salary
//		This part will print who has the same salary
		System.out.println("5.Employee who has same salary: ");
		int similar = 0;
		for(int i = 0; i < salary.length; i++) {
			for(int j = i++; j < salary.length; j++) {
				if (salary[i] == salary[j] ) {
					similar = j;
					System.out.println(employee[j]+":$"+salary[i]);
				}
			
			}
		}

	}

}
