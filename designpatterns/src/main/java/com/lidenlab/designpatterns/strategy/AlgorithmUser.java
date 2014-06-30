package com.lidenlab.designpatterns.strategy;

/**
 * Could use Strategy without inheritance
 * @author fliden
 *
 */
public abstract class AlgorithmUser {

	public Algorithm algorithm;
	
	public String tryProcess(){
		return algorithm.process();
	}

	public void setAlgorithm(Algorithm algorithm){
		this.algorithm = algorithm;
	}
}
