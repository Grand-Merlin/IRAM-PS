import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class TestFichierTexte {
	public static void main(String[] args) {
		String strPathDirectory = "C:\\Test";
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez le chemin du fichier comme C:\\Temp par exemple");
			strPathDirectory = sc.nextLine();
			File f=new File(strPathDirectory + "\\MonFichierTexteIRAM_PS.txt"); //
			if (f.exists()) {
				System.out.println("Le fichier existe d�j� et va �tre modifi�");
			}else {
				System.out.println("Le fichier n'existe pas encore et va �tre cr��");
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f, false);
			System.out.println("Entrez votre nom");
			fw.write("Ca y est ! Voil� que je sais �crire mon nom " +
					sc.nextLine() + " dans un fichier texte \r\n" +
					" Youhouuuuu !!!!!\r\n");
			fw.close();
			System.out.println("Allez voir votre fichier " + f.getName() + " dans le " +
					" r�pertoire " + f.getParent());
			sc.close();
		}catch(Exception e) {
			System.out.println("Erreur survenue :" + e.getMessage());
		}//end catch
	}//end main
}
