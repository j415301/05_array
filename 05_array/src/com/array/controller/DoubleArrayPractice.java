package com.array.controller;

import java.util.Random;

public class DoubleArrayPractice {
	
	public void basicDoubleArray() {
		//2차원 배열
		
		int[][] arr = new int[3][3];
		arr[0][0] = 100;
		arr[0][1] = 200;
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		//for문을 이용해서 2차원 배열 처리
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		arr = new int[3][5];
		
		//2차원 배열에 랜덤값 넣기
		for (int i=0 ; i<arr.length ; i++) {//arr.length: arr의 행 길이
			for (int j=0 ; j<arr[i].length ; j++) {//arr[i].length: arr의 열 길이
				arr[i][j] = new Random().nextInt(8);//0~7
			}
		}
		for (int i=0 ; i<arr.length ; i++) {//arr.length: arr의 행 길이
			for (int j=0 ; j<arr[i].length ; j++) {//arr[i].length: arr의 열 길이
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
