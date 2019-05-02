
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("Affichage du tableau");
		
		for (int i=0 ; i< array.length ; i++) {
			System.out.print(array [i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("Affichage du tableau inverse");
		
		for (int i=array.length - 1 ; i!=-1 ; i--) {
			System.out.print(array [i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("affichage des nombres superieurs à 3");
		
		for (int i=0 ; i< array.length ; i++) {
			
			if (array [i] > 3) {
				
				System.out.print(array [i] + " ");
			}
		}
		
		System.out.println(" ");
		System.out.println("affichage des nombres paires");
		
		for (int i=0 ; i< array.length ; i++) {
			
			if (array [i] % 2 == 0)  {
				
				System.out.print(array [i] + " ");
			}
		}
		
		System.out.println(" ");
		System.out.println("affichage du plus grand element du tableau");
		
		int plus_grand = array[0];
		
		for (int i=0 ; i< array.length ; i++) {
			
			if (array [i] >= plus_grand)  {
				
				plus_grand = array[i];
			
			}
		}
		System.out.println(plus_grand);
		
		System.out.println(" ");
		System.out.println("affichage du plus petit element du tableau");
		
		int plus_petit = array[0];
		
		for (int i=0 ; i< array.length ; i++) {
			
			if (array [i] <= plus_grand)  {
				
				plus_petit = array[i];
			
			}
		}
		System.out.println(plus_petit);

	}

}
