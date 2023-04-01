package com.neu.opportunitymanagement;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

    public void testm1() throws Exception{
        System.out.println(1/0);
    }

    public static void main(String[] args) throws Exception {
        Test1 t = new Test1();
        t.testm1();
    }
}
