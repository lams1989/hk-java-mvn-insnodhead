package com.lams1989.insnodhead;

public class AppInsNodHead {
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		
		public SinglyLinkedListNode tail;
		
		public SinglyLinkedList() {
			
			this.tail = null;
		}

	}

	public static void main(String args[]) {

		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 141, 302, 164, 530, 474 };

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = insertNodeAtHead(llist.tail, llistItem[i]);
			llist.tail = llist_head;
		}
		System.out.println(llist.tail.data);
	}

	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
		 SinglyLinkedListNode nodeInsert = new SinglyLinkedListNode(data);
		    if (head == null) {
		    	return nodeInsert;
		    }
		    nodeInsert.next = head;
		    return nodeInsert;
	}
}
