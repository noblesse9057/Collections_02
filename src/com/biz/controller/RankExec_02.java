package com.biz.controller;

import java.util.Random;

public class RankExec_02 {

	public static void main(String[] args) {

		/*
		 * �й��� ���������� ���� �迭�� �����ϰ� �й��� 1������ ������� �ο��ϰ� ���������� ���ǰ����� �����Ͽ� ����
		 */ 

		int[] intNum = new int[10];
		int[] intKor = new int[10];

		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = i + 1; // 1������ �й��ο�
			intKor[i] = rnd.nextInt(50) + 51;
		}
		int index = 0;
		for (int num : intNum) {
			System.out.printf("%d:%d \t", num, intKor[index++]);
		}
		System.out.println();
		/* 
		 * ���������� �������� ������������������
		 */

		for (int i = 0; i < intKor.length; i++) {
			for (int j = i + 1; j < intKor.length; j++) {

				if (intKor[i] > intKor[j]) {
					//������ ���� ������ ��� ��ġ�� �����Ǹ� 
					int _t1 = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _t1;
					// �й��� ����� ��ġ�� ������ ������Ѵ�.
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