package com.capgemini.datastructuresproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {
	//UC3...
	@Test
	public void given3NumbersWhenEnqueuedToQueueFirstEnqueuedToBeAtTop() {
		MyQueue<Integer> myQueue=new MyQueue<>();
		MyNode myFirstNode=new MyNode(56);
		MyNode mySecondNode=new MyNode(30);
		MyNode myThirdNode=new MyNode(70);
		
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
	
		INode peekNode=myQueue.peek();
		boolean result=peekNode.equals(myFirstNode);
		assertTrue(result);
		
	}
	//UC4...
	@Test
	public void given3NumbersFirstDequeuedNodeToBeTheTop() {
		MyQueue<Integer> myQueue=new MyQueue<>();
		MyNode myFirstNode=new MyNode(56);
		MyNode mySecondNode=new MyNode(30);
		MyNode myThirdNode=new MyNode(70);
		
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		
		
		INode peekNode=myQueue.dequeue();
		myQueue.printMyQueue();
		boolean result=peekNode.equals(myFirstNode);
		assertTrue(result);
	}

}
