#define _CRT_SECURE_NO_WARNINGS 1
//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。

//
//
//在杨辉三角中，每个数是它左上方和右上方的数的和。
//
//示例 :
//
//输入 : 5
//输出 :
//   [
//	   [1],
//	   [1, 1],
//	   [1, 2, 1],
//	   [1, 3, 3, 1],
//	   [1, 4, 6, 4, 1]
//   ]

//int** generate(int numRows, int* returnSize, int** returnColumnSizes)
//{
//	
//	*returnSize = numRows;
//	*returnColumnSizes = (int *)malloc(sizeof(int)*numRows);
//	int** res = (int**)malloc(sizeof(int*)*numRows);
//
//	for (int i = 0; i < numRows; i++) {
//		(*returnColumnSizes)[i] = i + 1;
//		res[i] = (int*)malloc(sizeof(int)*(i + 1));
//		res[i][0] = 1;
//		res[i][i] = 1;
//		for (int j = 1; j < i; j++) {
//			res[i][j] = res[i - 1][j] + res[i - 1][j - 1];
//		}
//	}
//	return res;
//}


int** generate(int numRows, int* returnSize, int** returnColumnSizes){
	int **ret;
	ret = (int **)malloc(sizeof(int *)* numRows);
	*returnColumnSizes = (int*)malloc(sizeof(int)* numRows);
	int i, j;
	for (i = 0; i < numRows; i++)
	{
		(*returnColumnSizes)[i] = i + 1;
		ret[i] = (int*)malloc(sizeof(int)*(i + 1));
		ret[i][0] = 1;
		ret[i][i] = 1;
	}
	for (i = 1; i < numRows; i++)
	{
		for (j = 1; j < i; j++)
		{
			ret[i][j] = ret[i - 1][j - 1] + ret[i - 1][j];
		}
	}
	*returnSize = numRows;
	return ret;
}