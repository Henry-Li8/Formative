import java.util.Scanner;

/*
 * Date: 27-28 Octobre 2020
 * Nom de programmeur : Henry Li
 * Description: de prendre en compte le nom de famille, les revenus annuels et le montant des dons de l'utilisateur.
 * Le programme retournera (avec le nom de famille de l'utilisateur) le montant du revenu brut, le montant des dons,
 * le revenu imposable, le pourcentage des impôts et l'impôt à payer
 */

public class ImpotHenry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("entrez votre nom de famille: ");
		String name = sc.next();
		System.out.println("saisissez votre salaire annuel avant impôt ($):");
		double gi = sc.nextDouble();
		System.out.println("inscrivez le montant de la contribution aux dons de bienfaisance (charité) ($):");
		double don = sc.nextDouble();

		double ti = 0;
		double tamount = 0;
		double tpercent = 0;
		
		if (don>gi * 0.2) {
			System.out.println("vos dons de charité ont dépassé le montant autorisé pour les déductions d'impot par $" + (don- gi *0.2));
			ti = 0.8 * gi;
		}else {
			ti = gi - don;
		}
		
		if (ti <= 47630) {
			tpercent = 0.15;
		}
		else if (ti <= 95259) {
			tpercent = 0.205;
		}
		else if (ti <= 147667) {
			tpercent = 0.26;
		}
		else if (ti <= 210371) {
			tpercent = 0.29;
		}
		else {
			tpercent = 0.33;
		}
		
		tamount = ti * tpercent;
		
		System.out.println("Monsieur /Madame " + name + ",");
		System.out.println("Merci d’avoir produit votre déclaration de revenus. D’après les informations fournies, nous avons calculé\n" + 
				"votre impôt de la manière suivante: ");
		System.out.println("Revenu Brut: $" + gi);
		System.out.println("Contributions don de bienfaisance: $" + don);
		System.out.println("Revenu imposable: $" + ti);
		System.out.println("pourcentage de l'impôt :" + tpercent * 100 + "%");
		System.out.println("Impôt à payer: $" + ti * tpercent);

		
		

	}

}
