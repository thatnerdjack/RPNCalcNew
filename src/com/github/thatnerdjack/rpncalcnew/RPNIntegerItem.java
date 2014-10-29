package com.github.thatnerdjack.rpncalcnew;

public class RPNIntegerItem extends RPNStackItem {
	  int myInt;
	  
	  RPNIntegerItem(int i) {
		  myInt = i;
	  }
	  
	  public String toString() {
		  return String.valueOf(myInt);
	  }
}
