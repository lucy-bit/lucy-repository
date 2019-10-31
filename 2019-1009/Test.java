
public class Test {
	/*
	public static void main(String [] args) {
	//1. 写代码实现: 给定两个 int 变量, 交换变量的值. 
	int a = 10;
	int b = 20;
	int tmp = 0;
	tmp = a;
	a = b;
	b = tmp;
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	}
	*/
	
	/*
	public static void main(String[] args) {
		//2. 写代码实现: 给定三个 int 变量, 求其中的最大值和最小值
		int a = 10;
		int b = 20;
		int c = 30;
		int tmp = 0;
		if(a > b)
		{
			tmp = a;
			a = b;
			b = tmp;
		}
		if(a > c)
		{
			tmp = a;
			a = c;
			c = tmp;
		}
		if(b > c)
		{
			tmp = b;
			b = c;
			c = tmp;
		}
		System.out.println("max = " + c);
		System.out.println("min = " + a);
	}
	*/
	
	
	public static void main(String[] args) {
		/*
		int sumOdd = 0;//奇数和
		int sumEve = 0;//偶数和
		for(int i = 1; i <= 99; i += 2) {
			sumOdd += i;
		}			
		for(int j = 2; j <= 100; j += 2) {
			sumEve += j;
		}
		System.out.println("sumOdd = " + sumOdd);
		System.out.println("sumEve = " + sumEve);
		*/
		
		
		int sum = 0;
		int ret = 1;
		int i = 0;
		int num = 5;
		/*for(num = 5; num >= 1; num--) {
			ret = 1;
			for(i = 1; i <= num; i++) {
				ret *= i;
			}
			sum += ret;
		}
		*/
		for(num = 5; num >= 1; num--) {
			ret *= num;
			su
		}
		System.out.println("sum = " + sum);
	}
	
	//能被4整除同时不被100整除  或  能被400整除(求闰年)
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			int ret = if_prime(i);
			/*
			if(0 == ret) {
				System.out.println(i + "不是素数");
			}else {
				System.out.println(i + "是素数");
			}
			*/
			if(0 != ret) {
				System.out.print(i +" ");
			}
		}
	}
	
	public static int if_prime(int num) {
		if(((num%4 == 0) && (num%100 != 0)) || (num%400 == 0)) {
			return 1;
		}else {
			return 0;
		}
	}
}














