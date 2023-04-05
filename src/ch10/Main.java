package ch10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2){
			System.out.println("Usage : java Main randomseed1 randomseed2");
			System.out.println("Example : java Main 314 15");
			System.exit(0);
		}

		int seed1 = Integer.parseInt(args[0]);
		int seed2 = Integer.parseInt(args[1]);
		Player player1 = new Player("사과", new WinningStrategy(seed1));
		Player player2 = new Player("바나나", new ProbStrategy(seed2));
		for(int i=0; i<1000; i++){
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			if(nextHand1.isStrongerThan(nextHand2)){
				System.out.println(" winner : "+player1);
				player1.win();
				player2.lose();
			}else if(nextHand2.isStrongerThan(nextHand1)){
				System.out.println(" winner : "+player2);
				player2.win();
				player1.lose();
			} else {
				System.out.println("무승부");
				player1.even();
				player2.even();
			}
			
		}
		System.out.println("Total ");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
	}
}
