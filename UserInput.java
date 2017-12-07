//  Created by Shawn O'Grady on 12/7/17.
//  Copyright © 2017 Shawn O'Grady. All rights reserved.
//
/*
 This code is a practice Java interview question from testdome.com
 
 Problem statement: User interface contains two types of user input controls: TextInput, which accepts all characters and NumericInput, which accepts only digits.
	-Implement the class TextInput that contains:
		i) Public method void add(char c) - adds the given character to the current value
		ii) Public method String getValue() - returns the current value
	-Implement the class NumericInput that:
		i) Inherits from TextInput
		ii) Overrides the add method so that each non-numeric character is ignored
 */
package userInput;

public class UserInput {
    
    public static class TextInput {}

    public static class NumericInput {}

    public static void main(String[] args) {
        //TextInput input = new NumericInput();
        //input.add('1');
        //input.add('a');
        //input.add('0');
        //System.out.println(input.getValue());
    }
}
