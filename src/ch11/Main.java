package ch11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Making root entries..");
			Directory rootdir = new Directory("root");
			Directory binddir = new Directory("bind");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");
			rootdir.add(binddir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			binddir.add(new File("vi", 10000));
			binddir.add(new File("latex", 20000));

			System.out.println("");
			System.out.println("Making root entries..");
			Directory Kim = new Directory("Kim");
			Directory Lee = new Directory("Lee");
			Directory Park = new Directory("Park");
			usrdir.add(Kim);
			usrdir.add(Lee);
			usrdir.add(Park);
			Kim.add(new File("diary.html",100));
			Kim.add(new File("composite.java",200));
			Lee.add(new File("memo.txt",300));
			Park.add(new File("game.doc",400));
			Park.add(new File("junk.mail",500));
			rootdir.printList();

		}catch(FileTreatmentException e){
			e.printStackTrace();
		}
	}

}
