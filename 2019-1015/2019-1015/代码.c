#define _CRT_SECURE_NO_WARNINGS 1
/*
2. �ж�һ�������Ƿ�������
3. ��ӡ 1 - 100 ֮�����е�����
4. ��� 1000 - 2000 ֮�����е�����
5. ����˷��ھ���
6. �����������������Լ��
7. ����1/1-1/2+1/3-1/4+1/5 ���� + 1/99 - 1/100 ��ֵ��
8. ��д������һ�� 1�� 100 �����������г��ֶ��ٸ�����9��
9. ���0��999֮������С�ˮ�ɻ������������(��ˮ�ɻ�������ָһ����λ�������λ���ֵ�������ȷ�õ��ڸ�����
���磻153��1��5��3?����153��һ����ˮ�ɻ�������)
10. ��д����ģ��������������ĳ����� ����������������룬������ȷ����ʾ����¼�ɹ���,������� ����������
�룬����������Ρ����ξ�������ʾ�˳�����
11. дһ���������ز����������� 1 �ĸ��� ���磺 15 0000 1111 4 �� 1
12. ��ȡһ�������������������е�ż��λ������λ�� �ֱ�������������С�
13. ���һ��������ÿһλ.
14. ��ɲ�������Ϸ */

import java.util.Scanner;
public class Test {
	//1. ��������, ����ӡ����ǰ�������������(����18), ����(19-28), ����(29-55), ����(56����) 
	/*
	public static void main(String[] args) {
	age(12);
	age(24);
	age(33);
	age(60);
	}
	public static void age(int age) {
	if(age < 18) {
	System.out.println("����");
	}else if(age >= 19 && age <= 28) {
	System.out.println("����");
	}else if(age >= 29 && age <= 55) {
	System.out.println("����");
	}else if(age >= 56) {
	System.out.println("����");
	}
	}
	*/

	//2. �ж�һ�������Ƿ������� 
	/*
	public static void main(String[] args) {
	int ret = if_prime(7);
	if(0 == ret) {
	System.out.println("��������");
	}else {
	System.out.println("������");
	}
	}

	public static int if_prime(int num) {
	int i = num/2;
	for(int j=2; j<i; j++) {

	if(num%j == 0) {
	return 0;
	}
	}
	return 1;
	}
	*/

	//3. ��ӡ 1 - 100 ֮�����е����� 
	/*
	public static void main(String[] args) {
	for(int i=2; i<100; i++) {
	int ret = if_prime(i);
	if(0 != ret) {
	System.out.print(i +" ");
	}
	}
	}

	public static int if_prime(int num) {
	int i = num/2;
	for(int j=2; j<i; j++) {

	if(num%j == 0) {
	return 0;
	}
	}
	return 1;
	}
	*/

	//4. ��� 1000 - 2000 ֮�����е�����
	/*
	public static void main(String[] args) {
	int sum = 0;
	for(int i=1000; i<=2000; i++) {
	int ret = judge(i);
	if(0 != ret) {
	sum++;
	System.out.print(i +" ");
	}
	}
	System.out.println(sum);
	}

	public static int judge(int num) {
	if(((num%4 == 0) && (num%100 != 0)) || (num%400 == 0)) {
	return 1;
	}else {
	return 0;
	}
	}
	*/

	//5. ����˷��ھ��� 
	/*
	public static void main(String[] args) {
	int i = 1;
	for(i=1; i<=9; i++) {
	for(int j=1; j<=i; j++) {
	System.out.printf("%d * %d = %-3d ",i,j,i*j);
	}
	System.out.printf("\n");
	}
	}
	*/

	//6. �����������������Լ�� 
	/*
	public static void main(String[] args) {
	int ret = common(3,7);
	System.out.println(ret);

	}
	public static int common(int i, int j) {
	if(j < i) {
	int ret = 0;
	ret = i;
	i = j;
	j = ret;
	}
	for(int n=i; ; n+=i) {
	if(n%j == 0) {
	return n;
	}
	}
	}
	*/

	//7. ����1/1-1/2+1/3-1/4+1/5 ���� + 1/99 - 1/100 ��ֵ

	/*public static void main(String[] args) {
	int i = 1;
	double sum = 0.0;

	//���㣬���署��
	int flag = 1;
	for(i=1; i<=100; i++) {
	sum += 1.0/i*flag;
	flag *= -1;
	}


	//������ż���ֿ��������
	for(i=1; i<=99; i+=2) {
	sum += 1.0/i;
	}
	for(i=2; i<=100; i+=2) {
	sum += -1.0/i;
	}
	System.out.println(sum);
	}
	*/

	//8. ��д������һ�� 1�� 100 �����������г��ֶ��ٸ�����9��
	/*
	public static void main(String[] args) {
	int i = 1;
	int sum = 0;
	for(i=1; i<=100; i++) {
	if(i%10 == 9) {
	sum++;
	}
	if(i/10 == 9) {
	sum++;
	}
	}
	System.out.println(sum);
	}
	*/

	//9. ���0��999֮������С�ˮ�ɻ������������(��ˮ�ɻ�������ָһ����λ�������λ���ֵ�������ȷ�õ��ڸ����� 
	//���磻153��1��5��3?����153��һ����ˮ�ɻ�������) 



	/*public static void main(String[] args) {
	int i = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	for(i=0; i<=999; i++) {
	{
	a = i % 10;
	b = (i / 10) % 10;
	c = i / 100;
	if((a*a*a + b*b*b + c*c*c) == i) {
	System.out.println(i + "��ˮ�ɻ���");
	}
	}
	}
	}
	*/

	//10. ��д����ģ��������������ĳ����� ����������������룬������ȷ����ʾ����¼�ɹ���,������� ���������� 
	//�룬����������Ρ����ξ�������ʾ�˳����� 
	/*
	public static void main(String[] args) {
	int password = 123;
	Scanner sc = new Scanner(System.in);
	int i = 1;
	while(i <= 3) {
	i++;
	int myword = sc.nextInt();
	if(myword == password) {
	System.out.println("����������ȷ");
	break;
	}else {
	System.out.println("���������������������");
	}
	}
	if(i > 3) {
	System.out.println("�������������������ʧȥ�ʸ�");
	}
	sc.close();
	}
	*/

	//11. дһ���������ز����������� 1 �ĸ��� ���磺 15 0000 1111 4 �� 1 
	/*
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	change(num);
	sc.close();
	}

	public static void change(int num) {
	int shang = num;
	int sum = 0;
	while(shang != 0) {
	if ((shang % 2) == 1) {
	sum++;
	}
	shang /= 2;
	}
	System.out.print(sum);
	}
	*/

	//12. ��ȡһ�������������������е�ż��λeven������λodd�� �ֱ��������������
	//����������һ��ʮ������n��ͨ��(n >> i) & 1�ķ����õ�n�Ķ����Ƶ�ÿһλ���浽����binary�С�
	//�������binary�ĳ���sz, �ٷֱ�õ���żλ
	/*
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	binary(num);
	sc.close();

	}
	public static void binary(int num) {
	int[] binary = {0};
	int[] odd = {0};
	int[] even = {0};
	int i = 0;
	while((num>>i) != 0) {
	binary[i] = (num>>i) & 1;
	i++;
	}
	int sz = binary.length;
	for(i=0; i<sz; i+=2) {
	even[i] = binary[i];
	}
	for(i=1; i<sz; i+=2) {
	odd[i] = binary[i];
	}
	System.out.println("����λΪ");
	for(i=sz-1; i>0; i-=2) {
	System.out.print(odd[i]);
	}
	System.out.print("\n");
	System.out.println("ż��λΪ");
	for(i=sz; i>=0; i-=2) {
	System.out.print(even[i]);
	}
	}
	}
	*/

	//13. ���һ��������ÿһλ. 
	/*
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int i = 0;
	int[] arr = {0};
	while(num != 0) {
	arr[i] = num%10;
	num /= 10;
	i++;
	}
	int sz = arr.length;
	for(i=sz-1; i>=0;  i--) {
	System.out.print(arr[i]);
	}
	sc.close();
	}
	*/
	//14. ��ɲ�������Ϸ */
	public static void main(String[] args) {
		int num = 123;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (num == n) {
				System.out.println("�¶���");
				break;
			}
		}
		sc.close();
	}
}














