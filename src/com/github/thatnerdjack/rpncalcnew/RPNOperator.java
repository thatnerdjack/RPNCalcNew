package com.github.thatnerdjack.rpncalcnew;

public abstract class RPNOperator extends RPNStackItem {
	String mySymbol;
	int nArguments;
	
	
	public RPNOperator(String s, int n) {
		mySymbol = s;
		nArguments = n;
	}
	
	public String toString() {
		return mySymbol;
	}
	
	public void typeError() {
		System.err.println("operator " + mySymbol + ": invalidArguments");
	}
	
	public abstract void evaluate(RPNStack stack);
}
