
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
		System.out.print("La moyenne des elements du tableau est " + moyenne);
		
		

	}

}
