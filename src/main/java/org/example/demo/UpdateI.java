package org.example.demo;

public class UpdateI {
    public int varOfSecondClass = 10;
    static int staticVarOfSecondClass = 10;

    public int getVarOfSecondClass(){
        return this.varOfSecondClass;
    }

    int increaseI(int increaseBy){
        varOfSecondClass = varOfSecondClass + increaseBy;
        return varOfSecondClass;
    }

    static int decreaseI(int decreaseBy){
        staticVarOfSecondClass = staticVarOfSecondClass - decreaseBy;
        return staticVarOfSecondClass;
    }

    final static int reset(){
        staticVarOfSecondClass = 0;
        return staticVarOfSecondClass;
    }
}
