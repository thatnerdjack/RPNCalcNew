package com.github.thatnerdjack.rpncalcnew;

public abstract class RPNStackItem {
	RPNStackItem next;
	String myString;
	
	RPNStackItem() {	
	}
	
	RPNStackItem(String s) {
		myString = s;
	}
	
	public String toString() {
		return myString;
	}
}
