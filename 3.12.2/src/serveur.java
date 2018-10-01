import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class serveur {
	List<Client> clients;
	
	public serveur() {
		clients=new ArrayList<Client>();
	
	}
	
	public boolean connecter(Client client) {
		return clients.contains(client);
		
	}
	
	public void diffuser(String message) {
		ListIterator<Client> it = this.clients.listIterator();
		for(;it.hasNext();) {
			it.next().recevoirMessage(message);
		}
	
	}
	
	
}
