package com.array.controller;

import java.util.Scanner;

public class ArraycontrollerPractice {
	
	public void basicArray() {
		//배열 선언
		int[] nums;
		//System.out.println(nums[0]);
		
		//배열 할당
		nums = new int[5];
//		for (int i=0 ; i<100 ; i++) {
//			System.out.println(nums[i]);
//		}
		
		//배열 선언 및 할당
		int[] nums2 = new int[3];
		System.out.println(nums[0]);
		
		nums[0] = 100;
		System.out.println(nums[0]);
		
		//배열의 각 변수에 대입을 해보자
		String[] names = new String[3];
		names[0] = "정유정";
		names[1] = "유병승";
		names[2] = "권설영";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		//for문으로 배열 출력하기
		for (int i=0 ; i<3 ; i++) {
			System.out.println(names[i]);
		}
		
		//대입에 for문 적용하기
		for (int i=0 ; i<3 ; i++) {
			names[i] = "힘내요! 잠깨고!";
		}
		for (int i=0 ; i<3 ; i++) {
			System.out.println(names[i]);
		}
		
		//배열로 생성된 저장공간(변수) 자료형은 고정됨
		int[] ages = new int[5];
		ages[0] = 100;
		//ages[1] = "유병승";//int 저장공간의 배열에 다른 자료형이 들어갈 수 없음
		
		//저장공간이 3개인 String 배열을 만들고, 3개의 주소를 입력받고 각 배열에 저장하고 출력하세요.
		String[] datas = new String[3];
		Scanner sc = new Scanner(System.in);
		for (int i=0 ; i<datas.length ; i++) {
			System.out.print("값: ");
			datas[i] = sc.nextLine();
		}
		for (int i=0 ; i<datas.length ; i++) {
			System.out.println(datas[i]);
		}
		
		System.out.println(datas);
		System.out.println(names);
		
		String[] studentName = new String[5];
		studentName[0] = "지수현";
		studentName[1] = "김상현";
		studentName[2] = "신충현";
		studentName[3] = "이진주";
		studentName[4] = "이우식";
		
		//학생 이름 중 신충현이 있는지 확인하는 로직
		boolean flag = false;
		for(int i=0 ; i<studentName.length ; i++) {
			if (studentName[i]=="신충현") {
				flag = true;
			}
		}
		System.out.println(flag? "존재함" : "존재하지 않음");
		
		//입력받은 이름이 있는지 찾는 로직 구현
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		boolean flag2 = false;
		for (int i=0 ; i<studentName.length ; i++) {
			if (studentName[i].equals(name)) {//String은 ==로 연산 불가!!!!!!!!제발!!!!!!!!!!
				flag2 = true;
			}
		}
		System.out.println(flag2? "존재함" : "존재하지 않음");
		
		//배열을 생성과 동시에 초기화 하기 (값을 바로 대입하기)
		double[] height = new double[10];
		height[0] = 180.5;
		double[] height2 = {180.5, 170.5, 176.8, 188.5, 190.4};
		for (int i=0 ; i<height2.length ; i++) {
			System.out.println(height2[i]);
		}
		
		//height = {10.2, 20.3, 32.3};//이미 선언한 배열에 {}로 입력 절대 불가
		height = new double[] {10.2, 20.3, 32.3};//이건 가능
		for (int i=0 ; i<height.length ; i++) {
			System.out.println(height[i]);
		}
	}
	
	public void changeData() {
		//배열 저장공간 활용하기
		
		//배열 안에 저장된 데이터 간의 위치 조정(배열의 순서 변경)
		
	}

}
