#define _CRT_SECURE_NO_WARNINGS 1


//2.实现一个通讯录；
//通讯录可以用来存储1000个人的信息，每个人的信息包括：
//姓名、性别、年龄、电话、住址
//
//提供方法：
//1. 添加联系人信息
//2. 删除指定联系人信息
//3. 查找指定联系人信息
//4. 修改指定联系人信息
//5. 显示所有联系人信息
//6. 清空所有联系人
//7. 以名字排序所有联系人
//8. 保存联系人到文件
//9. 加载联系人

//1.增加
//2.删减
//3.修改
//4.排序
//5.查找
//6.显示
#include "contact.h"
void Init(Contact* pcon)
{
	assert(pcon);
	pcon->sz = 0;
	//memset(pcon->date, 0, sizeof(pcon->date));
	pcon->date = (PeoInfor *)calloc(CAPACITY, sizeof(PeoInfor));
	if (pcon->date == NULL)
	{
		printf("%s\n", strerror(errno));
		return;
	}
	pcon->capacity = CAPACITY;
}
void CheckCapacity(Contact* pcon)
{
	if (pcon->sz == pcon->capacity)
	{
		//增容
		PeoInfor* ptr = realloc(pcon->date, (pcon->capacity + 2)*sizeof(PeoInfor));
		if (ptr != NULL)
		{
			pcon->date = ptr;
			pcon->capacity += 2;
			printf("增容成功\n");
		}
	}
}

void AddContact(Contact *pcon)
{
	assert(pcon);
	CheckCapacity(pcon);
	printf("请输入名字:");
	scanf("%s", pcon->date[pcon->sz].name);
	printf("请输入性别:");
	scanf("%s", pcon->date[pcon->sz].sex);
	printf("请输入年龄:");
	scanf("%d", &pcon->date[pcon->sz].age);
	printf("请输入电话号码:");
	scanf("%s", pcon->date[pcon->sz].tele);
	printf("请输入地址:");
	scanf("%s", pcon->date[pcon->sz].addr);
	pcon->sz++;
	printf("添加成功\n");
	/*else
	{
		printf("通讯录已满\n");
	}*/
}
static int FindName(char name[],Contact *pcon)
{
	int i = 0;
	for (i = 0; i < pcon->sz; i++)
	{
		if (strcmp(pcon->date[i].name, name) == 0)
			return i;
	}
	return -1;
}
void DeleteContact(Contact *pcon)
{
	assert(pcon);
	char name[NAME_MAX] = { 0 };
	int ret = 0;
	int i = 0;
	if (pcon->sz == 0)
	{
		printf("通讯录为空\n");
		return;
	}
	printf("请输入要删除学生的名字:");
	scanf("%s", name);
	//因为要查找的学生不确定是否存在，所以分情况
	//又因为查找一操作在Delete，Search,Modify中均有应用，所以可以另写一个函数方便调用
	ret = FindName(name,pcon);
	if (ret == -1)
	{
		printf("该学生的信息不存在\n");
		return;
	}
	//通过把要删除的学生后边的每个学生信息都向前移动一位即可实现（这是一种方法，还可以把当前学生信息删除后将最后一个学生的信息移到此处，只是顺序会改变，选择哪种方法看需求）
	for(i = ret; i < pcon->sz-1; i++)
	{
		pcon->date[i] = pcon->date[i + 1];
	}
	pcon->sz--;
	printf("删除成功\n");
}

void ModifyContact(Contact *pcon)
{
	assert(pcon);
	int ret = 0;
	char name[NAME_MAX] = { 0 };
	printf("请输入要修改的学生姓名\n");
	scanf("%s", name);
	ret = FindName(name, pcon);
	if (ret == -1)
	{
		printf("查无此人\n");
		return;
	}
	//找到对应学生后重新输入信息
	printf("请输入名字:");
	scanf("%s", pcon->date[ret].name);
	printf("请输入性别:");
	scanf("%s", pcon->date[ret].sex);
	printf("请输入年龄:");
	scanf("%d", &pcon->date[ret].age);
	printf("请输入电话号码:");
	scanf("%s", pcon->date[ret].tele);
	printf("请输入地址:");
	scanf("%s", pcon->date[ret].addr);
}

void ShowContact(Contact *pcon)
{
	int i = 0;
	printf("%15s\t%5s\t%5s\t%15s\t%20s\t\n","名字","年龄","性别","地址","电话");
	for (i = 0; i < pcon->sz; i++)
	{
		printf("%15s\t%5d\t%5s\t%15s\t%20s\t",
			pcon->date[i].name,
			pcon->date[i].age,
			pcon->date[i].sex,
			pcon->date[i].addr,
			pcon->date[i].tele);
		printf("\n");
	}
}