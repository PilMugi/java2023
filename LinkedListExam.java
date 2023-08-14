package s0814;

import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("송우기");
		list.add("조미연");
		list.add("예슈화");
		System.out.println(list.toString());
		
		System.out.println("------------");
		
		System.out.println(list.getFirst());
		
		System.out.println("------------");
		
		System.out.println(list.getLast());
		
		list.addFirst("전소연");
		
		list.addLast("김민니");
		
		System.out.println("------------");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("------------");
		

	}

}
