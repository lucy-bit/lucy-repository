#define _CRT_SECURE_NO_WARNINGS 1
import java.util.Scanner;

/**
* Created with IntelliJ IDEA.
* Description:
* User: GAOBO
* Date: 2019-10-17
* Time: 18:55
*/
public class HomeWork {

	public static void printAge(int age) {
		if (age <= 18) {
			System.out.println("����");
		}
		else if (age >= 19 && age <= 28){
			System.out.println("����");
		}
		else if (age >= 29 && age <= 55) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
	}
	//n:1  3    7   ֻ�ܱ�1�ͱ�������  2-n-1
	public static boolean isPrime1(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	//16: n = a*b   4*4  2*8  1*16  <=n/2
	public static boolean isPrime2(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	//8: n = a*b   2*4  1*8    <= ����n 2.8
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	/*
	1����ϵ�
	2����ʼ����
	ctr+shift+/  ��ע��
	ctr+/  ��ע��
	*/
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public static int func1(int a, int b) {
		int tmp = 0;//��������
		while (a%b != 0) {
			tmp = a%b;
			a = b;
			b = tmp;
		}
		return tmp;
	}
	//����1/1-1/2+1/3-1/4+1/5 ���� + 1/99 - 1/100 ��ֵ
	public static double sumN(int n) {
		double sum = 0.0;
		int flg = 1;
		//i�Ƿ�ĸ
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i * flg;
			flg = -flg;
		}
		return sum;
	}
	//��д������һ�� 1�� 100 �����������г��ֶ��ٸ�����9
	//9  19 29 ......89   90 91.....99  20
	//9%10=9    91/10=9   99
	public static int func2(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 10 == 9) {
				count++;
			}
			if (i / 10 == 9) {
				count++;
			}
		}
		return count;
	}
	//���0��999999֮������С�ˮ�ɻ����������
	public static void waterFlower(int n) {
		for (int i = 0; i <= n; i++) {
			//1����λ��
			int count = 0;//λ��
			int tmp = i;
			while (tmp != 0) {
				count++;
				tmp /= 10;
			}
			//count���汣��ľ��ǵ�ǰi��λ��
			tmp = i;
			//��tmp��ÿһ��λ�ϵ�����
			//123   123%10=3  123/10 %10=2
			//12/10%10=1   1/10=0
			int sum = 0;//�η��ĺ�
			while (tmp != 0) {
				sum += Math.pow(tmp % 10, count);
				tmp = tmp / 10;
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}

	public static void func3() {
		Scanner scanner = new Scanner(System.in);
		int count = 3;
		while (count != 0) {
			System.out.println("������������룺");
			String password = scanner.nextLine();
			//if(password == "abcde") {
			//if(password.equals("abcde")) {
			if ("abcde".equals(password)) {
				System.out.println("������ȷ��");
				break;
			}
			else {
				System.out.println("�������!");
				count--;
			}
		}
	}
	//дһ���������ز����������� 1 �ĸ���
	//15    0000 1111    4
	//123   123%10=3   123/10=12%10=2
	public static int numberOfOne1(int num) {
		int count = 0;
		while (num != 0) {
			if (num % 2 == 1) {
				count++;
			}
			num /= 2;
		}
		return count;
	}

	public static int numberOfOne(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num & (num - 1);
		}
		return count;
	}

	//ʹ��λ��������������ƽ��ֵ
	public static int avg(int a, int b) {
		return (a&b) + (a^b) >> 1;
	}

	public static void printNum(int n) {
		for (int i = 31; i >= 1; i -= 2) {
			System.out.print(((n >> i) & 1) + " ");
		}
		System.out.println();
		System.out.println("===========");
		for (int i = 30; i >= 0; i -= 2) {
			System.out.print(((n >> i) & 1) + " ");
		}
	}

	public static void main(String[] args) {

		printNum(6);
		// System.out.println(avg(7,8));

		//String str = null;
		//System.out.println(str.equals("abcde"));
		//System.out.println("abcde".equals(str));

		//func3();

		/*int a = scanner.nextInt();
		waterFlower(a);
		int ret = func1(10,6);
		System.out.println(ret);
		int b = scanner.nextInt();
		int ret = func1(a,b);
		System.out.println(ret);
		for (int i = 1000; i < n; i++) {
		if(isLeapYear(i)) {
		System.out.println(i);
		}
		}*/
		//boolean flg = isPrime(n);
		//System.out.println(flg);//sout
	}
}
