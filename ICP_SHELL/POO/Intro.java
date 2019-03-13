public class Intro {
	
	public static void affichage() {
		
		String message = "Interface de création de personnage LTF";
		
		System.out.println("");

		for (int i = 0 ; i<message.length() + 4 ; i++) {
			System.out.print("#");
		}

		System.out.print("\n#");
		for (int j = 0 ; j<message.length() + 2 ; j++) {
			System.out.print(" ");
		}
		System.out.print("#\n");

		System.out.print("# " + message + " #\n");
		
		System.out.print("#");
		for (int k = 0 ; k<message.length() + 2 ; k++) {
			System.out.print(" ");
		}
		System.out.print("#\n");

		for (int l = 0 ; l<message.length() + 4 ; l++) {
			System.out.print("#");
		}
		System.out.println("\n");
	} 
}