#define _CRT_SECURE_NO_WARNINGS 1


//2.ʵ��һ��ͨѶ¼��
//ͨѶ¼���������洢1000���˵���Ϣ��ÿ���˵���Ϣ������
//�������Ա����䡢�绰��סַ
//
//�ṩ������
//1. �����ϵ����Ϣ
//2. ɾ��ָ����ϵ����Ϣ
//3. ����ָ����ϵ����Ϣ
//4. �޸�ָ����ϵ����Ϣ
//5. ��ʾ������ϵ����Ϣ
//6. ���������ϵ��
//7. ����������������ϵ��
//8. ������ϵ�˵��ļ�
//9. ������ϵ��

//1.����
//2.ɾ��
//3.�޸�
//4.����
//5.����
//6.��ʾ
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
		//����
		PeoInfor* ptr = realloc(pcon->date, (pcon->capacity + 2)*sizeof(PeoInfor));
		if (ptr != NULL)
		{
			pcon->date = ptr;
			pcon->capacity += 2;
			printf("���ݳɹ�\n");
		}
	}
}

void AddContact(Contact *pcon)
{
	assert(pcon);
	CheckCapacity(pcon);
	printf("����������:");
	scanf("%s", pcon->date[pcon->sz].name);
	printf("�������Ա�:");
	scanf("%s", pcon->date[pcon->sz].sex);
	printf("����������:");
	scanf("%d", &pcon->date[pcon->sz].age);
	printf("������绰����:");
	scanf("%s", pcon->date[pcon->sz].tele);
	printf("�������ַ:");
	scanf("%s", pcon->date[pcon->sz].addr);
	pcon->sz++;
	printf("��ӳɹ�\n");
	/*else
	{
		printf("ͨѶ¼����\n");
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
		printf("ͨѶ¼Ϊ��\n");
		return;
	}
	printf("������Ҫɾ��ѧ��������:");
	scanf("%s", name);
	//��ΪҪ���ҵ�ѧ����ȷ���Ƿ���ڣ����Է����
	//����Ϊ����һ������Delete��Search,Modify�о���Ӧ�ã����Կ�����дһ�������������
	ret = FindName(name,pcon);
	if (ret == -1)
	{
		printf("��ѧ������Ϣ������\n");
		return;
	}
	//ͨ����Ҫɾ����ѧ����ߵ�ÿ��ѧ����Ϣ����ǰ�ƶ�һλ����ʵ�֣�����һ�ַ����������԰ѵ�ǰѧ����Ϣɾ�������һ��ѧ������Ϣ�Ƶ��˴���ֻ��˳���ı䣬ѡ�����ַ���������
	for(i = ret; i < pcon->sz-1; i++)
	{
		pcon->date[i] = pcon->date[i + 1];
	}
	pcon->sz--;
	printf("ɾ���ɹ�\n");
}

void ModifyContact(Contact *pcon)
{
	assert(pcon);
	int ret = 0;
	char name[NAME_MAX] = { 0 };
	printf("������Ҫ�޸ĵ�ѧ������\n");
	scanf("%s", name);
	ret = FindName(name, pcon);
	if (ret == -1)
	{
		printf("���޴���\n");
		return;
	}
	//�ҵ���Ӧѧ��������������Ϣ
	printf("����������:");
	scanf("%s", pcon->date[ret].name);
	printf("�������Ա�:");
	scanf("%s", pcon->date[ret].sex);
	printf("����������:");
	scanf("%d", &pcon->date[ret].age);
	printf("������绰����:");
	scanf("%s", pcon->date[ret].tele);
	printf("�������ַ:");
	scanf("%s", pcon->date[ret].addr);
}

void ShowContact(Contact *pcon)
{
	int i = 0;
	printf("%15s\t%5s\t%5s\t%15s\t%20s\t\n","����","����","�Ա�","��ַ","�绰");
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