#define _CRT_SECURE_NO_WARNINGS 1

//ʵ�� pow(x, n) �������� x �� n ���ݺ�����
//
//ʾ�� 1:
//
//���� : 2.00000, 10
//��� : 1024.00000
//
//
//	 ʾ�� 2 :
//
// ���� : 2.10000, 3
//  ��� : 9.26100
//
//
//	   ʾ�� 3 :
//
//   ���� : 2.00000, -2
//	��� : 0.25000
//	 ���� : 2 - 2 = 1 / 22 = 1 / 4 = 0.25
//
//		 
	 

double myPow(double x, int n){
	unsigned int _n;
	_n = n < 0 ? -(n + 1) : n;
	double res = 1;
	double tmp_pow = x;
	while (_n){
		if (_n & 1){
			res *= tmp_pow;
		}
		_n >>= 1;
		tmp_pow *= tmp_pow;
	}
	return n < 0 ? 1.0 / (res * x) : res;
}



//class Solution {
//	public double myPow(double x, int n) {
//		long temp = n;
//		temp = temp>0 ? temp : -temp;
//		double ans = 1;
//		if (n == 0) return 1;
//		double base = x;
//		while (temp > 0){
//			if ((temp & 1) == 1){
//				ans = ans*base;
//			}
//			base = base*base;
//			temp >>= 1;
//		}
//		if (n > 0){
//			return ans;
//		}
//		else{
//			return 1 / ans;
//		}
//	}
//}
//
//
//class Solution {
//	public double myPow(double x, int n) {
//		double res = 1.0;
//		for (int i = n; i != 0; i /= 2){
//			if (i % 2 != 0){
//				res *= x;
//			}
//			x *= x;
//		}
//		return  n < 0 ? 1 / res : res;
//	}
//}