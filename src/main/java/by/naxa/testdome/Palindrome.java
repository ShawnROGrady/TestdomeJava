//  Created by Shawn O'Grady on 12/7/17.
//  Copyright © 2017 Shawn O'Grady. All rights reserved.
//
/*
 This code is a practice Java interview question from testdome.com
 https://www.testdome.com/questions/java/palindrome/7283?visibility=1&skillId=4
 Problem statement: Write a function that checks if a given word is a palindrome. Character case should be ignored.
 
 +Passes 3/3 tests
 */
package by.naxa.testdome;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        int stringLength=word.length();
        for(int i=0; i<stringLength; i++){
        	if(Character.toLowerCase(word.charAt(i))!=Character.toLowerCase(word.charAt(stringLength-i-1))){
        		return false;
        	}
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
