
public class main {

	public static void main(String[] args) {
		serveur s= new serveur();
		Client c1 = new Client("c1");
		Client c2 = new Client("c2");
		Client c3 = new Client("c3");
		
		c1.seConnecter(s);
		c2.seConnecter(s);
		//c3.seConnecter(s);
		
		c1.envoyerMessage("t'as de beaux yeux bleus tu sais ?");
		

	}

}
