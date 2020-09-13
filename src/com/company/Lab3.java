package com.company;


public class Lab3 {
    public static void main(String[] args) {
        LogicalOperation logic = new LogicalOperation();
        System.out.println(logic.equalText("FastTrackIT", 9));
        System.out.println(logic.compareThreeNumbers(5,5,1));
        System.out.println(logic.isEligibleToVote(39));
        System.out.println(logic.isNumberEven(0));
        System.out.println(logic.parametru(9));
        System.out.println(logic.verifyText("FastTrackIT"));
        int biggest = logic.checkBiggerNumber(100, 1000);
        System.out.println("The bigger number is: " + biggest);
        System.out.println(logic.verifyNumber(9));
        System.out.println(logic.amountSnow(5));
        System.out.println(logic.comparisonNumbers(4));

    }
}
