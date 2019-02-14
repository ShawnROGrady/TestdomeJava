//  Created by Shawn O'Grady on 12/8/17.
//  Copyright © 2017 Shawn O'Grady. All rights reserved.
//
/*
 This code is a practice Java interview question from testdome.com
 https://www.testdome.com/questions/java/train-composition/11909?visibility=1&skillId=4
 
 Problem statement: A TrainComposition is built by attaching and detaching wagons from the left and the right sides.
    -For example, if we start by attaching wagon 7 from the left followed by attaching wagon 13, again from the left, we get a composition of two wagons (13 and 7 from left to right). 
    -Now the first wagon that can be detached from the right is 7 and the first that can be detached from the left is 13.
    -Implement a TrainComposition that models this problem
 
 +Basically just a dll queue where you can enqueue/dequeue from either end
 
 +Passes 3/3 tests
 */

package by.naxa.testdome;

class TrainNode{
	int value;
	TrainNode leftTrain;
	TrainNode rightTrain;
	
	public TrainNode(int value){
		this.value=value;
		this.leftTrain=null;
		this.rightTrain=null;
	}
	public void setRightTrain(TrainNode right){
		this.rightTrain=right;
	}
	public void setLeftTrain(TrainNode left){
		this.leftTrain=left;
	}
}

public class TrainComposition {
	private TrainNode leftMost;
	private TrainNode rightMost;
	
	public TrainComposition(){
		leftMost=null;
		rightMost=null;
	}
	
    public void attachWagonFromLeft(int wagonId) {
        TrainNode tmp=new TrainNode(wagonId);
        if(leftMost!=null){
        	//trains in composition
        	leftMost.setLeftTrain(tmp);
        	tmp.setRightTrain(leftMost);
        	leftMost=tmp;
        }else{
        	leftMost=tmp;
        	rightMost=tmp;
        }
    }

    public void attachWagonFromRight(int wagonId) {
    	TrainNode tmp=new TrainNode(wagonId);
        if(rightMost!=null){
        	//trains in composition
        	rightMost.setRightTrain(tmp);
        	tmp.setLeftTrain(rightMost);
        	rightMost=tmp;
        }else{
        	leftMost=tmp;
        	rightMost=tmp;
        }
    }

    public int detachWagonFromLeft() {
        TrainNode tmp;
        if(leftMost!=null){
        	tmp=leftMost;
        	leftMost=leftMost.rightTrain;
        	int tmpValue=tmp.value;
        	return tmpValue;
        }else{
        	return 0;
        }
    }

    public int detachWagonFromRight() {
    	TrainNode tmp;
        if(rightMost!=null){
        	tmp=rightMost;
        	rightMost=rightMost.leftTrain;
        	int tmpValue=tmp.value;
        	return tmpValue;
        }else{
        	return 0;
        }
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7 
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}
