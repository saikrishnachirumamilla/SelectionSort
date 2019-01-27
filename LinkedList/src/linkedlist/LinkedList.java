package linkedlist;

public class LinkedList {
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList addNewNode(LinkedList linkedList, int data) {
		Node newNode = new Node(data);
		if (linkedList.getHead() == null) {
			linkedList.setHead(newNode);
		} else {
			Node node = linkedList.getHead();
			while (node.getNext() != null) {
				node = node.getNext();
			}
			node.setNext(newNode);
		}
		return linkedList;
	}

	public void viewLinkedList() {
		Node currentNode = this.head;
		while (currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
	}
	 
	 public Node sort(Node head) {
		 if(head.getNext() == null) {
			 return head;
		 }
		 
		 Node beforeMin = null;
		 Node minNode = head;
		
		 
		 for ( Node current = head; current.getNext()!=null; current = current.getNext()) {
				 if (current.getNext().getData() < minNode.getData()){
					 minNode = current.getNext();
					 beforeMin = current;
		            } 
		}
		 
		 if(minNode != head) {
			 if(beforeMin == head) {
				head.setNext(minNode.getNext());
				minNode.setNext(head);
				head=minNode;
			 }else {
				Node temp=head.getNext();
				head.setNext(minNode.getNext());
				beforeMin.setNext(head);
				minNode.setNext(temp);
				head=minNode;
			 }
		 }
		 head.setNext(sort(head.getNext()));
		 return head;
	 }
	 
}
