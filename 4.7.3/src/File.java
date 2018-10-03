
public class File extends Component {
	
	public File(int taille, String nom) {
			super(taille,nom);
	}
	@Override
	public int getTaille() {
		return this.taille;
	}

}
