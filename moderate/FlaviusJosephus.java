import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FlaviusJosephus {

	public static void main(String[] a) throws IOException {
		Scanner s = new Scanner(new File(a[0]));
		while (s.hasNext()) {
			String l = s.nextLine();
			String[] x = l.split(",");
			
			int n = Integer.parseInt(x[0]);
			int m = Integer.parseInt(x[1]);
			
			Node head = new Node();
			head.value = 0;
			CircularList c = new CircularList(head);
			Node node = null;
			for (int i = 1; i < n; i++) {
				node = new Node();
				node.value = i;
				c.add(node);
			}
			node = c.current;
			for (int i = 0; i < n; i++) {
				node = node.next;
			}
			StringBuffer u = new StringBuffer();
			while (c.size > 1) {
				for (int i = 1; i < m; i++) {
					node = c.next();
				}
				u.append(node.value).append(' ');
				node = c.delete();
			}
			u.append(c.current.value);
			System.out.println(u.toString());
		}
	}
}

class Node {
	Node prev;
	Node next;
	int value;
}

class CircularList {
	Node head;
	Node tail;
	Node current;
	int size = 0;
	
	CircularList(Node head) {
		this.head = head;
		this.tail = head;
		head.next = tail;
		head.prev = tail;
		tail.next = head;
		tail.prev = head;
		current = head;
		size = 1;
	}
	
	/**
	 * add as tail
	 */
	void add(Node node) {
		node.prev = tail;
		node.next = head;
		tail.next = node;
		head.prev = node;
		tail = node;
		++size;
	}
	
	Node delete() {
		current.prev.next = current.next;
		current.next.prev = current.prev;
		current = current.next;
		--size;
		return current;
	}
	
	Node next() {
		current = current.next;
		return current;
	}
}
