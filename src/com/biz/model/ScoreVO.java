package com.biz.model;

/*
 *  VO : Value Object Ŭ����
 *  1��ü��(���, å)�� �����͸� �����ؼ� �޼��尣, Ŭ��������
 *  �̵��Ҷ� �ٱ���ó�� ����ϴ� Ŭ����
 *  
 *  Dto(Data Transfer Object)
 */
public class ScoreVO {
	
	/* vo ���� Ư¡
	 *  1. �������(�ʵ�)�� ���ʿ��� �뵵�� �ƴϸ� ��ü��
	 *  	private���� ������ �Ѵ�.
	 * 	2. ��������� �ܺο��� ����(����,�б�)�Ҽ� �ֵ���
	 * 		getter�� setter �޼��带 �����ؼ� ����Ѵ�.
	 * 		== �������� ����(���߱�)�ؼ� �����͸� ��ȣ�ϴ� ����
	 *  3. toString() �޼��带 �� ����(Override)�ؼ� �ʵ忡
	 *  	����� ���� �ܺο��� Ȯ���Ҽ� �ֵ��� �Ѵ�.
	 */
	
	private String number; // strNumber
	private String name;   // strName
	private int kor;	   // intKor
	private int eng;	   // intEng	
	private int math;	   // intMath
	
	private int total;
	private int average;
	
	private int rank;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	// toString()�� ���� Object Ŭ������ ���ǵǾ� �ִ� method�̸�
	// ��ü�� ����� �޸� �ּҸ� �˷��ִ� method�̴�
	// �� method�� �� �ʵ��� ���� Ȯ�ν����ִ� �뵵�� ����
	@Override
	public String toString() {
		return "ScoreVO [number=" + number + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", total=" + total + ", average=" + average + ", rank=" + rank + "]";
	}
	
	
	


}
