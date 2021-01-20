package com.array.controller;

import java.util.Random;
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
		
		//배열 오름차순
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
		
		//배열 내림차순
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
		//int 10 배열을 선언하고 4,5,9,10,22,4,53,12,16,88 대입
		//값에서 짝수와 홀수 갯수 출력하기
		int[] nums = {4,5,9,10,22,4,53,12,16,88};
		int count = 0;
		for (int i=0 ; i<nums.length ; i++) {
			if (nums[i]%2==0) {
				count++;
			}
		}
		System.out.println("짝수: "+count+"\t홀수: "+(nums.length-count));
	}
	
	public void randomTest() {
		//랜덤 값(숫자) 출력하기
		System.out.println(Math.random());
		
		//random 값 정수 변경 방법
		System.out.println((int)(Math.random()*10));//0~9
		System.out.println((int)(Math.random()*5)+1);//1~5
		System.out.println((int)(Math.random()*44)+1);//1~44
		System.out.println();
		
		//로또: 1~45 사이의 6개의 번호가 중복 없이 들어가야 함
		//int 6개짜리 배열을 만들고 각 인덱스에 랜덤값 넣기 (단, 1~28까지의 번호여야 함)
		//**********************중복 없애기
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
		
		//Random 객체의 nextInt(범위값) 기능을 이용하는 방법
		System.out.println(new Random().nextInt(10));//0~9
	}
	
	public void copyArray() {
		//배열을 복사해보자
		//1. 얕은 복사
		String[] hobby = {"스마트폰", "축구", "낚시", "청소"};
		String[] hobby2 = hobby;//앝은 복사
		System.out.println(hobby);
		System.out.println(hobby2);
		
		hobby2[0] = "코딩";//원본값 수정
		System.out.println(hobby[0]);
		System.out.println(hobby2[0]);
		System.out.println();
		
		//2. 깊은 복사
		String[] hobby3 = new String[hobby.length];
		for (int i=0 ; i<hobby.length ; i++) {
			hobby3[i] = hobby[i];
		}
		hobby[0] = "수영";
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
		hobby4[2] = "농구";
		System.out.println(hobby[2]);
		System.out.println(hobby4[2]);
	}
}
