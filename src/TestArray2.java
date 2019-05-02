
public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int somme = 0;
		int moyenne = 0;
		
		for (int i = 0 ; i < array.length ; i++) {
			somme += array[i];
		}
		
		moyenne = somme / array.length;
		System.out.println("La moyenne des elements du tableau est " + moyenne);
		
		int index_15 = 0 ;
		
		System.out.println("index de l'entier 15");
		
		for (int i = 0 ; i < array.length ; i++) {
			if (array[i] == 15) {
				index_15 = i;
			}
		}
		
		System.out.println("l'entier 15 est l'element " + (index_15 + 1) + " du tableau");
		
		int nombre_doublon = 0 ;
		
		
		for (int i = 0 ; i < array.length ; i++) {
			
			for(int j = i+1 ; j < array.length ; j++) {
				if (array [i] == array[j]) {
					nombre_doublon += 1 ;
				}
			
			
			}
		}
		
		System.out.println("Il y a " + nombre_doublon + " doublon dans le tableau");
		
		
	}

}
