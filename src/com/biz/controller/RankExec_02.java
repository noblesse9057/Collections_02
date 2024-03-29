package com.biz.controller;

import java.util.Random;

public class RankExec_02 {

	public static void main(String[] args) {

		/*
		 * 학번과 국어점수를 각각 배열로 생성하고 학번은 1번부터 순서대로 부여하고 국어점수는 임의값으로 생성하여 저장
		 */ 

		int[] intNum = new int[10];
		int[] intKor = new int[10];

		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = i + 1; // 1번부터 학번부여
			intKor[i] = rnd.nextInt(50) + 51;
		}
		int index = 0;
		for (int num : intNum) {
			System.out.printf("%d:%d \t", num, intKor[index++]);
		}
		System.out.println();
		/* 
		 * 국어점수를 기준으로 오름차순정렬을실행
		 */

		for (int i = 0; i < intKor.length; i++) {
			for (int j = i + 1; j < intKor.length; j++) {

				if (intKor[i] > intKor[j]) {
					//점수에 따라 점수가 담긴 위치가 변동되면 
					int _t1 = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _t1;
					// 학번이 저장된 위치도 변동을 해줘야한다.
					int _t = intNum[i];
					intNum[i] = intNum[j];
					intNum[j] = _t;
				}

			}
		}

		index = 0;
		for (int num : intNum) {
			System.out.printf("%d:%d \t", num, intKor[index++]);
		}
		System.out.println();

	}
}