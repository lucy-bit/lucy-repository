#define _CRT_SECURE_NO_WARNINGS 1
//实现 int sqrt(int x) 函数。
//
//计算并返回 x 的平方根，其中 x 是非负整数。
//
//由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
//
//示例 1:
//
//输入 : 4
//输出 : 2
//
//
//	 示例 2 :
//
// 输入 : 8
//  输出 : 2
//   说明 : 8 的平方根是 2.82842...,
//		由于返回类型是整数，小数部分将被舍去。
//
		

//int mySqrt(int x)
//{
//	if (x == 1)
//		return 1;
//	int min = 0;
//	int max = x;
//	while (max - min>1)
//	{
//		int m = (max + min) / 2;
//		if (x / m<m)
//			max = m;
//		else
//			min = m;
//	}
//	return min;
//}

int mySqrt(int x) {
	unsigned m = 0x40000000, y = 0, b = 0;

	while (m != 0) {
		b = y | m;
		y = y >> 1;
		if (x >= b) {
			x = x - b;
			y = y | m;
		}
		m = m >> 2;
	}

	return y;
}