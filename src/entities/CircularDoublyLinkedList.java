package entities;

public class CircularDoublyLinkedList {

	private Node currentNode;
	
	
	public boolean isEmpty() {
		if(currentNode == null) {
		return true;
		}
		return false;
	}
	
	
	public void addInicio(String element, Double price) {
		Node novo = new Node();
		novo.setElement(element);
		novo.setPrice(price);
		if(currentNode == null) {
			currentNode = novo;
			currentNode.setPrev(novo);
			currentNode.setNext(novo);
		}else {
			Node lastNode = currentNode.getPrev();
			lastNode.setNext(novo);
			currentNode.setPrev(novo);
			novo.setPrev(lastNode);
			novo.setNext(currentNode);
			currentNode = novo;
		}		
	}
	
	
	
	public void addFim(String element, Double price) {
		Node novo = new Node();
		novo.setElement(element);
		novo.setPrice(price);
		if(currentNode == null) {
			currentNode = novo;
			currentNode.setPrev(novo);
			currentNode.setNext(novo);
		}else {
			currentNode.getPrev().setNext(novo);
			novo.setPrev(currentNode.getPrev());
			
			currentNode.setPrev(novo);
			novo.setNext(currentNode);
		}
	}

	
	public Node getCurrentNode() {
		return currentNode;
	}

	public void removeNoFinal() {
	Node lastNode = currentNode.getPrev();
	
		if(currentNode == null) {
			System.out.println("Não há nó!");
		}else {
			currentNode.setPrev(lastNode.getPrev());
			lastNode.getPrev().setNext(currentNode);
		}
	}
	
	public void removerPrimeiroNo() {
	Node firstNode = currentNode;
	Node lastNode = currentNode.getPrev();
	if(currentNode == null) {
		System.out.println("Não há nó!");
	}else {
		firstNode.getNext().setPrev(lastNode);
		lastNode.setNext(firstNode.getNext());
		currentNode = lastNode.getNext();
	}
		
	}
		
	
	public void buscaNo(String element) {
	
		while(currentNode.getElement() != element) {
			currentNode = currentNode.getNext();
		}
		
		System.out.println("Element: "+currentNode.getElement());
		System.out.println("Price: "+currentNode.getPrice());
		
	}
	
	
	public void printList() {
		
		Node firstNode = currentNode;
		firstNode = firstNode.getNext();
		do{
			System.out.print(" <-["+currentNode.getElement()+"]->");
			currentNode = currentNode.getNext();
		}	while(currentNode.getNext() != firstNode);
	}

}
