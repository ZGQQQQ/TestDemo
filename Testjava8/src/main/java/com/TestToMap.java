package com;

import org.junit.Test;
import java.util.HashMap;
import java.util.WeakHashMap;

public class TestToMap {
//	@Test
//	public void testMethod() {
//		Integer key = new Integer(1);
//		String value = "hashMap";
//		HashMap<Integer, String> hashMap = new HashMap<>();
//		hashMap.put(key, value);
//		System.out.println(hashMap);//{1=hashMap}
//		key = null;
//		System.out.println(hashMap);//{1=hashMap}
//		System.gc();
//		System.out.println(hashMap);//{1=hashMap}
//	}

	@Test
	public void testMethod1() {
		Integer key = new Integer(2);
		String value = "WeakhashMap";


		WeakHashMap<Integer, String> hashMap = new WeakHashMap<>();
		hashMap.put(key, value);
		System.out.println(hashMap);//{2=WeakhashMap}
		key = null;
		System.out.println(hashMap);//{2=WeakhashMap}
		System.gc();
		System.out.println(hashMap);//{}
	}
}
