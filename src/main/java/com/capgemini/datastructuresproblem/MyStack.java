package com.capgemini.datastructuresproblem;

public class MyStack <K>{
	public MyLinkedList<K> myLinkedList;
	
	public MyStack(){
		this.myLinkedList=new MyLinkedList<>();
	}
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}
	public void printMyStack() {
		myLinkedList.printMyLinkedList();
	}
}
