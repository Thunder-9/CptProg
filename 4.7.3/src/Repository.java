import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;


public class Repository extends Component {
	List<Component> contenue;
	
	public Repository(String nom) {
		super(0,nom);
		contenue=new ArrayList<Component>();
		
		
	}
	public void addComponent(Component comp) {
		contenue.add(comp);
	}
	@Override 
	public int getTaille() {
		int taille=0;
		ListIterator<Component> it = this.contenue.listIterator();
		for(;it.hasNext();) {
			taille+=it.next().getTaille();
		}
		this.taille=taille;
		return taille;
		
	}

}
