#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//
//示例 :
//
//给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回[0, 1]

int* twoSum(int* nums, int numsSize, int target, int* returnSize)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < numsSize - 1; i++)
	{
		for (j = i; j < numsSize; j++)
		{
			if ((nums[i] + nums[j]) == target)
			{
				returnSize[0] = i;
				returnSize[1] = j;
				return returnSize;
			}
		}
	}

}

//
//int* twoSum(int* nums, int numsSize, int target)
//{
//	static int a[2] = { 0 };
//
//
//	for (int i = 0; i < numsSize - 1; i++)
//	{
//		for (int j = i + 1; j < numsSize; j++)
//		{
//			if (nums[i] + nums[j] == target)
//			{
//				a[0] = i;
//				a[1] = j;
//				return a;
//			}
//		}
//	}
//	return 0;
//}
int main()
{
	int i = 0;
	//int* twoSum(int* nums, int numsSize, int target, int* returnSize)
	int nums[] = { 2, 7, 11, 15 };
	int target = 9;
	//int a[2] = { 0 };
	int a[2] = { 0 };
	a = twoSum(nums, 4, 9,a);
	for (i = 0; i < 2; i++)
	{
		printf("%d\n", a[i]);
	}
	return 0;
}



