
public class ChaineCryptee{
 String chaine;
 int decalage;
 
 
 public static ChaineCryptee deCryptee(String chaine,int dec) {
	 return new ChaineCryptee(chaine,dec);
 }
 public static ChaineCryptee deEnClair(String chaine,int dec){
	 return new ChaineCryptee(Crypte(chaine,dec),dec);
 }
 
 private ChaineCryptee(String chaine,int decalage) {
	 this.decalage=decalage;
	 this.chaine=chaine;
 }
 
 /**
  * Décale un caractère majuscule.
  * Les lettres en majuscule ('A' - 'Z') sont décalés de <code>decalage</code>
  * caractères de façon circulaire. Les autres caractères ne sont pas modifiés.
  *
  * @param c le caractère à décaler
  * @param decalage le décalage à appliquer
  * @return le caractère décalé
  */
 private static char decaleCaractere(char c, int decalage) {
     return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
 }
 

public static String Crypte(String chaine,int decalage) {
	 if (chaine==null) {
		 return "";
	 }
	 
	 String crypte=new String();
	 for(int i =0; i<chaine.length();i++) {
		 crypte+=decaleCaractere(chaine.charAt(i),decalage);
	}
	 return crypte;
			 
 }
 

public String Decrypte() {
	 String decrypte=new String();
	 for(int i =0; i<chaine.length();i++) {
		 decrypte+=decaleCaractere(chaine.charAt(i),-this.decalage);
	}
	 return decrypte;
 }
 
}
