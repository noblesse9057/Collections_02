package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {

		// ScoreVO 클래스를 이용해서 10개의 배열을 생성하고
		// 번호는 순서대로 설정하고
		// 이름은 입력하지 않고
		// kor , eng , math 점수를 각각 난수로 생성해서 저장
		// 단 점수는 51~100점까지
		// 입력(저장된)값을 콘솔에서 확인하고
		// 총점과 평균을 계산해 봅시다.

		ScoreVO[] sVOs = new ScoreVO[10];

		Random rnd = new Random();
		for (int i = 0; i < sVOs.length; i++) {
			// 1번방법
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			
			sVOs[i] = new ScoreVO();
			sVOs[i].setNumber(""+(i+1));
			sVOs[i].setKor(intKor);
			sVOs[i].setEng(intEng);
			sVOs[i].setMath(intMath);
			
			//2번방법
			sVOs[i].setKor(rnd.nextInt(50)+51);
			sVOs[i].setEng(rnd.nextInt(50)+51);
			sVOs[i].setMath(rnd.nextInt(50)+51);
			
			// number 필드를 private으로 선언했기때문에
			// 다음코드
			
			// 때문에 number값을 저장할떄 사용할 setter method를 만들
			
			// number필드는 String형인데 i 값은 int 형이다
			// sVOs[i].setNumber(i);// 오류발생
			
			// 1. i값은 0부터 시작하므로 +1 실행해서
			//		1부터 시작하도록 설정 해줘야 한다
			// 2. 따라서 number필드에 값을 저장하기 위해서는
			//		int 형을 String 형으로 변환을 시켜야 된다.
			// 기존의 자바 전통문법
			sVOs[i].setNumber(Integer.toString(i+1));
			
			// int형을 String으로 바꾸는 최근문법
			sVOs[i].setNumber(""+i+1);
			// 하지만 이코드는 모든 숫자를 문자화 한후
			// 연결하여 number값을 01, 11, 21, 31형식으로 바뀌게 된다.
			
			// 따라서 먼저 i값에 +1을 실행해서 숫자값으로 1증가시킨후
			// 문자열로 바꾸어야한다.
			sVOs[i].setNumber(""+(i+1));
			
			
			
			// 과목의 점수를 세팅
			//1번방법
			// int intTotal = intKor+intEng+intMath;
			
			//2번방법
			int intTotal = sVOs[i].getKor();
			intTotal += sVOs[i].getEng();
			intTotal += sVOs[i].getMath();
			
			sVOs[i].setTotal(intTotal);
			sVOs[i].setAverage(intTotal/3);
			
			//총점을 별도로 계산
			// for(ScoreVO vo : sVOs){
			// 	   int intKor =vo.getKor();
			//	   int intEng = vo.getEng();
			//	   int intMath = vo.getMath();
			//     int intTotal = intKor + intEng + intMath;
			System.out.println(sVOs[i].toString());
				
			
			
		
		
		}
	}
}
