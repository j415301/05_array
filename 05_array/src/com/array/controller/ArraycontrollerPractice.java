package com.array.controller;

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
		
	}

}
