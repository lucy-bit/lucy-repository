#define _CRT_SECURE_NO_WARNINGS 1

//
//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//示例 1:
//输入 : 123
//输出 : 321


//int reverse(int x)
//{
//	int max = 0x7fffffff, min = 0x80000000;//int的最大值最小值
//	long rs = 0;//用long类型判断溢出
//	for (; x; rs = rs * 10 + x % 10, x /= 10);//逆序，正负通吃，不用单独考虑负值
//	return rs>max || rs<min ? 0 : rs;//超了最大值低于最小值就返回0
//}

//
//int reverse(int x){
//	int max = 0x7fffffff, min = 0x80000000;//int的最大值最小值
//	long temp = 0;
//	while (x != 0)
//	{
//		temp = temp * 10 + x % 10;
//		x /= 10;
//	}
//
//	if (temp>max || temp<min)
//	{
//		return 0;
//	}
//	else
//	{
//		return (int)temp;
//	}
//}

int reverse(int x){
	int y = 0;
	int max = 2147483647;
	int min = -2147483648;
	int lastMax = max % 10;
	int lastMin = min % 10;
	while (x != 0){
		if (y < max / 10 && y > min / 10){
			y = 10 * y + (x % 10);
			x = x / 10;
		}
		else if ((y == max / 10 && x / 10 <= lastMax) || (y == min / 10 && x / 10 >= lastMin)){
			y = 10 * y + (x % 10);
			x = x / 10;
		}
		else{
			y = 0;
			break;
		}
	}
	return y;
}