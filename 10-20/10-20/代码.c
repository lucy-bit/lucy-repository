#define _CRT_SECURE_NO_WARNINGS 1

import java.util.Arrays;

/**
* Created with IntelliJ IDEA.
* Description:
* User: GAOBO
* Date: 2019-10-20
* Time: 9:09
*/
public class TestDemo1 {
	//1��д����  ����
	//2��������  ��д
	public static void main(String[] args) {
		int[][] array4 = new int[2][];
		array4[0] = new int[3];
		array4[1] = new int[5];
		for (int i = 0; i < array4.length; i++) {
			for (int j = 0; j < array4[i].length; j++) {
				array4[i][j] = i*j;
			}
		}
		System.out.println(Arrays.deepToString(array4));
		/* for (int i = 0; i < array4.length; i++) {
		for (int j = 0; j < array4[i].length; j++) {
		System.out.print(array4[i][j] + " ");
		}
		System.out.println();
		}*/

		/*
		int[][] array = {{1,2,3},{4,5,6}};
		int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
		int[][] array5 = {{1,2},{4,5,6}};
		System.out.println(array5[0].length);
		System.out.println(array5[1].length);
		for (int i = 0; i < array5.length; i++) {
		for (int j = 0; j < array5[i].length; j++) {
		System.out.print(array5[i][j] + " ");
		}
		System.out.println();
		}*/
	}

	public static void main10(String[] args) {
		//2����ά����
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] array2 = new int[][]{{ 1, 2, 3 }, { 4, 5, 6 }};
		int[][] array3 = new int[2][3];

		int[][] array4 = new int[2][];
		int[][] array5 = { { 1, 2 }, { 4, 5, 6 } };
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b;
	}

	public static int sum(int... array) {
		int ret = 0;
		for (int x : array) {
			ret += x;
		}
		return ret;
	}

	public static void main9(String[] args) {
		//1���ɱ�������
		//System.out.println(sum(1,2,3,4,5));
		// System.out.println(sum(1,2,3,4,5,6));
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(sum(array));
		int[] array2 = new int[]{1, 2, 3, 4, 5, 6};
		System.out.println(sum(array2));
		//��������
		System.out.println(sum(new int[]{1, 2, 3, 4, 5, 6}));
	}

	public static void bubbleSort(int[] array) {

		boolean flg = false;
		//����
		for (int i = 0; i < array.length - 1; i++) {
			flg = false;//��Ϊÿһ�˶���������
			//����
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					flg = true;
				}
			}
			if (!flg) {
				return;
			}
		}
	}
	/**
	* ѧϰArrays�൱�еķ�����
	* Arrays.toString();
	* Arrays.copyOf();
	* Arrays.copyOfRange();//������������[)
	* Arrays.binarySearch();
	* Arrays.equals();�ж������Ƿ���ͬ
	* Arrays.fill(array,9); ��������
	* Arrays.fill(array,2,7,88);[2,7)�±����Ϊ88
	* Arrays.sort(array);�������������
	*     ԭ��������ѧ��֮��  ��������Դ��
	* @param args
	*/
	public static void main8(String[] args) {
		int[] array = { 15, 23, 5, 71, 9, 66 };
		System.out.println(Arrays.toString(array));
		//Arrays.sort(array);
		bubbleSort(array);
		System.out.println(Arrays.toString(array));

		/*
		int[] array = new int[10];
		System.out.println(Arrays.toString(array));
		Arrays.fill(array,2,7,88);
		System.out.println(Arrays.toString(array));
		int[] array = {1,3,5,7,9};
		int[] array2 = {1,3,5,7,19};
		System.out.println(Arrays.equals(array,array2));

		int[] array2 = Arrays.copyOfRange(
		array,1,4);
		System.out.println(Arrays.toString(array2));*/
	}



	/**
	* ����
	* @param array
	*/
	public static void reverse(int[] array) {
		int i = 0;
		int j = array.length - 1;
		while (i < j) {
			int tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
			i++;
			j--;
		}
	}



	/**
	* i    j
	* @param array
	*/
	public static void eveAfterOdd(int[] array) {
		int i = 0;
		int j = array.length - 1;
		while (i < j) {
			while (i < j && array[i] % 2 != 0) {
				i++;
			}//i��������±����ż�����±�

			while (i < j && array[j] % 2 == 0) {
				j--;
			}//j��������±�����������±�

			if (i < j) {
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
			}
		}
	}

	public static int binarySearch1(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			//int mid = (left+right)/2;
			int mid = (left + right) >> >1;
			if (array[mid] == key) {
				return mid;
			}
			else if (array[mid] < key) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static int binarySearch(
		int[] array, int key, int left, int right) {
		if (left > right) {
			return -1;
		}
		int mid = (left + right) >> 1;
		if (array[mid] == key) {
			return mid;
		}
		else if (array[mid] > key) {
			return binarySearch(array, key, left, mid - 1);
		}
		else {
			return binarySearch(array, key, mid + 1, right);
		}
	}

	public static void main7(String[] args) {
		int[] array = { 1, 3, 5, 7, 9 };//5  -(low+1): low:
		int ret = Arrays.binarySearch(
			array, 0, 4, 7);
		//[fromIndex,toIndex)
		System.out.println(ret);
		//System.out.println(Arrays.toString(array));
		//int ret = binarySearch(array,18,0,array.length-1);
		//System.out.println(ret);
	}
	/**
	* 1�������鵱�е����ֵ
	* 2�������鵱�е���Сֵ
	* 3�������鵱�е�ƽ��ֵ
	* 4�����������
	* 5�������鵱�������ŵ�ż��ǰ��
	* 6��ʵ�ֶ��ֲ��Ҵ���
	* 7��ʵ��ð������ð��������Ż�����
	* 8����ά����
	* 9��Arrays�����൱�������ķ���ʹ��
	* 10����Ͷ���
	* @param args
	*/
	public static void main6(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = array;
		System.out.println(Arrays.toString(array2));
	}

	/**
	* ����Ŀ�����
	* 1��forѭ��ȥ����
	* 2��System.arraycopy
	* 3��Arrays.copyOf
	* 4��������.clone();  clone��Object�ķ���
	*    ����һ������
	*    ������->��Ҫ����������
	* @param args
	*/
	public static void main5(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		//int[] array2 = new int[array.length];
		//System.out.println(Arrays.toString(array2));
		/*for (int i = 0; i < array.length; i++) {
		array2[i] = array[i];
		}*/
		/*System.arraycopy(array,
		0,array2,0,array.length);*/
		//int[] array2 = Arrays.copyOf(array,array.length);
		int[] array2 = array.clone();
		System.out.println(Arrays.toString(array2));
	}

	/**
	* ģ��ʵ��Arrays.toString()������
	*    [1,2,3,4,5,6]
	* @param array
	* @return
	*/
	public static String toString(int[] array) {
		String str = "[";
		for (int i = 0; i < array.length; i++) {
			str = str + array[i];
			if (i != array.length - 1) {
				str += ", ";
			}
		}
		str += "]";
		return str;
	}

	public static void main4(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		System.out.println(toString(array));
	}

	/**
	* ������Ϊ����ֵ
	* ����������2�������ҷ���
	* Ҫ�󣺲����޸�ԭ����
	* @param array
	* @return
	*/
	public static int[] transform(int[] array) {
		int[] tmp = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			tmp[i] = 2 * array[i];
		}
		return tmp;
	}

	public static void main3(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int[]ret = transform(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(ret));
	}


	public static void func1(int x) {
		x = 20;
	}
	public static void func2(int[] array) {
		array[0] = 99;
	}

	public static void main2(String[] args) {
		int a = 10;
		System.out.println(a);//10
		func1(a);
		System.out.println(a);//20  10

		int[] array = { 1, 2, 3, 4, 5 };
		//1,2,3,4,5
		System.out.println(Arrays.toString(array));
		func2(array);
		//99 2 3 4 5
		System.out.println(Arrays.toString(array));
	}

	public static void main1(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] array2 = new int[]{1, 2, 3, 4, 5};
		//array3���飺Ĭ��ֵΪ0
		int[] array3 = new int[5];

		System.out.println(array[0]);
		//array.length ->�����һ������
		System.out.println(array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//x :���鵱�е�Ԫ��   array:��Ҫ��ӡ��������
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
		//���������ַ�������ʽ���д�ӡ
		System.out.println(Arrays.toString(array3));
	}
}
