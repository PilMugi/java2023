package s0828;

public class Lotto {

	public static void main(String[] args) {
		System.out.println("ArrayList로 로또 만들기");
		LottoArrayList lotto1 = new LottoArrayList();
		lotto1.getRandomBalls();
		
		
		
		
		
		
		System.out.println("HashSet으로 로또 만들기");
		LottoHashSet lotto2 = new LottoHashSet();
		lotto2.getRandomBalls();
		
		
		
		
	}

}
