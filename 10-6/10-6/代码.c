#define _CRT_SECURE_NO_WARNINGS 1

//
//����һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��
//ʾ�� 1:
//���� : 123
//��� : 321


//int reverse(int x)
//{
//	int max = 0x7fffffff, min = 0x80000000;//int�����ֵ��Сֵ
//	long rs = 0;//��long�����ж����
//	for (; x; rs = rs * 10 + x % 10, x /= 10);//��������ͨ�ԣ����õ������Ǹ�ֵ
//	return rs>max || rs<min ? 0 : rs;//�������ֵ������Сֵ�ͷ���0
//}

//
//int reverse(int x){
//	int max = 0x7fffffff, min = 0x80000000;//int�����ֵ��Сֵ
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