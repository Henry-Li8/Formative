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
		//faire un tableau de 10 elements
		for (int i = 0; i<10; i++) {
			array1[i] = (int)(Math.random()*10);
		}
		//mettre 10 elements "random" dans le tableau
		System.out.println("tableau de 10 éléments générés au hasard: " + Arrays.toString(array1));
		//imprimer le tableau
		System.out.println(addArray(array1));
		//utilise le method j'ai cree de cherche le sum de le tableau, et imprime le sum
		System.out.println(numEven(array1));
		//utilise le method j'ai cree de numbre de nombres de chiffres pairs, et imprime ca
		System.out.println(Arrays.toString(removeSmallestElement(array1)));
		//utilise le method j'ai cree de enlever le premier plus petit nombre, et imprimer ca
		

	}
	//method pour cherche le plus grand int dans le tableau
	public static int addArray(int [] a) {
		int sum = 0;
		for (int i : a) {
			sum = sum+i;
		}
		return sum;
		
	}
	//method pour cherche le nombre de nombres de paires dans un tableau
	public static int numEven(int [] a) {
		int numOfEven = 0;
		for (int i : a) {
			if (i%2 == 0) {
				numOfEven ++;
			}
		}
		return numOfEven;
		
	}
	//method pour enlever le premier plus petit nombre dans un tableau, 
	//et déplace tout après par un élément, en dupliquant l'avant-dernier élément
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
