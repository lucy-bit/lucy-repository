#define _CRT_SECURE_NO_WARNINGS 1

//实现 pow(x, n) ，即计算 x 的 n 次幂函数。
//
//示例 1:
//
//输入 : 2.00000, 10
//输出 : 1024.00000
//
//
//	 示例 2 :
//
// 输入 : 2.10000, 3
//  输出 : 9.26100
//
//
//	   示例 3 :
//
//   输入 : 2.00000, -2
//	输出 : 0.25000
//	 解释 : 2 - 2 = 1 / 22 = 1 / 4 = 0.25
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