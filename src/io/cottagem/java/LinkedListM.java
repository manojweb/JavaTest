package io.cottagem.java;
import io.cottagem.java.MyLinkedList;

public class LinkedListM {

	public static void main(String[] args) {
		MyLinkedList linklistm =  new MyLinkedList();
		
		for(int i=1; i<=10; ++i) {
		linklistm.InsertFirst(i);
		}
		
		linklistm.printLinkedList();
	}

}
