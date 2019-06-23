package com.lss.study.list;

public class ArrList<T> implements List<T> {

	private Object[] arr;
	
	private int size = 0;	// �����ʵ�����ݳ���
	
	public ArrList(){
		arr = new Object[3];
		size = 0;
	}
	
	public void add(T obj) {
		
		if(size == arr.length){
			Object[] tmp = arr;
			arr = new Object[arr.length * 2];
			// tmp.length = 3 arr.length = 6
			for(int i = 0 ;i < tmp.length ; i++){
				arr[i] = tmp[i];
			}
			
		}
		arr[size++] = obj;
	}

	
	public void remove(int index) {
		if(index < 0 || index >= size){
			return;
		}
		// ÿһ���ǰ�ƶ�
		for(int i = index ; i < size - 1; i++){
			arr[i] = arr[i+1];
		}
		// ���һ���ÿ�
		arr[size-1] = null;
		
		size--;
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public T get(int index) {
		if(index >= size || index < 0){
			return null;
		}
		
		return (T) arr[index];
	}
	

	public static <W> void copyArrToList(W[] arr, List<W> list){
		for(int i = 0 ;i < arr.length ; i++){
			list.add(arr[i]);
		}
	}

}
