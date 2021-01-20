package com.array.controller;

import java.util.Random;

public class DoubleArray {
	
	public void basicDoubleArray() {
		//2차원 배열: 바둑판 형식의 저장소
		int[][] arr = new int[3][3];
		arr[0][0] = 100;
		arr[0][1] = 200;
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		//for문을 이용해서 2차원 배열 처리
		for (int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		arr = new int[3][5];//열이 5임에도 불구하고 출력해서 나오지 않는 이유는 arr의 길이(stack에 있는 arr에는 행의 갯수(길이)가 들어 있음)를 범위로 하여 for문을 돌렸기 때문
		//2차원 배열에 랜덤 값 넣기
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {//arr->arr[i]로 바꾸니 5열까지 잘 나옴 why? heap의 arr[i]에는 각 행이 가진 열의 갯수가 들어있음
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