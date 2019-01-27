package linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserInterface {
	 public static void main(String[] args) {
			LinkedList linkedList = new LinkedList();
			Integer[] arr = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			List<Integer> list = Arrays.asList(arr);

			Collections.shuffle(list);
			
			for (int i = 0; i < list.size(); i++) {
				linkedList = linkedList.addNewNode(linkedList,list.get(i));
			}
			
			System.out.print("Linked List Before Sorting: ");
			linkedList.viewLinkedList();

			linkedList.setHead(linkedList.sort(linkedList.getHead()));
			
			System.out.println("");
			
			System.out.print("Linked List After Sorting: ");
			linkedList.viewLinkedList();
		
	}
}
