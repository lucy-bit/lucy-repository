

/*public static void Print(int num) {
	while(num > 9) {
		
		System.out.println(num % 10);
		num /= 10;
		
	}
}
public class Test {
	
	public static void Print(int num) {
	if(num > 9) {
		num /= 10;
		Print(num);
		System.out.print(num % 10);
		}
		 
	
	}
	
	public static void main(String[] args) {
		int num = 1234;
		Print(num);
		
	}
}
*/


//1+2+3+4+5+6+7+8+9+10
public class Test {
	public static void main(String[] args) {
		int num = 4;
		System.out.println(func2(num));
	}

	public static int sum(int num) {
		if(num == 1) {
			return 1; 
		}
		return num + sum(num -1);
	}
	
	public static int sum2(int num) {
		if(num <10) {
			return num;
		}
		return num%10 + sum2(num/10);
	}
	
	//1 1 2 3 5 8 13
	//递归
	 public static int fab(int n) {
		if((n == 1) | (n == 2)) {
			return 1;
		}
		return fab(n-1) + fab(n-2);
	 }
	 //循环
	 public static int fab2(int n) {
		int f1 = 1;
		int f2 = 1;
		int f3 = 1;
		while(n >= 3) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			n--;
		}
		return f3;
	 }
	 //青蛙跳台阶
	 //递归
	 public static int func(int n) {
			if(n == 1) {
				return 1;
			}else if(n == 2) {
				return 2;
			}
			return func(n-1) + func(n-2);
	 }
	 //非递归
	 public static int func2(int n) {
		if(n == 1 || n == 2) {
			return n;
		}
		int f1 = 1;
		int f2 = 2;
		int f3 = 3;
		for(int i = 3; i <= n; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		return f3;
				
	 }
	 
}

public class Test {
	public static void main(String[] args) {
		int num = 4;
		System.out.println(func(num));
	}
	 //递归
	 public static int func(int n) {
			if(n == 1) {
				return 1;
			}else if(n == 2) {
				return 2;
			}
			return func(n-1) + func(n-2);
	 }
}


public class Test {
	public static void main(String[] args) {
		int num = 4;
		System.out.println(func2(num));
	}
	
	public static int func2(int n) {
		if(n == 1 || n == 2) {
			return n;
		}
		int f1 = 1;
		int f2 = 2;
		int f3 = 3;
		for(int i = 3; i <= n; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		return f3;
				
	}
}



