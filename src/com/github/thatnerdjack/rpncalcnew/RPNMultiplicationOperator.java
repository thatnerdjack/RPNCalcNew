package com.github.thatnerdjack.rpncalcnew;

/**
 * Created by block7 on 10/31/14.
 */
public class RPNMultiplicationOperator extends RPNOperator {

    public RPNMultiplicationOperator() {
        super("*", 2);
    }

    public void evaluate(RPNStack stack) {
        RPNStackItem aItem = stack.pop();
        RPNStackItem bItem = stack.pop();

        if (! ((aItem instanceof RPNIntegerItem) && (bItem instanceof RPNIntegerItem))) {
            typeError();
            return;
        }

        int a, b;
        a = ((RPNIntegerItem) aItem).myInt;
        b = ((RPNIntegerItem) bItem).myInt;

        stack.push(a * b);
    }

}
