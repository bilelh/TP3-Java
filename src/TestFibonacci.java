import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner questionUser = new Scanner(System.in);
		
		int n_range ;
		int answer ;
		int quitter ;
		
		System.out.println("********Suite de Fibonacci********");
		
		do {
			
			System.out.println("Veuillez choisir un rang N : ");
			n_range = questionUser.nextInt();
			
			answer = (n_range-1) + (n_range-2) ;
			
			System.out.println("le nombre de rang " + n_range + " est : " + answer);
		
			System.out.println("tapez 0 Pour quitter, pour continuer, tapez un autre nombre : ");
			quitter= questionUser.nextInt() ;
			
		} while(quitter != 0) ;
		
		System.out.println("BYE BYE");

	}

}
