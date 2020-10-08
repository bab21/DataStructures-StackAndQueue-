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
	
	//UC2..
	public INode pop() {
		INode poppedNode=myLinkedList.pop();
		return poppedNode;
	}
	
	//UC2..
	public boolean isEmpty() {
		return myLinkedList.head==null;
	}
	public void printMyStack() {
		myLinkedList.printMyLinkedList();
	}
}
