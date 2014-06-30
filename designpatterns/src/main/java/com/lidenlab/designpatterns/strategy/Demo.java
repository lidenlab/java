package com.lidenlab.designpatterns.strategy;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AlgorithmUser algorithmUser1 = new AlgorithmUserType1();
		AlgorithmUser algorithmUser2 = new AlgorithmUserType2();
		
		System.out.println(algorithmUser1.tryProcess());
		System.out.println(algorithmUser2.tryProcess());
		
	}

}
