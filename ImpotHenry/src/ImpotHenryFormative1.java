import java.util.*;

/*
 * Date: 27-28 Octobre 2020
 * Nom de programmeur : Henry Li
 * Description: après avoir fait un tableau 
 * aléatoire de 10 entiers, faites trois méthodes:
 *  une pour additionner tous les nombres ensemble,
 *  une pour trouver tous les nombres pairs,
 *  et une pour enlever le plus petit nombre, 
 *  	en décalant le reste vers l'avant 
 *  et en dupliquant le dernier élément.
 */


public class ImpotHenryFormative1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = new int [10];
		for (int i = 0; i<10; i++) {
			array1[i] = (int)(Math.random()*10);
		}
		System.out.println("tableau de 10 éléments générés au hasard: " + Arrays.toString(array1));
		System.out.println(Arrays.toString(removeSmallestElement(array1)));
		
		

	}
	public static int addArray(int [] a) {
		int sum = 0;
		for (int i : a) {
			sum = sum+i;
		}
		return sum;
		
	}
	public static int numEven(int [] a) {
		int numOfEven = 0;
		for (int i : a) {
			if (i%2 == 0) {
				numOfEven = numOfEven + i;
			}
		}
		return numOfEven;
	}
	public static int[] removeSmallestElement(int [] a) {
		int min = 1000;
		int indexMin = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				indexMin = i;
				
			}
		}
		for (int k = indexMin; k<a.length-1; k++) {
			a[k] = a[k+1];
		}
		return a;
	}

}
