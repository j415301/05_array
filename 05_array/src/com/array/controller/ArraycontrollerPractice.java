package com.array.controller;

import java.util.Random;
import java.util.Scanner;

public class ArraycontrollerPractice {
	
	public void basicArray() {
		//�迭 ����
		int[] nums;
		//System.out.println(nums[0]);
		
		//�迭 �Ҵ�
		nums = new int[5];
//		for (int i=0 ; i<100 ; i++) {
//			System.out.println(nums[i]);
//		}
		
		//�迭 ���� �� �Ҵ�
		int[] nums2 = new int[3];
		System.out.println(nums[0]);
		
		nums[0] = 100;
		System.out.println(nums[0]);
		
		//�迭�� �� ������ ������ �غ���
		String[] names = new String[3];
		names[0] = "������";
		names[1] = "������";
		names[2] = "�Ǽ���";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		//for������ �迭 ����ϱ�
		for (int i=0 ; i<3 ; i++) {
			System.out.println(names[i]);
		}
		
		//���Կ� for�� �����ϱ�
		for (int i=0 ; i<3 ; i++) {
			names[i] = "������! �����!";
		}
		for (int i=0 ; i<3 ; i++) {
			System.out.println(names[i]);
		}
		
		//�迭�� ������ �������(����) �ڷ����� ������
		int[] ages = new int[5];
		ages[0] = 100;
		//ages[1] = "������";//int ��������� �迭�� �ٸ� �ڷ����� �� �� ����
		
		//��������� 3���� String �迭�� �����, 3���� �ּҸ� �Է¹ް� �� �迭�� �����ϰ� ����ϼ���.
		String[] datas = new String[3];
		Scanner sc = new Scanner(System.in);
		for (int i=0 ; i<datas.length ; i++) {
			System.out.print("��: ");
			datas[i] = sc.nextLine();
		}
		for (int i=0 ; i<datas.length ; i++) {
			System.out.println(datas[i]);
		}
		
		System.out.println(datas);
		System.out.println(names);
		
		String[] studentName = new String[5];
		studentName[0] = "������";
		studentName[1] = "�����";
		studentName[2] = "������";
		studentName[3] = "������";
		studentName[4] = "�̿��";
		
		//�л� �̸� �� �������� �ִ��� Ȯ���ϴ� ����
		boolean flag = false;
		for(int i=0 ; i<studentName.length ; i++) {
			if (studentName[i]=="������") {
				flag = true;
			}
		}
		System.out.println(flag? "������" : "�������� ����");
		
		//�Է¹��� �̸��� �ִ��� ã�� ���� ����
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		boolean flag2 = false;
		for (int i=0 ; i<studentName.length ; i++) {
			if (studentName[i].equals(name)) {//String�� ==�� ���� �Ұ�!!!!!!!!����!!!!!!!!!!
				flag2 = true;
			}
		}
		System.out.println(flag2? "������" : "�������� ����");
		
		//�迭�� ������ ���ÿ� �ʱ�ȭ �ϱ� (���� �ٷ� �����ϱ�)
		double[] height = new double[10];
		height[0] = 180.5;
		double[] height2 = {180.5, 170.5, 176.8, 188.5, 190.4};
		for (int i=0 ; i<height2.length ; i++) {
			System.out.println(height2[i]);
		}
		
		//height = {10.2, 20.3, 32.3};//�̹� ������ �迭�� {}�� �Է� ���� �Ұ�
		height = new double[] {10.2, 20.3, 32.3};//�̰� ����
		for (int i=0 ; i<height.length ; i++) {
			System.out.println(height[i]);
		}
	}
	
	public void changeData() {
		//�迭 ������� Ȱ���ϱ�
		
		//�迭 �ȿ� ����� ������ ���� ��ġ ����(�迭�� ���� ����)
		int[] num = {1,4,6,2,3,7};
		for (int i=0 ; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		int temp = num[2];
		num[2] = num[3];
		num[3] = temp;
		
		for (int i=0 ; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		//�迭 ��������
		for (int i=0 ; i<num.length ; i++) {
			for (int j=0 ; j<i ; j++) {
				if (num[i]<num[j]) {
					int t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
		}
		for (int i=0 ; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		//�迭 ��������
		for (int i=0 ; i<num.length ; i++) {
			for (int j=0 ; j<i ; j++) {
				if (num[i]>num[j]) {
					int t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
		}
		for (int i=0 ; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	public void practice1() {
		//int 10 �迭�� �����ϰ� 4,5,9,10,22,4,53,12,16,88 ����
		//������ ¦���� Ȧ�� ���� ����ϱ�
		int[] nums = {4,5,9,10,22,4,53,12,16,88};
		int count = 0;
		for (int i=0 ; i<nums.length ; i++) {
			if (nums[i]%2==0) {
				count++;
			}
		}
		System.out.println("¦��: "+count+"\tȦ��: "+(nums.length-count));
	}
	
	public void randomTest() {
		//���� ��(����) ����ϱ�
		System.out.println(Math.random());
		
		//random �� ���� ���� ���
		System.out.println((int)(Math.random()*10));//0~9
		System.out.println((int)(Math.random()*5)+1);//1~5
		System.out.println((int)(Math.random()*44)+1);//1~44
		System.out.println();
		
		//�ζ�: 1~45 ������ 6���� ��ȣ�� �ߺ� ���� ���� ��
		//int 6��¥�� �迭�� ����� �� �ε����� ������ �ֱ� (��, 1~28������ ��ȣ���� ��)
		//**********************�ߺ� ���ֱ�
		int[] lotto = new int[6];
		for (int i=0 ; i<lotto.length ; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for (int j=0 ; j<i ; j++) {
				if (lotto[i]==lotto[j]) {
					lotto[j] = (int)(Math.random()*45)+1;
				}
			}
		}
		for (int i=0 ; i<lotto.length ; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		//Random ��ü�� nextInt(������) ����� �̿��ϴ� ���
		System.out.println(new Random().nextInt(10));//0~9
	}
	
	public void copyArray() {
		//�迭�� �����غ���
		//1. ���� ����
		String[] hobby = {"����Ʈ��", "�౸", "����", "û��"};
		String[] hobby2 = hobby;//���� ����
		System.out.println(hobby);
		System.out.println(hobby2);
		
		hobby2[0] = "�ڵ�";//������ ����
		System.out.println(hobby[0]);
		System.out.println(hobby2[0]);
		System.out.println();
		
		//2. ���� ����
		String[] hobby3 = new String[hobby.length];
		for (int i=0 ; i<hobby.length ; i++) {
			hobby3[i] = hobby[i];
		}
		hobby[0] = "����";
		System.out.println("hobby");
		for (int i=0 ; i<hobby.length ; i++) {
			System.out.print(hobby[i]+" ");
		}
		System.out.println();
		System.out.println("hobby3");
		for (int i=0 ; i<hobby3.length ; i++) {
			System.out.print(hobby3[i]+" ");
		}
		System.out.println();
		String[] hobby4 = new String[5];
		System.arraycopy(hobby,0,hobby4,2,3);
		for (int i=0 ; i<hobby4.length ; i++) {
			System.out.print(hobby4[i]+" ");
		}
		System.out.println();
		hobby4[2] = "��";
		System.out.println(hobby[2]);
		System.out.println(hobby4[2]);
	}
}
