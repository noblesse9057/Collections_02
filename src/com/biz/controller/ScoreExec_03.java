package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

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
			// 1�����
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			
			sVOs[i] = new ScoreVO();
			sVOs[i].setNumber(""+(i+1));
			sVOs[i].setKor(intKor);
			sVOs[i].setEng(intEng);
			sVOs[i].setMath(intMath);
			
			//2�����
			sVOs[i].setKor(rnd.nextInt(50)+51);
			sVOs[i].setEng(rnd.nextInt(50)+51);
			sVOs[i].setMath(rnd.nextInt(50)+51);
			
			// number �ʵ带 private���� �����߱⶧����
			// �����ڵ�
			
			// ������ number���� �����ҋ� ����� setter method�� ����
			
			// number�ʵ�� String���ε� i ���� int ���̴�
			// sVOs[i].setNumber(i);// �����߻�
			
			// 1. i���� 0���� �����ϹǷ� +1 �����ؼ�
			//		1���� �����ϵ��� ���� ����� �Ѵ�
			// 2. ���� number�ʵ忡 ���� �����ϱ� ���ؼ���
			//		int ���� String ������ ��ȯ�� ���Ѿ� �ȴ�.
			// ������ �ڹ� ���빮��
			sVOs[i].setNumber(Integer.toString(i+1));
			
			// int���� String���� �ٲٴ� �ֱٹ���
			sVOs[i].setNumber(""+i+1);
			// ������ ���ڵ�� ��� ���ڸ� ����ȭ ����
			// �����Ͽ� number���� 01, 11, 21, 31�������� �ٲ�� �ȴ�.
			
			// ���� ���� i���� +1�� �����ؼ� ���ڰ����� 1������Ų��
			// ���ڿ��� �ٲپ���Ѵ�.
			sVOs[i].setNumber(""+(i+1));
			
			
			
			// ������ ������ ����
			//1�����
			// int intTotal = intKor+intEng+intMath;
			
			//2�����
			int intTotal = sVOs[i].getKor();
			intTotal += sVOs[i].getEng();
			intTotal += sVOs[i].getMath();
			
			sVOs[i].setTotal(intTotal);
			sVOs[i].setAverage(intTotal/3);
			
			//������ ������ ���
			// for(ScoreVO vo : sVOs){
			// 	   int intKor =vo.getKor();
			//	   int intEng = vo.getEng();
			//	   int intMath = vo.getMath();
			//     int intTotal = intKor + intEng + intMath;
			System.out.println(sVOs[i].toString());
				
			
			
		
		
		}
	}
}
