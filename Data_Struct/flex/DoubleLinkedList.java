public class DoubleLinkedList{
	
	// Definição de cada celula;
	class Node{
		Integer data;
		Node next;
		Node prev;

		Node(Integer data){
			this.data = data;
			next = prev = null;
		}

	}
	
	private Node head;
	private Node tail;

	DoubleLinkedList(){
			head = new Node();
			tail = head;
	}

	

	public void insertFront(int element){
		Node tmp = new Node(element);
		tmp.next = head.next;
		head.next.prev = tmp;
		tmp.prev = head;
		head.next = tmp;
		if(head == tail){
			tail = tmp;
		}
	}

	public void insertBack(int element){
		Node tmp = new Node(element);
		
	}

}
