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
	//1、写博客  数组
	//2、看代码  手写
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
		//2、二维数组
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
		//1、可变参数编程
		//System.out.println(sum(1,2,3,4,5));
		// System.out.println(sum(1,2,3,4,5,6));
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(sum(array));
		int[] array2 = new int[]{1, 2, 3, 4, 5, 6};
		System.out.println(sum(array2));
		//匿名数组
		System.out.println(sum(new int[]{1, 2, 3, 4, 5, 6}));
	}

	public static void bubbleSort(int[] array) {

		boolean flg = false;
		//趟数
		for (int i = 0; i < array.length - 1; i++) {
			flg = false;//因为每一趟都有能有序
			//次数
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
	* 学习Arrays类当中的方法：
	* Arrays.toString();
	* Arrays.copyOf();
	* Arrays.copyOfRange();//拷贝部分数组[)
	* Arrays.binarySearch();
	* Arrays.equals();判断数组是否相同
	* Arrays.fill(array,9); 数组的填充
	* Arrays.fill(array,2,7,88);[2,7)下标填充为88
	* Arrays.sort(array);将数组进行排序
	*     原理：等排序学完之后  记着剖析源码
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
	* 逆置
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
			}//i所保存的下标就是偶数的下标

			while (i < j && array[j] % 2 == 0) {
				j--;
			}//j所保存的下标就是奇数的下标

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
	* 1、求数组当中的最大值
	* 2、求数组当中的最小值
	* 3、求数组当中的平均值
	* 4、数组的逆置
	* 5、将数组当中奇数放到偶数前面
	* 6、实现二分查找代码
	* 7、实现冒泡排序及冒泡排序的优化代码
	* 8、二维数组
	* 9、Arrays工具类当中其他的方法使用
	* 10、类和对象
	* @param args
	*/
	public static void main6(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = array;
		System.out.println(Arrays.toString(array2));
	}

	/**
	* 数组的拷贝：
	* 1、for循环去拷贝
	* 2、System.arraycopy
	* 3、Arrays.copyOf
	* 4、数组名.clone();  clone是Object的方法
	*    返回一个副本
	*    数组名->你要拷贝的数组
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
	* 模拟实现Arrays.toString()方法；
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
	* 数组作为返回值
	* 将数组扩大2倍，并且返回
	* 要求：不能修改原数组
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
		//array3数组：默认值为0
		int[] array3 = new int[5];

		System.out.println(array[0]);
		//array.length ->数组的一个属性
		System.out.println(array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//x :数组当中的元素   array:需要打印的数组名
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
		//将数组以字符串的形式进行打印
		System.out.println(Arrays.toString(array3));
	}
}
