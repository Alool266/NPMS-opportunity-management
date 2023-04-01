package com.neu.opportunitymanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String[] oppPhases = {"E","D","C","B","A","S"};
        List<String> list = Arrays.asList(oppPhases);
        String s1 = "D";
        String s2 = "A";

        System.out.println(list.indexOf(s1));
    }

}
