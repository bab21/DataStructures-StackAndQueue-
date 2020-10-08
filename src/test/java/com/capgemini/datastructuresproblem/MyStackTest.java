package com.capgemini.datastructuresproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {
	
	//UC1....
	@Test
	public void given3NumbersWhenPushToStackLastPushedNodeToBeAtTop() {
		MyStack myStack=new MyStack();
		
		MyNode<Integer> myFirstNode=new MyNode(56);
		MyNode<Integer> mySecondNode=new MyNode(30);
		MyNode<Integer> myThirdNode=new MyNode(70);
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		
		myStack.printMyStack();
		INode returnedNode=myStack.peek();
		boolean result=returnedNode.equals(myThirdNode);
		assertTrue(result);
		
	}

}
