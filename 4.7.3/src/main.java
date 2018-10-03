
public class main {

	public static void main(String[] args) {
		File f1 = new File(1000,"un");
		File f2 = new File(100,"deux");
		File f3 = new File(10,"trois");
		
		Repository r1 = new Repository("r1");
		Repository r2 = new Repository("r2");
		r1.addComponent(r2);
		r2.addComponent(f2);
		r2.addComponent(f3);
		r1.addComponent(f1);
		System.out.println(r1.getTaille());
		System.out.println(r2.getTaille());
		// TODO Auto-generated method stub

	}

}
