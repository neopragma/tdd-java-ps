package com.neopragma.tdd2;

public class Calc {
    public Double sum(Double... val) {
        Double res = 0.0;
        for (Double num : val) {
            res += num;
        }
        return res;
    }
}
