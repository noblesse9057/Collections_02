package com.biz.controller;

import com.biz.model.ScoreVO;

public class ScoreExec_02 {

	public static void main(String[] args) {

		// ScoreVO Ŭ������ �̿��ؼ� 2���� �迭�� ����
		// ���� �迭�� 2���� ������ ����
		ScoreVO[] sVOs= new ScoreVO[2];//�迭����
		
		// ������ �迭�� ���� 2���� ������ ����
		sVOs[0] = new ScoreVO();
		sVOs[0].setNumber("1");
		sVOs[0].setName("ȫ�浿");
		sVOs[0].setKor(90);
		sVOs[0].setEng(88);
		sVOs[0].setMath(70);
		
		// �������
		int intTotal = sVOs[0].getKor();
		intTotal += sVOs[0].getEng();
		intTotal += sVOs[0].getMath();
		
		sVOs[0].setTotal(intTotal);
		sVOs[0].setAverage(intTotal/3);
		
		System.out.println(sVOs[0].toString());
		
		sVOs[1] = new ScoreVO();
		sVOs[1].setNumber("2"); 
		sVOs[1].setName("������");
		sVOs[1].setKor(70);
		sVOs[1].setEng(98);
		sVOs[1].setMath(90);
		int intTotal1 = sVOs[1].getKor();
		intTotal1 += sVOs[1].getEng();
		intTotal1 += sVOs[1].getMath();
		
		sVOs[1].setTotal(intTotal1);
		sVOs[1].setAverage(intTotal1/3);
		
		System.out.println(sVOs[1].toString());
		
		
	}

}