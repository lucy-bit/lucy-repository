#define _CRT_SECURE_NO_WARNINGS 1

import java.util.Arrays;

/**
* Created with IntelliJ IDEA.
* Description:˳���
* User: GAOBO
* Date: 2019-10-26
* Time: 15:26
*/
class MyArrayList {
	//����
	private int[] elem;
	private int usedSize;//��Ч���ݵĸ���
	private final int CAPACITY = 5;

	public MyArrayList() {
		this.elem = new int[CAPACITY];
		this.usedSize = 0;
	}
	//����
	// ��ӡ˳���
	public void display() {
		for (int i = 0; i < this.usedSize; i++) {
			System.out.print(this.elem[i] + " ");
		}
		System.out.println();
	}

	private boolean isFull() {
		/*if(this.usedSize == this.elem.length) {
		return true;
		}
		return false;*/
		return this.usedSize == this.elem.length;
	}
	// �� pos λ������Ԫ��
	public void add(int pos, int data) {

		if (isFull()) {
			//��������
			this.elem = Arrays.copyOf(
				this.elem, this.elem.length * 2);
		}

		if (pos < 0 || pos > this.usedSize) {
			System.out.println("��λ�ò��Ϸ�");
			return;
		}

		//1��Ų����
		for (int i = this.usedSize - 1; i >= pos; i--) {
			this.elem[i + 1] = this.elem[i];
		}
		this.elem[pos] = data;
		this.usedSize++;
	}

	// �ж��Ƿ����ĳ��Ԫ��
	public boolean contains(int toFind) {
		for (int i = 0; i < this.usedSize; i++) {
			if (this.elem[i] == toFind) {
				return true;
			}
		}
		return false;
	}
	// ����ĳ��Ԫ�ض�Ӧ��λ��
	public int search(int toFind) {
		for (int i = 0; i < this.usedSize; i++) {
			if (this.elem[i] == toFind) {
				return i;
			}
		}
		return -1;
	}
	// ��ȡ pos λ�õ�Ԫ��
	public int getPos(int pos) {
		if (pos < 0 || pos >= this.usedSize) {
			System.out.println("posλ�ò��Ϸ�");
			return -1;//����û��posλ��
		}

		return this.elem[pos];
	}
	// �� pos λ�õ�Ԫ����Ϊ value
	public void setPos(int pos, int value) { }
	//ɾ����һ�γ��ֵĹؼ���key
	public void remove(int toRemove) {
		int index = search(toRemove);
		if (index == -1) {
			System.out.println("�Ҳ���Ҫɾ��������");
			return;
		}
		for (int i = index; i < this.usedSize - 1; i++) {
			this.elem[i] = this.elem[i + 1];
		}
		this.usedSize--;
	}
	// ��ȡ˳�����
	public int size() {
		return this.usedSize;
	}
	// ���˳���
	public void clear() {
		this.usedSize = 0;
	}
}


