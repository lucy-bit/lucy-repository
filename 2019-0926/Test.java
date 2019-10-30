
import java.util.Scanner; 
public class Test {
	public static void main(String[] args) {
		/*int num = 1;
		int i = 1;
		int ret = 1;
		int sum = 0;
		while(num <= 5) {
			ret = 1;
			i = 1;
			while(i <= num) {
				ret *= i;
				i++;
			}
			num++;
			sum += ret;
		}
		System.out.println("sum == " + sum);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		int num = 0;
		while (sc.hasNextDouble()) {    
			double tmp = sc.nextDouble();    
			sum += tmp;
			num++; 
		}

		System.out.println("sum = " + sum);
		System.out.println("avg = " + sum / num);
		sc.close();  
	}
	*/
	
		Scanner sc = new Scanner(System.in);
		boolean judge = sc.hasNextDouble();
		System.out.println(judge);
		sc.close();
}

