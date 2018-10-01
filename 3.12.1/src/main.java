
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChaineCryptee chaine = ChaineCryptee.deEnClair("AAA",1);
		System.out.println(chaine.chaine);
		System.out.println(chaine.Decrypte());
		ChaineCryptee chaine2 = ChaineCryptee.deCryptee("BBB", 1);
		System.out.println(chaine2.chaine);
		System.out.println(chaine2.Decrypte());
	}

}
