package s0814;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		ArrayList<String> list = new ArrayList<>();
		list.add("임필묵");
		list.add("송우기");
		list.add("백인서");
		list.add("이승재");
		list.add("서준민");
		list.add("구예성");
		System.out.println(list.toString());
		list.remove("송우기");
		System.out.println(list.toString());
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("----------------");
		for(String s : list) {
			System.out.println(s);
		}
		
		list.clear();
		System.out.println(list);
		System.out.println("----------------");
		list.add("서울");
		list.add("로봇");
		System.out.println(list);
		
		if(list.contains("서울") == true) {
			System.out.println("서울을 포함하고 있음");
		}

	}

}
