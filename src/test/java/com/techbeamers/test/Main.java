package com.techbeamers.test;

public class Main{
	public static void main(String[] args){
 
	TestCase1_Negative testCase1Negative = new TestCase1_Negative();
    TestCase1_Positive testCase1Positive = new TestCase1_Positive();
    TestCase2 testCase2 = new TestCase2();
    TestCase3 testCase3 = new TestCase3();
    
    try {
        testCase1Negative.TestCase1_Negative();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    try {
        testCase1Positive.TestCase1_Positive();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    try {
        testCase2.TestCase2();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    try {
        testCase3.TestCase3();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}	