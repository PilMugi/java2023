package s0904;

import java.util.Scanner;

public class RobotRace {

	public static void main(String[] args) {
		
		System.out.println("로봇 선택: ");
		Scanner s = new Scanner(System.in);
		String myRobot = s.next();
		
		Race a = new Race("A");
		Race b = new Race("B");
		Race c = new Race("C");
		
		a.start();
		b.start();
		c.start();
		
	}

}

class Race extends Thread{
	
	static int score = 0;
	int myScore = 0;
	String name;
	Race(String name){
		this.name = name;
	}
	@Override
	public void run() {
		
		for(int i = 0; i<10; i++) {
			if(name.equals("A")) {
				System.out.println("A");
			}else if(name.equals("B")) {
				System.out.println("\tB");
			}else if(name.equals("C")) {
				System.out.println("\t\tC");
		
			}
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		score = score + 1;
		myScore = score;
		System.out.println(name + "이 결승선에 도착함");
		System.out.println(name + ": " + myScore + "등");
	}
	
}