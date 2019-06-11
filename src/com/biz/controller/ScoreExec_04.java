package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_04 {

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
			sVOs[i].setNumber(""+(i+1));
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			sVOs[i].setKor(intKor);
			sVOs[i].setEng(intEng);
			sVOs[i].setMath(intMath);
			
			int intTotal = sVOs[i].getKor();
			intTotal += sVOs[i].getEng();
			intTotal += sVOs[i].getMath();
			
			sVOs[i].setTotal(intTotal);
			sVOs[i].setAverage(intTotal/3);
			
			System.out.println(sVOs[i].toString());
		}
		for(ScoreVO vo : sVOs) {
			System.out.println(vo.toString());
		}
		System.out.println("===========================================================");
		System.out.println("�����͹� ����ó��");
		System.out.println("===========================================================");
		System.out.println("�й�\t����\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------------------");
		for(ScoreVO vo: sVOs) {
		System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%5d\t%3d\n",
				vo.getNumber(),
				vo.getKor(),
				vo.getEng(),
				vo.getMath(),
				vo.getTotal(),
				vo.getAverage(),
				vo.getRank()
		);
	}
		System.out.println("===========================================================");
		
	}
}