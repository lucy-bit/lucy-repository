#define _CRT_SECURE_NO_WARNINGS 1

import java.util.Arrays;

/**
* Created with IntelliJ IDEA.
* Description:
* User: GAOBO
* Date: 2019-10-17
* Time: 21:12
*/
public class TestDemo1 {

	public static void func(int[] array2) {
		array2[0] = 99;
	}
	public static void func2(int x) {
		x = 99;
	}


	public static void main(String[] args) {
		int[] array2 = { 1, 2, 3, 4 };
		/*for (int i = 0; i < array2.length; i++) {
		System.out.print (array2[i] + " ");
		}*/
		/* for (int x : array2) {
		System.out.print (x + " ");
		}*/
		//Arrays:��java���в�������Ĺ�����
		//���������ַ�������ʽ���д�ӡ
		System.out.println(Arrays.toString(array2));
		System.out.println();
		func(array2);
		/*  for (int i = 0; i < array2.length; i++) {
		System.out.print (array2[i] + " ");
		}*/
		/* for (int x : array2) {
		System.out.print (x + " ");
		}*/
		System.out.println(Arrays.toString(array2));
		System.out.println();

		/* int a = 10;
		System.out.println(a);
		func2(a);
		System.out.println(a);*/
	}

	public static void main1(String[] args) {
		int[] array = new int[]{1, 2, 3, 4};

		int[] array3 = new int[10];//��������
		int[] array2 = { 1, 2, 3, 4 };
		System.out.println(array2[0]);//1
		System.out.println(array2.length);//4

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		System.out.println(array2);

	}
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