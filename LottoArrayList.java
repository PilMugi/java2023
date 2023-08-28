package s0828;

import java.util.ArrayList;
import java.util.Random;

public class LottoArrayList {

	public void getRandomBalls() {
		ArrayList<Integer>	lotto = new ArrayList<>();
		while(lotto.size()<6) {
			Random r = new Random();
			Integer num = r.nextInt(45) + 1;
			if(lotto.contains(num))
				continue;
			else
				lotto.add(num);
		}
		System.out.println(lotto.toString());
		
	}

}
