package ch18;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer = new Gamer(50);
		Memento m = gamer.createMemento();
		
		for(int i=0; i<20; i++) {
			System.out.println(" === "+i);
			System.out.println(" 현상 : "+gamer);
			gamer.bet();
			System.out.println(" 소지금 : "+gamer.getMoney());
			if(gamer.getMoney() > m.getMoney()) {
				m = gamer.createMemento();
			}else if(gamer.getMoney() < m.getMoney() / 2) {
				gamer.restoreMemento(m);
			}
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			System.out.println("");
		}
	}

}
