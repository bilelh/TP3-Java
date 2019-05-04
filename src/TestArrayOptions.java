import java.util.Arrays;
import java.util.Scanner;

public class TestArrayOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner questionUser = new Scanner(System.in);
		
		
		int[] array = new int [1] ;
		int choice_number ;
		
		System.out.println("Vous avez le choix entre 2 options : ");
		System.out.println("1 . Ajouter un nombre ");
		System.out.println("2 . Afficher les nombres existants ");
		System.out.println("0 . Quitter ");
		
		System.out.println("Veuillez selectionner une option : ");
		int user_choice = questionUser.nextInt();
		
		while (user_choice != 0) {
			
			if (user_choice == 1) {
			
			System.out.println("Veuillez saisir un nombre : ");
			choice_number = questionUser.nextInt();
			
			array[array.length-1] = choice_number; 
			
			int [] newArray = new int[array.length+1] ;
			
			for (int i = 0 ; i<array.length ; i++) {
				newArray[i] = array[i];
			}
			
			array = newArray ;
			
			}
		
			if (user_choice == 2) {
			
				for (int i = 0 ; i < array.length ; i++) {
				
					System.out.print(array[i] + " ");
				
				}
				System.out.println(" ");
		
			}
			
			System.out.println("Vous avez le choix entre 2 options : ");
			System.out.println("1 . Ajouter un nombre ");
			System.out.println("2 . Afficher les nombres existants ");
			System.out.println("0 . Quitter ");
			
			System.out.println("Veuillez selectionner une option : ");
			user_choice = questionUser.nextInt();
			
		}
		
		System.out.println("Au revoir ");
		
	}

}
