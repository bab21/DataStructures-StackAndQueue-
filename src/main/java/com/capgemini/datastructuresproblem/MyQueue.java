package com.capgemini.datastructuresproblem;

public class MyQueue<K> {
	private MyLinkedList<K> myLinkedList;
	
	public MyQueue(){
		myLinkedList=new MyLinkedList<>();
	}
	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}
	public INode peek() {
		return myLinkedList.head;
	}
	public void printMyQueue() {
		myLinkedList.printMyLinkedList();
	}
}
