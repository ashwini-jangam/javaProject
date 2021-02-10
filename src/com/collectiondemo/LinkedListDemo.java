package com.collectiondemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		ll.add(80);
		
		//System.out.println(ll.poll()+" "+ ll);
		//int[] x = {14,15,16,17,18,19,20};
		Object[] x = {"Ashwini",'h',10,true,null,20.36f	};
		ArrayList al  =new ArrayList();
		al.add(100);
		al.add(x);
		al.add(ll);
		al.add(200);
		LinkedList list = (LinkedList) al.get(2);
		
		System.out.println(list.get(4));
		//int[] y = (int[]) al.get(1);
		Object[] y = (Object[]) al.get(1);
		System.out.println(y[3] );
		
		//System.out.println(ll.get(10));
		
		
		
	}

}
