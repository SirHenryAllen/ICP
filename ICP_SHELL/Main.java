public class Main {

	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);
		String x = "";

		intro();

		System.out.println("[enter] pour continuer");
		x = in.nextLine();

		int[] car = caracteristiques();
		System.out.println("Debug = " + (java.util.Arrays.toString(car)));
		
		System.out.println("");
		System.out.println("[enter] pour continuer");
		x = in.nextLine();
		
		int[] compB = competencesB(car);
		System.out.println("Debug = " + (java.util.Arrays.toString(compB)));
		
		System.out.println("");
		System.out.println("[enter] pour continuer");
		x = in.nextLine();

/*		int[][] culture = culture();
		System.out.println("Debug = " + (java.util.Arrays.toString(culture)));
		System.out.println("Debug = OK");*/

	}
}