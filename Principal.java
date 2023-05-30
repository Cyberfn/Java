import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of tax payer: ");
		int n = sc.nextInt();

		List<TaxPayer> list = new ArrayList<>();

		for (int i = 1; i < n; n++) {
			System.out.println("Tax payer #" + i + " data: ");

			System.out.println("individual or company (i/c)? ");
			char type = sc.next().charAt(0);

			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Anual income: ");
			double income = sc.nextDouble();

			if (type == 'i') {
				System.out.println("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();

				Individual individual = new Individual(name, income, healthExpenditures);

				list.add(individual);

			} else {
				System.out.println("Number of employees: ");
				int numberOfEmployess = sc.nextInt();
				Company company = new Company(name, income, numberOfEmployess);

				list.add(new Company(name, income, numberOfEmployess));
			}

		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));

			sum += tax;

		}

		System.out.println();
		System.out.println("TAXES PAID : $ " + String.format("%.2f", sum));

		sc.close();

	}

}
