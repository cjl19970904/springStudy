package cjl.spring.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class C {
	public static void main(String[] args) {
		Map a = new HashMap<>();
		Map b = new HashMap<>();
		Map c = new HashMap<>();
		a.put("a",111);
		ArrayList<Map> objects = new ArrayList<>();
		objects.add(a);
		objects.add(b);
		objects.add(c);
		for (Map object : objects) {
			object.put("b",121);
		}
		for ( int i =0;i<10;i++){
			System.out.println(i);
			for (int j = 0 ;j< 100 ;j++){
				System.out.println(j);
				break;
			}
		}
	}
}
