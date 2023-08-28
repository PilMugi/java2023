package s0828;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		HashMap<Integer, String>	map = new HashMap<>();
		map.put(20318, "송우기");
		map.put(20319, "정진수");
		map.put(20320, "조미연");
		map.put(20321, "예슈화");
		map.put(20322, "김민니");
		
		System.out.println(map.toString());
		System.out.println(map.size());
		
		System.out.println(map.get(20318));
		map.put(20319, "전소연");
		System.out.println(map.toString());
		
		for (Integer a : map.keySet()) {
			System.out.println(a);
		}
		
		for(String b : map.values()) {
			System.out.println(b);
		}
		
		for (Integer a : map.keySet()) {
			System.out.print("학번: " + a);
			System.out.println(" 이름: " + map.get(a));
		}
		
		map.remove(20321);
		map.clear();
		System.out.println(map.toString());
		
	}

}
