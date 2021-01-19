package com.array.controller;

import java.util.Random;
import java.util.Scanner;

public class ArrayController {
	
	public void basicArray() {
		//배열은 동일함 자료형의 변수 여러 개를 관리하는 것
		//배열의 선언: 변수와 비슷. 자료형 뒤에 [] or 변수명 뒤에 []
		//배열은 선언 후 바로 사용 불가, 꼭 할당을 해서 저장공간을 만들어야 함!!
		//배열의 할당: 자료형[] 변수명 = new 자료형[생성할 변수 칸의 개수];
		
		//배열 선언하기
		int[] nums;
//		System.out.println(nums[0]);//error, 할당이 안 되어 있으므로 출력할 수 있는 값이 아예 없음
		
		//배열 할당하기
		nums = new int[5];
//		for(int i=0 ; i<100 ; i++) {
//			System.out.println(nums[i]);
//		}//for문을 통해 이런 식으로도 접근할 수 있음(엄청나게 많이 쓰임)
		
		//배열 선언과 할당 동시에
		int[] nums2 = new int[3];
		
		//배열의 저장공간에 접근하기
		//배열 할당 시 부여된 인덱스 번호로 저장공간에 접근함
		//배열명[인덱스 번호]; == int a; a
		//nums[0];//nums 배열 저장공간의 첫번째 저장공간(변수) 가져온 것
		System.out.println("nums[0] : "+nums[0]);//0
		//0이 출력되는 이유: 배열은 할당을 통해 저장공간을 만들면 자동으로 default값(0)으로 초기화 됨
		//default: int -> 0, char -> ' ', double -> 0.0, String -> null
		
		//배열의 저장공간에 값 대입하기
		nums[0] = 100;
		System.out.println("nums[0] 대입 후 : "+nums[0]);
		
		//index번호의 최대값을 넘어서 접근을 하면?
//		System.out.println(nums[5]);//코드를 쓰면 에러는 안 나지만, 실행을 하면 에러가 남
		
		//배열의 각 변수에 대입을 해보자.
		String[] names = new String[3];//문자열 변수 3개 만들고 이름 names
		names[0] = "정유정";
		names[1] = "유병승";
		names[2] = "권설영";
				
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
				
		//for문으로 배열 출력하기
		for(int i=0 ; i<3 ; i++) {
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
//		ages[1] = "유병승";//int형 저장공간의 배열에 다른 타입이 들어갈 수 없음
				
		//저장공간이 3개인 String 배열을 만들고, 3개의 주소를 입력받고 각 배열에 저장하고 출력하세요.
		String[] datas = new String[3];
		Scanner sc = new Scanner(System.in);
		datas = new String[2];
		//배열의 크기가 3개에서 2개로 변경됨
		//배열의 길이를 확인하려면 배열명.length
		for (int i=0 ; i<datas.length ; i++) {
			System.out.print("값 입력 : ");
			datas[i] = sc.nextLine();
		}
		for (int i=0 ; i<datas.length ; i++) {
			System.out.println(datas[i]);
		}
		
//		System.out.println(datas);
//		System.out.println(names);
		//배열 이름을 출력하면 변수처럼 값이 나오는 것이 아닌 heap에 위치한 배열 주소를 출력함
		
		String[] studentName = new String[5];
		studentName[0] = "지수현";
		studentName[1] = "김상현";
		studentName[2] = "신충현";
		studentName[3] = "이진주";
		studentName[4] = "이우식";
	
		//학생 이름 중 신충현이 있는지 확인하는 로직
//		boolean check = false;
//		for (int i=0 ; i<studentName.length ; i++) {
//			if (studentName[i].equals("신충현")) {
//				check = true;
//			}
//		}
//		System.out.println(check? "존재합니다" : "존재하지 않습니다");
		
		//입력받은 이름이 있는지 찾는 로직 구현
		System.out.println("학생 이름을 입력하시오.");
		String searchName = sc.next();
		boolean check = false;
		for (int i=0 ; i<studentName.length ; i++) {
			if (studentName[i].equals(searchName)) {//string은 ==로 연산 불가
				check = true;
			}
		}
		System.out.println(searchName+"은 "+(check? "존재합니다" : "존재하지 않습니다"));
		
		//배열을 생성과 동시에 초기화 하기 (값을 바로 대입하기)
		double[] height = new double[10];//배열 생성(선언 및 할당)
		height[0] = 180.5;//초기화
		double[] height2 = {180.5, 170.5, 176.8, 188.5, 190.4};
		for (int i=0 ; i<height2.length ; i++) {
			System.out.println(height2[i]);
		}
		
		//height = {10.2, 20.3, 32.3};//error, 이미 선언한 배열에 {}로 입력할 수 없음
		height = new double[] {10.2, 20.3, 32.3};//배열 선언과 동시에 초기화
		for (int i=0 ; i<height.length ; i++) {
			System.out.println(height[i]);
		}
	}
	
	//배열 저장공간 활용하기
	public void changeData() {
		
		//배열 안에 저장된 데이터 간의 위치조정(배열의 순서 변경)
		int[] num = {1, 4, 6, 2, 3, 7};
		for (int i=0 ; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		int temp = num[2];
		num[2] = num[3];
		num[3] = temp;
		//인덱스 2와 3의 순서 변경
		
		for (int i=0 ; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		//배열 순차 정렬
		//오름차순: 작은 건 앞으로, 큰 건 뒤로
		for(int i=0 ; i<num.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				System.out.println(num[i]+" : "+num[j]);
				if (num[i]<num[j]) {
					//변경하기
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
		
		//내림차순
		for(int i=0 ; i<num.length ; i++) {
			for(int j=0 ; j<i ; j++) {
				System.out.println(num[i]+" : "+num[j]);
				if (num[i]>num[j]) {//오름차순과 부등호만 반대
					//변경하기
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
	
	//int 10 배열을 선언하고 4,5,9,10,22,4,53,12,16,88 대입
	//값에서 짝수와 홀수 갯수 출력하기
	public void practice1() {
		int[] num = {4,5,9,10,22,4,53,12,16,88};
		int count = 0;
		for (int i=0 ; i<num.length ; i++) {
			if(num[i]%2==0) {
				count++;
			}
		}
		System.out.println("짝수: "+count+"개 홀수: "+(num.length-count)+"개");
	}
	
	//랜덤 값(숫자) 출력하기
	public void randomTest() {
		//Math클래스에서 제공하는 random() 함수를 이용하여 출력함
		System.out.println(Math.random());//매소드가 호출(실행)될 때마다 소수점의 랜덤값 출력
		//random값 정수 변경 방법
		System.out.println((int)(Math.random()*10));
		//(int)Math.random()*10으로 안 하는 이유: *연산을 먼저 수행하므로 int로 바꿔도 계속 0이 나옴
		//뒤에 곱해주는 수에 따라 랜덤값의 범위가 정해짐 (ex. 10: 0~9)
		System.out.println((int)(Math.random()*4)+1);//1~5 사이의 랜덤값 출력	}
		
		//1~45를 랜덤으로 출력하기
		System.out.println((int)(Math.random()*44)+1);
		System.out.println();
		
		//로또: 1~45 사이의 6개의 번호가 중복 없이 들어가야 함
		//int 6개짜리 배열을 만들고 각 인덱스에 랜덤값 넣기 (단, 1~28까지의 번호여야 함)
		//**********************중복 없애기
		int[] lotto = new int[6];
		for (int i=0 ; i<lotto.length ; i++) {
			lotto[i] = (int)(Math.random()*27)+1;
			//System.out.print(lotto[i]+" ");
		}
		for (int i=0 ; i<lotto.length ; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
//*****배열에 입력하는 for문 안에 바로 출력문을 넣으면 안되나요?
		//된다! 근데 다만 분리한 이유는 중복값 제거를 위한 코드를 만들기 위해서~~
		
		//Random 객체를 이용하는 방법
		//Random 객체의 nextInt(범위값)기능을 이용함
		System.out.println(new Random().nextInt(10));//0~9
	}
	
	//배열을 복사해보자
	public void copyArray() {
		//1. 얕은 복사: 배열명의 주소값을 복사
		String[] hobby = {"스마트폰", "축구", "낚시", "청소"};
		String[] hobby2 = hobby;//얕은 복사
		System.out.println(hobby);
		System.out.println(hobby2);
		//hobby와 hobby2의 주소가 같음
		System.out.println(hobby[0]);
		System.out.println(hobby2[0]);
		
		//원본 값 수정
		hobby2[0] = "코딩";
		System.out.println(hobby[0]);
		System.out.println(hobby2[0]);
		//hobby와 hobby2가 같은 주소를 공유하고 있기 때문에 아무나 원본 값을 수정할 수 있음
		System.out.println();
		
		//2. 깊은 복사: 배열에 연결되어 공간 복사
		//강의 5교시
		String[] hobby3 = new String[hobby.length];
		for(int i=0 ; i<hobby.length ; i++) {
			hobby3[i] = hobby[i];
		}
		hobby[0] = "수영";
		for (int i=0 ; i<hobby.length; i++) {
			System.out.print(hobby[i]+" ");
		}
		System.out.println();
		System.out.println("hobby3 출력");
		
		for (int i=0 ; i<hobby3.length ; i++) {
			System.out.print(hobby3[i]+" ");
		}
		System.out.println();
		
		String[] hobby4 = new String[5];
		System.arraycopy(hobby, 0, hobby4, 2, 3);
		//arraycopy: 배열을 복사하는 함수
		//복사될 배열, 복사될 배열의 시작 인덱스, 복사해서 넣을 배열, 시작 인덱스, 길이
		for (int i=0 ; i<hobby4.length ; i++) {
			System.out.print(hobby4[i]+" ");
		}
		System.out.println();
		hobby4[2] = "농구";
		System.out.println(hobby[2]);
		System.out.println(hobby4[2]);
	}
}