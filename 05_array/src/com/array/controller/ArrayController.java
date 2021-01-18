package com.array.controller;

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
		
	}

}