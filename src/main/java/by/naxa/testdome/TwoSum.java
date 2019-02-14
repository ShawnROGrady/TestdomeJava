//  Created by Shawn O'Grady on 12/7/17.
//  Copyright © 2017 Shawn O'Grady. All rights reserved.
//
/*
 This code is a practice Java interview question from testdome.com
 
 https://www.testdome.com/questions/java/two-sum/10284?visibility=1&skillId=4
 
 Problem statement: Write a function that, given a list and a target sum, returns zero-based indices of any two distinct elements whose sum is equal to the target sum. If there are no such elements, the function should return null.

 +passes 3/4 tests
 	-code takes too long to answer when array has large # of elements
 */
package by.naxa.testdome;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        int listLength=list.length;
        int[] match=new int[2];
        
        for(int i=0; i<listLength; i++){
        	for(int j=i+1; j<listLength; j++){
        		if(list[i]+list[j]==sum){
        			match[0]=i;
        			match[1]=j;
        			return match;
        		}
        	}
        }
        return null;	//yes this results in an exception, but it's what specification said to do
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 10);
        System.out.println(indices[0] + " " + indices[1]);
    }
}
