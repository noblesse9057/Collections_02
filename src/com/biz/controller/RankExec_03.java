package com.biz.controller;

import java.util.Random;

public class RankExec_03 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		int[] intTotal = new int[10];
		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = i + 1;
			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;
		}	
		for(int i = 0 ; i< intTotal.length;i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
		}
		System.out.println("===========================================");
		System.out.println("빅데이터반 성적표");
		System.out.println("===========================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\n");
		for (int i = 0; i < intTotal.length; i++) {
			for (int j = i + 1; j < intTotal.length; j++) {
				if (intTotal[i] > intTotal[j]) {
					int _t = intTotal[i];
					intTotal[i] = intTotal[j];
					intTotal[j] = _t;
					int _t1 = intNum[i];
					intNum[i] = intNum[j];
					intNum[j] = _t1;
					int _t2 = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _t2;
					int _t3 = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = _t3;
					int _t4 = intMath[i];
					intMath[i] = intMath[j];
					intMath[j] = _t4;
					
				}

			}
			System.out.printf("%d\t%d\t%d\t%d\t%d", intNum[i], intKor[i], intEng[i], intMath[i], intTotal[i]);
			System.out.println();

		}
	}
}
