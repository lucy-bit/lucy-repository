#define _CRT_SECURE_NO_WARNINGS 1
//ʵ�� int sqrt(int x) ������
//
//���㲢���� x ��ƽ���������� x �ǷǸ�������
//
//���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
//
//ʾ�� 1:
//
//���� : 4
//��� : 2
//
//
//	 ʾ�� 2 :
//
// ���� : 8
//  ��� : 2
//   ˵�� : 8 ��ƽ������ 2.82842...,
//		���ڷ���������������С�����ֽ�����ȥ��
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