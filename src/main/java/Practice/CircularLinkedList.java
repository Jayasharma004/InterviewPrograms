package Practice;// Bottomline Interview
// Write a program to check if its a circular linked list

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class CircularLinkedList {
	
	public static boolean isCircular(Node head) {
		if (head == null) {
			return false; // An empty list is not circular
		}
		
		Node current = head;
		while (current.next != null) {
			if (current.next == head) {
				return true; // If a node points back to the head, it's circular
			}
			current = current.next;
		}
		
		return false; // If we reach the end, it's not circular
	}
	
	public static void main(String[] args) {
		// Creating a non-circular linked list
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		
		System.out.println("Is the linked list circular? " + isCircular(head));
		
		// Creating a circular linked list
		Node circularHead = new Node(1);
		circularHead.next = new Node(2);
		circularHead.next.next = new Node(3);
		circularHead.next.next.next = circularHead; // Tests.Point the last node to the head
		
		System.out.println("Is the linked list circular? " + isCircular(circularHead));
	}
}


