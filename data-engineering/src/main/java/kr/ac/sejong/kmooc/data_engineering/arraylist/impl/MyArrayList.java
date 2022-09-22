package kr.ac.sejong.kmooc.data_engineering.arraylist.impl;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// List를 상속받아 MyArrayList를 작성
public class MyArrayList<E> implements List<E> {
	
	// 데이터 추상화
	private Object[] data;
	
	// 생성자
	public MyArrayList() {
		// 생성 당시 크기 0
		data = new Object[0];
	}
	
	@Override
	public String toString() {
		if (data.length == 0) {
			return "[]";
		}
		
		String result = "[";
		result += data[0];
		for (int i = 1; i < data.length; i++) {
			result += ", " + data[i];
		}
		result += "]";
		
		return result;
	}

	@Override
	public int size() {
		return data.length;
	}

	@Override
	public boolean isEmpty() {
		// data가 null 또는 length = 0이면, true 반환.
		if (data == null || data.length == 0)
			return true;
		return false;
	}

	@Override
	public boolean contains(Object o) {
		for (Object value : data) {
			if (value.equals(o))
				return true;
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new MyArrayListIterator<E>(data);
	}

	@Override
	public Object[] toArray() {
		return data;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		if (a.length < data.length) {
			// getClass(): 클래스를 가져오는 메소드.
			// componentType(): Class의 componentType을 반환하는 메소드
			// 이를 통해, 'T(type)'를 가져올 수 있음.
			// newInstance(): 새로운 크기와 새로운 타입의 배열을 생성.
			a = (T[]) Array.newInstance(a.getClass().componentType(), data.length);
		}
		
		// T로 형변환하여 a에 넣어줌.
		for (int i = 0; i < data.length; i++) {
			a[i] = (T) data[i];
		}
		
		return a;
	}

	@Override
	public boolean add(E e) {
		// 1. 현재보다 크기가 한 개 더 큰 배열 생성 newData
		Object[] newData = new Object[data.length + 1];
		
		// 2. 현재의 데이터 복사
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		
		// 3. 마지막에 e를 추가
		newData[newData.length - 1] = e;
		
		// 4. newData가 data가 되게 참조
		data = newData;
		
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// Object o의 존재 유무와 그 위치까지 확인 가능.
		int ri = indexOf(o);
		
		// Object o를 찾지 못한 경우
		if (ri == -1)
			return false;
		
		// ri는 지워야 할 index.
		// 1. 크기가 하나 작은 Object[] newData
		Object[] newData = new Object[data.length - 1];
		
		// 2. 복사: ri 이전까지의 데이터를 복사 + ri 이후의 데이터를 복사
		for (int i = 0; i < data.length; i++) {
			if (i == ri)
				break;
			newData[i] = data[i];
		}
		for (int i = ri + 1; i < data.length; i++) {
			// 한 칸씩 미뤄지므로
			newData[i-1] = data[i];
		}
		
		// 3. 새로운 newData가 data
		data = newData;
		
		return true;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		data = new Object[0];
	}

	@Override
	public E get(int index) {
		// index가 범위 밖일 때, 문제 발생.
		// [3, 5, 7] => size 3, last index = 2
		if (index >= data.length || index < 0)
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + data.length);
		
		return (E) data[index];
	}

	@Override
	public E set(int index, E element) {
		if (index >= data.length || index < 0)
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + data.length);
		
		E previous = (E) data[index];
		data[index] = element;
		
		return previous;
	}

	@Override
	public void add(int index, E element) {
		// []
		// add(0, 3)
		// [3]
		
		// []
		// add(1, 3)
		// throw IndexOutOfBoundsException
		// index의 값이 데이터의 length보다 커서는 안됨.
		if (index > data.length || index < 0)
			throw new IndexOutOfBoundsException();
		
		// 1. 크기가 한 개 더 큰 Object[] 생성 newData
		Object[] newData = new Object[data.length + 1];
		
		// 2. 기존의 data를 index 전까지 newData 복사
		for (int i = 0; i < data.length; i++) {
			if (i == index)
				break;
			newData[i] = data[i];
		}
		
		// 3. newData[index] = element;
		newData[index] = element;
		
		// 4. 나머지 data를 index 이후부터 복사
		for (int i = index; i < data.length; i++) {
			newData[i+1] = data[i];
		}
		
		// 5. data = newData;
		data = newData;
	}

	@Override
	public E remove(int index) {
		if (index >= data.length || index < 0)
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + data.length);
	
		E previous = (E) data[index];
		
		// index는 지워야 할 index.
		// 1. 크기가 하나 작은 Object[] newData
		Object[] newData = new Object[data.length - 1];
		
		// 2. 복사: index 이전까지의 데이터를 복사 + index 이후의 데이터를 복사
		for (int i = 0; i < data.length; i++) {
			if (i == index)
				break;
			newData[i] = data[i];
		}
		for (int i = index + 1; i < data.length; i++) {
			// 한 칸씩 미뤄지므로
			newData[i-1] = data[i];
		}
		
		// 3. 새로운 newData가 data
		data = newData;
		
		return previous;
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < data.length; i++) {
			if (data[i].equals(o))
				return i;
		}
		
		// 찾지 못한 경우
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		for (int i = data.length - 1; i >= 0; i--) {
			if (data[i].equals(o))
				return i;
		}
		
		// 찾지 못한 경우
		return -1;
	}

	@Override
	public ListIterator<E> listIterator() {
		return new MyArrayListListIterator<E>(data, 0);
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return new MyArrayListListIterator<E>(data, index);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
