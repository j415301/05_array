package com.array.controller;

import java.util.Random;
import java.util.Scanner;

public class ArrayController {
	
	public void basicArray() {
		//�迭�� ������ �ڷ����� ���� ���� ���� �����ϴ� ��
		//�迭�� ����: ������ ���. �ڷ��� �ڿ� [] or ������ �ڿ� []
		//�迭�� ���� �� �ٷ� ��� �Ұ�, �� �Ҵ��� �ؼ� ��������� ������ ��!!
		//�迭�� �Ҵ�: �ڷ���[] ������ = new �ڷ���[������ ���� ĭ�� ����];
		
		//�迭 �����ϱ�
		int[] nums;
//		System.out.println(nums[0]);//error, �Ҵ��� �� �Ǿ� �����Ƿ� ����� �� �ִ� ���� �ƿ� ����
		
		//�迭 �Ҵ��ϱ�
		nums = new int[5];
//		for(int i=0 ; i<100 ; i++) {
//			System.out.println(nums[i]);
//		}//for���� ���� �̷� �����ε� ������ �� ����(��û���� ���� ����)
		
		//�迭 ����� �Ҵ� ���ÿ�
		int[] nums2 = new int[3];
		
		//�迭�� ��������� �����ϱ�
		//�迭 �Ҵ� �� �ο��� �ε��� ��ȣ�� ��������� ������
		//�迭��[�ε��� ��ȣ]; == int a; a
		//nums[0];//nums �迭 ��������� ù��° �������(����) ������ ��
		System.out.println("nums[0] : "+nums[0]);//0
		//0�� ��µǴ� ����: �迭�� �Ҵ��� ���� ��������� ����� �ڵ����� default��(0)���� �ʱ�ȭ ��
		//default: int -> 0, char -> ' ', double -> 0.0, String -> null
		
		//�迭�� ��������� �� �����ϱ�
		nums[0] = 100;
		System.out.println("nums[0] ���� �� : "+nums[0]);
		
		//index��ȣ�� �ִ밪�� �Ѿ ������ �ϸ�?
//		System.out.println(nums[5]);//�ڵ带 ���� ������ �� ������, ������ �ϸ� ������ ��
		
		//�迭�� �� ������ ������ �غ���.
		String[] names = new String[3];//���ڿ� ���� 3�� ����� �̸� names
		names[0] = "������";
		names[1] = "������";
		names[2] = "�Ǽ���";
				
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
				
		//for������ �迭 ����ϱ�
		for(int i=0 ; i<3 ; i++) {
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
//		ages[1] = "������";//int�� ��������� �迭�� �ٸ� Ÿ���� �� �� ����
				
		//��������� 3���� String �迭�� �����, 3���� �ּҸ� �Է¹ް� �� �迭�� �����ϰ� ����ϼ���.
		String[] datas = new String[3];
		Scanner sc = new Scanner(System.in);
		datas = new String[2];
		//�迭�� ũ�Ⱑ 3������ 2���� �����
		//�迭�� ���̸� Ȯ���Ϸ��� �迭��.length
		for (int i=0 ; i<datas.length ; i++) {
			System.out.print("�� �Է� : ");
			datas[i] = sc.nextLine();
		}
		for (int i=0 ; i<datas.length ; i++) {
			System.out.println(datas[i]);
		}
		
//		System.out.println(datas);
//		System.out.println(names);
		//�迭 �̸��� ����ϸ� ����ó�� ���� ������ ���� �ƴ� heap�� ��ġ�� �迭 �ּҸ� �����
		
		String[] studentName = new String[5];
		studentName[0] = "������";
		studentName[1] = "�����";
		studentName[2] = "������";
		studentName[3] = "������";
		studentName[4] = "�̿��";
	
		//�л� �̸� �� �������� �ִ��� Ȯ���ϴ� ����
//		boolean check = false;
//		for (int i=0 ; i<studentName.length ; i++) {
//			if (studentName[i].equals("������")) {
//				check = true;
//			}
//		}
//		System.out.println(check? "�����մϴ�" : "�������� �ʽ��ϴ�");
		
		//�Է¹��� �̸��� �ִ��� ã�� ���� ����
		System.out.println("�л� �̸��� �Է��Ͻÿ�.");
		String searchName = sc.next();
		boolean check = false;
		for (int i=0 ; i<studentName.length ; i++) {
			if (studentName[i].equals(searchName)) {//string�� ==�� ���� �Ұ�
				check = true;
			}
		}
		System.out.println(searchName+"�� "+(check? "�����մϴ�" : "�������� �ʽ��ϴ�"));
		
		//�迭�� ������ ���ÿ� �ʱ�ȭ �ϱ� (���� �ٷ� �����ϱ�)
		double[] height = new double[10];//�迭 ����(���� �� �Ҵ�)
		height[0] = 180.5;//�ʱ�ȭ
		double[] height2 = {180.5, 170.5, 176.8, 188.5, 190.4};
		for (int i=0 ; i<height2.length ; i++) {
			System.out.println(height2[i]);
		}
		
		//height = {10.2, 20.3, 32.3};//error, �̹� ������ �迭�� {}�� �Է��� �� ����
		height = new double[] {10.2, 20.3, 32.3};//�迭 ����� ���ÿ� �ʱ�ȭ
		for (int i=0 ; i<height.length ; i++) {
			System.out.println(height[i]);
		}
	}
	
	//�迭 ������� Ȱ���ϱ�
	public void changeData() {
		
		//�迭 �ȿ� ����� ������ ���� ��ġ����(�迭�� ���� ����)
		int[] num = {1, 4, 6, 2, 3, 7};
		for (int i=0 ; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		int temp = num[2];
		num[2] = num[3];
		num[3] = temp;
		//�ε��� 2�� 3�� ���� ����
		
		for (int i=0 ; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		//�迭 ���� ����
		//��������: ���� �� ������, ū �� �ڷ�
		for(int i=0 ; i<num.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				System.out.println(num[i]+" : "+num[j]);
				if (num[i]<num[j]) {
					//�����ϱ�
					int t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
			System.out.println();
		}
		for (int i=0 ; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		
		//��������
		for(int i=0 ; i<num.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				System.out.println(num[i]+" : "+num[j]);
				if (num[i]>num[j]) {//���������� �ε�ȣ�� �ݴ�
					//�����ϱ�
					int t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
			System.out.println();
		}
		for (int i=0 ; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	//int 10 �迭�� �����ϰ� 4,5,9,10,22,4,53,12,16,88 ����
	//������ ¦���� Ȧ�� ���� ����ϱ�
	public void practice1() {
		int[] num = {4,5,9,10,22,4,53,12,16,88};
		int count = 0;
		for (int i=0 ; i<num.length ; i++) {
			if(num[i]%2==0) {
				count++;
			}
		}
		System.out.println("¦��: "+count+"�� Ȧ��: "+(num.length-count)+"��");
	}
	
	//���� ��(����) ����ϱ�
	public void randomTest() {
		//MathŬ�������� �����ϴ� random() �Լ��� �̿��Ͽ� �����
		System.out.println(Math.random());//�żҵ尡 ȣ��(����)�� ������ �Ҽ����� ������ ���
		//random�� ���� ���� ���
		System.out.println((int)(Math.random()*10));
		//(int)Math.random()*10���� �� �ϴ� ����: *������ ���� �����ϹǷ� int�� �ٲ㵵 ��� 0�� ����
		//�ڿ� �����ִ� ���� ���� �������� ������ ������ (ex. 10: 0~9)
		System.out.println((int)(Math.random()*4)+1);//1~5 ������ ������ ���	}
		
		//1~45�� �������� ����ϱ�
		System.out.println((int)(Math.random()*44)+1);
		System.out.println();
		
		//�ζ�: 1~45 ������ 6���� ��ȣ�� �ߺ� ���� ���� ��
		//int 6��¥�� �迭�� ����� �� �ε����� ������ �ֱ� (��, 1~28������ ��ȣ���� ��)
		//**********************�ߺ� ���ֱ�
		int[] lotto = new int[6];
		for (int i=0 ; i<lotto.length ; i++) {
			lotto[i] = (int)(Math.random()*27)+1;
			//System.out.print(lotto[i]+" ");
		}
		for (int i=0 ; i<lotto.length ; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
//*****�迭�� �Է��ϴ� for�� �ȿ� �ٷ� ��¹��� ������ �ȵǳ���?
		//�ȴ�! �ٵ� �ٸ� �и��� ������ �ߺ��� ���Ÿ� ���� �ڵ带 ����� ���ؼ�~~
		
		//Random ��ü�� �̿��ϴ� ���
		//Random ��ü�� nextInt(������)����� �̿���
		System.out.println(new Random().nextInt(10));//0~9
	}
	
	//�迭�� �����غ���
	public void copyArray() {
		//1. ���� ����: �迭���� �ּҰ��� ����
		String[] hobby = {"����Ʈ��", "�౸", "����", "û��"};
		String[] hobby2 = hobby;//���� ����
		System.out.println(hobby);
		System.out.println(hobby2);
		//hobby�� hobby2�� �ּҰ� ����
		System.out.println(hobby[0]);
		System.out.println(hobby2[0]);
		
		//���� �� ����
		hobby2[0] = "�ڵ�";
		System.out.println(hobby[0]);
		System.out.println(hobby2[0]);
		//hobby�� hobby2�� ���� �ּҸ� �����ϰ� �ֱ� ������ �ƹ��� ���� ���� ������ �� ����
		System.out.println();
		
		//2. ���� ����: �迭�� ����Ǿ� ���� ����
		//���� 5����
		String[] hobby3 = new String[hobby.length];
		for(int i=0 ; i<hobby.length ; i++) {
			hobby3[i] = hobby[i];
		}
		hobby[0] = "����";
		for (int i=0 ; i<hobby.length; i++) {
			System.out.print(hobby[i]+" ");
		}
		System.out.println();
		System.out.println("hobby3 ���");
		
		for (int i=0 ; i<hobby3.length ; i++) {
			System.out.print(hobby3[i]+" ");
		}
		System.out.println();
		
		String[] hobby4 = new String[5];
		System.arraycopy(hobby, 0, hobby4, 2, 3);
		//arraycopy: �迭�� �����ϴ� �Լ�
		//����� �迭, ����� �迭�� ���� �ε���, �����ؼ� ���� �迭, ���� �ε���, ����
		for (int i=0 ; i<hobby4.length ; i++) {
			System.out.print(hobby4[i]+" ");
		}
		System.out.println();
		hobby4[2] = "��";
		System.out.println(hobby[2]);
		System.out.println(hobby4[2]);
	}
}