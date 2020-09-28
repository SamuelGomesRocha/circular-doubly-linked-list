package application;
import entities.CircularDoublyLinkedList;

public class Program {
	public static void main(String[] args) {
	
		CircularDoublyLinkedList list1 = new CircularDoublyLinkedList();
//		CircularDoublyLinkedList list2 = new CircularDoublyLinkedList();
		
		list1.addFim("casa", 1200.00);
		list1.addFim("carro", 12200.00);
		list1.addFim("casar", 13200.00);
		list1.addInicio("Lucas", 55.55);
		list1.addInicio("Cabeça", 105.55);
		
		list1.removerPrimeiroNo();
		list1.printList();
		
	}
}
