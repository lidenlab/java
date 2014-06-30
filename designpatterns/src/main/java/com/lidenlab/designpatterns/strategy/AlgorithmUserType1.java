package com.lidenlab.designpatterns.strategy;

public class AlgorithmUserType1 extends AlgorithmUser {

	public AlgorithmUserType1() {
		algorithm = new AlgorithmImpl1();
	}
}
