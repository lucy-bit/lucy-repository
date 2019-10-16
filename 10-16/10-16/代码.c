#define _CRT_SECURE_NO_WARNINGS 1
//1.题目描述
//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
//你可以假设除了整数 0 之外，这个整数不会以零开头。
//示例 1:
//输入 : [1, 2, 3] 输出 : [1, 2, 4] 解释 : 输入数组表示数字 123。
//	示例 2 :
//输入 : [4, 3, 2, 1] 输出 : [4, 3, 2, 2] 解释 : 输入数组表示数字 4321。


//
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
		
class Solution {
	public double myPow(double x, int n) {
		double res = 1.0;
		for (int i = n; i != 0; i /= 2){
			if (i % 2 != 0){
				res *= x;
			}
			x *= x;
		}
		return  n < 0 ? 1 / res : res;
	}
}

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