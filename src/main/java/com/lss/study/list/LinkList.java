package com.lss.study.list;

public class LinkList<T> implements List<T> {

	private int size;
	private Node<T> first;
	private Node<T> last;
 	
	public LinkList(){
		size = 0;
		first = new Node<T>(null);
		last = new Node<T>(null);
		first.before = null;
		first.next = last;
		last.before = first;
		last.next = null;
	}
	
	@Override
	public void add(T obj) {
		Node<T> nNode = new Node<T>(obj);
		Node<T> before = last.before;
		
		before.next = nNode;
		nNode.next = last;
		nNode.before = before;
		last.before = nNode;
		
		size ++;
	}

	@Override
	public void remove(int index) {
		
		Node<T> before = getNode(index-1);
		Node<T> next = before.next.next;
		
		before.next = next;
		next.before = before;
		
		size--;
		
	}

	@Override
	public T get(int index) {
		if(index < 0 || index >= size)
			return null;
		
		Node<T> current = first;
		for(int i = 0 ;i <= index ; i++){
			current = current.next;
		}
		
		return current.t;
	}
	

	private Node<T> getNode(int index) {
		if(index < 0 || index >= size)
			return null;
		
		Node<T> current = first;
		for(int i = 0 ;i <= index ; i++){
			current = current.next;
		}
		
		return current;
	}
	

	@Override
	public int size() {
		return size;
	}
	


	private class Node<T>{
		Node<T> next;
		Node<T> before;
		
		public Node(T t){
			this.t = t;
		}
		
	}

}
