#define _CRT_SECURE_NO_WARNINGS 1
//����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
//
//����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
//
//ʾ�� :
//
//���� nums = [2, 7, 11, 15], target = 9
//
//��Ϊ nums[0] + nums[1] = 2 + 7 = 9
//���Է���[0, 1]

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

	return 0;
}
