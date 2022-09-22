package kr.kmooc.dataEngineering.homework1;

import java.util.ListIterator;

public class MyArrayListListIterator<E> implements ListIterator<E> {

	private Object[] data;
	private int cursor;
	
	public MyArrayListListIterator(Object[] data, int index) {
		this.data = data;
		this.cursor = index - 1;
	}
	
	@Override
	public boolean hasNext() {
		if (cursor + 1 < data.length)
			return true;
		else
			return false;
	}

	@Override
	public E next() {
		return (E) data[++cursor];
	}

	@Override
	public boolean hasPrevious() {
		// hasPrevious()는 0보다만 크면 됨.
		// cursor가 0보다 크면, true 반환.
		// cursor가 0보다 작으면, false 반환.
		if (cursor >= 0)
			return true;
		return false;
	}

	@Override
	public E previous() {
		// 현재 cursor의 값을 반환하고 cursor를 -1.
		return (E) data[cursor--];
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(E e) {
		// TODO Auto-generated method stub
		
	}

}
