
public class TestString {

	public static void main(String[] args) {
		
		String strNom="Le Passe Temps";
		System.out.println("1 lenght : " + strNom.length());//renvoie le nbr de caracter espace compris
		System.out.println("2 CompareTo 'Le Passe Temps' : " + strNom.compareTo("Le Passe Temps"));//renvoie 0 si pas de difference
		System.out.println("3 CompareTo 'Le Passe Temps ' : " + strNom.compareTo("Le Passe Temps "));//renvoie un code different de 0 si differences entre les deux chaine
		System.out.println("4 CompareTo 'le passe temps': " + strNom.compareTo("le passe temps"));//renvoie un code different de 0 si differences entre les deux chaine
		System.out.println("5 CompareToIgnoreCase 'le passe temps': " + strNom.compareToIgnoreCase("le passe temps"));//compare en ignorant la case et renvoie 0 si pas de difference
		strNom="    Le   Passe   Temps   ";
		System.out.println("6 :"+ strNom);//concatenation simple
		System.out.println("7:" + strNom.trim());//concatenation sans les espace avant et apres la chaine de caractère
		System.out.println("8:"+ strNom);//affichage de la variable juste pour etre sûr que la manip précédente n'as pas réafecter la variable (appliquer une fonction sur une chaine, ne modifie pas la chaine original)
		strNom=strNom.trim();//dans ce cas, la chaine originale est modifier par l'affectation
		System.out.println("9 :"+ strNom);//concatenation simple mais la variable à déja été purgée de ses espace avant et apres
		strNom="Le Passe Temps";//remise chaine de début d'exos
		System.out.println("10:"+ strNom.substring(10, 12));//renvoie la chaine, du 10em caractere au 12eme non compris (on compte a partir de 0)
		System.out.println("11:"+ strNom.charAt(3));//renvoie le caracter 3 (on compte a partir de 0)
		System.out.println("12:"+ strNom.concat("\nBienvenu"));//concatene les deux chaine de caractere
		System.out.println("13 Contenu de la variable : "+ strNom);//concatenation simple strnom pas modifier
		strNom = strNom + "\nBienvenu";//affectation de la variable
		System.out.println("14 Contenu de la variable : " + strNom);//concatenation simple
		strNom="Le Passe Temps";//remise chaine de début d'exos
		System.out.println("15 endsWith: " + strNom.endsWith("Temps"/*.trim()*/));//renvoie un bool si se termine par la chaine
		System.out.println("16 endsWith: " + strNom.endsWith("mps"));
		System.out.println("17 endsWith: " + strNom.endsWith("mas"));//bool faux car ne se termine pas par mas
		System.out.println("18 replace: " + strNom.replace("temps", "Partout"));//remplace une chaine de caractere par une autre, dans se cas, il ne la remplace pas car temps est en minuscule
		System.out.println("19 replace: " + strNom.replace("Temps", "Partout"));//remplace une chaine de caractere par une autre (remplace toute les occurence trouvée)(accepte des type different)
		System.out.println("20 replace All: " + strNom.replaceAll("e", "EEE"));//remplace toute les chaine de caractere par une autre
		System.out.println("21 to lower case: " + strNom.toLowerCase());//renvoie tout en mminuscule
		System.out.println("22 to upper case: " + strNom.toUpperCase());//renvoie tout en majuscule
		
		//System.out.println(strNom.substring(0, 1).toUpperCase() + strNom.substring(1, strNom.length()));
		
		System.out.println("23 Index of: " + strNom.indexOf("s", 0));//recherche la premiere occurence de la chaine rechercher a partir de l'index 0
		System.out.println("24 Index of: " + strNom.indexOf("s", 2));//recherche la premiere occurence de la chaine rechercher a partir de l'index 2
		System.out.println("25 Index of: " + strNom.indexOf("s", 7));//recherche la premiere occurence de la chaine rechercher a partir de l'index 7
		System.out.println("26 Index of: " + strNom.indexOf("x", 0));//renvoie -1 si pas d'occurence trouvée
		System.out.println("27 Last Index of e : " + strNom.lastIndexOf("e",10));//renvoie la derniere occurance trouvée en allant jusqua l'index 1
		System.out.println("28 Last Index of e: " + strNom.lastIndexOf("e",9));//renvoie la derniere occurance trouvée en allant jusqua l'index 9
		System.out.println("29 Last Index of e : " + strNom.lastIndexOf("e",0));//renvoie -1 si pas d'occurence trouvée
		System.out.println("30 Last Index of e : " + strNom.lastIndexOf("e"));//renvoie l'index de la dernere occurance
		//strNom = Integer.toString(38);//transforme un entier en string
		System.out.println("31 string ou entier ?? " + strNom);
		System.out.println("egal ? " + strNom.equals("Le Passe Temps"));//meme que compare mais est preferer

	}

}
