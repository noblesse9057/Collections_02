package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreRankExec_01 {

	public static void main(String[] args) {

		// ScoreVO Ŭ������ �̿��ؼ� 10���� �迭�� �����ϰ�
		// ��ȣ�� ������� �����ϰ�
		// �̸��� �Է����� �ʰ�
		// kor , eng , math ������ ���� ������ �����ؼ� ����
		// �� ������ 51~100������
		// �Է�(�����)���� �ֿܼ��� Ȯ���ϰ�
		// ������ ����� ����� ���ô�.

		ScoreVO[] sVOs = new ScoreVO[10];

		Random rnd = new Random();
		for (int i = 0; i < sVOs.length; i++) {
			sVOs[i] = new ScoreVO();
			sVOs[i].setNumber("" + (i + 1));
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			sVOs[i].setKor(intKor);
			sVOs[i].setEng(intEng);
			sVOs[i].setMath(intMath);

			int intTotal = sVOs[i].getKor();
			intTotal += sVOs[i].getEng();
			intTotal += sVOs[i].getMath();

			sVOs[i].setTotal(intTotal);
			sVOs[i].setAverage(intTotal / 3);

			System.out.println(sVOs[i].toString());
		}
		for (ScoreVO vo : sVOs) {
			System.out.println(vo.toString());
		}
		System.out.println("===========================================================");
		System.out.println("�����͹� ����ó��");
		System.out.println("===========================================================");
		System.out.println("�й�\t����\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------------------");
		for (ScoreVO vo : sVOs) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%5d\t%3d\n", vo.getNumber(), vo.getKor(), vo.getEng(),
					vo.getMath(), vo.getTotal(), vo.getAverage(), vo.getRank());
		}
		System.out.println("===========================================================");

		// ������ �������� �������� ������ �Ѵ�.
		for (int i = 0; i < sVOs.length; i++) {
			for (int j = i + 1; j < sVOs.length; j++) {
				
				// �ε�ȣ�� ���� > : ������������
				// �ε�ȣ�� ���� < : ������������
				// if
				if (sVOs[i].getTotal() < sVOs[j].getTotal()) {

					ScoreVO _score = sVOs[i];
					sVOs[i] = sVOs[j];
					sVOs[j] = _score;

				}
			}
		}
		// �������� ���ĵ� ���¿��� rank �ʵ忡 ������ �߰�
		 for(int i=0; i<sVOs.length;i++) {
			 sVOs[i].setRank(i+1);
		 }
		 // ������ �߰��� �Ŀ� �ٽ� �й������� ����
		 for (int i = 0; i < sVOs.length; i++) {
				for (int j = i + 1; j < sVOs.length; j++) {
					
					if (Integer.valueOf(sVOs[i].getNumber()) 
							> Integer.valueOf(sVOs[j].getNumber())) {

						ScoreVO _score = sVOs[i];
						sVOs[i] = sVOs[j];
						sVOs[j] = _score;
		System.out.println("===========================================================");
		System.out.println("�����͹� ����ó��");
		System.out.println("===========================================================");
		System.out.println("�й�\t����\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------------------");
		for (ScoreVO vo : sVOs) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%5d\t%3d\n", vo.getNumber(), vo.getKor(), vo.getEng(),
					vo.getMath(), vo.getTotal(), vo.getAverage(), vo.getRank());
		}
		System.out.println("===========================================================");
}
				}
		 }
	}
}
