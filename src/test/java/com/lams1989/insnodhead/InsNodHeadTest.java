package com.lams1989.insnodhead;


import com.lams1989.insnodhead.AppInsNodHead.SinglyLinkedList;
import com.lams1989.insnodhead.AppInsNodHead.SinglyLinkedListNode;

import junit.framework.TestCase;

public class InsNodHeadTest extends TestCase{
	
	public void testInsertNodeAtHead() {
		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 141, 302, 164, 530, 474 };

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = AppInsNodHead.insertNodeAtHead(llist.tail, llistItem[i]);
			llist.tail = llist_head;
		}
		int expected =474;
		int actual = llist.tail.data;
		
		assertEquals(expected, actual);

	}
}
