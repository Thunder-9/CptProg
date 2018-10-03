
public abstract class Component {
	int taille;
	String nom;
	public Component(int taille, String nom) {
		this.taille=taille;
		this.nom=nom;
	}
	abstract int getTaille();
		
	
}

