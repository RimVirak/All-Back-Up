
public class Array {

	public static void main(String[] args) {
		
		String[] employee = {"Doung","Chan","Minea","Mesa","Romdoul","Veha","Por","Kanika"};
		int[] salary = {560,560,500,500,190,190,560,700};
		
		int sum = 0;
		for(int i = 0; i < salary.length; i++) {
			sum += salary[i];
		}
		double average = sum / salary.length;
		
		
		//1. Find who has the highest salary 
		int x = 0;
		int maximum = salary[0];
		for(int i = 0; i < salary.length; i++) {
			if(salary[i] > maximum) {
				maximum =salary[i];
				x=i;
			}
		}
		System.out.println("1. Employee who has highest salary:");
		System.out.println(employee[x]+" has the highest salary of $"+maximum);
		System.out.println("...................................");
		
		
		//2. Find who has the lowest salary
		System.out.println("2.Employee who has lowest salary:");
		int a = 0;
		int minimum = salary[0];
		for(int i = 0; i < salary.length; i++) {
			if(salary[i] < minimum) {
				minimum =salary[i];
			}
		}
		for (int i =0; i < salary.length; i++) {
			if(minimum == salary[i]) {
				a=i;
				System.out.println(employee[a]+" has the lowest salary of $"+minimum);
			}
		}
		
		System.out.println("...................................");
		
		
		//3. Find who has the salary lower than average salary
		System.out.println("3. Employee who has lower salary than average: "+average);
		int c = 0;
		for(int i = 0; i < salary.length; i++) {
			if (salary[i] < average) {
				c = i;
				System.out.println(employee[c]+" : $"+salary[i]);
			}
		}
		
		System.out.println("...................................");
		
		//4. Find who has the salary higher or equal average salary  
		System.out.println("4. Employee who has higher salary than average: "+average);
		int d = 0;
		for(int i = 0; i < salary.length; i++) {
			if (salary[i] > average) {
				d = i;
				System.out.println(employee[d]+" : $"+salary[i]);
			}
		}
		System.out.println("...................................");
		//5. Find who has the salary higher or equal average salary
		System.out.println("5.Employee who has same salary: ");
		int e = 0;
		for(int i = 0; i < salary.length; i++) {
			for(int f = i+1; f < salary.length; f++) {
				if (salary[i] == salary[f] ) {
					e = f;
					System.out.println(employee[e]+" : $"+salary[f]);
				}
			}
		}
		System.out.println("...................................");


	}

}
