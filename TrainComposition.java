//  Created by Shawn O'Grady on 12/8/17.
//  Copyright © 2017 Shawn O'Grady. All rights reserved.
//
/*
 This code is a practice Java interview question from testdome.com
 https://www.testdome.com/questions/java/user-input/11995?visibility=1&skillId=4
 
 Problem statement: A TrainComposition is built by attaching and detaching wagons from the left and the right sides.
    -For example, if we start by attaching wagon 7 from the left followed by attaching wagon 13, again from the left, we get a composition of two wagons (13 and 7 from left to right). 
    -Now the first wagon that can be detached from the right is 7 and the first that can be detached from the left is 13.
    -Implement a TrainComposition that models this problem
    
 */
package TrainComposition;

public class TrainComposition {
    public void attachWagonFromLeft(int wagonId) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public void attachWagonFromRight(int wagonId) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public int detachWagonFromLeft() {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public int detachWagonFromRight() {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7 
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}
