package io.cottagem.java;

class Node{
	public int data;
	public Node next;
	
	public void displayNodeData() {
		System.out.println(data);
	}
}
	 
public class MyLinkedList{
	private Node head;

	//class to insert a node at the start of linked list
	public void InsertFirst(int data){
		Node newNode = new Node();
		
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	
	public void printLinkedList() {
		Node current = head;
		
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		
	//	System.out.println();
	}
}
	