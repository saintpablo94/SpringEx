package com.javalec.ex;

public class MyCalcurator {
	private Calcurator calcurator;
	private int firstNum;
	private int secondNum;

	public void setCalcurator(Calcurator calcurator) {
		this.calcurator = calcurator;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secoundNum) {
		this.secondNum = secoundNum;
	}
	
	public void add() {
		calcurator.add(firstNum, secondNum);
	}
	
	public void substract() {
		calcurator.substract(firstNum, secondNum);
	}
	
	public void multi() {
		calcurator.multi(firstNum, secondNum);
	}
	
	public void divide() {
		calcurator.divide(firstNum, secondNum);
	}
}
