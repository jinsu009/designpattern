package ch18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {

	private int money;
	private List fruits = new ArrayList();
	private Random random = new Random();
	
	private static String[] fruitsnames = {
			"사과","포도","바나나","딸기"
	};
	
	public Gamer(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void bet() {
		int dice = random.nextInt(6)+1;
		if(dice==1) {
			money +=100;
			System.out.println("소지금 증가");
		}else if(dice == 2) {
			money /= 2;
			System.out.println("소지금 절반 감소");
		}else if(dice == 6) {
			String f = getFruit();
			System.out.println("과일 획득 : "+f);		
			fruits.add(f);
		}else {
			System.out.println("변동 없음");
		}		
	}
	
	public Memento createMemento() {
		Memento m = new Memento(money);
		Iterator it = fruits.iterator();
		while(it.hasNext()) {
			String f = (String)it.next();
			if(f.startsWith("맛있는 ")) {
				m.addFruit(f);
			}
		}
		return m;
	}
	
	public void restoreMemento(Memento memento) {
		this.money = memento.money;
		this.fruits = memento.getFruits();
	}
	
	public String toString() {
		return " money : "+money+" | fruit : "+fruits;
	}
	
	private String getFruit() {
		String prefix = "";
		if(random.nextBoolean()) {
			prefix = "맛있는 ";
		}
		return prefix + fruitsnames[random.nextInt(fruitsnames.length)];
	}
	
}
