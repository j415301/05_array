package com.array.controller;

import java.util.Random;

public class DoubleArray {
	
	public void basicDoubleArray() {
		//2���� �迭: �ٵ��� ������ �����
		int[][] arr = new int[3][3];
		arr[0][0] = 100;
		arr[0][1] = 200;
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		//for���� �̿��ؼ� 2���� �迭 ó��
		for (int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		arr = new int[3][5];//���� 5�ӿ��� �ұ��ϰ� ����ؼ� ������ �ʴ� ������ arr�� ����(stack�� �ִ� arr���� ���� ����(����)�� ��� ����)�� ������ �Ͽ� for���� ���ȱ� ����
		//2���� �迭�� ���� �� �ֱ�
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {//arr->arr[i]�� �ٲٴ� 5������ �� ���� why? heap�� arr[i]���� �� ���� ���� ���� ������ �������
				arr[i][j] = new Random().nextInt(8);//0~7
			}
		}
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}