
public class Client {
 String nom;
 serveur s;
 
 public Client(String nom) {
	 this.nom=nom;
 }
 
 public void seConnecter(serveur s) {
	 s.clients.add(this);
	 this.s=s;
 }
 
 public void envoyerMessage(String message) {
	 this.s.diffuser(message);
	 }

public void recevoirMessage(String message) {
	System.out.println(this.nom+" : "+ message);
}
 
}
