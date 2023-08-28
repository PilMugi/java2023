package s0828;


import java.util.HashSet;
import java.util.Random;

public class LottoHashSet {

	public void getRandomBalls() {
		HashSet<Integer>	lotto = new HashSet<>();
		while(lotto.size()<6) {
			Random r = new Random();
			Integer num = r.nextInt(45) + 1;
				lotto.add(num);
		}
		System.out.println(lotto.toString());
		
	}

}
