#define _CRT_SECURE_NO_WARNINGS 1
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
	//与c语言不同，java中可以不定义列数
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