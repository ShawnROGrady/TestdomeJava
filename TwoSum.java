//  Created by Shawn O'Grady on 12/7/17.
//  Copyright © 2017 Shawn O'Grady. All rights reserved.
//
/*
 This code is a practice Java interview question from testdome.com
 
 https://www.testdome.com/questions/java/two-sum/10284?visibility=1&skillId=4
 
 Problem statement: Write a function that, given a list and a target sum, returns zero-based indices of any two distinct elements whose sum is equal to the target sum. If there are no such elements, the function should return null.

 */
package TwoSum;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
    }
}
