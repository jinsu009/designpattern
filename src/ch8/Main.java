package ch8;

import ch8.factory.Factory;
import ch8.factory.Item;
import ch8.factory.Link;
import ch8.factory.Page;
import ch8.factory.Tray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1){
			//System.out.println("USAGE: java Main class.name.of.ConcreteFactory");
			//System.out.println("USAGE: java Main");
			//System.out.println("USAGE: java Main ch8.listfactory.ListFactory");
			System.out.println("USAGE: java Main factory.Factory");
			System.out.println("USAGE: java Main listfactory.ListFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);
		
		Link naver = factory.createLink("naver", "https://www.naver.com");
		Link daum = factory.createLink("daum", "https://www.daum.net");
		Link antd = factory.createLink("antd", "https://ant.design");

//		Link google = factory.createLink("google", "https://www.google.com");
		
//		Tray traygoogle = factory.createTray("google");
//		traygoogle.add(traygoogle);

		Tray traysearch = factory.createTray("검색");
//		traysearch.add(traygoogle);
		traysearch.add(naver);
		traysearch.add(daum);

		Tray trayant = factory.createTray("antd");
		trayant.add(antd);

		Page page = factory.createPage("LinkPage","영진닷컴");
		page.add(traysearch);
		page.add(trayant);
		page.output();
	}

}
