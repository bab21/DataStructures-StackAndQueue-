package com.capgemini.datastructuresproblem;

public class MyStack <K>{
	
	public MyLinkedList<K> myLinkedList;
	
	public MyStack(){
		this.myLinkedList=new MyLinkedList<>();
	}
	
	//UC1..
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}
	//UC1...
	public INode peek() {
		return myLinkedList.head;
	}
	public void printMyStack() {
		myLinkedList.printMyLinkedList();
	}
}
